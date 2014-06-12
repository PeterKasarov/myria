package edu.washington.escience.myria.api.encoding;

import javax.ws.rs.core.Response.Status;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Verify;

import edu.washington.escience.myria.RelationKey;
import edu.washington.escience.myria.Schema;
import edu.washington.escience.myria.api.MyriaApiException;
import edu.washington.escience.myria.coordinator.catalog.CatalogException;
import edu.washington.escience.myria.operator.DbQueryScan;
import edu.washington.escience.myria.parallel.Server;

public class TableScanEncoding extends LeafOperatorEncoding<DbQueryScan> {
  /** The name of the relation to be scanned. */
  @Required
  public RelationKey relationKey;
  public Integer storedRelationId;
  public Boolean temporary;

  @Override
  public DbQueryScan construct(final Server server) {
    Schema schema;
    Verify.verifyNotNull(temporary, "temporary");
    if (temporary) {
      schema = server.getTempSchema(relationKey);
    } else {
      try {
        schema = server.getSchema(relationKey);
      } catch (final CatalogException e) {
        throw new MyriaApiException(Status.INTERNAL_SERVER_ERROR, e);
      }
    }
    Preconditions.checkArgument(schema != null, "Specified relation %s does not exist.", relationKey);
    return new DbQueryScan(relationKey, schema);
  }

  @Override
  public void validateExtra() {
    temporary = Objects.firstNonNull(temporary, Boolean.FALSE);
  }

}
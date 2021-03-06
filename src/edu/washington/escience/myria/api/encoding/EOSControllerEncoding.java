package edu.washington.escience.myria.api.encoding;

import java.util.List;

import com.google.common.primitives.Ints;

import edu.washington.escience.myria.api.encoding.QueryConstruct.ConstructArgs;
import edu.washington.escience.myria.operator.network.EOSController;
import edu.washington.escience.myria.parallel.ExchangePairID;

public class EOSControllerEncoding extends AbstractProducerEncoding<EOSController> {

  @Override
  public EOSController construct(ConstructArgs args) {
    List<ExchangePairID> ids = getRealOperatorIds();
    return new EOSController(
        null, ids.toArray(new ExchangePairID[ids.size()]), Ints.toArray(getRealWorkerIds()));
  }
}

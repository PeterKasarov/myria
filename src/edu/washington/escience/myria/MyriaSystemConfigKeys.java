package edu.washington.escience.myria;

import org.jboss.netty.channel.socket.nio.NioSocketChannelConfig;

import edu.washington.escience.myria.operator.network.Consumer;
import edu.washington.escience.myria.parallel.ipc.FlowControlBagInputBuffer;
import edu.washington.escience.myria.parallel.ipc.StreamInputBuffer;

/**
 * Myria system configuration keys.
 * */
public final class MyriaSystemConfigKeys {

  /**
   * .
   * */
  private MyriaSystemConfigKeys() {}

  /**
   * The max number of data messages that the {@link StreamInputBuffer} of each {@link Consumer}
   * operator should hold. It's not a restrict upper bound. Different implementations of
   * {@link StreamInputBuffer} may restrict the size differently. For example, a
   * {@link FlowControlBagInputBuffer} use the upper bound as a soft restriction.
   * */
  public static final String OPERATOR_INPUT_BUFFER_CAPACITY =
      "operator.consumer.inputbuffer.capacity";

  /**
   * After an input buffer full event, if the size of the input buffer reduced to the
   * recover_trigger, the input buffer recover event should be issued.
   * */
  public static final String OPERATOR_INPUT_BUFFER_RECOVER_TRIGGER =
      "operator.consumer.inputbuffer.recover.trigger";

  /**
   * .
   * */
  public static final String TCP_SEND_BUFFER_SIZE_BYTES = "tcp.sendbuffer.size.bytes";

  /**
   * .
   * */
  public static final String TCP_RECEIVE_BUFFER_SIZE_BYTES = "tcp.receivebuffer.size.bytes";

  /**
   * See {@link NioSocketChannelConfig#setWriteBufferLowWaterMark}.
   * */
  public static final String FLOW_CONTROL_WRITE_BUFFER_LOW_MARK_BYTES =
      "flowcontrol.writebuffer.watermark.low";

  /**
   * See {@link NioSocketChannelConfig#setWriteBufferHighWaterMark}.
   * */
  public static final String FLOW_CONTROL_WRITE_BUFFER_HIGH_MARK_BYTES =
      "flowcontrol.writebuffer.watermark.high";

  /**
   * TCP timeout.
   * */
  public static final String TCP_CONNECTION_TIMEOUT_MILLIS = "tcp.connection.timeout.milliseconds";

  /** */
  public static final String WORKER_STORAGE_DATABASE_SYSTEM = "dbms";

  /** */
  public static final String WORKER_STORAGE_DATABASE_NAME = "database_name";

  /** */
  public static final String WORKER_STORAGE_DATABASE_PASSWORD = "database_password";

  /** */
  public static final String WORKER_STORAGE_DATABASE_PORT = "database_port";

  /** */
  public static final String WORKER_IDENTIFIER = "worker_id";
  /** */
  public static final String DEPLOYMENT_PATH = "path";
  /** */
  public static final String DESCRIPTION = "name";
  /** */
  public static final String USERNAME = "username";
  /** */
  public static final String NUMBER_VCORES = "container.vcores.number";
  /** */
  public static final String MEMORY_QUOTA_GB = "container.memory.size.gb";
  /** */
  public static final String JVM_HEAP_SIZE_MAX_GB = "jvm.heap.size.max.gb";
  /** */
  public static final String JVM_HEAP_SIZE_MIN_GB = "jvm.heap.size.min.gb";
  /** */
  public static final String DEPLOYMENT_CONF_FILE = "deployment.cfg";
  /** */
  public static final String ADMIN_PASSWORD = "admin_password";
  /** */
  public static final String REST_PORT = "rest_port";
  /** */
  public static final String SSL = "ssl";
  /** */
  public static final String DEBUG = "DEBUG";
  /** */
  public static final String JVM_OPTIONS = "jvm.options";

  /**
   * Default value for {@link MyriaSystemConfigKeys#FLOW_CONTROL_WRITE_BUFFER_HIGH_MARK_BYTES}.
   */
  public static final int FLOW_CONTROL_WRITE_BUFFER_HIGH_MARK_BYTES_DEFAULT_VALUE =
      5 * MyriaConstants.MB;

  /**
   * Default value for {@link MyriaSystemConfigKeys#FLOW_CONTROL_WRITE_BUFFER_LOW_MARK_BYTES}.
   */
  public static final int FLOW_CONTROL_WRITE_BUFFER_LOW_MARK_BYTES_DEFAULT_VALUE =
      512 * MyriaConstants.KB;

  /**
   * Default value for {@link MyriaSystemConfigKeys#OPERATOR_INPUT_BUFFER_CAPACITY}.
   */
  public static final int OPERATOR_INPUT_BUFFER_CAPACITY_DEFAULT_VALUE = 100;

  /**
   * Default value for {@link MyriaSystemConfigKeys#OPERATOR_INPUT_BUFFER_RECOVER_TRIGGER}.
   */
  public static final int OPERATOR_INPUT_BUFFER_RECOVER_TRIGGER_DEFAULT_VALUE = 80;

  /**
   * Default value for {@link MyriaSystemConfigKeys#TCP_CONNECTION_TIMEOUT_MILLIS}.
   */
  public static final int TCP_CONNECTION_TIMEOUT_MILLIS_DEFAULT_VALUE = 3000;

  /**
   * Default value for {@link MyriaSystemConfigKeys#TCP_RECEIVE_BUFFER_SIZE_BYTES}.
   */
  public static final int TCP_RECEIVE_BUFFER_SIZE_BYTES_DEFAULT_VALUE = 2 * MyriaConstants.MB;

  /**
   * Default value for {@link MyriaSystemConfigKeys#TCP_SEND_BUFFER_SIZE_BYTES}.
   */
  public static final int TCP_SEND_BUFFER_SIZE_BYTES_DEFAULT_VALUE = 5 * MyriaConstants.MB;

  /**
   * Default value for {@link MyriaSystemConfigKeys#WORKER_STORAGE_DATABASE_SYSTEM}.
   */
  public static final String WORKER_STORAGE_DATABASE_SYSTEM_DEFAULT_VALUE =
      MyriaConstants.STORAGE_SYSTEM_SQLITE;

  /**
   * Default value for {@link MyriaSystemConfigKeys#WORKER_STORAGE_DATABASE_PORT}.
   */
  public static final int WORKER_STORAGE_DATABASE_PORT_DEFAULT_VALUE =
      MyriaConstants.STORAGE_POSTGRESQL_PORT;
}

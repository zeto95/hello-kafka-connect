package us.yellosoft.hellokafkaconnect;

/**
 * Declares various reusable constants
 */
public final class Constants {
  /** Utility class */
  private Constants() {}

  public static final String VERSION = "0.1";

  public static final String TOPIC_DELIMITER = ",";

  public static final String CONFIG_TOPICS = "topics";
  public static final String CONFIG_KAFKA_PARTITIONS = "kafka_partitions";
  public static final String CONFIG_REDIS_ADDRESS = "redis_address";
  public static final String CONFIG_NAME_LIST_KEY = "name_list_key";
  public static final String CONFIG_GREETING_LIST_KEY = "greeting_list_key";

  public static final int REDIS_QUERY_TIMEOUT = 3; // sec
}

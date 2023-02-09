package sensorcomp;

/**
 * Interface of Discrete sensor which implements ISensor.
 */
public interface IDiscreteSensor extends ISensor {
  
  /**
   * Status method.
   * @return status of the alert.
   */
  boolean status();
  
  /**
   * Flip status method.
   */
  void flipStatus();
  
  /**
   * Setter method for status.
   * @param value true or false.
   */
  void setStatus(boolean value);
  
  /**
   * Getter default last reading method.
   * @return last reading.
   */
  default double lastReading() {
    return 0;
  }
  
  /**
   * Default get new reading.
   * @return current reading.
   */
  @Override
  default double takeNewReading() {
    return 0;
  }
}

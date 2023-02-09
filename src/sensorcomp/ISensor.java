package sensorcomp;

/**
 * Interface ISensor.
 */
public interface ISensor {
  
  /**
   * get new reading method.
   * @return current reading.
   */
  double takeNewReading();
  
  /**
   * Get last reading method.
   * @return last reading.
   */
  double lastReading();
}

package sensorcomp;

/**
 * Sensor data for smoke test.
 */
public class SensorData {
  private static double [] readings = {0.1, 0.4, 0.0, 0.51, 0.5, 0.7, 0.0, 2.2, 1.0};
  private static int counter = 0;
  
  /**
   * Have current reading for looping the data.
   * @return readings value.
   */
  public static double currentReading() {
    int value = counter;
    counter++;
    if (counter >= readings.length) {
      counter = 0;
    }
    return readings[value];
  }
  
  /**
   * Reset the counter.
   */
  public static void reset() {
    counter = 0;
  }
}

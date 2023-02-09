package sensorcomp;

/**
 * Water sensor class.
 */
public class WaterSensor implements IDiscreteSensor {
  private double currentLevel;
  private double lastLevel;
  private boolean alert;
  
  /**
   * Water sensor constructor.
   */
  public WaterSensor() {
    this.currentLevel = this.lastLevel = 0.0;
    this.alert = false;
  }
  
  /**
   * New reading taker. Setting constraints to decide alert alarm.
   * @return current level.
   */
  @Override
  public double takeNewReading() {
    this.lastLevel = this.currentLevel;
    this.currentLevel = SensorData.currentReading();
    if (this.currentLevel > 0.5) {
      this.alert = true;
    } else {
      this.alert = false;
    }
    return this.currentLevel;
  }
  
  /**
   * Getter method for last reading.
   * @return last reading.
   */
  @Override
  public double lastReading() {
    return this.lastLevel;
  }
  
  /**
   * Getter method for alert status.
   * @return alert status.
   */
  @Override
  public boolean status() {
    return this.alert;
  }
  
  /**
   * Flip the status of alert.
   */
  @Override
  public void flipStatus() {
    this.alert = !this.alert;
  }
  
  /**
   * Setter method for alert status.
   * @param value true or false for status of alert.
   */
  @Override
  public void setStatus(boolean value) {
    this.alert = value;
  }
}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import sensorcomp.IDiscreteSensor;
import sensorcomp.SensorData;
import sensorcomp.WaterSensor;

/**
 * Water sensor test by using the data in SensorData.
 */
public class WaterSensorTests {
  private WaterSensor sensorReading;
  
  /**
   * Set up a sensor reading by setting the constructor.
   */
  @Before
  public void setUp() {
    sensorReading = new WaterSensor();
  }
  
  /**
   * Test take new reading by reading SensorData's data one by one.
   */
  @Test
  public void takeNewReadingTest() {
    // reset to counter = 0. Start from the first value.
    SensorData.reset();
    double reading1 = sensorReading.takeNewReading(); // first one in readings[] is 0.1.
    assertEquals(0.1, reading1, 0.01);
    double reading2 = sensorReading.takeNewReading(); // second one is 0.4.
    assertEquals(0.4, reading2, 0.01);
    double reading3 = sensorReading.takeNewReading();
    assertEquals(0.0, reading3, 0.01);
  }
  
  /**
   * Test the last reading by take several new reading and then get last reading.
   */
  @Test
  public void testLastReading() {
    SensorData.reset();
    sensorReading.takeNewReading();
    sensorReading.takeNewReading();
    double lastReading = sensorReading.lastReading();
    assertEquals(0.1, lastReading, 0.01);
  }
  
  /**
   * Test the status of sensor reading.
   */
  @Test
  public void testStatus() {
    SensorData.reset();
    boolean status1 = sensorReading.status();
    assertFalse(status1);
    
    sensorReading.flipStatus();
    boolean status2 = sensorReading.status();
    assertTrue(status2);
    
    sensorReading.flipStatus();
    boolean status3 = sensorReading.status();
    assertFalse(status3);
  }
  
  /**
   * Test the setter of status.
   */
  @Test
  public void SetterTest() {
    sensorReading.setStatus(true);
    boolean status = sensorReading.status();
    assertTrue(status);
    
    sensorReading.setStatus(false);
    boolean status2 = sensorReading.status();
    assertFalse(status2);
  }
}



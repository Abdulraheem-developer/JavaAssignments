import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionAppTest {

    @Test
    public void checkIfAirConditionExist() {
        AirCondition airCondition = new AirCondition();
        assertNotNull(airCondition);

    }

    @Test
    public void checkIfAirConditionTurnedOn() {
        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
        assertTrue(airCondition.isOn());
    }

    @Test
    public void checkIfAirConditionTurnedOff() {
        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
        airCondition.turnOff();
        assertFalse(airCondition.isOn());
    }

    @Test
    public void checkIfTempratureIncreased() {
        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
        airCondition.incrementTemprature();
        assertEquals(airCondition.getTemprature(), 1);
    }

    @Test
    public void checkIfTempratureDecreased() {
        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
        airCondition.incrementTemprature();
        airCondition.decreaseTemprature();
        assertEquals(airCondition.getTemprature(), 0);
    }

    @Test
    public void checkIfTempratureIncreasedto30degrees() {
        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
        airCondition.getTemperature();
        airCondition.incrementTemprature();
        assertEquals(airCondition.getTemperature(), 30);
    }

    @Test
    public void checkTempraturedecreasedBelow16(){
        AirCondition ac = new AirCondition();
        ac.turnOn();
        assertEquals(16, ac.getTemprature());


        ac.decreaseTemprature();
        ac.decreaseTemprature();
        ac.decreaseTemprature();


        assertEquals(16, ac.getTemprature());
    }
}

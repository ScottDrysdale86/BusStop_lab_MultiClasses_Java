import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Bus busFull;
    private Person person;

    private BusStop busStop;

    @Before
    public void before(){
        bus= new Bus("Edinburgh", 30);
        busFull = new Bus("Edinburgh", 0);
        person = new Person();
        bus.add(person);
        busStop = new BusStop("Castle Terrace");
        busStop.addToQueue(person);

    }

    @Test
    public void canAddPerson(){
        bus.add(person);
        assertEquals(2,bus.getPassengerCount());
    }
    @Test
    public void cantAddPersonBusFull(){
        busFull.add(person);
        assertEquals(0,busFull.getPassengerCount());
    }
    @Test
    public void canRemovePerson() {
        bus.remove();
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canPickUpPassenger() {
        bus.pickUp(busStop);
        assertEquals(2, bus.getPassengerCount());
    }
}

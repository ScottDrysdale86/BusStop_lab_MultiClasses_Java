import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Castle Terrace");
        person = new Person();
    }

    @Test
    public void canAddToQueue(){
        busStop.addToQueue(person);
        assertEquals(1, busStop.getQueueCount());
    }

    @Test
    public void canRemoveFromQueue() {
        busStop.addToQueue(person);
        busStop.removeFromQueue();
        assertEquals(0, busStop.getQueueCount());
    }
}

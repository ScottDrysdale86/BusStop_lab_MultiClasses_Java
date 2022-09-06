import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String _destination, int _capacity){
        this.destination = _destination;
        this.capacity = _capacity;
        this.passengers = new ArrayList<>();
    }

    public void add(Person person) {
        if (this.passengers.size() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public Person remove() {
        if (this.passengers.size() > 0) {
            return this.passengers.remove(0);
        }
        return null;
    }

    public void pickUp(BusStop busStop) {
        this.add(busStop.removeFromQueue());
    }
}

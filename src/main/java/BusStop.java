
//Add a BusStop class which interacts with the other two.
//        BusStop should have a name and an initially empty ArrayList of type "Person" called queue.
//        Add a method to add a person to the queue.
//        Add a method to remove a person from the queue.
//        Create a pickUp method in Bus that gets a person from bus stop and adds to the bus passengers.

import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> queue;

    public BusStop(String _name) {
        this.name = _name;
        this.queue = new ArrayList<>();
    }


    public int getQueueCount() {
        return this.queue.size();
    }

    public void addToQueue(Person person) {
        this.queue.add(person);
    }

    public Person removeFromQueue() {
        return this.queue.remove(0);
    }
}

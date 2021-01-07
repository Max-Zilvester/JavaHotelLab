import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guestList;
    private String name;

    public ConferenceRoom( int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guestList = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfGuests() {
        return this.guestList.size();
    }

    public void addGuestToRoom(Guest guest) {
        if (capacity > getNumberOfGuests()){
            this.guestList.add(guest);
        }
    }

    public void removeGuestFromRoom(Guest guest) {
        if (this.guestList.contains(guest)){
            this.guestList.remove(guest);
        }
    }
}

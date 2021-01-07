import java.util.ArrayList;

public class Bedroom {


    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guestList;
    private BedroomType type;

    public Bedroom( int roomNumber, int capacity,  BedroomType type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
        this.type = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public BedroomType getBedroomType() {
        return type;
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

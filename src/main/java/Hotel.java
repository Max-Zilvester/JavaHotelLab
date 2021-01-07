import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedroomList;
    private ArrayList<ConferenceRoom> conferenceRoomList;

    public Hotel(){
        this.bedroomList = new ArrayList<Bedroom>();
        this.conferenceRoomList = new ArrayList<ConferenceRoom>();
    }

    public int getBedroomCount(){
        return bedroomList.size();
    }

    public int getConferenceRoomCount(){
        return conferenceRoomList.size();
    }

    public void addBedroomToList(Bedroom bedroom) {
        bedroomList.add(bedroom);
    }

    public void addConferenceRoomToList(ConferenceRoom conferenceRoom) {
        conferenceRoomList.add(conferenceRoom);
    }

    public int getBedroomIndex(Bedroom bedroom){
        return bedroomList.indexOf(bedroom);
    }

    public int getNumberOfGuestsFromBedroomList(Bedroom bedroom){
        int bedroomIndex = getBedroomIndex(bedroom);
        return bedroomList.get(bedroomIndex).getNumberOfGuests();
    }

    public void checkInGuestToBedroom(Bedroom bedroom, Guest guest) {
        int bedroomIndex = getBedroomIndex(bedroom);
        bedroomList.get(bedroomIndex).addGuestToRoom(guest);
    }
    public int getConferenceRoomIndex(ConferenceRoom conferenceRoom){
        return conferenceRoomList.indexOf(conferenceRoom);
    }

    public int getNumberOfGuestsFromConferenceRoomList(ConferenceRoom conferenceRoom){
        int conferenceRoomIndex = getConferenceRoomIndex(conferenceRoom);
        return conferenceRoomList.get(conferenceRoomIndex).getNumberOfGuests();
    }

    public void checkInGuestToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        int conferenceRoomIndex = getConferenceRoomIndex(conferenceRoom);
        conferenceRoomList.get(conferenceRoomIndex).addGuestToRoom(guest);
    }

}

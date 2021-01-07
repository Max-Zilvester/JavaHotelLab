import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom;
    ConferenceRoom conferenceRoom2;
    Guest guest1;
    Guest guest2;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(1, 2, BedroomType.DOUBLE);
        bedroom2 = new Bedroom(2, 2, BedroomType.DOUBLE);
        conferenceRoom = new ConferenceRoom(2, "Conference Room 1");
        conferenceRoom2 = new ConferenceRoom(2, "Conference Room 1");
        guest1 = new Guest("Guest One");
        guest2 = new Guest("Guest Two");
        hotel.addBedroomToList(bedroom);
        hotel.addBedroomToList(bedroom2);
        hotel.addConferenceRoomToList(conferenceRoom);
        hotel.addConferenceRoomToList(conferenceRoom2);
    }

    @Test
    public void addRoomToHotelRoomList(){
        assertEquals(2, hotel.getBedroomCount());
        assertEquals(2, hotel.getConferenceRoomCount());
    }

    @Test
    public void canGetNumberOfGuestFromWithinBedroomList(){
        assertEquals(0, hotel.getNumberOfGuestsFromBedroomList(bedroom));
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.checkInGuestToBedroom(bedroom, guest1);
        assertEquals(1, hotel.getNumberOfGuestsFromBedroomList(bedroom));
    }

    @Test
    public void canCheckInGuestToBedroom2(){
        hotel.checkInGuestToBedroom(bedroom2, guest1);
        assertEquals(1, hotel.getNumberOfGuestsFromBedroomList(bedroom2));
        assertEquals(0, hotel.getNumberOfGuestsFromBedroomList(bedroom));
    }

    @Test
    public void canGetNumberOfGuestFromWithinConferenceRoomList(){
        assertEquals(0, hotel.getNumberOfGuestsFromBedroomList(bedroom));
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(conferenceRoom, guest1);
        assertEquals(1, hotel.getNumberOfGuestsFromConferenceRoomList(conferenceRoom));
    }

    @Test
    public void canCheckInGuestToConferenceRoom2(){
        hotel.checkInGuestToConferenceRoom(conferenceRoom2, guest1);
        assertEquals(1, hotel.getNumberOfGuestsFromConferenceRoomList(conferenceRoom2));
        assertEquals(0, hotel.getNumberOfGuestsFromConferenceRoomList(conferenceRoom));
    }
}

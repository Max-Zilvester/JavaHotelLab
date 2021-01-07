import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(2, "Conference Room 1");
        guest = new Guest("Guest One");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetName(){
        assertEquals("Conference Room 1", conferenceRoom.getName());
    }

    @Test
    public void checkRoomIsEmpty(){
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void canAddGuestToRoom(){
        conferenceRoom.addGuestToRoom(guest);
        assertEquals(1, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        conferenceRoom.addGuestToRoom(guest);
        conferenceRoom.removeGuestFromRoom(guest);
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(1, 2, BedroomType.DOUBLE);
        guest = new Guest("Guest One");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetBedroomType(){
        assertEquals(BedroomType.DOUBLE, bedroom.getBedroomType());
    }

    @Test
    public void checkBedroomIsEmpty(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom.addGuestToRoom(guest);
        assertEquals(1, bedroom.getNumberOfGuests());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        bedroom.addGuestToRoom(guest);
        bedroom.removeGuestFromRoom(guest);
        assertEquals(0, bedroom.getNumberOfGuests());
    }


}

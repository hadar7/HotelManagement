import java.util.HashMap;

public class Reservation {

    private Integer reservationNumber;
    private String guestName;
    private Integer guestId;
    private Integer guestsAmount;
    public enum Request{

        ELEVATORPROXIMITY,
        SEAVIEW,
        BATH,
        BALCONY,
        HANDICAPPED,
        HIGHFLOOR,
        LOWFLOOR
    }
    private HashMap<Request,Boolean> guestsRequests;
    // closed to other rooms

    public Ree

}

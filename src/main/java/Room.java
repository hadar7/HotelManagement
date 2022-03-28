


public class Room {
    private Integer roomNumber;
    public enum RoomFacingDirection {

        North,
        South,
        West,
        East
    }
    private RoomFacingDirection roomDirection;
    private Integer roomCapacity;
    public enum RoomType {
        Deluxe,
        Executive,
        Club,
        HanndicappedFriendly,
        DeluxeSuite,
        ExecutiveSuite,
        ClubSuite,
        PresidentSuite
    }
    private RoomType roomType;
    private Boolean  elevatorProximity;
    private Boolean  hasBathtub;
    private Boolean hasBalcony;







}

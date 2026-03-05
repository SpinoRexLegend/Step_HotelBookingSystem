import java.util.HashMap;

public class RoomSearchService {
    public void searchAvailabilityRooms(RoomInventory inventory, RoomDet singleRoom, RoomDet doubleRoom, RoomDet suiteRoom){
        HashMap<String, Integer> avail = inventory.getRoomAvailability();

        if(avail.get("Single") > 0)
            System.out.println("Rooms available\nCurrently "+avail.get("Single")+" rooms left");
        else
            System.out.println("Sorry! all booked out");

        if(avail.get("Double") > 0)
            System.out.println("Rooms available\nCurrently "+avail.get("Double")+" rooms left");
        else
            System.out.println("Sorry! all booked out");

        if(avail.get("Suite") > 0)
            System.out.println("Rooms available\nCurrently "+avail.get("Suite")+" rooms left");
        else
            System.out.println("Sorry! all booked out");
    }
}

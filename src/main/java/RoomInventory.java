import java.util.HashMap;

public class RoomInventory {

    private  HashMap<String, Integer> roomAvailability;

    public RoomInventory(){
        roomAvailability = new HashMap<>();
    }

    public void updateAvailability(String roomType, int count){
        roomAvailability.put(roomType, count);
    }

    public HashMap<String, Integer> getRoomAvailability(){
        return roomAvailability;
    }
}

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class RoomDet {
    private int noOfBeds;
    private double squareFeet;
    private double ppn;
}

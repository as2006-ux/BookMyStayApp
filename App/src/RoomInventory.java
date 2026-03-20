import java.util.HashMap;
import java.util.Map;

public class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();

        // Sample data
        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 0);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability; // read-only usage expected
    }
}
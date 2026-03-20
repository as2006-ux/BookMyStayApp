import java.util.Map;

public class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Room Search\n");

        // Single Room
        if (availability.get("Single") > 0) {
            singleRoom.displayDetails(availability.get("Single"));
        }

        // Double Room
        if (availability.get("Double") > 0) {
            doubleRoom.displayDetails(availability.get("Double"));
        }

        // Suite Room
        if (availability.get("Suite") > 0) {
            suiteRoom.displayDetails(availability.get("Suite"));
        }
    }
}

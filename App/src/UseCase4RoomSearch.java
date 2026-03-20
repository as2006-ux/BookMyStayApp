public class UseCase4RoomSearch {

    public static void main(String[] args) {

        // Room definitions
        Room singleRoom = new Room("Single", 1, 250, 1500.0);
        Room doubleRoom = new Room("Double", 2, 400, 2500.0);
        Room suiteRoom = new Room("Suite", 3, 700, 5000.0);

        // Inventory
        RoomInventory inventory = new RoomInventory();

        // Search service
        RoomSearchService searchService = new RoomSearchService();

        // Execute search
        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}
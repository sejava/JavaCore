package module5;

import java.util.Date;

public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];

    @Override
    public Room[] findRooms(int price, int preson, String city, String hotel) {
        int roomCount = 0;
        Room[] result = new Room[5];
        int i = 0;
        while (i < result.length) {
            if (rooms[i].getPrice() == price)
                if (rooms[i].getCityName().equals(city))
                    if (rooms[i].getHotelName().equals(hotel)) {
                        result[roomCount] = rooms[i];
                        roomCount++;
                    }
            i++;
        }

        Room[] findRooms = new Room[roomCount];

        int j = 0;
        while (j < findRooms.length){
            findRooms[j] = result[j];
            j++;
        }

        return findRooms;
    }

    public BookingComAPI() {
        Room room1 = new Room(1, 550, 1, new Date(), "Radmond", "Inferno");
        Room room2 = new Room(2, 450, 2, new Date(), "Radmond", "Inferno");
        Room room3 = new Room(3, 350, 3, new Date(), "Radmond", "Inferno");
        Room room4 = new Room(4, 100, 1, new Date(), "test", "test");
        Room room5 = new Room(5, 100, 1, new Date(), "test", "test");
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }

}

package module5;

import java.util.Date;

/**
 * Created by pan on 09.01.17.
 */
public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];

    @Override
    public Room[] findRooms(int price, int preson, String city, String hotel) {
        return new Room[0];
    }

    public BookingComAPI(Room[] rooms) {
        Room room1 = new Room(1,550,1,new Date(),"Radmond","Inferno");
        Room room2 = new Room(2,450,2,new Date(),"Radmond","Inferno");
        Room room3 = new Room(3,350,3,new Date(),"Radmond","Inferno");
        Room room4 = new Room(4,250,4,new Date(),"Radmond","Inferno");
        Room room5 = new Room(5,150,5,new Date(),"Radmond","Inferno");
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }
}

package module5;

import java.util.Date;

/**
 * Created by pan on 09.01.17.
 */
public class GoogleAPI implements API{
    private Room[] rooms = new Room[5];

    public GoogleAPI(Room[] rooms) {
        Room room1 = new Room(1,550,1,new Date(),"Hoshen","Rome");
        Room room2 = new Room(2,450,2,new Date(),"Hoshen","Rome");
        Room room3 = new Room(3,350,3,new Date(),"Hoshen","Rome");
        Room room4 = new Room(4,250,4,new Date(),"Hoshen","Rome");
        Room room5 = new Room(5,150,5,new Date(),"Hoshen","Rome");
        rooms[0] = room1;
        rooms[1] = room2;
        rooms[2] = room3;
        rooms[3] = room4;
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int preson, String city, String hotel) {
        return rooms;
    }
}

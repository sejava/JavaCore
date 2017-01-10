package module5;

import java.util.Date;

/**
 * Created by pan on 09.01.17.
 */
public class TripAdvisorAPI implements API {
    private Room[] rooms = new Room[5];

    @Override
    public Room[] findRooms(int price, int preson, String city, String hotel) {
        return new Room[0];
    }

    public TripAdvisorAPI(Room[] rooms) {
            Room room1 = new Room(1,750,1,new Date(),"Philadelfia","Kiev");
            Room room2 = new Room(2,650,2,new Date(),"Philadelfia","Kiev");
            Room room3 = new Room(3,550,3,new Date(),"Philadelfia","Kiev");
            Room room4 = new Room(4,450,4,new Date(),"Philadelfia","Kiev");
            Room room5 = new Room(5,350,5,new Date(),"Philadelfia","Kiev");
            rooms[0] = room1;
            rooms[1] = room2;
            rooms[2] = room3;
            rooms[3] = room4;
            rooms[4] = room5;
    }
}

package module5;

import java.util.Date;

/**
 * Created by pan on 10.01.17.
 */
public class DAOimpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + "  SAVED");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + " UPDATE");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(1,100,2,new Date(),"Hotel","City");
        if (room.getId() != id)
            System.out.println("room id is not find!");
        else System.out.println("Room find: ");
        //getAll().equals(room.getId());
            return room;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}

package module5;

/**
 * Created by pan on 10.01.17.
 */
public class DAOimpl implements DAO {
    private Room[] rooms = new Room[10];
    private int countRooms = 0;

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override

    public Room[] save(Room room) {
        if(room != null){
            this.rooms[countRooms]= room;
            this.countRooms++;
        }if (countRooms == 9) countRooms = 0;
        return rooms;
    }

    @Override
    public boolean delete(Room room) {
        boolean res = false;
        int i = 0;
        while (i < rooms.length){
            if (rooms[i] == room){
                rooms[i] = null;
                res = true;
            }
            i++;
        }
        return res;
    }

    @Override
    public Room update(Room room) {
        int i = 0;
        while (i < rooms.length){
            if (rooms[i] != null) break;
            if (rooms[i].getId() == room.getId()){
                rooms[i] = room;
                i++;
            }
        }
        return room;
    }

    @Override
    public Room findById(long id) {
        int i = 0;
        while (i < rooms.length)
            if (rooms[i].getId() == id);
        return rooms[i];
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}

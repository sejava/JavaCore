package module5;

/**
 * Created by pan on 10.01.17.
 */
public class Controller implements API{
    private API apis[] = new API[3];

    @Override
    public Room[] findRooms(int price, int preson, String city, String hotel) {
        return new Room[0];
    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}

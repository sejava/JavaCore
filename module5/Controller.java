package module5;

import java.util.ArrayList;
import java.util.Date;

public class Controller {
    private API apis[] = new API[3];
    private DAOimpl daoIMPL = new DAOimpl();

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        apis[0] = bookingComAPI;
        apis[1] = googleAPI;
        apis[2] = tripAdvisorAPI;
    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[15];
        int roomCount = 0;
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        int countAllRooms = bookingComAPI.findRooms(price, persons, city, hotel).length;
        int countAllRooms2 = googleAPI.findRooms(price, persons, city, hotel).length;
        int countAllRooms3 = tripAdvisorAPI.findRooms(price, persons, city, hotel).length;
        int countAll = countAllRooms + countAllRooms2 + countAllRooms3;

        Room[] getAllRooms = new Room[countAll];
        Room[] getAllRoomsBooking = bookingComAPI.findRooms(price, persons, city, hotel);
        Room[] getAllRoomsGoogle = googleAPI.findRooms(price, persons, city, hotel);
        Room[] getAllRoomsTrip = tripAdvisorAPI.findRooms(price, persons, city, hotel);

        int index = 0;
        for (int i = 0; i < countAllRooms - 1; i++) {
            while (i < countAllRooms) {
                getAllRooms[i] = getAllRoomsBooking[i];
                i++;
            }
            while (i < countAllRooms + countAllRooms2) {
                getAllRooms[i] = getAllRoomsGoogle[i - countAllRooms];
                i++;
            }
            while (i < countAllRooms + countAllRooms2 + countAllRooms3) {
                if (index < countAllRooms3)
                getAllRooms[i] = getAllRoomsTrip[index];
                index++;
                i++;
            }
            break;
        }

        return getAllRooms;
    }

    Room[] check(API api1, API api2) {
        Room[] result = new Room[100];
        int roomCount = 0;

        for (Room r1 : api1.getAllRooms()){
            for (Room r2 : api2.getAllRooms()){
                if(r1.equals(r2)){
                    result[roomCount] = r1;
                    roomCount++;
                    result[roomCount] = r2;
                    roomCount++;
                }
            }
        }
        return result;
    }

    Room save(Room room){
        daoIMPL.save(room);
        return room;
    }
    boolean delete(Room room){
        return daoIMPL.delete(room);
    }
    Room update(Room room){
        return daoIMPL.update(room);
    }
    Room findById(long id){
        return daoIMPL.findById(id);
    }

}

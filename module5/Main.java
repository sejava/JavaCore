package module5;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Stream;

/**
 * Created by pan on 07.01.17.
 */
public class Main {
    public static void main(String[] args) {

        Date date = new Date();

        Room room1 = new Room(1,550,1,new Date(),"Radmond","Inferno");
        Room room2 = new Room(2,500,2,date,"Radmond","Inferno");

        Room room3 = new Room(1,500,2,date,"Tree","Inferno");
        Room room4 = new Room(4,250,1,date,"Tree","Inferno");

        ///module0.1
        /*
        System.out.println("module0.1");
        System.out.println(room1.toString());
        System.out.println(room1.equals(room4));
        System.out.println(room1.hashCode());
        System.out.println(room4.hashCode());
        System.out.println(room2.equals(room3));
        */

        ///module0.2
        /*
        System.out.println("module0.2");
        API apis[] = new API[3];
        Room[] rooms = {room1, room2, room3,room4};
        */

        //Controller and make three requests with different parameters to find rooms
        Controller controller = new Controller();
        for (Room r : controller.requstRooms(100,1,"test","test")) {
            System.out.println(r);
        }
        System.out.println();
        for (Room r: controller.requstRooms(250,2,"test","test")) {
            System.out.println(r);
        }
        System.out.println();
        for (Room r: controller.requstRooms(350,2,"test","test")) {
            System.out.println(r);
        }
        // check methods three times with different apis to demonstrate how programs works.
        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        for (Room room : controller.check(bookingComAPI, googleAPI)) {
            System.out.println(room);
        }

        System.out.println("FINDS bookingComAPI");
        for (Room findRoomsBookingComAPI: bookingComAPI.findRooms(100,1,"test","test")){
            System.out.println(findRoomsBookingComAPI);
        }

        System.out.println("GET ALL ROOMS for bookingComAPI");
        for (Room allRoomsBookingCom : bookingComAPI.getAllRooms()) {
            System.out.println(allRoomsBookingCom);
        }

        System.out.println("FINDS GoogleAPI");
        for (Room findsRoomsGoogleAPI: googleAPI.findRooms(100, 1, "test", "test")) {
            System.out.println(findsRoomsGoogleAPI);
        }

        System.out.println("GET ALL ROOMS for GoogleAPI");
        for (Room allRoomsGoogleAPI : googleAPI.getAllRooms()) {
            System.out.println(allRoomsGoogleAPI);
        }
        System.out.println("FINDS TripAdvisorAPI");
        for (Room findsRoomsTripAdvisorAPI: tripAdvisorAPI.findRooms(100, 1, "test", "test")) {
            System.out.println(findsRoomsTripAdvisorAPI);
        }

        System.out.println("GET ALL ROOMS for TripAdvisorAPI");
        for (Room allRoomsTripAdvisorAPI : tripAdvisorAPI.getAllRooms()) {
            System.out.println(allRoomsTripAdvisorAPI);
        }
        System.out.println("DAO");
        DAOimpl dao = new DAOimpl();
        System.out.println(dao.save(room3));
        System.out.println(dao.delete(room2));
        System.out.println(dao.update(room1));
        System.out.println(dao.findById(1));
        for (Room r : dao.getAll()) {
            System.out.println(r);
        }
    }

}

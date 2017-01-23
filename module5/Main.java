package module5;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by pan on 07.01.17.
 */
public class Main {
    public static void main(String[] args) {

        Date date = new Date();

        Room room4 = new Room(4,250,1,date,"Tree","Inferno");
        Room room3 = new Room(3,500,2,date,"Tree","Inferno");

        Room room1 = new Room(1,550,1,new Date(),"Radmond","Inferno");
        Room room2 = new Room(2,500,2,date,"Radmond","Inferno");

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


        /*
        Room tested = new Room(1,550,1,new Date(),"Radmond","Inferno");
        Controller controller = new Controller();
        BookingComAPI bookingComAPI = new BookingComAPI();
        //                controller.requstRooms(550,1,"Radmond","inferno");
        Room room5 = new Room(5,150,5,new Date(),"Radmond","Inferno");

        Room[] rq = bookingComAPI.find                                                                                                                                                                                                                                                      Rooms(150,5,"Inferno","Radmond");


        System.out.println(room5.equals(rq[0]));
        for (Room res: rq){
            System.out.println(res);
        }
        */

        Controller controller = new Controller();
        Room[] rooms = controller.requstRooms(100,1,"test","test");
        for (Room r : rooms) {
            System.out.println(r);
        }
        System.out.println();
        System.out.println();

        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        Room[] res = controller.check(bookingComAPI, googleAPI);
        for (Room r : res) {
            System.out.println(r);
        }
        System.out.println();
        DAOimpl daOimpl = new DAOimpl();
        daOimpl.save(room1);

    }

}

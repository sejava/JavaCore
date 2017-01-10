package module5;

import java.util.Date;

/**
 * Created by pan on 07.01.17.
 */
public class Main {
    public static void main(String[] args) {

        Date date = new Date();

        Room room4 = new Room(4,250,1,date,"Tree","Inferno");
        Room room3 = new Room(3,500,2,date,"Tree","Inferno");

        Room room1 = new Room(1,250,1,date,"Radmond","Inferno");
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
    }

}

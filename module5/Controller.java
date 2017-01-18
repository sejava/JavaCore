package module5;

public class Controller {
    private API apis[] = new API[3];

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
        int countAllRooms2 = countAllRooms + googleAPI.findRooms(price, persons, city, hotel).length;
        int countAllRooms3 = countAllRooms2 + tripAdvisorAPI.findRooms(price, persons, city, hotel).length;
        int countAll = countAllRooms3 - 1;

        Room[] getAllRooms = new Room[countAll];
        Room[] getAllRoomsBooking = bookingComAPI.findRooms(price, persons, city, hotel);
        Room[] getAllRoomsGoogle = googleAPI.findRooms(price, persons, city, hotel);
        Room[] getAllRoomsTrip = tripAdvisorAPI.findRooms(price, persons, city, hotel);
        for (int i = 0; i < countAllRooms - 1; i++) {
            while (i < countAllRooms) {
                getAllRooms[i] = getAllRoomsBooking[i];
                i++;
            }
            while (i < countAllRooms2) {
                getAllRooms[i] = getAllRoomsGoogle[i - countAllRooms];
                i++;
            }
            while (i < countAllRooms3) {
                int countTrip = tripAdvisorAPI.findRooms(price, persons, city, hotel).length;
                getAllRooms[i] = getAllRoomsTrip[i];
                i++;
                break;
            }
        }

        return getAllRooms;
    }

    Room[] check(API api1, API api2) {
        Room[] res1 = api1.findRooms(0, 0, null, null);
        Room[] res2 = api2.findRooms(0, 0, null, null);
        return res1;
    }
}

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


        if (bookingComAPI.findRooms(price, persons, city, hotel) != null)
            result = bookingComAPI.findRooms(price, persons, city, hotel);
        if (googleAPI.findRooms(price, persons, city, hotel) != null)
            result = googleAPI.findRooms(price, persons, city, hotel);
        if (tripAdvisorAPI.findRooms(price, persons, city, hotel) != null) {
            result = tripAdvisorAPI.findRooms(price, persons, city, hotel);
        }
        

        return result;
    }

    Room[] check(API api1, API api2) {
        Room[] res1 = api1.findRooms(0, 0, null, null);
        Room[] res2 = api2.findRooms(0, 0, null, null);
        return res1;
    }


}

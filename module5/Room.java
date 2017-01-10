package module5;

import practic.dbconfig.abstarcMethods.DeveloperEmployee;

import java.util.Date;

/**
 * Created by pan on 07.01.17.
 */
public class Room {
    private long id;
    private int price;
    private int person;
    private Date dateAvailableForm;
    private String hotelName;
    private String cityName;

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getPerson() {
        return person;
    }

    public Date getDateAvailableForm() {
        return dateAvailableForm;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setId(long id) {

        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public void setDateAvailableForm(Date dateAvailableForm) {
        this.dateAvailableForm = dateAvailableForm;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Room(long id, int price, int person, Date dateAvailableForm, String hotelName, String cityName) {

        this.id = id;
        this.price = price;
        this.person = person;
        this.dateAvailableForm = dateAvailableForm;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (getClass() != obj.getClass()) return false;
        Room room = (Room) obj;
        if (price != 0)
            if (price != room.getPrice()) return false;
        if (cityName != null)
            if (!cityName.equals(room.getCityName())) return false;
        if (person != 0)
            if (person != room.getPerson()) return false;
        return  this.getPerson() == room.getPerson();
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", price=" + price +
                ", person=" + person +
                ", dateAvailableForm=" + dateAvailableForm +
                ", hotelName='" + hotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = (int) (id +  (int) Math.random() + (int) Math.random());
        return (int) Math.random();
    }
}

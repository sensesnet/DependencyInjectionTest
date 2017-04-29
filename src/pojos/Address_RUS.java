package pojos;

/**
 * Created by KIRILL on 29.04.2017.
 */
public class Address_RUS implements IAddress {

    private String country;
    private String state;
    private String town;
    private String street;
    private int numberOfFlat;


    public Address_RUS(String country, String state, String town, String street, int numberOfFlat) {
        this.country = country;
        this.state = state;
        this.town = town;
        this.street = street;
        this.numberOfFlat = numberOfFlat;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfFlat() {
        return numberOfFlat;
    }

    public void setNumberOfFlat(int numberOfFlat) {
        this.numberOfFlat = numberOfFlat;
    }
}

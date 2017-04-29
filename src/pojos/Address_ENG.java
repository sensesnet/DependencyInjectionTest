package pojos;

/**
 * Created by KIRILL on 29.04.2017.
 */
public class Address_ENG implements IAddress{

    private String street;
    private int numberOfHome;

    public Address_ENG(String street, int numberOfHome) {
        this.street = street;
        this.numberOfHome = numberOfHome;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOfHome() {
        return numberOfHome;
    }

    public void setNumberOfHome(int numberOfHome) {
        this.numberOfHome = numberOfHome;
    }
}

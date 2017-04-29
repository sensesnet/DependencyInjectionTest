package testDI;

import pojos.Address_ENG;
import pojos.Address_RUS;
import pojos.IAddress;
import pojos.Person;

/**
 * Created by KIRILL on 29.04.2017.
 */
public class TestDependencyInjection {


    public static void main(String[] args) {

        Address_ENG address_eng = new Address_ENG("Tomas_Edison st.", 12);
        Address_RUS address_rus = new Address_RUS("Belarus", "7", "Minsk", "FreeBelarus", 12);
        Person person_eng = new Person(1, "Kirill", "Degtyarev", 20, (IAddress) address_eng);
        Person person_rus = new Person(2, "Irina", "Degtyareva", 18, (IAddress) address_rus);

        Address_ENG address_eng_by_person = (Address_ENG) person_eng.getAddress();
        Address_RUS address_rus_by_person = (Address_RUS) person_rus.getAddress();

        System.out.println("English person: "
                + person_eng.getFirstName() + " "
                + person_eng.getSecondName() + " address: "
                + person_eng.getAddress() + " "
                + address_eng_by_person.getStreet() + " "
                + address_eng_by_person.getNumberOfHome()
        );

        System.out.println("Russian person: "
                + person_rus.getFirstName() + " "
                + person_rus.getSecondName() + " address: "
                + person_rus.getAddress() + " "
                + address_rus_by_person.getStreet() + " "
                + address_rus_by_person.getNumberOfFlat()
        );

    }
}

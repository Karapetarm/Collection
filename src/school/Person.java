package school;


import java.util.Map;

public class Person {

    private String firstName;
    private String lastName;
    private int idNumber;
    private PhoneNumbers phoneNumbers;

    public Person(String firstName,String lastName, int idNumber,PhoneType type,String phoneNumber ) {
        this.firstName = firstName;
        this.idNumber = idNumber;
        this.lastName = lastName;
        phoneNumbers = new PhoneNumbers();

    }

    public Person setPhoneNumber(PhoneType type,String phoneNumber) {
        this.phoneNumbers.setPhoneNumber(type,phoneNumber);
        return this;
    }

    public Map<PhoneType, String> getPhoneNumbers() {
        return phoneNumbers.getPhoneNumber();
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }
}

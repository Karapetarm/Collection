package school;

import java.util.Map;
import java.util.TreeMap;

public class PhoneNumbers {

    private Map<PhoneType ,String> phoneNumber;

    public PhoneNumbers() {
        phoneNumber=new TreeMap<>();
    }

    public Map<PhoneType, String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneType type, String phoneNumber) {
        this.phoneNumber.put(type,phoneNumber);
    }
}

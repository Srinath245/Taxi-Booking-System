package DETAILS.PASSENGER;

public class PassengerDetails {

    Integer age;
    String name;
    Long PhoneNumber;

    public PassengerDetails() {
        System.out.println( " please enter your details for verification ");
    }

    public PassengerDetails(Integer age, String name, Long phoneNumber) {
        this.age = age;
        this.name = name;
        PhoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PassengerDetails{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}

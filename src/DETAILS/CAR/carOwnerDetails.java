package DETAILS.CAR;

public class carOwnerDetails {

    Integer age;
    String name;
    Long PhoneNumber;
    boolean licence;
    Integer drivingExperience;

    public carOwnerDetails(){
        System.out.println( " please enter your details for verification ");
    }
    public carOwnerDetails(Integer age, String name, Long phoneNumber, boolean licence, Integer drivingExperience) {
        this.age = age;
        this.name = name;
        PhoneNumber = phoneNumber;
        this.licence = licence;
        this.drivingExperience = drivingExperience;
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

    public boolean isLicence() {
        return licence;
    }

    public void setLicence(boolean licence) {
        this.licence = licence;
    }

    public Integer getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(Integer drivingExperience) {
        this.drivingExperience = drivingExperience;
    }

    @Override
    public String toString() {
        return "carOwnerDetails{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", licence=" + licence +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}

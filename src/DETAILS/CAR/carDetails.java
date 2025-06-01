package DETAILS.CAR;

public class carDetails {

    Integer carNumber;

    String carName;

    Boolean acNonac;

    public carDetails(){
        System.out.println( " please enter your details for verification ");
    }

    public carDetails(Integer carNumber, String carName, Boolean acNonac) {
        this.carNumber = carNumber;
        this.carName = carName;
        this.acNonac = acNonac;
    }

    public Integer getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Integer carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Boolean getAcNonac() {
        return acNonac;
    }

    public void setAcNonac(Boolean acNonac) {
        this.acNonac = acNonac;
    }

    @Override
    public String toString() {
        return "carDetails{" +
                "carNumber=" + carNumber +
                ", carName='" + carName + '\'' +
                ", acNonac='" + acNonac + '\'' +
                '}';
    }
}

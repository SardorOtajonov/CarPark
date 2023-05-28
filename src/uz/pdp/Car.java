package uz.pdp;

public class Car {

    private  String registerNumber;

    public Car( String registerNumber) {

        this.registerNumber = registerNumber;
    }

    public Car() {
    }


    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registerNumber='" + registerNumber + '\'' +
                '}';
    }
}

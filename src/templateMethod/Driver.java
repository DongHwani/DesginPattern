package templateMethod;

public class Driver {

    private Car car;

    public Driver(Car car){
        this.car = car;
    }

    public void execute(){
        car.turnOnEngine();
        car.wheelDrive();
        car.turnOnHeating();
        car.turnOffEngine();
    }
}

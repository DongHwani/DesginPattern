package templateMethod;

public abstract class Car {

    public void turnOnEngine(){
        System.out.println("자동차 시동을 킵니다.");
    }

    abstract public void wheelDrive();

    //Hook 메서드
    public void turnOnHeating(){}

    public void turnOffEngine(){
        System.out.println("자동차 시동을 끕니다.");
    }


}

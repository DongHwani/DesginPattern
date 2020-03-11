package templateMethod;

public class GenesisCoupe extends Car {

    @Override
    public void wheelDrive() {
        System.out.println("이 차는 후륜 구동으로 주행되고 있습니다.");
    }

    @Override
    public void turnOnHeating() {
        System.out.println("좌석에 난방을 켰습니다.");
    }
}

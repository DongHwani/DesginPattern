package templateMethod;

public class Client {
    public static void main(String[] args){
        Driver driver = new Driver(new Avante());
        driver.execute();

        System.out.println("================");

        Driver driver1 = new Driver(new GenesisCoupe());
        driver.execute();
    }
}

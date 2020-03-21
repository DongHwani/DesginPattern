package DIP.chapter03;

public class SlickTier implements Tier {

    private int slickBreakingDistance = 10;

    @Override
    public void tierStop() {
        System.out.println("SlickTier 제동거리 : "+ slickBreakingDistance);
    }
}

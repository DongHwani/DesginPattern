package DIP.chapter01;

public class SlickTier {

    private int slickBreakingDistance;

    public SlickTier(int breakDistance) {
        this.slickBreakingDistance = breakDistance;
    }

    public void slickTierStop(){
        System.out.println("SlickTier 제동거리 : "+ slickBreakingDistance);
    }

}

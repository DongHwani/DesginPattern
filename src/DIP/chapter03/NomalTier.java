package DIP.chapter03;

public class NomalTier implements Tier {

    private int nomalBreakingDistance = 8;

    @Override
    public void tierStop() {
        System.out.println("NomalTier 제동거리 : " + nomalBreakingDistance);
    }
}

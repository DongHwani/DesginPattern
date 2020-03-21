package DIP.chapter01;

public class NomalTier {

    private int nomalBreakingDistance;

    public NomalTier(int distance){
        this.nomalBreakingDistance = distance;
    }

    public void normalTierStop(){
        System.out.println("NomalTier 제동거리 : "+ nomalBreakingDistance);
    }

}

package DIP.chapter03;

/**
 * Break클래스는 생성자 파라미터로 들어오는 Tier가
 * Normal인지 Slick타이어 인지 알 수가 없다
 */
public class Break {

    private Tier tier;

    public Break(Tier tier){
        this.tier = tier;
    }

    public void executeBreak(){
        tier.tierStop();
    }
}

package DIP.chapter03;


/**
 * 타이어와 브레이크의 관계설정은
 * 운전자가 대신한다
 */
public class Driver {

    public static void main(String[] args){
        Tier tier = new SlickTier();

        //브레이크 넌 알필요 없어, 타이어는 운전자인 내가 교체한다.
        Break carBreak = new Break(tier);

        carBreak.executeBreak();

    }
}

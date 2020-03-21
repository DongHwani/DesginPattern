package DIP.chapter01;

public class Break {

    private SlickTier slickTier;
    private int breakDistance = 10;

    public void executeBreak(){
        slickTier = new SlickTier(breakDistance);
        slickTier.slickTierStop();
    }
}

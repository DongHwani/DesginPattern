package DIP.chapter02;

public class Break {

    private Tier tier;

    public void executeBreak(){
        tier = new SlickTier();
        tier.tierStop();
    }
}

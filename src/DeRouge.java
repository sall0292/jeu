
public class DeRouge extends De {
     private final int MIN=4;
    private final int MAX=8;
    public final int VITESSE =3;
    
    @Override
    public int genererResultat()
    
    {
    return (int)(Math.random()*(MAX-MIN+1))+4;
    }
}


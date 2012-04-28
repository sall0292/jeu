
public class DeOrange extends De {
     private final int MIN=2;
    private final int MAX=4;
    public final int VITESSE =2;
    
    @Override
    public int genererResultat()
    
    {
    return (int)(Math.random()*(MAX-MIN+1))+2;
    }
    
}
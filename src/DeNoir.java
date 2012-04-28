
public class DeNoir  extends De{
     private final int MIN=1;
    private final int MAX=10;
    
    
    @Override
    public int genererResultat()
    
    {
    return (int)(Math.random()*(MAX-MIN+1))+1;
    }
    
}
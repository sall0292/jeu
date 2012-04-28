
import java.lang.Math;

/**
 *
 * @author Mami Sall
 */
public class DeJaune extends De {
    private final int MIN=1;
    private final int MAX=2;
    public final int VITESSE =1;
    
    @Override
    public int genererResultat()
    
    {
    return (int)(Math.random()*(MAX-MIN+1))+1;
    }
    
}

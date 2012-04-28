
public class DeVert extends De {
 
	  private final int MIN=7;
	    private final int MAX=12;
	    
	    
	    @Override
	    public int genererResultat()
	    
	    {
	    return (int)(Math.random()*(MAX-MIN+1))+7;
	    }
}

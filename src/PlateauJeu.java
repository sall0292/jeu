import java.awt.*;
import java.awt.event.*;

class PlateauJeu extends Frame
{

  Image MPTable;
  Image De;
  Image voitureBleue,voitureRouge;
  public int Dice1 = 0;


  PlateauJeu()
  {
  	setTitle("formule dé");
  	
   
    MPTable=getToolkit().getImage("table2.jpg");
    De=getToolkit().getImage("De.png");
    voitureBleue=getToolkit().getImage("f.png");
   voitureRouge=getToolkit().getImage("d.gif");
    addWindowListener(new WindowAdapter() 
    {
		public void windowClosing(WindowEvent e) 
		{
			dispose();
			System.exit(0);
		}
	});
  }
  
 
  
  public void paint(Graphics g)
  {
  	//AFFICHAGE PLEIN ECRAN DU PLATEAU
  	int width = (int)Toolkit.getDefaultToolkit().getScreenSize().width;
	int heigh = (int)Toolkit.getDefaultToolkit().getScreenSize().height;
	setBounds(0,0,width, heigh);
    g.drawImage(MPTable, 210, 50, 600, 600, this);
    g.drawImage(De, 50, 50, 117, 142, this);
    
   
   //AFFICHAGE DES PIONS BLEU
   g.setColor( Color.blue );
   g.drawImage(voitureBleue,FormuleDe.MPJoueur1.getPlacementJoueur1()[FormuleDe.MPJoueur1
                                      				.getJPosition()][0],
                                      				FormuleDe.MPJoueur1.getPlacementJoueur1()[FormuleDe.MPJoueur1
                                      						.getJPosition()][1],this);

  // AFFICHAGE DES PIONS ROUGE
     g.setColor(Color.red);
    g.drawImage(voitureRouge,FormuleDe.MPJoueur2.getPlacementJoueur2()[FormuleDe.MPJoueur2
                                      				.getJPosition()][0],
                                      				FormuleDe.MPJoueur2.getPlacementJoueur2()[FormuleDe.MPJoueur2
                                      						.getJPosition()][1],this);

   //LES DICES
   	g.setFont( new Font( "verdana", Font.BOLD, 20 ) );
   	g.setColor(Color.black);
   	//g.drawString("Résultat des Dés",10,130);
   	
   	
	   
		   //LE TOTAL DES DES
   g.drawString("Resultat=" + (Dice1),50,210);
		



		g.setFont( new Font( "verdana", Font.BOLD, 20 ) );
   		//AFFICHAGE DES JOUEURS SUR LA TABLE DU MONOPOLY
   		g.setColor(Color.blue);
  

      
 
    
   		
   		//AFFICHAGE DES NOM DES JOUEURS SUR LA TABLE DU MONOPOLY QUI DOIVENT JOUER
   		g.setFont( new Font( "verdana", Font.BOLD, 20 ) );
   		g.setColor(Color.black);
   		g.drawString("Celui qui a la main est :",220,700);
   		
		if(FormuleDe.MPJoueur1.getTour()==true)
		{
			g.setFont(new Font("verdana", Font.BOLD, 20));
			g.setColor(Color.blue);
			g.drawString(FormuleDe.MPJoueur1.getNom(),500,700);
		}
		else
		{
			g.setColor(Color.red);
			g.drawString(FormuleDe.MPJoueur2.getNom(),500,700);
		}
		
		
		
		
		
		



}


  }

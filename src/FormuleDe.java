
import java.awt.*;
import java.applet.*;
import java.awt.image.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormuleDe extends Applet implements ActionListener
{
	Image welcome;
	static Joueur MPJoueur1 = new Joueur();
	static Joueur MPJoueur2 = new Joueur();
	PlateauJeu MPTable = new PlateauJeu();
	static int debut=2;
	
		
		 
//FIN GESTION DE LA PARTIE


public void init() 
	{
	new DebutPartie();

	DebutPartie.Exit.addActionListener(this);
	DebutPartie.Play.addActionListener(this);
	}
	
public void Jouer(Joueur MPJoueur)
	{
	if(MPJoueur.getJPosition()+MPTable.Dice1>=40)
	{
		MPJoueur.setJPosition(MPJoueur.getJPosition()+MPTable.Dice1-40);
		
	}
	else
	if(MPJoueur.getJPosition()+MPTable.Dice1<40)
	{
		MPJoueur.setJPosition(MPJoueur.getJPosition()+MPTable.Dice1);
	}
	
	
	

if(MPJoueur1.getJPosition()!=0)
		Interface.frein1.setEnabled(true);
	if(MPJoueur2.getJPosition()!=0)
		Interface.frein2.setEnabled(true);
	MPTable.repaint();
	if((MPJoueur1.getTour()==true))
	{
		MPJoueur1.setTour(false);
		MPJoueur2.setTour(true);
	}
	else
	if((MPJoueur2.getTour()==true))
	{
	MPJoueur2.setTour(false);
	MPJoueur1.setTour(true);
	}
	if(MPJoueur1.getTour()==true)
	{	if(MPJoueur1.getV().getVitesseCourante()==1)
		{Interface.r.setEnabled(false);
		Interface.v.setEnabled(false);}
		if(MPJoueur1.getV().getVitesseCourante()==2)
			{Interface.r.setEnabled(true);
			Interface.v.setEnabled(false);}
		if(MPJoueur1.getV().getVitesseCourante()==3)
			{Interface.r.setEnabled(true);
			Interface.v.setEnabled(true);}
	}
	else
		
	if(MPJoueur2.getTour()==true)
	{	if(MPJoueur2.getV().getVitesseCourante()==1)
		{Interface.r.setEnabled(false);
		Interface.v.setEnabled(false);}
		if(MPJoueur2.getV().getVitesseCourante()==2)
			{Interface.r.setEnabled(true);
			Interface.v.setEnabled(false);}
		if(MPJoueur2.getV().getVitesseCourante()==3)
			{Interface.r.setEnabled(true);
			Interface.v.setEnabled(true);}
	}
	MPTable.repaint();
	}


public void paint()
	{
	Interface.vitesse1.setText("Vitesse courante:" + "    "
			+ MPJoueur1.getV().getVitesseCourante());
	Interface.vitesse2.setText("Vitesse courante:" + "    "
			+ MPJoueur2.getV().getVitesseCourante());
	Interface.Cons1.setText("Points Consommation:" + "     "+ MPJoueur1.getV().getPtsCons());
	Interface.Cons2.setText("Points Consommation:" + "     "+ MPJoueur2.getV().getPtsCons());
	Interface.Freins1.setText("Points Frein:" + "     "+ MPJoueur1.getV().getPtsFreins());
	Interface.Freins2.setText("Points Frein:" + "     "+ MPJoueur2.getV().getPtsFreins());
	Interface.Moteur1.setText("Points Moteur:" + "     "+ MPJoueur1.getV().getPtsMoteur());
	Interface.Moteur2.setText("Points Moteur:" + "     "+ MPJoueur2.getV().getPtsMoteur());
	Interface.Pneus1.setText("Points Pneu:" + "     "+ MPJoueur1.getV().getPtsPneus());
	Interface.Pneus2.setText("Points Pneu:" + "     "+ MPJoueur2.getV().getPtsPneus());
	Interface.Carro1.setText("Points Carrosserie:" + "     "+ MPJoueur1.getV().getPtsCarosserie());
	Interface.Carro2.setText("Points Carrosserie:" + "     "+ MPJoueur2.getV().getPtsCarosserie());
	if(debut==0)
		{Interface.n.setEnabled(false);
		Interface.j.setEnabled(true);
		Interface.o.setEnabled(true);
		}
	if(MPJoueur1.getV().getPtsFreins()==0)
		Interface.frein1.setEnabled(false);
	if(MPJoueur2.getV().getPtsFreins()==0)
		Interface.frein2.setEnabled(false);
	}

public static void main(String argv[])
    {
     	new FormuleDe();
    }

public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == DebutPartie.Exit)
						        {
									DebutPartie.Joueur.setVisible(false);
								}
		if(e.getSource() == DebutPartie.Play) 
					{
									MPJoueur1.setTour(true);
								   MPJoueur2.setTour(false);
							
									DebutPartie.Joueur.setVisible(false);
									
									MPTable.setSize(300, 220);
    								MPTable.setVisible(true);
    								new Interface();
    								
    								
    								MPJoueur1.setNom(DebutPartie.Joueur1.getText());
    								MPJoueur2.setNom(DebutPartie.Joueur2.getText());
    								
									
									Interface.Quitter.addActionListener(this);
									Interface.j.addActionListener(this);
									Interface.n.addActionListener(this);
									Interface.r.addActionListener(this);
									Interface.o.addActionListener(this);
									Interface.v.addActionListener(this);
									
									Interface.frein1.addActionListener(this);
									Interface.frein2.addActionListener(this);
									if(MPJoueur1.getJPosition()==0)
										Interface.frein1.setEnabled(false);
									if(MPJoueur2.getJPosition()==0)
										Interface.frein2.setEnabled(false);
									//FIN OUVERTURE DE LA FRAME DE GESTION DE LA PARTIE
    							}
		
		if(e.getSource() == Interface.Quitter)
						        {	
						        	MPTable.setVisible(false);
						        	Interface.FrameJ1.setVisible(false);
						        	Interface.FrameJ2.setVisible(false);
						        	Interface.FrameDe.setVisible(false);
						        	
								}
if (e.getSource() == Interface.j) {
			
			
			if (MPJoueur1.getTour() == true) {
			
				MPJoueur1.getV().penaliteSurregime(MPJoueur1, 1);
				MPJoueur1.getV().setVitesseCourante(1);
				paint();
				DeJaune dj = new DeJaune();
				MPTable.Dice1 = dj.genererResultat();
				Jouer(MPJoueur1);

			} 
			else if (MPJoueur2.getTour() == true) {
				
				MPJoueur2.getV().penaliteSurregime(MPJoueur2, 1);
				MPJoueur2.getV().setVitesseCourante(1);
				paint();
				DeJaune dj = new DeJaune();
				MPTable.Dice1 = dj.genererResultat();
				Jouer(MPJoueur2);
				

			}
}
if (e.getSource() == Interface.n) {
	
	
	if (MPJoueur1.getTour() == true) {
		int s1 = MPJoueur1.superDepart();
		if (s1 == 10) 
			MPJoueur1.setJPosition(MPJoueur1.getJPosition() +4);
		MPTable.Dice1 =s1;
		MPTable.repaint();
	}
	if (MPJoueur2.getTour() == true) {
		int s2 = MPJoueur2.superDepart();
		if (s2 == 10) 
			MPJoueur2.setJPosition(MPJoueur2.getJPosition() +4);
		MPTable.Dice1 =s2;
		MPTable.repaint();
	}
	
	
	debut--;




}

if (e.getSource() == Interface.o) {
if (MPJoueur1.getTour() == true) {
	MPJoueur1.getV().penaliteSurregime(MPJoueur1, 2);
	MPJoueur1.getV().setVitesseCourante(2);
	paint();
	DeOrange dor = new DeOrange();
	MPTable.Dice1 = dor.genererResultat();
	Jouer(MPJoueur1);
	
} else if (MPJoueur2.getTour() == true) {
	MPJoueur2.getV().penaliteSurregime(MPJoueur2, 2);
	MPJoueur2.getV().setVitesseCourante(2);
	paint();
	DeOrange dor = new DeOrange();
	MPTable.Dice1 = dor.genererResultat();
	Jouer(MPJoueur2);

}

}
if (e.getSource() == Interface.r) {
if (MPJoueur1.getTour() == true) {
	MPJoueur1.getV().penaliteSurregime(MPJoueur1, 3);
	MPJoueur1.getV().setVitesseCourante(3);
	paint();
	DeRouge dr = new DeRouge();
	MPTable.Dice1 = dr.genererResultat();
	Jouer(MPJoueur1);
	
} else if (MPJoueur2.getTour() == true) {
	MPJoueur2.getV().penaliteSurregime(MPJoueur2, 3);
	MPJoueur2.getV().setVitesseCourante(3);
	paint();
	DeRouge dr = new DeRouge();
	MPTable.Dice1 = dr.genererResultat();
	Jouer(MPJoueur2);

}

}
if (e.getSource() == Interface.v) {

if (MPJoueur1.getTour() == true) {
	MPJoueur1.getV().penaliteSurregime(MPJoueur1, 4);

	MPJoueur1.getV().setVitesseCourante(4);
	paint();
	
	DeVert dv = new DeVert();
	MPTable.Dice1 = dv.genererResultat();
	Jouer(MPJoueur1);
	
} else if (MPJoueur2.getTour() == true) {
	MPJoueur2.getV().penaliteSurregime(MPJoueur2, 4);
	MPJoueur2.getV().setVitesseCourante(4);
	paint();
	DeVert dv = new DeVert();
	MPTable.Dice1 = dv.genererResultat();
	Jouer(MPJoueur2);

}

}
if(e.getSource()==Interface.frein1)

{	if(MPJoueur1.getJPosition()!=0 && MPJoueur1.getV().getPtsFreins()!=0)
{	
	MPJoueur1.reculer();
	if(MPJoueur1.getV().getPtsFreins()!=0)
	MPJoueur1.getV().freiner();
	
	MPTable.repaint();
}
}
if(e.getSource()==Interface.frein2)
{
	if(MPJoueur2.getJPosition()!=0 && MPJoueur2.getV().getPtsFreins()!=0)
	{
	MPJoueur2.reculer();
	if(MPJoueur2.getV().getPtsFreins()!=0)
		MPJoueur2.getV().freiner();

	MPTable.repaint();
	}

		
}
paint();	
	}

}
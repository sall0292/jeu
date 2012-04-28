import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DebutPartie {


	static JFrame Joueur = new JFrame();

	public static JTextField Joueur1 = new JTextField();
	public static JTextField Joueur2 = new JTextField();
	final JPanel PanelJoueur = new JPanel(new GridLayout(0, 1));
	static  JButton Play = new JButton("Nouvelle Partie");
	static  JButton Exit = new JButton("Quitter le jeu");
	public DebutPartie()
	
	{
		Joueur.setSize(380, 390);
		Joueur.setTitle("Selection des Joueurs");
		Joueur.setBackground(new Color((250), (0), (0)));
		Joueur.setLayout(new FlowLayout(FlowLayout.CENTER));
		Joueur.setResizable(false);
		Joueur.add(PanelJoueur);
		PanelJoueur.add(new Label("Joueur 1"));
		PanelJoueur.add(Joueur1);
		PanelJoueur.add(new Label("Joueur 2"));
		PanelJoueur.add(Joueur2);
		PanelJoueur.add(new Label(""));
		PanelJoueur.add(Play);
		PanelJoueur.add(Exit);
		Joueur.setVisible(true);
		
		
	}
}

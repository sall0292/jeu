import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Interface {

	static JFrame FrameJ1 = new JFrame();
	static  JFrame FrameJ2 = new JFrame();
	static final Frame FrameDe = new Frame();

	
	//boite a vitesse
	static JButton j = new JButton("Dé Jaune");
	static JButton n = new JButton("Dé Noir");
	static JButton o = new JButton("Dé Orange");
	static JButton r = new JButton("Dé Rouge");
	static JButton v = new JButton("Dé Rouge");
	static JButton Quitter = new JButton("Quitter");
	// declaration pour joueur 1
		static JLabel titre1 = new JLabel("Points De Vie");
		static JButton frein1 = new JButton("Freiner");
		static JLabel Pneus1 = new JLabel();
		static JLabel Freins1 = new JLabel();
		static JLabel Cons1 = new JLabel();
		static JLabel Carro1 = new JLabel();
		static JLabel Moteur1 = new JLabel();
		static JLabel vitesse1= new JLabel();

		// declaration pour joueur 2
		static JLabel titre2 = new JLabel("Points De Vie");
		static JButton frein2 = new JButton("Freiner");
		static JLabel Pneus2 = new JLabel();
		static JLabel Freins2 = new JLabel();
		static JLabel Cons2 = new JLabel();
		static JLabel Carro2 = new JLabel();
		static JLabel Moteur2 = new JLabel();
		static JLabel vitesse2= new JLabel();
		public Interface()
		{
			//interface pour joueur 1
			FrameJ1.setLocation(850, 40);
			FrameJ1.setResizable(false);
			FrameJ1.setSize(300, 300);
			FrameJ1.setTitle("Joueur 1:" + DebutPartie.Joueur1.getText());
			FrameJ1.setBackground(Color.white);
			FrameJ1.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			Panel PanelJ1 = new Panel(new GridLayout(0, 1));
			PanelJ1.add(titre1);
			PanelJ1.add(Freins1);
			PanelJ1.add(Pneus1);
			PanelJ1.add(Cons1);
			PanelJ1.add(Carro1);
			PanelJ1.add(Moteur1);
			PanelJ1.add(vitesse1);
			PanelJ1.add(frein1);
			
			FrameJ1.add(PanelJ1);
			FrameJ1.setVisible(true);
		
			
			
			//interface pour joueur 2
			FrameJ2.setLocation(850, 400);
			FrameJ2.setResizable(false);
			FrameJ2.setSize(300, 300);
			FrameJ2.setTitle("Joueur 2:" +DebutPartie.Joueur2.getText());
			FrameJ2.setBackground(Color.white);
			FrameJ2.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			Panel PanelJ2 = new Panel(new GridLayout(0, 1));
			FrameJ2.add(PanelJ2);
			PanelJ2.add(titre2);
			PanelJ2.add(Freins2);
			PanelJ2.add(Pneus2);
			PanelJ2.add(Cons2);
			PanelJ2.add(Carro2);
			PanelJ2.add(Moteur2);
			PanelJ2.add(vitesse2);
			PanelJ2.add(frein2);
			FrameJ2.setVisible(true);
			
			//reglage de l'affichage
			vitesse1.setFont(new Font("verdana", Font.BOLD, 20));
			vitesse2.setFont(new Font("verdana", Font.BOLD, 20));
			titre1.setFont(new Font("verdana", Font.BOLD, 20));
			titre2.setFont(new Font("verdana", Font.BOLD, 20));
			frein1.setBackground(Color.LIGHT_GRAY);
			frein2.setBackground(Color.LIGHT_GRAY);
			
		
			//boite à vitesse
			FrameDe.setLocation(40, 400);
			FrameDe.setResizable(false);
			FrameDe.setSize(150, 280);
			FrameDe.setTitle("Dés");
			FrameDe.setBackground(Color.white);
			FrameDe.setLayout(new FlowLayout(FlowLayout.CENTER));
			
			JPanel PanelDe = new JPanel(new GridLayout(0, 1));
			FrameDe.add(PanelDe);
			j.setBackground(Color.YELLOW);
			n.setBackground(Color.BLACK);
			o.setBackground(Color.orange);
			r.setBackground(Color.RED);
			v.setBackground(Color.GREEN);
			JLabel bad = new JLabel("Boite à Vitesse");
			bad.setFont(new Font("verdana", Font.BOLD, 15));
			PanelDe.add(bad);
			PanelDe.add(n);
			PanelDe.add(j);
			PanelDe.add(o);
			PanelDe.add(r);
			PanelDe.add(v);
			PanelDe.add(Quitter);
			FrameDe.setVisible(true);
	
		}
}

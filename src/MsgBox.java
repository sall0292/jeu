

	
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MsgBox extends Dialog implements ActionListener {
    boolean id=false;   //permet de connaître le bouton utilisé
    Button ok,can;
    MsgBox(Frame fr, String msg, boolean okcan) {

    super(fr, "Message", true);
  
    setLayout(new BorderLayout());
   
    add(BorderLayout.CENTER,new Label(msg,Label.CENTER));

    Panel p=new Panel();
    p.setLayout(new FlowLayout());
    ok=new Button(" OK ");
    p.add(ok);
    ok.addActionListener(this);
    
    if (okcan) {
        can=new Button("Annule");
        p.add(can);
        can.addActionListener(this);
    }

    add(BorderLayout.SOUTH,p);

    pack();
    Dimension d=getToolkit().getScreenSize();
    setLocation(d.width/3,d.height/3);
  
    setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==ok) {
        id=true;
        setVisible(false);
    }
    else if(e.getSource()==can) {
        id=false;
        setVisible(false);
    }
    }

    public static void affMsg(Frame fr, String msg) {
    MsgBox message=new MsgBox(fr, msg, false);
    message.dispose();
    }

    public static boolean affQuest(Frame fr, String msg) {
         MsgBox message=new MsgBox(fr, msg,true);
         boolean rep=message.id;
         message.dispose();
         return rep;
    }


}

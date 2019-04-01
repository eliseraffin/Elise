import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fond_Jeu extends JPanel {

	
	
	
	
	public Fond_Jeu() {
		 
        setLayout(null); // on supprime le layout manager
 
        add(image_de_fond());
        	
        
        
    }
	
	private JComponent image_de_fond() {
		ImageIcon img = new ImageIcon(getClass().getResource("fond.png"));
    	JLabel fondlabel = new JLabel(img);
    	JPanel conteneur=new JPanel();
        conteneur.add(fondlabel);
        conteneur.setSize(1280, 720);
        conteneur.setLocation(0, 0);
        return conteneur;
	}
	
	
	
 
}

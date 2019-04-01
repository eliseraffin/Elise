import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueCrafting extends JPanel {

	
	
	String[][] img_sources = {{"baton.png","bois.png","fil.png"},{"canne_sucre.png","pierre.png","redstone.png"},{"lingot_fer.png","silex.png", null},{null,null,null},{null,null,null}};
	
	public VueCrafting() {
		 
        setLayout(null); // on supprime le layout manager
 
        Deplacement dep = new Deplacement(this);
        for (int i = 0; i<5; i++) {
        	for (int j = 0; j<3; j++) {
        		if (img_sources[i][j]!=null) {
        			add(inventaire(img_sources[i][j], 52+j*50,84+i*50));
        		}
        			
        		
        	}
        }
        
        
        addMouseListener(dep);
        addMouseMotionListener(dep);
        Grilles grilles = new Grilles();
        grilles.setBounds(0,40,900,600);
		add(grilles);
		
		
		
 
    }
	
	private JComponent inventaire(String imgsrc, int x, int y) {
		ImageIcon img = new ImageIcon(getClass().getResource(imgsrc));
    	JLabel batonlabel = new JLabel(img);
    	JPanel conteneur=new JPanel();
    	conteneur.setOpaque(false);
        conteneur.add(batonlabel);
        conteneur.setSize(50, 50);
        conteneur.setLocation(x, y);
        conteneur.setEnabled(false); // les composants ne doivent pas intercepter la souris
        return conteneur;
	}
	
	
	public static void main(String[] args) {
		JFrame frame2 = new JFrame("Minecraft");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setContentPane(new Fond_Jeu());
        frame2.setSize(1280, 720);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
        JFrame frame = new JFrame("Crafting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new VueCrafting());
        frame.setResizable(false);
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
	}
 
}

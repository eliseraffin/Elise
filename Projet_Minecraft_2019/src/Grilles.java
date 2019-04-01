import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

public class Grilles extends JComponent {
	
	ImageIcon fleche;
	
	Grilles() {
		fleche = new ImageIcon(getClass().getResource("craftingfleche.png"));
		
	}

	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		int dim = 50;
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<3; j++) {
				//cases
				g2.setPaint(Color.GRAY);
				g2.fill(new Rectangle2D.Double((j+1)*dim,(i+1)*dim, dim,dim));
				g2.setPaint(Color.black);
				g2.setStroke(new BasicStroke(1));
				g2.draw(new Rectangle2D.Double((j+1)*dim,(i+1)*dim, dim,dim));
			}
		}
		

		for (int i = 0; i<1; i++) {
			for (int j = 0; j<16; j++) {
				g2.setPaint(Color.GRAY);
				g2.fill(new Rectangle2D.Double((j+1)*dim,(i+7)*dim,dim,dim));
				g2.setPaint(Color.black);
				g2.setStroke(new BasicStroke(1));
				g2.draw(new Rectangle2D.Double((j+1)*dim, (i+7)*dim, dim, dim));
			}
		}

		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				g2.setPaint(Color.GRAY);
				g2.fill(new Rectangle2D.Double((j+7)*dim,(i+2)*dim,dim,dim));
				g2.setPaint(Color.black);
				g2.draw(new Rectangle2D.Double((j+7)*dim,(i+2)*dim,dim,dim));
			}
		}
		
		fleche.paintIcon(null, g2, 550, 150);

		
		g2.setPaint(Color.GRAY);
		g2.fill(new Rectangle2D.Double(650,120,100,100));
		g2.setPaint(Color.black);
		g2.draw(new Rectangle2D.Double(650,120,100,100));
		//g2.dispose();
		Font police = new Font("Courier",Font.PLAIN,20);
		g2.setColor(Color.DARK_GRAY);
		g2.setFont(police);
		g2.drawString("Inventaire", 60, 40);
		g2.dispose();


	}
}

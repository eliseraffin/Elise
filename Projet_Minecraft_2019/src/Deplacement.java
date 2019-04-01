import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;

public class Deplacement extends MouseAdapter {

	private boolean move;
	private int X;
	private JComponent objt;
	private int Y;
	private Container zone;

	public Deplacement(Container z) {
		this.zone=z;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if ( move ) {
			move=false; // arrêt du mouvement
			objt=null;
		}
		else {
			objt = getComponent(e.getX(),e.getY()); // on mémorise le composant en déplacement
			if ( objt!=null ) {
				zone.setComponentZOrder(objt,0); // place le composant le plus haut possible
				X = e.getX()-objt.getX(); // on mémorise la position relative
				Y = e.getY()-objt.getY(); // on mémorise la position relative
				move=true; // démarrage du mouvement
				}
		}
	}

	private JComponent getComponent(int x, int y) {
		// on recherche le premier composant qui correspond aux coordonnées de la souris
		for(Component objet : zone.getComponents()) {
			if ( objet instanceof JComponent && objet.getBounds().contains(x, y) ) {
				return (JComponent)objet;
			}
		}
		return null;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if ( move ) {
			objt.setLocation(e.getX()-X, e.getY()-Y);
		}
	}

}



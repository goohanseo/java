import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DrawingArea extends JPanel implements MouseMotionListener {
/**
	 * 
	 */
	private static final long serialVersionUID = -6705918636231411862L;
static int N = 50;
int n = 10;
private Point p1,p2;
int xpoints[] = new int[N], ypoints[] = new int[N];
DrawingArea(){
	setBackground(Color.GREEN);
	setSize(420-40, 35-90-20);
	setLocation(20,10);//왼쪽 모서리 위
	addMouseMotionListener(this);
}
public void mouseMoved(MouseEvent e) {}
public void mouseDragged(MouseEvent e) {}
}
public class Sw4TabbedPanelLab2 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9137502215635999692L;
	public static void main() {new Sw4TabbedPanelLab2 ();}
	Sw4TabbedPanelLab2 (){
		super("핵심 Java:TabbyPanelab");
		JLabel cafe = new JLabel("핵심 Java 카페",SwingConstants.CENTER);
		getContentPane().add(cafe,"North");
		JTabbedPane tpane = new JTabbedPane(JTabbedPane.TOP);
		
		ImageIcon icon0 = new ImageIcon("/Users/guhanseo/Desktop/image-cafe/icon-java.png");
		tpane.addTab ("Java", null, new JLabel(icon0), "역시 Java... 공부하자!");
		ImageIcon icon1 = new ImageIcon("/Users/guhanseo/Desktop/image-cafe/cappuccino.JPG");
		tpane.addTab("Cappuccino", null, new JLabel(icon1), "따사로움을 ");
		ImageIcon icon2 = new ImageIcon("/Users/guhanseo/Desktop/image-cafe/americano.JPG");
		tpane.addTab ("Java", null, new JLabel(icon2), "한잔의 여유");
		ImageIcon icon3 = new ImageIcon("/Users/guhanseo/Desktop/image-cafe/latte.jpg");
		tpane.addTab ("Java", null, new JLabel(icon3), "함께하는 낭만");
		JPanel pan = new JPanel(null);
		  pan.setBackground(Color.WHITE);
		  DrawingArea drawpan = new DrawingArea();
		  pan.add(drawpan);
		 tpane.addTab("my Space",null, pan,"마음을 채우");
		  getContentPane().add(tpane,"Center");
		setSize(420,350); setVisible(true); //setDefaultCloseOp..
	}
}
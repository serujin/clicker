package clicker.constants;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Cons {
	private static final int SCALE = 70;
	private static final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width*SCALE/100;
	private static final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height*SCALE/100;
	public static final Dimension DIMENSION = new Dimension(WIDTH,HEIGHT);
	public static final String TITLE = "Clicker Game";
	public static final Dimension PRODUCT_IMAGE_DIMENSION = new Dimension(DIMENSION.height/100,DIMENSION.height/100);
}

package clicker.constants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Cons {
	private static final int SCALE = 70;
	public static final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width*SCALE/100;
	public static final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height*SCALE/100;
	public static final Dimension DIMENSION = new Dimension(WIDTH,HEIGHT);
	public static final String TITLE = "Clicker Game";
	public static final Dimension COIN_SIZE = new Dimension(WIDTH/4,HEIGHT/2);
	public static final String COIN_PATH = "./resources/Coin.png";
	public static final String MONEY = "   MONEY: ";
	public static int money = 0;
	public static int moneyPerClick = 100;
	public static final Color SCENE_BG = new Color(14,122,133);
	public static int minTime = 10000;
}

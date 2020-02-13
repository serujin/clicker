package clicker.constants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

public class Cons {
	private static final int SCALE = 70;
	public static final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width*SCALE/100;
	public static final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height*SCALE/100;
	public static final Dimension DIMENSION = new Dimension(WIDTH,HEIGHT);
	public static final String TITLE = "Clicker Game";
	public static final Dimension COIN_SIZE = new Dimension(WIDTH/4,HEIGHT/2);
	public static final String COIN_PATH = "./resources/Coin.png";
	public static final String MPT_PATH_ENABLED = "./resources/mptgreen.png";
	public static final String MPS_PATH_ENABLED = "./resources/mpsgreen.png";
	public static final String MPT_PATH_DISABLED = "./resources/mptred.png";
	public static final String MPS_PATH_DISABLED = "./resources/mpsred.png";
	public static final String MONEY = "   MONEY: ";
	public static final String MONEY_PER_SECOND = "   MONEY/SEC: ";
	public static final String MONEY_PER_TAP = "   MONEY/TAP: ";
	public static final String COST = "COST: ";
	public static double money = 0;
	public static double moneyPerTap = 0.001; //FIX TO 0.001
	public static double passiveMoney = 0;
	public static double moneyPerTapCost = 0.1;
	public static double passiveMoneyCost = 2;
	public static final Point MONEY_PER_TAP_POSITION = new Point(Cons.WIDTH/40,Cons.HEIGHT*80/100);
	public static final Point MONEY_PER_SECOND_POSITION = new Point(Cons.WIDTH*73/100,Cons.HEIGHT*80/100);
	public static final Point TIME_PER_REFRESH_POSITION = new Point(Cons.WIDTH/2-Cons.COIN_SIZE.width/2,Cons.HEIGHT*80/100);
	public static final Color SCENE_BG = new Color(14,122,133);
	public static boolean mptEnabled = false;
	public static boolean mpsEnabled = false;
}

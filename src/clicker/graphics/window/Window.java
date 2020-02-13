package clicker.graphics.window;

import javax.swing.JFrame;
import clicker.constants.Cons;
import clicker.graphics.components.Coin;
import clicker.graphics.scenes.Scene;

public class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	public Scene main = new Scene();
	public Coin coin = new Coin(Cons.COIN_PATH);
	public void initWindow() {
		setSize(Cons.DIMENSION);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle(Cons.TITLE);
		setUndecorated(true);
		setVisible(true);
		addComponents();
	}
	public void addComponents() {
		add(main);
		main.add(coin);
	}
}

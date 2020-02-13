package clicker.graphics.components;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;

import clicker.constants.Cons;
import clicker.inputs.Mouse;

public class Coin extends JLabel {
	private static final long serialVersionUID = 1L;
	private Mouse mouse = new Mouse(1);
	public Coin(String path) {
		setSize(Cons.COIN_SIZE);
		setLocation(Cons.WIDTH/2-Cons.COIN_SIZE.width/2,Cons.HEIGHT/2-Cons.COIN_SIZE.height/2);
		ImageIcon iconImg = new ImageIcon(path);
		Icon icon = new ImageIcon(iconImg.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		setIcon(icon);
		addMouseListener(mouse);
	}
}

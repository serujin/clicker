package clicker.graphics.components;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import clicker.constants.Cons;
import clicker.inputs.Mouse;

public class Upgrade extends JLabel {
	private static final long serialVersionUID = 1L;
	private Icon enabledIcon;
	private Icon disabledIcon; 
	private double price;
	private boolean enabled;
	public Upgrade(Point p, Mouse mouse, double price, boolean check, String enabledPath,String disabledPath) {
		initUpgrade(p);
		ImageIcon enabledIconImg = new ImageIcon(enabledPath);
		ImageIcon disabledIconImg = new ImageIcon(disabledPath);
		enabledIcon = new ImageIcon(enabledIconImg.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		disabledIcon = new ImageIcon(disabledIconImg.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		this.price=price;
		refreshUpgradeLabel();
		addMouseListener(mouse);
	}
	public void initUpgrade(Point location) {
		setSize(Cons.COIN_SIZE.width,Cons.COIN_SIZE.height/3);
		setLocation(location);
		setBorder(new LineBorder(Color.BLACK));
	}
	public void refreshUpgradeLabel() {
		checkAvaliableUpgrade();
		if(enabled) {
			setIcon(enabledIcon);
			setFocusable(true);
		} else {
			setIcon(disabledIcon);
			setFocusable(false);
		}
	}
	public void checkAvaliableUpgrade() {
		if(Cons.money>price) {
			enabled=true;
		} else {
			enabled=false;
		}
	}
}

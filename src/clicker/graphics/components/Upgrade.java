package clicker.graphics.components;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import clicker.constants.Cons;

public class Upgrade extends JLabel {
	private static final long serialVersionUID = 1L;
	public boolean enabled = false;
	private Icon enabledIcon;
	private Icon disabledIcon; 
	public Upgrade(String enabledPath,String disabledPath) {
		setSize(Cons.COIN_SIZE);
		setLocation(Cons.WIDTH/2-Cons.COIN_SIZE.width/2,Cons.HEIGHT/2-Cons.COIN_SIZE.height/2);
		ImageIcon enabledIconImg = new ImageIcon(enabledPath);
		ImageIcon disabledIconImg = new ImageIcon(disabledPath);
		enabledIcon = new ImageIcon(enabledIconImg.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
		disabledIcon = new ImageIcon(disabledIconImg.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
	}
	public void refreshUpgradeLabel() {
		if(enabled) {
			setIcon(enabledIcon);
		} else {
			setIcon(disabledIcon);
		}
	}
}

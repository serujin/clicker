package clicker.graphics.scenes;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import clicker.constants.Cons;

public class Scene extends JPanel {
	private static final long serialVersionUID = 1L;
	public static JTextField moneyField = new JTextField();
	public Font f = new Font("Verdana",0,Cons.WIDTH/50);
	public Scene() {
		setSize(Cons.DIMENSION);
		setLayout(null);
		setBackground(Cons.SCENE_BG);
		initMoneyField();
		this.add(moneyField);
	}
	public void initMoneyField() {
		moneyField.setFont(f);
		moneyField.setSize(Cons.WIDTH/3, Cons.WIDTH/20);
		moneyField.setEditable(false);
		moneyField.setBackground(this.getBackground());
		refreshMoney();
//		moneyField.setBorder(null);
	}
	public static void refreshMoney() {
		moneyField.setText(Cons.MONEY+(Cons.money)+" €");
	}
}

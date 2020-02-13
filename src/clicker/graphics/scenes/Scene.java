package clicker.graphics.scenes;

import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.JPanel;
import javax.swing.JTextField;
import clicker.constants.Cons;
import clicker.graphics.components.Upgrade;
import clicker.inputs.Mouse;

public class Scene extends JPanel {
	private static final long serialVersionUID = 1L;
	public static JTextField moneyField = new JTextField();
	public static JTextField mpsField = new JTextField();
	public static JTextField mptField = new JTextField();
	public static JTextField UpgradeMpsField = new JTextField();
	public static JTextField UpgradeMptField = new JTextField();
	private static Mouse mptMouse = new Mouse(2);
	private static Mouse mpsMouse = new Mouse(3);
	public static Upgrade moneyPerTapUpgrade = new Upgrade(Cons.MONEY_PER_TAP_POSITION, mptMouse, Cons.moneyPerTapCost, Cons.mptEnabled, Cons.MPT_PATH_ENABLED, Cons.MPT_PATH_DISABLED);
	public static Upgrade moneyPerSecondUpgrade = new Upgrade(Cons.MONEY_PER_SECOND_POSITION, mpsMouse, Cons.passiveMoneyCost, Cons.mpsEnabled, Cons.MPS_PATH_ENABLED, Cons.MPS_PATH_DISABLED);
	public Font f = new Font("Verdana",0,Cons.WIDTH/50);
	private static DecimalFormat d = new DecimalFormat("###,###,###.###");
	public Scene() {
		setSize(Cons.DIMENSION);
		setLayout(null);
		setBackground(Cons.SCENE_BG);
		initMoneyField();
		add(moneyPerTapUpgrade);
		add(moneyPerSecondUpgrade);
		add(moneyField);
		add(mptField);
		add(mpsField);
		add(UpgradeMptField);
		add(UpgradeMpsField);
		
	}
	public void initMoneyField() {
		moneyField.setFont(f);
		moneyField.setBounds(0,0,Cons.WIDTH/3, Cons.WIDTH/20);
		moneyField.setEditable(false);
		moneyField.setBackground(this.getBackground());
		mpsField.setFont(f);
		mpsField.setBounds(Cons.WIDTH-Cons.WIDTH/3,0,Cons.WIDTH/3, Cons.WIDTH/20);
		mpsField.setEditable(false);
		mpsField.setBackground(this.getBackground());
		mptField.setFont(f);
		mptField.setBounds((int) (Cons.WIDTH*33.3333333/100),0,Cons.WIDTH/3, Cons.WIDTH/20);
		mptField.setEditable(false);
		mptField.setBackground(this.getBackground());
		UpgradeMptField.setFont(f);
		UpgradeMptField.setBounds(300,300,Cons.COIN_SIZE.width,Cons.COIN_SIZE.height/3);
		UpgradeMptField.setEditable(false);
		UpgradeMptField.setBackground(this.getBackground());
		UpgradeMpsField.setFont(f);
		UpgradeMpsField.setBounds(700,700,Cons.COIN_SIZE.width,Cons.COIN_SIZE.height/3);
		UpgradeMpsField.setEditable(false);
		UpgradeMpsField.setBackground(this.getBackground());
		refreshMoney();
	}
	public static void refreshMoney() {
		moneyField.setText(Cons.MONEY+d.format(Cons.money)+" €");
		mpsField.setText(Cons.MONEY_PER_SECOND+d.format(Cons.passiveMoney)+" €");
		mptField.setText(Cons.MONEY_PER_TAP+d.format(Cons.moneyPerTap)+" €");
		UpgradeMptField.setText(Cons.COST+d.format(Cons.moneyPerTapCost)+" €");
		UpgradeMpsField.setText(Cons.COST+d.format(Cons.passiveMoneyCost)+" €");
		moneyPerTapUpgrade.refreshUpgradeLabel();
		moneyPerSecondUpgrade.refreshUpgradeLabel();
	}
	
}

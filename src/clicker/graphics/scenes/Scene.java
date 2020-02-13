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
	public static Upgrade moneyPerTapUpgrade = new Upgrade(Cons.UPGRADE_MTP_POSITION, mptMouse, Mouse.moneyPerTapCost, Cons.mptEnabled, Cons.MPT_PATH_ENABLED, Cons.MPT_PATH_DISABLED,1);
	public static Upgrade moneyPerSecondUpgrade = new Upgrade(Cons.UPGRADE_MTS_POSITION, mpsMouse, Mouse.passiveMoneyCost, Cons.mpsEnabled, Cons.MPS_PATH_ENABLED, Cons.MPS_PATH_DISABLED,2);
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
		UpgradeMptField.setBounds(Cons.WIDTH/40,Cons.HEIGHT*80/100-Cons.COIN_SIZE.height/5,Cons.COIN_SIZE.width,Cons.COIN_SIZE.height/6);
		UpgradeMptField.setEditable(false);
		UpgradeMptField.setBackground(this.getBackground());
		UpgradeMpsField.setFont(f);
		UpgradeMpsField.setBounds(Cons.WIDTH*73/100,Cons.HEIGHT*80/100-Cons.COIN_SIZE.height/5,Cons.COIN_SIZE.width,Cons.COIN_SIZE.height/6);
		UpgradeMpsField.setEditable(false);
		UpgradeMpsField.setBackground(this.getBackground());
		refreshMoney();
	}
	public static void refreshMoney() {
		moneyField.setText(Cons.MONEY+d.format(Mouse.money)+" €");
		mpsField.setText(Cons.MONEY_PER_SECOND+d.format(Mouse.passiveMoney)+" €");
		mptField.setText(Cons.MONEY_PER_TAP+d.format(Mouse.moneyPerTap)+" €");
		UpgradeMptField.setText(Cons.COST+d.format(Mouse.moneyPerTapCost)+" €");
		UpgradeMpsField.setText(Cons.COST+d.format(Mouse.passiveMoneyCost)+" €");
		moneyPerTapUpgrade.refreshUpgradeLabel();
		moneyPerSecondUpgrade.refreshUpgradeLabel();
	}
	
}

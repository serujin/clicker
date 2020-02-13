package clicker.inputs;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import clicker.graphics.scenes.Scene;

public class Mouse extends MouseAdapter {
	private static Random r = new Random();
	public static double money = 0;
	public static double moneyPerTap = 0.001; //FIX TO 0.001
	public static double passiveMoney = 0;
	public static double moneyPerTapCost = 0.05;
	public static double passiveMoneyCost = 1.3;
	private int op;
	public Mouse(int operation) {
		op=operation;
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		if(op==1) {
			money+=1*moneyPerTap;
			Scene.refreshMoney();
		}
		if(op==2) {
			if(money>moneyPerTapCost) {
				moneyPerTap+=0.001*(r.nextInt(11)+1);
				money-=moneyPerTapCost;
				moneyPerTapCost+=0.01*(r.nextInt(20)+1);
			}
			Scene.refreshMoney();
		}
		if(op==3) {
			if(money>passiveMoneyCost) {
				passiveMoney+=0.001*(r.nextInt(9)+1);
				money-=passiveMoneyCost;
				passiveMoneyCost+=0.1*(r.nextInt(6)+1);
			}
			Scene.refreshMoney();
		}
	}
}

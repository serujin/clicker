package clicker.inputs;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import clicker.constants.Cons;
import clicker.graphics.scenes.Scene;

public class Mouse extends MouseAdapter {
	private int op;
	public Mouse(int operation) {
		op=operation;
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		if(op==1) {
			Cons.money+=1*Cons.moneyPerTap;
			Scene.refreshMoney();
		}
		if(op==2) {
			if(Cons.money>Cons.moneyPerTapCost) {
				Cons.moneyPerTap+=0.001;
				Cons.money-=Cons.moneyPerTapCost;
			}
			Scene.refreshMoney();
		}
		if(op==3) {
			if(Cons.money>Cons.passiveMoneyCost) {
				Cons.passiveMoney+=0.001;
				Cons.money-=Cons.passiveMoneyCost;
			}
			Scene.refreshMoney();
		}
	}
}

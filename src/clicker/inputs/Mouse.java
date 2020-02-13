package clicker.inputs;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import clicker.constants.Cons;
import clicker.graphics.scenes.Scene;

public class Mouse extends MouseAdapter {
	@Override
	public void mousePressed(MouseEvent arg0) {
		Cons.money+=1*Cons.moneyPerClick;
		Scene.refreshMoney();
	}
}

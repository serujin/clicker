package clicker.main;

import clicker.constants.Cons;
import clicker.graphics.scenes.Scene;
import clicker.graphics.window.Window;

public class ClickerApplication {
	private static Thread graphics;
	public static Window frame = new Window();
	public static boolean working = true;
	public static void main(String[] args) {
		startGame();
		frame.initWindow();
	}
	public static void startGame() {
		Runner run = new Runner();
		graphics = new Thread(run);
		graphics.start();
	}
	public static void stopGame() {
		System.exit(0);
	}
	public static void refreshAll() {
		Cons.money+=Cons.passiveMoney;
		Scene.refreshMoney();
	}
}
class Runner implements Runnable {
	@Override
	public void run() {
		while(ClickerApplication.working) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			ClickerApplication.refreshAll();
		}
	}
}

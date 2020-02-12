package clicker.graphics.window;

import javax.swing.JFrame;

import clicker.constants.Cons;

public class Window extends JFrame {
	private static final long serialVersionUID = 1L;
	public void initWindow() {
		setSize(Cons.DIMENSION);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		setTitle(Cons.TITLE);
	}
}

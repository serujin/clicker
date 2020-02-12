package clicker.graphics.scenes;

import java.util.ArrayList;

import javax.swing.JComponent;

public interface Scene {
	public void addComponents(ArrayList<JComponent> components);
	public void refreshComponents(ArrayList<JComponent> components);
	public void removeComponents(ArrayList<JComponent> components);
}

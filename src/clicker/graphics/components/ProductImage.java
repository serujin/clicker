package clicker.graphics.components;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import clicker.constants.Cons;

public class ProductImage extends JLabel {
	public ProductImage(String path) {
		setSize(Cons.PRODUCT_IMAGE_DIMENSION);
		ImageIcon icon = new ImageIcon(path);
		setIcon(icon);
	}
}

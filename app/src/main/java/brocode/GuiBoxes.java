package brocode;

import javax.swing.JOptionPane;

/**
 * GuiBoxes
 */
public class GuiBoxes {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		JOptionPane.showMessageDialog(null, "Hello Shan.");
		JOptionPane.showConfirmDialog(null, "Hello confirm");
		JOptionPane.showMessageDialog(null, "Hello Hello");
	}
}

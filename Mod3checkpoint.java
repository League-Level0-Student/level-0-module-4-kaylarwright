import javax.swing.JOptionPane;

public class Mod3checkpoint {
public static void main(String[] args) {
	String flour = JOptionPane.showInputDialog("How many cups of flour");
	double Kayla = Double.parseDouble(flour);
	if (Kayla < 2) {
		JOptionPane.showMessageDialog(null, "You need more flour");
	} 
	String cookies = JOptionPane.showInputDialog("How many people are you baking for");
	int Kay = Integer.parseInt(cookies);
	if (Kay > 30) {
		JOptionPane.showMessageDialog(null, "You need to bake 2 batch of cookies");
	}
}
}

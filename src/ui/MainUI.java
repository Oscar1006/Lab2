package src.ui;

import javax.swing.JFrame;

public class MainUI {

	public static void main(String[] args) {

		Window pPalWindow = new Window();
		pPalWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class Window extends JFrame{
	public Window (){
		setSize(500, 500);
		setTitle("The Pirate");
		setVisible(true);
	}
}
package src.ui;

import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class Window extends JFrame {
	
	public Window() {
		setSize(800,700);
		setTitle("The Pirate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		Sheet principal = new Sheet();
		add(principal);
	}
}
class Sheet extends JPanel {
	JButton upload;
	JButton download;

	private Image boat;


	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		setLayout(null);

		upload = new JButton("Upload Boat");
		download = new JButton("Download Boat");

		upload.setBounds(550, 40, 150, 40);
		download.setBounds(550, 100, 150, 40);

		add(upload);
		add(download);


		File b = new File("src/image/boat.png");
		try{
			boat = ImageIO.read(b);
		}
		catch(IOException e){
			System.out.println("Image not found");
		}
		g.drawImage(boat, 10, 40, null);
	}
}
/*
class Text extends JPanel {
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Welcome to Morgan's Boat", 50, 20);
	}
}

class BoatImage extends JPanel{
	private Image boat;

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		File b = new File("src/image/boat.png");
		try{
			boat = ImageIO.read(b);
		}
		catch(IOException e){
			System.out.println("Image not found");
		}
		g.drawImage(boat, 5, 40, null);
	}
}

class WindowActions implements WindowListener{
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

}
*/


public class MainUI {	
	public static void main(String[] args) {
		Window inter = new Window();
		inter.setVisible(true);
	}
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.*;

public class Main extends JPanel implements ActionListener {
	
	private static JPanel pan = new Main();
	private static JButton valider = new JButton("Dessiner le terrain");
	private static JButton soleil = new JButton("Dessiner le soleil");
	boolean click = false;
	String temps;
	static double valeur;
	
	@Override
	public void paintComponent(Graphics g) {
		if(click == true){
			if(valeur >=0 && valeur < 1){
				temps = "Il fait beau";
				g.setColor(Color.magenta);
				g.fillRect(0, 0, 480, 272);
				g.setColor(Color.GREEN);
				g.fillRect(0, 240, 480, 40);
				g.setColor(Color.YELLOW);
				g.fillOval(12, 15, 80, 80);
				g.setColor(Color.white);
				g.drawString(temps, 15, 15);
			}
			if(valeur >= 1 && valeur < 2){
				temps = "Nuageux";
				g.setColor(Color.darkGray);
				g.fillRect(0, 0, 480, 272);
				g.setColor(Color.green);
				g.fillRect(0, 240, 480, 40);
				g.setColor(Color.YELLOW);
				g.fillOval(332, 12, 50, 50);
				g.setColor(Color.gray);
				g.fillRoundRect(22, 55, 300, 40, 11, 11);
				g.setColor(Color.white);
				g.drawString(temps, 15, 15);
			}
			
		}
		
	}
	
	
	public void fenetre() {
		JFrame fenetre = new JFrame("Environnement Météo par MatR.fr");	
		fenetre.setSize(480,300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		fenetre.add(this);
		fenetre.setContentPane(this);
		//fenetre.setBackground(Color.GREEN);
		this.add(valider);
		//this.add(soleil);
		valider.setBackground(Color.BLUE);
		valider.setForeground(Color.WHITE);
		valider.setBorderPainted(true);;
		valider.addActionListener(this);
		//rafraichir
		fenetre.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lancement du programme");
		Main fenetre = new Main();
		fenetre.fenetre();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		valeur = (0 + (Math.random() * (2 - 0)));
		System.out.println(valeur);
		System.out.println("écrit");
		click = true;
		this.repaint();
	}

}
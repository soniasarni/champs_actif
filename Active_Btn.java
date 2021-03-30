package Swing;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;



import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Active_Btn extends JFrame {
	private JTextField zoneTxt;
	public Active_Btn() {
		getContentPane().setBackground(new Color(250, 240, 230));
		getContentPane().setLayout(null);
		
		JButton btnActiver = new JButton("Activer");
		btnActiver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    zoneTxt.setBackground(Color.RED);
				zoneTxt.setEnabled(true);
			}
		});
		btnActiver.setFont(new Font("Serif", Font.BOLD, 22));
		btnActiver.setBounds(50, 65, 189, 47);
		getContentPane().add(btnActiver);
		
		JButton btnDesactiver = new JButton("Desactiver");
		btnDesactiver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 zoneTxt.setBackground(Color.GRAY);
			zoneTxt.setEnabled(false);
			}
		});
		btnDesactiver.setFont(new Font("Serif", Font.BOLD, 22));
		btnDesactiver.setBounds(60, 123, 189, 47);
		getContentPane().add(btnDesactiver);
		
		zoneTxt = new JTextField();
		zoneTxt.setBackground(new Color(255, 69, 0));
		zoneTxt.setBounds(50, 205, 317, 262);
		getContentPane().add(zoneTxt);
		zoneTxt.setColumns(10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Active_Btn fr =new Active_Btn();
	      fr.setVisible(true);

	}
}

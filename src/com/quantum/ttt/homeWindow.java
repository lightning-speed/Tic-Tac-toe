package com.quantum.ttt;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import com.quantum.tools.KButton;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;

public class homeWindow {

	private JFrame frmTicTacToe;
	 private ImageIcon icon  = new ImageIcon(getClass().getResource("res/icon.png"));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homeWindow window = new homeWindow();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public homeWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setIconImage(icon.getImage());
		frmTicTacToe.setVisible(true);
		frmTicTacToe.setTitle("TIC TAC TOE!");
		frmTicTacToe.setResizable(false);
		frmTicTacToe.setBounds(100, 100, 468, 318);
		frmTicTacToe.setLocationRelativeTo(null);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		frmTicTacToe.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		KButton nbtn = new KButton("New Game");
		nbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainWindow abc = new mainWindow();
				abc.doit();
				frmTicTacToe.setVisible(false);
			}
		});
		nbtn.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 20));
		nbtn.setBounds(166, 46, 133, 47);
		panel.add(nbtn);
		
		
		KButton nbtn_1 = new KButton("Two Player");
		nbtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainWindow2 a = new mainWindow2();
				a.doit();
				frmTicTacToe.setVisible(false);
			}
		});
		nbtn_1.setBounds(166, 104, 133, 47);
		panel.add(nbtn_1);
		nbtn_1.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 20));
		
		
		KButton nbtn_2 = new KButton("Exit");
		nbtn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		nbtn_2.setBounds(166, 162, 133, 47);
		nbtn_2.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 20));
		panel.add(nbtn_2);
		
		JLabel lblNewLabel = new JLabel("TIC TAC TOE!");
		lblNewLabel.setForeground(new Color(255, 51, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(169, 11, 123, 31);
		panel.add(lblNewLabel);
	}
}

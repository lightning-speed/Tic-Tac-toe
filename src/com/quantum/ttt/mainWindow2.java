// This Program is made by Lightning Speed Technology and Quantum Tools (c). All Rights Reserved
package com.quantum.ttt;

import java.awt.BorderLayout;
import java.awt.Color;
import com.quantum.tools.KButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import com.tic.tools.TButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;


public class mainWindow2 {
	static mainWindow2 w = new mainWindow2();
	private boolean win = false;
	private JFrame frame;
	private JPanel panel; 
    private KButton setbtn;
    private KButton home;
    private TButton button1;
    private TButton button2;
    private TButton button3;
    private TButton button4;
    private TButton button5;
    private TButton button6;
    private  JLabel playerlb;
    private TButton button7;
    private TButton button8;
    private TButton button9;
    public Integer player = 1;
    private ImageIcon icon  = new ImageIcon(getClass().getResource("res/icon.png"));
    private KButton rebtn;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		w.draw();
	}
   public void doit() {
	   w.draw();
   }
	/**
	 * Create the application.
	 */
	

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void draw() {
	
		frame = new JFrame();
		frame.setIconImage(icon.getImage());
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(500,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("TIC TAC TOE!");
		
		 panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		
		
		
		home = new KButton("Home");
		home.setFontSize(25);
		home.setBorder(null);
		home.setForeground(Color.WHITE);
		home.setBackground(new Color(0, 102, 153));
		home.setBounds(0, 0, 98, 43);
		panel.add(home);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			homeWindow gc = new homeWindow();
            frame.setVisible(false);
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(34, 104, 422, 424);
		panel.add(panel_1);
		
		panel_1.setLayout(null);
		
	    button1 = new TButton("");
		button1.setBounds(0, 0, 140, 140);
		panel_1.add(button1);
		
		
		button2 = new TButton("");
		button2.setBounds(144, 0, 140, 140);
		panel_1.add(button2);
			
			
		
		button3 = new TButton("");
		button3.setBounds(288, 0, 135, 140);
		panel_1.add(button3);
		
		button4 = new TButton("");
		button4.setBounds(0, 144, 140, 140);
		panel_1.add(button4);
		
		button5 = new TButton("");
		button5.setBounds(144, 144, 140, 140);
		panel_1.add(button5);
		
		button6 = new TButton("");
		button6.setBounds(288, 144, 135, 140);
		panel_1.add(button6);
		
		button7 = new TButton("");
		button7.setBounds(0, 288, 140, 140);
		panel_1.add(button7);
		
		button8 = new TButton("");
		button8.setBounds(144, 288, 140, 140);
		panel_1.add(button8);
		
		button9 = new TButton("");
		button9.setBounds(288, 288, 135, 140);
		panel_1.add(button9);
		   w.activate(button1);
		   w.activate(button2);
		   w.activate(button3);
		   w.activate(button4);
		   w.activate(button5);
		   w.activate(button6);
		   w.activate(button7);
		   w.activate(button8);
		   w.activate(button9);
		   
		   playerlb = new JLabel("X Turn");
		   playerlb.setForeground(Color.RED);
		   playerlb.setFont(new Font("Tahoma", Font.PLAIN, 40));
		   playerlb.setHorizontalAlignment(SwingConstants.CENTER);
		   playerlb.setBounds(177, 44, 150, 43);
		   panel.add(playerlb);
		   
		   rebtn = new KButton("Restart");
		   rebtn.addActionListener(new ActionListener() {
		   	public void actionPerformed(ActionEvent e) {
		   		restart();
		   	}
		   });
		   rebtn.setForeground(Color.WHITE);
		   rebtn.setBackground(new Color(0, 102, 153));
		  
		   rebtn.setBounds(0, 44, 105, 43);
		   rebtn.setBorder(null);
		   rebtn.setFontSize(25);
		   panel.add(rebtn);
		   
		   
		 
		panel_1.repaint();
		panel.repaint();
	}
 
  
	public void activate(TButton button) {
		
		 button.addActionListener(new ActionListener() {
			 
		    	public void actionPerformed(ActionEvent e) {
		    		if(player == 1&&button.getText() !="X"&&button.getText() !="O"&&win == false) {
		    			button.setText("X");
		    			player = 2;
		    			 button.setForeground(Color.RED);
		    			playerlb.setForeground(Color.CYAN);
		    			playerlb.setText("O Turn");
		    			checkwin();
		    		}
		    	
		    	if(player == 2&&button.getText() !="X"&&button.getText() !="O"&&win == false) {
		    		button.setText("O");
	    			player = 1;
	    			playerlb.setForeground(Color.RED);
	    			playerlb.setText("X Turn");
	    			button.setForeground(Color.CYAN);
	    			checkwin();
		    	}
		    	if(win == true&&playerlb.getText() == "O Turn") {
		    		playerlb.setText("X WON!");
		    		playerlb.setForeground(Color.RED);
		    		
		    	}
		    	if(win == true&&playerlb.getText() == "X Turn") {
		    		playerlb.setForeground(Color.CYAN);
		    		playerlb.setText("O WON!");
		    	}
		    }
	    	
		    });
		 
	}
public void checkwin() {
	 
		if(button1.getText() == button2.getText()&&button2.getText() == button3.getText()) {
			
			if(button1.getText() == "X") {
				System.out.println("X win");
				win = true;
			}
			if(button1.getText() == "O")  {
				System.out.println("O wins");
				win = true;
			}
			
		}
		if(button4.getText() == button5.getText()&&button5.getText() == button6.getText()) {
			
			if(button4.getText() == "X") {
				System.out.println("X win");
				win = true;
			}
			if(button4.getText() == "O")  {
				System.out.println("O wins");
				win = true;
			}
			
		}
		if(button7.getText() == button8.getText()&&button8.getText() == button9.getText()) {
			
			if(button7.getText() == "X") {
				System.out.println("X win");
				win = true;
			}
			if(button7.getText() == "O")  {
				System.out.println("O wins");
				win = true;
			}
			
		}
		if(button1.getText() == button4.getText()&&button4.getText() == button7.getText()) {
			
			if(button1.getText() == "X") {
				System.out.println("X win");
				win = true;
			}
			if(button1.getText() == "O")  {
				System.out.println("O wins");
				win = true;
			}
			
		}
		if(button2.getText() == button5.getText()&&button5.getText() == button8.getText()) {
			
			if(button2.getText() == "X") {
				System.out.println("X win");
				win = true;
			}
			if(button2.getText() == "O")  {
				System.out.println("O wins");
				win = true;
			}
			
		}
        if(button3.getText() == button6.getText()&&button6.getText() == button9.getText()) {
			
			if(button3.getText() == "X") {
				System.out.println("X win");
				win = true;
			}
			if(button3.getText() == "O")  {
				System.out.println("O wins");
				win = true;
			}
			
		}
		if(button1.getText() == button5.getText()&&button5.getText() == button9.getText()) {
			
			if(button1.getText() == "X") {
				win = true;
				System.out.println("X win");
			}
			if(button1.getText() == "O") {
				win = true;
				System.out.println("O wins");
			}
			
		}
		if(button3.getText() == button5.getText()&&button5.getText() == button7.getText()) {
			
			if(button3.getText() == "X") {
				win = true;
				System.out.println("X win");
			}
			if(button3.getText() == "O") {
				win = true;
				System.out.println("O wins");
			}
			
		}
		if((button1.getText()  == "X"||button1.getText()  == "O")&&
				(button2.getText()  == "X"||button2.getText()  == "O")&&
				(button3.getText()  == "X"||button3.getText()  == "O")&&
				(button4.getText()  == "X"||button4.getText()  == "O")&&
				(button5.getText()  == "X"||button5.getText()  == "O")&&
				(button6.getText()  == "X"||button6.getText()  == "O")&&
				(button7.getText()  == "X"||button7.getText()  == "O")&&
				(button8.getText()  == "X"||button8.getText()  == "O")&&
				(button9.getText()  == "X"||button9.getText()  == "O")&& win  == false) {
		    playerlb.setText("TIE!");
		    playerlb.setForeground(Color.WHITE);
		}
	}
   void restart() {
	win = false;
	button1.setText("");
	button2.setText("");
	button3.setText("");
	button4.setText("");
	button5.setText("");
	button6.setText("");
	button7.setText("");
	button8.setText("");
	button9.setText("");
	player = 1;
	playerlb.setText("X Turn");
	playerlb.setForeground(Color.RED);
}
}

// This Program is made by Lightning Speed Technology and Quantum Tools (c). All Rights Reserved
package com.tic.tools;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
public class TButton extends JButton{
	public TButton(String label){
		this.setText(label);
		this.setBorder(null);
		this.setBackground(new Color(0, 102, 153));
		this.setSize(60,60);
		this.setFocusPainted(false);
		this.setFont(new Font("sans-serif", Font.PLAIN, 80));
		
	}


}


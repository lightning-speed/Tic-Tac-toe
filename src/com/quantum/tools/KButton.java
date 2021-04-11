// This Program is made by Lightning Speed Technology and Quantum Tools. All Rights Reserved
package com.quantum.tools;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class KButton extends JButton {
	Border border = new LineBorder(new Color(0,150,255), 1, true);
	 Border border2 = new LineBorder(new Color(220,220,220), 1, true);
	 private Color cl;
	 boolean a = true;
 public  KButton(String label){
	
 	addMouseListener(new MouseAdapter() {
 		@Override
 		public void mouseEntered(MouseEvent e) {
 			cl = getBackground();
 			setBackground(new Color(170,200,255));
 			
 		}
 		@Override
 		public void mouseExited(MouseEvent e) {
 			 if(getBackground() == new Color(240,240,255)) {
 	  			setBackground(new Color(240 ,240 ,255));
 	  			 }
 	  			 else {
 	  				 setBackground(cl);
 	  			 }
 		}
 	});
	 
	 this.setFont(new Font("Tahoma", Font.PLAIN, 13));
	 if(label==null) {
		 this.setText("New KButton");
	 }
	 else {
	 this.setText(label);
	 }
	 this.setEnabled(true);
	 this.setFocusPainted(false);
	 this.setBackground(new Color(240 ,240 ,255));
     this.setBorder(border);
     this.setSize(210,80);
    
  }	
   public void deactivateBlue() {
	   this.setBorder(border2);
	  
	    this.setBackground(new Color(240,240,240));
	    a = false;
     }
   public void activateBlue() {
	 this.setBorder(border);
	 this.setBackground(new Color(240, 240, 255));
	 a = true;

    }
   
   public void setBorderWidth(int  width) {
  	 border = new LineBorder(new Color(0,150,255), width, true);
  	 border2 = new LineBorder(new Color(220,220,220), width, true);
  	 if(a == true)this.setBorder(border);
  	 else this.setBorder(border2);
      }
 
   public void setFontSize(int  size) {
   	this.setFont(new Font("Tahoma", Font.PLAIN, size));
  	 
      }
}

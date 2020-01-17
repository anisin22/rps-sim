import javax.swing.*;
import java.awt.event.*;  
import java.awt.*;


public class rps_gui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("Button Example"); 
		final JTextField tf=new JTextField();  
	    tf.setBounds(100,100, 150,20);  
	    JButton b = new JButton("Click Here"); 
	    b.setBounds(280,280,95,30);
	    b.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent e){  
	            tf.setText("Welcome to Rock, Paper, Scissors!.");  
	        }  
	    });  
	    
	  	f.add(b);f.add(tf); 
	  	f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
       

}
}

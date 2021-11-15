/* Design a GUI program using Java Swing API to create a frame containing
three buttons (Yes, No, Close). When button yes or no is pressed, the message
"Button Yes/No is pressed" gets displayed in label control. On pressing
CLOSE button frame window gets closed.
 */

import javax.swing.*;
import java.awt.event.*;

public class GUIYesOrNo{
	
	JButton buttonYes, buttonNo, buttonClose; 
	JLabel resultLabel; 
	
	GUIYesOrNo(){
		// Creating Frames
		JFrame frame = new JFrame(); 
		
		// Creating Buttons
		buttonYes = new JButton("YES"); 
		buttonYes.setBounds(0, 0, 500, 100);
		
		buttonNo = new JButton("NO"); 
		buttonNo.setBounds(0, 100, 500, 100);
		
		buttonClose = new JButton("CLOSE"); 
		buttonClose.setBounds(0, 200, 500, 100); 
		
		// Creating Labels
		resultLabel = new JLabel("Click YES/NO to check Results!!", JLabel.CENTER);
		resultLabel.setBounds(0, 290, 500, 80); 
		
		// Adding Items to frame 
		frame.add(buttonYes); 
		frame.add(buttonNo); 
		frame.add(buttonClose);
		frame.add(resultLabel); 
		
		// Mandatory to set these three For Frames
		frame.setTitle("URK20CS2001 GUI YES/NO"); 
		frame.setSize(500, 400);
		frame.setLayout(null);
		frame.setVisible(true); 
		frame.setResizable(false); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Event Listeners for Buttons.
		buttonYes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resultLabel.setText("Button YES is pressed");
			}
		});
		
		buttonNo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				resultLabel.setText("Button NO is pressed");
			}
		});
		
		buttonClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button CLOSE is pressed!!");
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new GUIYesOrNo();
	}
}

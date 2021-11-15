/*Design a GUI program using Java Swing API to create a frame containing
choice list, labels and text fields. When any item is choosen in list then it has
to be displayed in the text box. 
 */

import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;

public class GUIComboList {
	
	JLabel subject, subName; 
	JTextField subjectName; 
	JComboBox comboBox; 
	JTextField result; 
	
	GUIComboList(){
		// Creating Frames 
		JFrame frame = new JFrame(); 
		frame.getContentPane().setBackground(new java.awt.Color(204, 166, 166));
		
		// Labels
		subject = new JLabel("SELECT SUBJECT:");
		subject.setBounds(100, 50, 200, 100);
		subject.setFont(new Font("Roboto", Font.BOLD, 18));
		
		subName = new JLabel("SUBJECT NAME: "); 
		subName.setBounds(100, 150, 200, 100);
		subName.setFont(new Font("Roboto", Font.BOLD, 18));
		
		String subjects[] = {"Object Oriented Programming", 
							 "Data Structures and Algorithms", 
							 "Software Engineering", 
							 "Probablity", 
							 "HTML", "CSS", "JS"};
	
		// Swing Combo box 
		comboBox = new JComboBox(subjects); 
		comboBox.setBounds(300, 85, 250, 35);
		comboBox.setFont(new Font("Roboto", 0, 16));
		
		// Swing Text Field
		result = new JTextField(); 
		result.setBounds(300, 182, 250, 35);
		result.setFont(new Font("Roboto", Font.BOLD, 16));
		result.setEditable(false);
		
		// Adding widgets to frame 
		frame.add(subject);
		frame.add(subName);
		frame.add(comboBox);
		frame.add(result); 
		
		// Mandatory attributes for swing 
		frame.setTitle("URK20CS2001 COMBO LIST"); 
		frame.setSize(700, 380); 
		frame.setLayout(null);
		frame.setVisible(true); 
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Item Event Listener
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
		    {
		        if (e.getSource() == comboBox) {
		            result.setText((String) comboBox.getSelectedItem());
		        }
		    }
		});
		
	}
	
	public static void main(String[] args) {
		new GUIComboList(); 
	}
}

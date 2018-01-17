package ObserversExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Program {

	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                createAndShowGUI();
//            }
//        });
    
		javax.swing.SwingUtilities.invokeLater(()->
                createAndShowGUI()
            );

	}
	public static void createAndShowGUI()  {
		//Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JButton button = new JButton("Hello World");
        
        // before Java 8
//        button.addActionListener(new ActionListener() {
//
//        	@Override
//        	public void actionPerformed(ActionEvent e) {
//        		System.out.println("Hello world");
//
//        	}
//        });
        
        // In Java 8
        
        button.addActionListener(e -> System.out.println("hello 		world"));
        frame.getContentPane().add(button);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }


	

}

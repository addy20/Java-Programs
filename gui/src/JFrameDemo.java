import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JFrameDemo extends JFrame{
	JButton quitButton;
	public JFrameDemo() {
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("A Really Simple Demo", JLabel.CENTER));
		cp.add(quitButton=new JButton("Exit"));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ActionListener act=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
            setVisible(false);
            dispose();
            System.exit(0);
			}
		};
		quitButton.addActionListener(act);
		pack();
		setLocation(500,400);
	}

	public static void main(String[] args) {
    JFrameDemo jgd=new JFrameDemo();
    jgd.setSize(500,400);
    jgd.setTitle("Jframe Demo");
    jgd.setVisible(true);
    jgd.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}

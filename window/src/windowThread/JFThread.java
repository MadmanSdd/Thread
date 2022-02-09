package windowThread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class JFThread extends JFrame{
	
	//components
	private JPanel jpanel = new JPanel(new GridBagLayout());
	
	private JLabel jlabelOne = new JLabel("One Time");
	private JTextField jtextOne = new JTextField();
	
	private JLabel jlabelTwo = new JLabel("Two Time");
	private JTextField jtextTwo = new JTextField();
	
	private JButton jbuttonOne = new JButton();
	private JButton jbuttonTwo = new JButton();
	
	private Runnable threadOne = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				jtextOne.setText(
							new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
							.format(Calendar.getInstance().getTime())
						);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	private Thread threadOneTime; 
	
	private Runnable threadTwo = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				jtextTwo.setText(
							new SimpleDateFormat("dd/MM/yyyy hh:mm:ss")
							.format(Calendar.getInstance().getTime())
						);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
	
	private Thread threadTwoTime;
	
	public JFThread () {
		setTitle("Projeto thread com swing");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		//grid
		GridBagConstraints griBag = new GridBagConstraints();
		griBag.gridx = 0;
		griBag.gridy = 0;
		griBag.gridwidth = 2;
		griBag.insets = new Insets(5, 5, 5, 5);// space in components
		griBag.anchor = GridBagConstraints.CENTER;// center in grid
		
		//Add label
		jlabelOne.setPreferredSize(new Dimension(200,25));
		jpanel.add(jlabelOne,griBag);
		
		// Add jtexte
		jtextOne.setPreferredSize(new Dimension(200,25));
		jtextOne.setEditable(false);
		griBag.gridy++;
		jpanel.add(jtextOne,griBag);
		
		
		jlabelTwo.setPreferredSize(new Dimension(200,25));
		griBag.gridy++;
		jpanel.add(jlabelTwo,griBag);
		
		// Add Jtext
		jtextTwo.setPreferredSize(new Dimension(200,25));
		jtextTwo.setEditable(false);
		griBag.gridy++;
		jpanel.add(jtextTwo,griBag);
		
		griBag.gridwidth = 1;
		
		//Button 
		jbuttonOne.setPreferredSize(new Dimension(92,25));
		jbuttonOne.setText("Start");
		griBag.gridy++;
		jpanel.add(jbuttonOne,griBag);
		
		jbuttonOne.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				threadOneTime = new Thread(threadOne);
				threadOneTime.start();
				
				threadTwoTime = new Thread(threadTwo);
				threadTwoTime.start();
				
				jbuttonOne.setEnabled(false);
				jbuttonTwo.setEnabled(true);
			}
		});
		
		jbuttonTwo.setPreferredSize(new Dimension(92,25));
		jbuttonTwo.setText("Stop");
		jbuttonTwo.setEnabled(false);
		griBag.gridx++;
		jpanel.add(jbuttonTwo,griBag);
		
		jbuttonTwo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				threadOneTime.stop();
				threadTwoTime.stop();
				
				jbuttonOne.setEnabled(true);
				jbuttonTwo.setEnabled(false);
			}
		});
	
		//jpanel.setBackground(Color.red);
		add(jpanel,BorderLayout.CENTER);
		
		setVisible(true);
	}
	
}

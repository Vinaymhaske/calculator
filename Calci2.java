package Calci;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calci2 extends Frame implements ActionListener {
	// 1) Declaration
	Button b1, b2, b3;
	Label l1, l2, l3;
	TextField t1, t2, t3;

	Calci2() {
		setTitle("Simple Calci");
		setSize(250, 300);
		setLocation(350, 250);
		setLayout(new FlowLayout()); // IMP

		// 2) Memory Allocation
		b1 = new Button("ADD");
		b2 = new Button("CLR");
		b3 = new Button("EXT");

		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);

		l1 = new Label("Enter First No.");
		l2 = new Label("Enter Second No.");
		l3 = new Label("Addition of 2 No.");

		// 3) Add Component on the frame
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
		add(b3);

		// 4) Add Listener on controls
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		addWindowListener((WindowListener) new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());
			int c = a + b;
			// t3.setText(""+c);
			t3.setText(Integer.toString(c));
		} else if (e.getSource() == b2) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t1.requestFocus();
		} else if (e.getSource() == b3) {
			System.exit(0);
		}
	}
	//main 
	public static void main(String args[]) {
		new Calci2();
	}

}

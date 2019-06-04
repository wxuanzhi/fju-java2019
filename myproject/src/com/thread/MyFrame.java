package com.thread;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MyFrame extends JFrame {
	public MyFrame() {
		setSize(500, 300);
		JButton ok = new JButton("ok");
		JPanel north = new JPanel();
		north.add(ok);
		add(north, BorderLayout.NORTH);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

}

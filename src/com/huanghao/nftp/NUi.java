package com.huanghao.nftp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class ndUI extends JFrame {

	private JPanel contentPane;
	private final JPanel panel_4 = new JPanel();
	private JTextField username;
	private JPasswordField pw;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ndUI frame = new ndUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ndUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel.add(panel_4, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		username = new JTextField();
		username.setBounds(233, 51, 153, 21);
		panel_3.add(username);
		username.setColumns(10);
		
		pw = new JPasswordField();
		pw.setSize(153, 21);
		pw.setLocation(233, 103);
		panel_3.add(pw);
		pw.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setText("\u7528\u6237\u540D\uFF1A");
		textArea.setBounds(176, 51, 54, 21);
		panel_3.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setText("\u5BC6\u7801\uFF1A");
		textArea_1.setBounds(176, 103, 54, 22);
		panel_3.add(textArea_1);
		
		JButton button = new JButton("\u767B\u5F55");
		button.setBounds(316, 173, 70, 25);
		panel_3.add(button);
		
		JButton button_1 = new JButton("\u6CE8\u518C");
		button_1.setBounds(236, 173, 70, 25);
		panel_3.add(button_1);
		
		JRadioButton radioButton = new JRadioButton("\u8BB0\u4F4F\u5BC6\u7801");
		radioButton.setBackground(Color.LIGHT_GRAY);
		radioButton.setFont(new Font("ËÎÌו", Font.PLAIN, 10));
		radioButton.setBounds(233, 130, 73, 23);
		panel_3.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\u5FD8\u8BB0\u5BC6\u7801\uFF1F");
		radioButton_1.setBackground(Color.LIGHT_GRAY);
		radioButton_1.setFont(new Font("ËÎÌו", Font.PLAIN, 10));
		radioButton_1.setBounds(301, 130, 85, 23);
		panel_3.add(radioButton_1);
		
		JPanel panel_5 = new JPanel();
		panel.add(panel_5, BorderLayout.EAST);
	}
}

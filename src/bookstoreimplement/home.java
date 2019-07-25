package bookstoreimplement;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

public class home {

	public  JFrame frame;
	public JPanel panel ,panel_1,panel_2,panel_3,panel_4,panel_5;
	public JLabel lblNewLabel_2, lblNewLabel, lblNewLabel_1,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_7,lblNewLabel_8
	,lblNewLabel_9,lblNewLabel_10,lblNewLabel_11,lblNewLabel_12,lblNewLabel_13,lblNewLabel_14,lblNewLabel_15,lblNewLabel_16,lblKetaby,lblSearchBy
	,lblTitle1,lblISBN,lblCategory,lblAuthor,lblPublisher,lblTitleISBN,lblTitle,lblIsbn,lblQuantaty;
	public JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6,textField_7,textField_8,textField_9,textFieldTitle_ISBN,textField_10,textField_11;
	public JButton  btnNewButton, btnNewButton_1,btnNewButton_2,btnNewButton_3,btnNewButton_4, btnNewButton_5, btnNewButton_6, btnNewButton_7,btnNewButton_8
	,btnNewButton_9,btnPersonalInfo,btnLogOut,btnSearch,btnCart,btnAddToCart,btnSearch_1;
	public JPasswordField passwordField,passwordField_1,passwordField_2;
	public JMenuBar menuBar;
	public JMenuItem mntmTitle,mntmTitle_1,mntmAuthor,mntmPublisher,mntmScience, mntmArt,mntmReligion,mntmHistory,mntmGeography;
	public JMenu mnTitle_1,mnCategory;
	public JTable table;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Ketaby Book Store");
		frame.setBounds(0, 0, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		
		
		
		
		/////////
		
		
		}
}

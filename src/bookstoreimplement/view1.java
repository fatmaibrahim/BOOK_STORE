package bookstoreimplement;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class view1 extends JFrame {

	public JPanel panel_11 ;
	public JButton btnModifyBooks,btnPlaceOrders ,btnAddManager,btnViewReports;
	public view1(){
		initialize();
	}
	private void initialize() {	
	//panel-11 manger actions
	//frame_1 = new JFrame("Ketaby Book Store");
//	frame_1.setBounds(500, 200, 320, 371);
//	frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//frame_1.getContentPane().setLayout(null);
	
	panel_11 = new JPanel();
	panel_11.setBounds(0, 0,304, 333);
	panel_11.setBackground(new Color(255,255,255));
	//frame_1.getContentPane().add(panel_11);
	panel_11.setLayout(null);
	
	btnModifyBooks = new JButton("Modify Books");
	btnModifyBooks.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnModifyBooks.setBounds(50, 39, 202, 47);
	btnModifyBooks.setForeground(new Color(255,255,255));
	btnModifyBooks.setBackground(new Color(102,0,21));
	panel_11.add(btnModifyBooks);
	
	btnPlaceOrders = new JButton("Place Orders");
	btnPlaceOrders.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnPlaceOrders.setBounds(50, 109, 202, 47);
	btnPlaceOrders.setForeground(new Color(255,255,255));
	btnPlaceOrders.setBackground(new Color(102,0,21));
	panel_11.add(btnPlaceOrders);
	
	btnAddManager = new JButton("Add Manager");
	btnAddManager.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnAddManager.setBounds(50, 179, 202, 47);
	btnAddManager.setForeground(new Color(255,255,255));
	btnAddManager.setBackground(new Color(102,0,21));
	panel_11.add(btnAddManager);
	
	btnViewReports = new JButton("View Reports");
	btnViewReports.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnViewReports.setBounds(50, 249, 202, 47);
	btnViewReports.setForeground(new Color(255,255,255));
	btnViewReports.setBackground(new Color(102,0,21));
	panel_11.add(btnViewReports);
	//panel_11
	this.add(panel_11);
	 panel_11.setVisible(true);
	}	
}

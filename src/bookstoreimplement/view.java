package bookstoreimplement;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;



@SuppressWarnings("serial")
public class view extends JFrame {
	//public  JFrame frame;
	public JPanel panel ,panel_1,panel_2,panel_3,panel_4,panel_5,panel_6,panel_7,panel_8,panel_9,panel_10,panel_12,panel_13,panel_14,panel_15,panel_16,panel_17;
	public JLabel lblNewLabel_2,lblName,	lblPass,lblNewLabel, lblNewLabel_1,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5,lblNewLabel_6,lblNewLabel_7,lblNewLabel_8
	,lblNewLabel_9,lblNewLabel_10,lblNewLabel_11,lblFName,lblNewLabel_12,lblLName,lblEmail,lblTotalPrice,
	lblKetaby_1 ,lblNewLabel_13,lblNewLabel_14,lblAuthor_1,lblIsbn_1,lblCategory_1,lblThreshold,lblPublishingYear,lblPublisherName,lblExpiryDate,lblNewLabel_15,lblNewLabel_16,lblKetaby,lblSearchBy
	,lblTitle1,lblISBN,lblCategory,lblAuthor,lblTitle_1,lblQuantity,lblPublisherPhone,lblPublisherAddress,lblPrice,lblShoppingCart,lblKetaby_2,lblCardNo,lblPublisher,lblTitleISBN,lblNum,lblAdd,lblTitle,lblIsbn,lblQuantaty,lblEdit
	,lblPlaceOrders,lblOrdersTable,lblIsbn_2,lblQuantity_1,lblViewReports,lblAddManager;
	public JTextField textField,textField_1,textFieldL,textField_23,textField_24,textField_22,textField_21, textField_20,textField_18,textField_15,textField_19,textField_16,textField_17,textField_14,textField_13,textField_12,textFieldNum
	,textField_2,textFieldAdd,textFieldF,textFieldName,textFieldE,textField_3,textField_4,textField_5,textField_6,textField_7,
	textField_8,textField_9,textFieldTitle_ISBN,textField_10,textField_11,textField_25,textField_26;
	public JButton  btnNewButton, btnNewButton_1,btnRemove_1,btnUpdate,btnNewButton_2,btnNewButton_3,btnNewButton_4, btnNewButton_5, btnNewButton_6, btnNewButton_7,btnNewButton_8
	,btnNewButton_9,btnBack ,btnAdd ,btnBack_1,btnSubmit,btnBack_2,btnCheckOut,btnSave,btnBackU,btnBackE,btnPersonalInfo,btnLogOut,btnSearch,btnCart,btnAddToCart,btnSearch_1,btnRemove,btnMoreActions,btnAddManager,
	btnBack_3,btnConfirm,btnInsert,btnShowTop5Customer,btnTop10Books,btnShowTotalSales,btnAddManager_1,btnBack_4,btnBack_5;
	public JPasswordField passwordField,passwordField_1,passwordField_2,passwordFieldPass;
	public JTable table,table_1,table_2,table_3,table_4,table_5;
	public JScrollPane scrollPane,scrollPane_1,scrollPane_2,scrollPane_3, scrollPane_4,scrollPane_5;
	public String [] compChoice={"ISBN","Title","Author","Publisher","Category"};
	public JComboBox comboBox,comboBox_1,comboBox_2;
	public String [] category ={"Art","History","Geography","Religion","Science"};

	
	public view(){
		initialize();
	}
	
@SuppressWarnings("deprecation")
private void initialize() {
		
//		frame = new JFrame("Ketaby Book Store");
//		frame.setBounds(0, 0, 1000, 700);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
		//PANEL first page
		panel=new JPanel();
		panel.setBackground(new Color(148,105,175));
		panel.setBounds(0, 0, 1000, 700);
		//frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ketaby Book Store");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 26, 1000, 46);
		lblNewLabel.setBackground(new Color(255,255,255));
		lblNewLabel.setForeground(new Color(33,13,45));
		panel.add(lblNewLabel);
		
				
		lblNewLabel_1 = new JLabel("Welcome To Our Book Store");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(329, 169, 376, 56);
		lblNewLabel_1.setForeground(new Color(33,13,45));
		panel.add(lblNewLabel_1);
		
		btnNewButton_1 = new JButton("Sign Up");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(378, 283, 243, 46);
		btnNewButton_1.setBackground(new Color(57,22,78));
		btnNewButton_1.setForeground(new Color(255 ,255, 255));
		btnNewButton_1.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Log In");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_2.setBounds(378, 355,243, 46);
		btnNewButton_2.setBackground(new Color(57,22,78));
		btnNewButton_2.setForeground(new Color(255 ,255, 255));
		btnNewButton_2.setBorder(new LineBorder(new Color(255, 255, 255), 3));
		panel.add(btnNewButton_2);
		
	//PANEL
	//panel_1 sign up
		panel_1 =new JPanel();
		panel_1.setBackground(new Color(255,255,255));
		panel_1.setBounds(0, 0, 1000, 700);
		//frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
	    lblNewLabel_2 = new JLabel("Sign Up");
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.PLAIN, 30));
		lblNewLabel_2.setForeground(new Color(153,51,201));
		lblNewLabel_2.setBounds(20, 11, 117, 42);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Please Fill This Fields To Complete Sign Up Operation !");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(42, 58, 451, 47);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("User Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(65, 123, 153, 27);
		panel_1.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(270, 123, 276, 29);
		panel_1.add(textField);
		textField.setColumns(20);
		
		lblNewLabel_5 = new JLabel("Passward");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(65, 173, 153, 27);
		panel_1.add(lblNewLabel_5);
		
		//textField_1=new JTextField();
		//textField_1.setBounds(270, 173, 276, 29);
		passwordField = new JPasswordField(20);
		passwordField.setBounds(270, 173, 276, 29);
		panel_1.add(passwordField);
		
		lblNewLabel_6 = new JLabel("First Name");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(65, 223, 153, 27);
		panel_1.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(270, 223, 276, 29);
		panel_1.add(textField_2);
		textField_2.setColumns(20);
		
		lblNewLabel_7 = new JLabel("Last Name");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(65, 273, 153, 27);
		panel_1.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(270, 273, 276, 29);
		panel_1.add(textField_3);
		textField_3.setColumns(20);
		
		lblNewLabel_8 = new JLabel("E-mail");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(65, 323, 153, 27);
		panel_1.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(270,323, 276, 29);
		panel_1.add(textField_4);
		textField_4.setColumns(30);
		
		lblNewLabel_9 = new JLabel("Phone Number");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(65, 373, 153, 27);
		panel_1.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(270,373, 276, 29);
		panel_1.add(textField_5);
		textField_5.setColumns(20);
		
		lblNewLabel_10 = new JLabel("Shipping Address");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(65, 423, 153, 27);
		panel_1.add(lblNewLabel_10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(270,423, 276, 29);
		panel_1.add(textField_6);
		textField_6.setColumns(40);
		
		btnNewButton_4 = new JButton("Submit");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.setBounds(418, 543, 183, 42);
		btnNewButton_4.setBackground(new Color(153,51,201));
		btnNewButton_4.setForeground(new Color(255,255,255));
		panel_1.add(btnNewButton_4);
		
		btnBackU = new JButton("Back");
		btnBackU.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBackU.setBounds(418, 600, 183, 42);
		btnBackU.setBackground(new Color(153,51,201));
		btnBackU.setForeground(new Color(255,255,255));
		panel_1.add(btnBackU);
		//panel_1
	
		//panel_3 sign in Customer
		panel_3 =new JPanel();
		panel_3.setBackground(new Color(255,255,255));
		panel_3.setBounds(0, 0, 1000, 700);
		//frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
	    lblNewLabel_14 = new JLabel("Sign In");
		lblNewLabel_14.setFont(new Font("Sylfaen", Font.PLAIN, 30));
		lblNewLabel_14.setForeground(new Color(153,51,201));
		lblNewLabel_14.setBounds(20, 11, 117, 42);
		panel_3.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("Email");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_15.setBounds(335, 137, 99, 29);
		panel_3.add(lblNewLabel_15);
		
		textField_8 = new JTextField();
		textField_8.setBounds(335, 177, 274, 29);
		panel_3.add(textField_8);
		textField_8.setColumns(20);
		
		lblNewLabel_16 = new JLabel("Passward");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_16.setBounds(335, 225, 99, 29);
		panel_3.add(lblNewLabel_16);
		
		btnNewButton_8 = new JButton("Sign Up!");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_8.setBounds(335, 302, 274, 29);
		btnNewButton_8.setBackground(new Color(255,255,255));
		btnNewButton_8.setBorder(new LineBorder(new Color(255, 255, 255)));
		panel_3.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("Submit");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_9.setBounds(335, 356, 274, 56);
		btnNewButton_9.setBackground(new Color(153,51,201));
		btnNewButton_9.setForeground(new Color(255,255,255));
		btnNewButton_9.setBorder(new LineBorder(new Color(153, 51, 201)));
		panel_3.add(btnNewButton_9);
		
		btnBack = new JButton("Back");
		btnBack .setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack .setBounds(335, 423, 274, 56);
		btnBack .setBackground(new Color(153,51,201));
		btnBack .setForeground(new Color(255,255,255));
		btnBack .setBorder(new LineBorder(new Color(153, 51, 201)));
		panel_3.add(btnBack );
		
		passwordField_2 = new JPasswordField(20);
		passwordField_2.setBounds(335, 265, 274, 29);
		panel_3.add(passwordField_2);
		
	//panel_3
		
			//panel_4,panel_5 customer main page
		panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 741, 700);
		panel_4.setBackground(new Color(255,255,255));
		//frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		lblKetaby = new JLabel("Ketaby Book Store");
		lblKetaby.setBounds(10, 11, 281, 37);
		lblKetaby.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblKetaby.setForeground(new Color(33,13,45));
		panel_4.add(lblKetaby);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 59, 721, 520);
		panel_4.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		lblIsbn = new JLabel("ISBN :");
		lblIsbn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblIsbn.setBounds(20, 594, 76, 26);
		lblIsbn.setForeground(new Color(102,0,51));
		panel_4.add(lblIsbn);
		
		lblQuantaty = new JLabel("Quantity:");
		lblQuantaty.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantaty.setBounds(20, 631, 106, 28);
		lblQuantaty.setForeground(new Color(102,0,51));
		panel_4.add(lblQuantaty);
		
		textField_10 = new JTextField();
		textField_10.setBounds(106, 599, 183, 20);
		panel_4.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(106, 637, 183, 20);
		panel_4.add(textField_11);
		textField_11.setColumns(10);
		
		btnAddToCart = new JButton("Add To Cart");
		btnAddToCart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddToCart.setBounds(334, 609, 141, 37);
		btnAddToCart.setBackground(new Color(102,0,51));
		btnAddToCart.setForeground(new Color(255,255,255));
		panel_4.add(btnAddToCart);
		
		btnMoreActions = new JButton("More Actions");
		btnMoreActions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnMoreActions.setBounds(590, 609, 141, 37);
		btnMoreActions.setBackground(new Color(102,0,51));
		btnMoreActions.setForeground(new Color(255,255,255));
		btnMoreActions.hide();
		panel_4.add(btnMoreActions);
		
		
		panel_5 =new JPanel();
		panel_5.setBounds(742, 0, 242, 662);
		//frame.getContentPane().add(panel_5);
		panel_5.setBackground(new Color(102,0,51));
		panel_5.setLayout(null);
		
		btnPersonalInfo = new JButton("Edit Personal Information");
		btnPersonalInfo.setBounds(10, 11, 222, 39);
		btnPersonalInfo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPersonalInfo.setBackground(new Color(255,255,255));
		btnPersonalInfo.setForeground(new Color(102,0,51));
		panel_5.add(btnPersonalInfo);
		
		btnLogOut = new JButton("Log Out");
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogOut.setBounds(12, 72, 220, 45);
		btnLogOut.setBackground(new Color(255,255,255));
		btnLogOut.setForeground(new Color(102,0,51));
		panel_5.add(btnLogOut);
		
		btnSearch = new JButton("search");
		btnSearch.setBounds(20, 139, 89, 66);
		btnSearch.setBackground(new Color(255,255,255));
		btnSearch.setIcon(new ImageIcon(("images/search.png")));
		panel_5.add(btnSearch);
		
		btnCart = new JButton("Shopping Cart");
		btnCart.setBounds(132, 139, 89, 66);
		btnCart.setBackground(new Color(255,255,255));
		btnCart.setIcon(new ImageIcon("images/cart (1).png"));
		panel_5.add(btnCart);
		
		lblSearchBy = new JLabel("Search By: ");
		lblSearchBy.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSearchBy.setBounds(18, 228, 99, 25);
		lblSearchBy.setForeground(new Color(255,255,255));
		lblSearchBy.hide();
		panel_5.add(lblSearchBy);
		
		////////////////////
		
		lblTitle1 = new JLabel("Title");
		lblTitle1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTitle1.setBounds(12, 400, 61, 25);
		lblTitle1.setForeground(new Color(255,255,255));
		lblTitle1.hide();
		panel_5.add(lblTitle1);

		lblISBN = new JLabel("ISBN");
		lblISBN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblISBN.setBounds(12, 400, 61, 25);
		lblISBN.setForeground(new Color(255,255,255));
		lblISBN.hide();
		panel_5.add(lblISBN);
		
		textField_9 = new JTextField();
		textField_9.setBounds(10, 430, 222, 30);
		textField_9.hide();
		panel_5.add(textField_9);
		textField_9.setColumns(30);
		
		lblTitleISBN = new JLabel("ISBN");
		lblTitleISBN.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTitleISBN.setBounds(10, 471, 61, 25);
		lblTitleISBN.hide();
		panel_5.add(lblTitleISBN);
		
		textFieldTitle_ISBN = new JTextField();
		textFieldTitle_ISBN.setBounds(10, 507, 222, 30);
		textFieldTitle_ISBN.hide();
		panel_5.add(textFieldTitle_ISBN);
		textFieldTitle_ISBN.setColumns(10);
		
		lblCategory = new JLabel("Category");
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCategory.setBounds(12, 400, 61, 25);
		lblCategory.setForeground(new Color(255,255,255));
		lblCategory.hide();
		panel_5.add(lblCategory);
		
		lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAuthor.setBounds(12, 400, 61, 25);
		lblAuthor.setForeground(new Color(255,255,255));
		lblAuthor.hide();
		panel_5.add(lblAuthor);
		
		lblPublisher = new JLabel("Publisher");
		lblPublisher.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPublisher.setBounds(12, 400, 61, 25);
		lblPublisher.setForeground(new Color(255,255,255));
		lblPublisher.hide();
		panel_5.add(lblPublisher);
		
		btnSearch_1 = new JButton("Search");
		btnSearch_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSearch_1.setBounds(65, 576, 117, 39);
		btnSearch_1.setBackground(new Color(255,255,255));
		btnSearch_1.hide();
		panel_5.add(btnSearch_1);
		
		comboBox_2 = new JComboBox(compChoice);
		comboBox_2.setBounds(20, 275, 201, 30);
		comboBox_2.setSelectedItem(null);
		comboBox_2.hide();
		panel_5.add(comboBox_2);
		
		
		comboBox_1 = new JComboBox(category);
		comboBox_1.setBounds(10, 430, 222, 30);
		comboBox_1.setSelectedItem(null);
		comboBox_1.hide();
		panel_5.add(comboBox_1);

		
			//panel_4 ,panel_5
				
				//panel_6 edit information
				panel_6 = new JPanel();
				panel_6.setBounds(0, 0, 1000, 700);
				panel_6.setBackground(new Color(255,255,255));
				//frame.getContentPane().add(panel_6);
				panel_6.setLayout(null);
				
				lblEdit = new JLabel("Edit Account Information");
				lblEdit.setFont(new Font("Sylfaen", Font.PLAIN, 30));
				lblEdit.setForeground(new Color(153,51,201));
				lblEdit.setBounds(20, 11, 500, 42);
				panel_6.add(lblEdit);
				
				
				lblName = new JLabel("User Name");
				lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblName.setBounds(65, 123, 153, 27);
				panel_6.add(lblName);
				
				textFieldName = new JTextField();
				textFieldName.setBounds(270, 123, 276, 29);
				panel_6.add(textFieldName);
				textFieldName.setColumns(20);
				
				lblPass = new JLabel("Passward");
				lblPass.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblPass.setBounds(65, 173, 153, 27);
				panel_6.add(lblPass);
				
				//textField_1=new JTextField();
				//textField_1.setBounds(270, 173, 276, 29);
				passwordFieldPass = new JPasswordField(20);
				passwordFieldPass.setBounds(270, 173, 276, 29);
				panel_6.add(passwordFieldPass);
				
				lblFName = new JLabel("First Name");
				lblFName.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblFName.setBounds(65, 223, 153, 27);
				panel_6.add(lblFName);
				
				textFieldF = new JTextField();
				textFieldF.setBounds(270, 223, 276, 29);
				panel_6.add(textFieldF);
				textFieldF.setColumns(20);
				
				lblLName = new JLabel("Last Name");
				lblLName.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblLName.setBounds(65, 273, 153, 27);
				panel_6.add(lblLName);
				
				textFieldL = new JTextField();
				textFieldL.setBounds(270, 273, 276, 29);
				panel_6.add(textFieldL);
				textFieldL.setColumns(20);
				
				lblEmail = new JLabel("E-mail");
				lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblEmail.setBounds(65, 323, 153, 27);
				panel_6.add(lblEmail);
				
				textFieldE = new JTextField();
				textFieldE.setBounds(270,323, 276, 29);
				panel_6.add(textFieldE);
				textFieldE.setColumns(30);
				
				lblNum = new JLabel("Phone Number");
				lblNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblNum.setBounds(65, 373, 153, 27);
				panel_6.add(lblNum);
				
				textFieldNum = new JTextField();
				textFieldNum.setBounds(270,373, 276, 29);
				panel_6.add(textFieldNum);
				textFieldNum.setColumns(20);
				
				lblAdd = new JLabel("Shipping Address");
				lblAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblAdd.setBounds(65, 423, 153, 27);
				panel_6.add(lblAdd);
				
				textFieldAdd = new JTextField();
				textFieldAdd.setBounds(270,423, 276, 29);
				panel_6.add(textFieldAdd);
				textFieldAdd.setColumns(40);
				
				btnSave = new JButton("Save");
				btnSave.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnSave.setBounds(418, 543, 183, 42);
				btnSave.setBackground(new Color(153,51,201));
				btnSave.setForeground(new Color(255,255,255));
				panel_6.add(btnSave);
				
				btnBackE = new JButton("Back");
				btnBackE.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnBackE.setBounds(418, 600, 183, 42);
				btnBackE.setBackground(new Color(153,51,201));
				btnBackE.setForeground(new Color(255,255,255));
				panel_6.add(btnBackE);
				
			//panel_6
				
			//panel_7,panel_8 Shopping Cart
				
				panel_7 = new JPanel();
				panel_7.setBounds(0, 0, 627, 700);
				panel_7.setBackground(new Color(255,255,255));
			//	frame.getContentPane().add(panel_7);
				panel_7.setLayout(null);
				
				panel_8 =new JPanel();
				panel_8.setBounds(626, 0, 358, 662);
				//frame.getContentPane().add(panel_8);
				panel_8.setBackground(new Color(102,0,51));
				panel_8.setLayout(null);
				
				lblTotalPrice = new JLabel("Total Price ");
				lblTotalPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblTotalPrice.setForeground(new Color(255,255,255));
				lblTotalPrice.setBounds(21, 115, 101, 47);
				panel_8.add(lblTotalPrice);
				
				textField_12 = new JTextField();
				textField_12.setBounds(149, 130, 115, 32);
				panel_8.add(textField_12);
				textField_12.setColumns(10);
				
				btnCheckOut = new JButton("Check Out");
				btnCheckOut.setFont(new Font("Tahoma", Font.PLAIN, 14));
				btnCheckOut.setBounds(92, 238, 152, 39);
				btnCheckOut.setBackground(new Color(255,255,255));
				panel_8.add(btnCheckOut);
				
				lblCardNo = new JLabel("Card No:");
				lblCardNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblCardNo.setBounds(92, 325, 101, 32);
				lblCardNo.setForeground(new Color(255,255,255));
				lblCardNo.hide();
				panel_8.add(lblCardNo);
				
				textField_13 = new JTextField();
				textField_13.setBounds(92, 368, 223, 32);
				textField_13.hide();
				panel_8.add(textField_13);
				textField_13.setColumns(40);
				
				lblExpiryDate = new JLabel("Expiry Date:");
				lblExpiryDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblExpiryDate.setBounds(92, 411, 101, 40);
				lblExpiryDate.setForeground(new Color(255,255,255));
				lblExpiryDate.hide();
				panel_8.add(lblExpiryDate);
				
				textField_14 = new JTextField();
				textField_14.setBounds(92, 462, 223, 32);
				textField_14.hide();
				panel_8.add(textField_14);
				textField_14.setColumns(15);
				
				btnSubmit = new JButton("Submit");
				btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
				btnSubmit.setBounds(106, 546, 138, 32);
				btnSubmit.setBackground(new Color(255,255,255));
				btnSubmit.hide();
				panel_8.add(btnSubmit);
				
				lblKetaby_1 = new JLabel("Ketaby Book Store");
				lblKetaby_1.setBounds(10, 11, 281, 37);
				lblKetaby_1.setFont(new Font("Tahoma", Font.BOLD, 30));
				lblKetaby_1.setForeground(new Color(33,13,45));
				panel_7.add(lblKetaby_1);
				
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(33, 140, 563, 424);
				panel_7.add(scrollPane_1);
				
				table_1 = new JTable();
				scrollPane_1.setViewportView(table_1);
				
				btnBack_1 = new JButton("Back");
				btnBack_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				btnBack_1.setBounds(142, 586, 114, 45);
				btnBack_1.setBackground(new Color(102,0,51));
				btnBack_1.setForeground(new Color(255,255,255));
				panel_7.add(btnBack_1);
				
				btnRemove = new JButton("Remove");
				btnRemove.setFont(new Font("Tahoma", Font.PLAIN, 14));
				btnRemove.setBounds(379, 586, 114, 45);
				btnRemove.setBackground(new Color(102,0,51));
				btnRemove.setForeground(new Color(255,255,255));
				panel_7.add(btnRemove);
				
				lblShoppingCart = new JLabel("Shopping Cart");
				lblShoppingCart.setFont(new Font("Tahoma", Font.PLAIN, 22));
				lblShoppingCart.setBounds(33, 84, 240, 45);
				lblShoppingCart.setForeground(new Color(102,0,51));
				panel_7.add(lblShoppingCart);
						
				//panel_7,8
				
				//panel_9,10 add,remove,update book
				
				panel_9 = new JPanel();
				panel_9.setBounds(0, 0, 686, 700);
				panel_9.setBackground(new Color(255,255,255));
				//frame.getContentPane().add(panel_9);
				panel_9.setLayout(null);
				
				panel_10 =new JPanel();
				panel_10.setBounds(688, 0, 320, 662);
				//frame.getContentPane().add(panel_10);
				panel_10.setBackground(new Color(102,0,51));
				panel_10.setLayout(null);
				
				lblIsbn_1 = new JLabel("ISBN");
				lblIsbn_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblIsbn_1.setBounds(10, 10, 72, 29);
				lblIsbn_1.setForeground(new Color(255,255,255));
				panel_10.add(lblIsbn_1);
				
				textField_15 = new JTextField();
				textField_15.setBounds(125, 10, 161, 25);
				panel_10.add(textField_15);
				textField_15.setColumns(10);
				
				lblTitle_1 = new JLabel("Title");
				lblTitle_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblTitle_1.setBounds(10, 60, 72, 29);
				lblTitle_1.setForeground(new Color(255,255,255));
				panel_10.add(lblTitle_1);
				
				textField_16 = new JTextField();
				textField_16.setBounds(125, 60, 161, 25);
				panel_10.add(textField_16);
				textField_16.setColumns(10);
				
				lblPublisherName = new JLabel("Publisher Name");
				lblPublisherName.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblPublisherName.setBounds(10,410, 115, 29);
				lblPublisherName.setForeground(new Color(255,255,255));
				panel_10.add(lblPublisherName);
				
				textField_17 = new JTextField();
				textField_17.setBounds(125, 110, 161, 25);
				panel_10.add(textField_17);
				textField_17.setColumns(10);
				
				lblPublishingYear = new JLabel("Publishing Year");
				lblPublishingYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblPublishingYear.setBounds(10, 160,115, 29);
				lblPublishingYear.setForeground(new Color(255,255,255));
				panel_10.add(lblPublishingYear);
				
				textField_18 = new JTextField();
				textField_18.setBounds(125, 160, 161, 25);
				panel_10.add(textField_18);
				textField_18.setColumns(10);
				
				lblCategory_1 = new JLabel("Category");
				lblCategory_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblCategory_1.setBounds(10, 210, 72, 29);
				lblCategory_1.setForeground(new Color(255,255,255));
				panel_10.add(lblCategory_1);
				
				
				lblQuantity = new JLabel("Quantity");
				lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblQuantity.setBounds(10, 260, 72, 29);
				lblQuantity.setForeground(new Color(255,255,255));
				panel_10.add(lblQuantity);
				
				textField_19 = new JTextField();
				textField_19.setBounds(125, 260,161, 25);
				panel_10.add(textField_19);
				textField_19.setColumns(10);
				
				textField_20 = new JTextField();
				textField_20.setBounds(125, 310,161, 25);
				panel_10.add(textField_20);
				textField_20.setColumns(10);
				
				textField_21 = new JTextField();
				textField_21.setBounds(125, 360, 161, 25);
				panel_10.add(textField_21);
				textField_21.setColumns(10);
				
				lblPrice = new JLabel("Price");
				lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblPrice.setBounds(10, 310, 115, 29);
				lblPrice.setForeground(new Color(255,255,255));
				panel_10.add(lblPrice);
				
				lblThreshold = new JLabel("Threshold");
				lblThreshold.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblThreshold.setBounds(10, 360,115, 29);
				lblThreshold.setForeground(new Color(255,255,255));
				panel_10.add(lblThreshold);
				
				lblAuthor_1 = new JLabel("Author(s)");
				lblAuthor_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblAuthor_1.setBounds(10, 110, 115, 29);
				lblAuthor_1.setForeground(new Color(255,255,255));
				panel_10.add(lblAuthor_1);
				
				textField_22 = new JTextField();
				textField_22.setBounds(125, 410,161, 25);
				panel_10.add(textField_22);
				textField_22.setColumns(10);
				
				lblPublisherAddress = new JLabel("Publisher Address");
				lblPublisherAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblPublisherAddress.setBounds(10, 460, 115, 29);
				lblPublisherAddress.setForeground(new Color(255,255,255));
				panel_10.add(lblPublisherAddress);
				
				textField_23 = new JTextField();
				textField_23.setBounds(125, 460, 161, 25);
				panel_10.add(textField_23);
				textField_23.setColumns(10);
				
				lblPublisherPhone = new JLabel("Publisher Phone");
				lblPublisherPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblPublisherPhone.setBounds(10,510,161, 25);
				lblPublisherPhone.setForeground(new Color(255,255,255));
				panel_10.add(lblPublisherPhone);
				
				textField_24 = new JTextField();
				textField_24.setBounds(125, 510, 161, 25);
				panel_10.add(textField_24);
				textField_24.setColumns(10);
				
				btnAdd = new JButton("Add");
				btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnAdd.setBounds(10, 591, 100, 38);
				btnAdd.setBackground(new Color(255,255,255));
				btnAdd.setForeground(new Color(102,0,51));
				panel_10.add(btnAdd);
				
				btnUpdate = new JButton("Update");
				btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnUpdate.setBounds(186, 591, 100, 38);
				btnUpdate.setBackground(new Color(255,255,255));
				btnUpdate.setForeground(new Color(102,0,51));
				panel_10.add(btnUpdate);
				
				comboBox = new JComboBox(category);
				comboBox.setBounds(125, 216, 161, 25);
				comboBox.setSelectedItem(null);
				panel_10.add(comboBox);
				
				lblKetaby_2 = new JLabel("Ketaby Book Store");
				lblKetaby_2.setBounds(10, 11, 281, 37);
				lblKetaby_2.setFont(new Font("Tahoma", Font.BOLD, 30));
				lblKetaby_2.setForeground(new Color(33,13,45));
				panel_9.add(lblKetaby_2);
				
				scrollPane_2 = new JScrollPane();
				scrollPane_2.setBounds(10, 92, 666, 474);
				panel_9.add(scrollPane_2);
				
				table_2 = new JTable();
				scrollPane_2.setViewportView(table_2);
				
				btnBack_2 = new JButton("Back");
				btnBack_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnBack_2.setBounds(80, 597, 124, 47);
				btnBack_2.setForeground(new Color(255,255,255));
				btnBack_2.setBackground(new Color(102,0,51));
				panel_9.add(btnBack_2);
				
				btnRemove_1 = new JButton("Find With ISBN");
				btnRemove_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnRemove_1.setBounds(488, 597, 200, 47);
				btnRemove_1.setForeground(new Color(255,255,255));
				btnRemove_1.setBackground(new Color(102,0,51));
				panel_9.add(btnRemove_1);
				
				//panel_9,10
			
				//panel_12,panel_13  orders
				panel_12 = new JPanel();
				panel_12.setBounds(0, 0, 686, 700);
				panel_12.setBackground(new Color(255,255,255));
				//frame.getContentPane().add(panel_12);
				panel_12.setLayout(null);
				
				lblPlaceOrders = new JLabel("Place Orders");
				lblPlaceOrders.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblPlaceOrders.setBounds(10, 11, 205, 40);
				lblPlaceOrders.setForeground(new Color(102,0,21));
				panel_12.add(lblPlaceOrders);
				
				lblOrdersTable = new JLabel("Orders Table");
				lblOrdersTable.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblOrdersTable.setBounds(20, 62, 110, 31);
				lblOrdersTable.setForeground(new Color(102,0,21));
				panel_12.add(lblOrdersTable);
				
				scrollPane_3 = new JScrollPane();
				scrollPane_3.setBounds(30, 112, 632, 445);
				panel_12.add(scrollPane_3);
				
				table_3 = new JTable();
				scrollPane_3.setViewportView(table_3);
				
				btnBack_3 = new JButton("Back");
				btnBack_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnBack_3.setBounds(88, 599, 138, 40);
				btnBack_3.setForeground(new Color(255,255,255));
				btnBack_3.setBackground(new Color(102,0,21));
				panel_12.add(btnBack_3);
				
				btnConfirm = new JButton("Confirm");
				btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnConfirm.setBounds(441, 599, 138, 40);
				btnConfirm.setForeground(new Color(255,255,255));
				btnConfirm.setBackground(new Color(102,0,21));
				panel_12.add(btnConfirm);
				
				panel_13 =new JPanel();
				panel_13.setBounds(688, 0, 320, 662);
			//	frame.getContentPane().add(panel_13);
				panel_13.setBackground(new Color(102,0,51));
				panel_13.setLayout(null);
				
				lblIsbn_2 = new JLabel("ISBN");
				lblIsbn_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblIsbn_2.setBounds(10, 110, 46, 14);
				lblIsbn_2.setForeground(new Color(255,255,255));
				panel_13.add(lblIsbn_2);
				
				textField_25 = new JTextField();
				textField_25.setBounds(100, 105, 180, 33);
				panel_13.add(textField_25);
				textField_25.setColumns(45);
				
				lblQuantity_1 = new JLabel("Quantity");
				lblQuantity_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblQuantity_1.setBounds(10, 179, 76, 28);
				lblQuantity_1.setForeground(new Color(255,255,255));
				panel_13.add(lblQuantity_1);
				
				textField_26 = new JTextField();
				textField_26.setBounds(100, 185, 180, 33);
				panel_13.add(textField_26);
				textField_26.setColumns(20);
				
				btnInsert = new JButton("Insert");
				btnInsert.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnInsert.setBounds(82, 287, 139, 49);
				btnInsert.setForeground(new Color(102,0,21));
				btnInsert.setBackground(new Color(255,255,255));
				panel_13.add(btnInsert);
				
				//panel_13
				
				//panel_14,panel_15 show reports
				
				panel_14 = new JPanel();
				panel_14.setBounds(0, 0, 686, 700);
				panel_14.setBackground(new Color(255,255,255));
				//frame.getContentPane().add(panel_14);
				panel_14.setLayout(null);
				
				lblViewReports = new JLabel("View Reports");
				lblViewReports.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblViewReports.setBounds(10, 11, 249, 37);
				lblViewReports.setForeground(new Color(102,0,21));
				panel_14.add(lblViewReports);
				
				scrollPane_4 = new JScrollPane();
				scrollPane_4.setBounds(20, 64, 643, 504);
				panel_14.add(scrollPane_4);
				
				table_4 = new JTable();
				scrollPane_4.setViewportView(table_4);
				
				panel_15 =new JPanel();
				panel_15.setBounds(688, 0, 320, 662);
			//	frame.getContentPane().add(panel_15);
				panel_15.setBackground(new Color(102,0,51));
				panel_15.setLayout(null);
				
				btnShowTotalSales = new JButton("Show Total Sales");
				btnShowTotalSales.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnShowTotalSales.setBounds(48, 77, 202, 43);
				btnShowTotalSales.setForeground(new Color(102,0,21));
				btnShowTotalSales.setBackground(new Color(255,255,255));
				panel_15.add(btnShowTotalSales);
				
				btnShowTop5Customer = new JButton("Show Top 5 Customers");
				btnShowTop5Customer.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnShowTop5Customer.setBounds(48, 152, 202, 43);
				btnShowTop5Customer.setForeground(new Color(102,0,21));
				btnShowTop5Customer.setBackground(new Color(255,255,255));
				panel_15.add(btnShowTop5Customer);
				
				btnTop10Books = new JButton("Show Top 10 Sold Books");
				btnTop10Books.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnTop10Books.setBounds(48, 227, 202, 43);
				btnTop10Books.setForeground(new Color(102,0,21));
				btnTop10Books.setBackground(new Color(255,255,255));
				panel_15.add(btnTop10Books);
				
				btnBack_4 = new JButton("Back");
				btnBack_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnBack_4.setBounds(248, 602, 138, 40);
				btnBack_4.setForeground(new Color(255,255,255));
				btnBack_4.setBackground(new Color(102,0,21));
				panel_14.add(btnBack_4);
				///panel_15
				
		//panel_16,17 promote customers
				panel_16 = new JPanel();
				panel_16.setBounds(0, 0, 686, 700);
				panel_16.setBackground(new Color(255,255,255));
			//	frame.getContentPane().add(panel_16);
				panel_16.setLayout(null);
				
				lblAddManager = new JLabel("Add New Manager");
				lblAddManager.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblAddManager.setBounds(10, 11, 249, 37);
				lblAddManager.setForeground(new Color(102,0,21));
				panel_16.add(lblAddManager);
				
				scrollPane_5 = new JScrollPane();
				scrollPane_5.setBounds(20, 64, 643, 504);
				panel_16.add(scrollPane_5);
				
				table_5 = new JTable();
				scrollPane_5.setViewportView(table_5);
				
				btnBack_5 = new JButton("Back");
				btnBack_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnBack_5.setBounds(248, 602, 138, 40);
				btnBack_5.setForeground(new Color(255,255,255));
				btnBack_5.setBackground(new Color(102,0,21));
				panel_16.add(btnBack_5);
				
				panel_17 =new JPanel();
				panel_17.setBounds(688, 0, 320, 662);
				//frame.getContentPane().add(panel_17);
				panel_17.setBackground(new Color(102,0,51));
				panel_17.setLayout(null);
				
				btnAddManager_1 = new JButton("Promote As A Manager");
				btnAddManager_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				btnAddManager_1.setBounds(48, 77, 202, 43);
				btnAddManager_1.setForeground(new Color(102,0,21));
				btnAddManager_1.setBackground(new Color(255,255,255));
				panel_17.add(btnAddManager_1);
				
				//panel16,17
				

     this.add(panel);
     this.add(panel_1);
     this.add(panel_3);
     this.add(panel_4);
     this.add(panel_5);
     this.add(panel_6);
     this.add(panel_7);
     this.add(panel_8);
     this.add(panel_9);
     this.add(panel_10);
     this.add(panel_12);
     this.add(panel_13);
     this.add(panel_14);
     this.add(panel_15);
     this.add(panel_16);
     this.add(panel_17);
     
     panel.setVisible(true);
     panel_1.setVisible(false);
     panel_3.setVisible(false);
     panel_4.setVisible(false);
     panel_5.setVisible(false);
     panel_6.setVisible(false);
     panel_7.setVisible(false);
     panel_8.setVisible(false);
     panel_9.setVisible(false);
     panel_10.setVisible(false);
     panel_12.setVisible(false);
     panel_13.setVisible(false);
     panel_14.setVisible(false);
     panel_15.setVisible(false);
     panel_16.setVisible(false);
     panel_17.setVisible(false);
     
     
     
	}

	
	
}

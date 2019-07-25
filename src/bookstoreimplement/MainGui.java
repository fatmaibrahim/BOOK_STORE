package bookstoreimplement;

import java.sql.SQLException;

import javax.swing.JFrame;


public class MainGui {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Controller controller = new Controller();
		controller.view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controller.view.setSize(1000, 700);
		controller.view.setTitle("Ketaby Book Store");
		controller.view.setVisible(true);
		controller.view.setLayout(null);
		
		controller.v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//controller.v.setSize( 320, 371);
		controller.v.setBounds(500, 200, 320, 371);
		controller.v.setTitle("Ketaby Book Store");
		controller.v.setVisible(false);
		controller.v.setLayout(null);


	}

}

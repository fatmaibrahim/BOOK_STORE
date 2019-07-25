package bookstoreinterface;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Operation {

	/**
	 * this functions add new book in the database with properties 
	 * and return true if function success
	 * else return false if this operation didn't confirm
	**/
	public boolean Add_new_books(String ISBN,String Title,String Publisher_name,String Publisher_address,String publisher_phone
			,String []Authors_name,String Publisher_year,String Selling_price,String Category,String Threshold,String Available_quantity);
	 /**
	  * this function make a search for book and perform 
	  * update if update is true and confirm return true else
	  * return false  
	  */
	public boolean Modify_existing_books(String OLd_ISBN,String New_ISBN,String Title,String Publisher_name1,String Publisher_name2,String Publisher_address,String Publisher_phone
			,String []Authors_name1,String []Authors_name2,String Publisher_year,String Selling_price,String Category,String Threshold,String Available_quantity);
		 /**
	  * this function add order to the database
	  */
	 boolean Place_orders_on_books(String Book_ISBN,String Quantity);
	 /**
	  * confirm the order quantity
	  *and return true if operation is success
	  */
	 public boolean Confirm_orders(Object Order_num);
	 /**
	  * this function search for the book by ISBN, and title. The user can search for
	  *  books of a specific Category, author
      *or publisher
      *and return 2d array of string of table
	  */
	 ResultSet Search_for_books(int type,String IBSN,String Title,String Category,String Authors,String Publisher) throws SQLException ;
	
	 public boolean add_manager(Object Manager_id);
}

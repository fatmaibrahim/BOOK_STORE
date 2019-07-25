package bookstoreimplement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		MYOperation op=new MYOperation();
		Scanner scan =new Scanner(System.in);
		
//		String [] au1={"michel1","jhon1"};
//		String [] au={"michel","jhon"};
//		
//      boolean b=op.Add_new_books("22-88-77", "sea", "ashraqat1", "cairo st 55 elnaser sity","0125634865",au,"2003","750","Geography","15","70");
//       System.out.println(b);
//		
		//System.out.println(op.Modify_existing_books("22-66-77", "22-66-7711", "sea live", "ashraqat1", "ashraqat2", "cairo st 55 elnaser sity1", "01253486", au, au1, "2004", "600", "Art", "22", "55"));
	//System.out.println(op.Place_orders_on_books("22-66-7711", "100"));
		//System.out.println(op.Confirm_orders("6"));
		
//		ResultSet rs=op.Search_for_books(4, "", "", "", "","yara");
//		
//		while(rs.next()){
//	         //Retrieve by column name
//			String ISBN=rs.getString("ISBN");
//			String Title=rs.getString("Title");
//			String Publisher_name=rs.getString("Publisher_name");
//			String Publisher_year=rs.getString("Publisher_year");
//			String Category=rs.getString("Category");
//			int  Threshold=rs.getInt("Threshold");
//			int Available_quantity=rs.getInt("Available_quantity");
//			float Selling_price=rs.getFloat("Selling_price");
//	
//	         System.out.print("ISBN: " + ISBN);
//	         System.out.print(", Title: " + Title);
//	         System.out.print(", Publisher_name: " + Publisher_name);
//	         System.out.print(", Publisher_year: " + Publisher_year);
//	         System.out.print(", Category: " + Category);
//	         System.out.print(", Threshold: " + Threshold);
//	         System.out.print(", Available_quantity: " + Available_quantity);
//	         System.out.println(", Selling_price: " + Selling_price);
//
//	      }

		//System.out.println(op.login("user1@example.com","1234"));
		//System.out.println(op.SignUp("user3first", "user3last", "user3@example.com", "12345", "alex", "0120255565","user3"));
		
		//System.out.println(op.edit_personal_info("3", "ash", "sheta", "ash@example.com", "1234", "dmanhour", "012563478","ash1"));
//System.out.println(op.Add_to_shoppingCart("6", "22-66-7711", "10"));
		//System.out.println(op.get_total_salary("4"));

//		System.out.println(op.Checkout_shopping_cart("6"));	
//		int i=scan.nextInt();
//		System.out.println(op.if_user_is_verify_check_out(true,5196081888500645L)); //invalid 4388576018402626
//		System.out.println(op.remove_item_from_cart("6"));
  // System.out.println(op.Log_out("6"));
		
		
//		ResultSet rs=op.top_10_selling_bookss();
//		while(rs.next()){
//			System.out.print(rs.getString("Book_ISBN"));
//			System.out.println("\t"+rs.getString("total"));
//		}
//		
		ResultSet rs=op.get_user("6");
//		ResultSet rs=op.top_5_customers();
//		while(rs.next()){
//			System.out.print(rs.getString("User_id"));
//			System.out.print("\t"+rs.getString("User_name"));
//			System.out.println("\t"+rs.getString("total"));
//
//		}
		
//		ResultSet rs=op.total_sales_for_books();
//		while(rs.next()){
//			System.out.print(rs.getString("Book_ISBN"));
//			System.out.print("\t"+rs.getString("Quantity"));
//			System.out.println("\t"+rs.getString("Price"));
//
//		}
//		
		
		
	}
	}


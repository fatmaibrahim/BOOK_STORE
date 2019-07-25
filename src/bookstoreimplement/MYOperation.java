package bookstoreimplement;
import java.sql.*;
import java.util.LinkedList;

import bookstoreinterface.Operation;

public class MYOperation implements Operation {
	public static Connection connection=null;
	public Statement stmt=null;
	
	MYOperation() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_store","root","fatma");
        stmt=connection.createStatement();  
	}

	@Override
	public boolean Add_new_books(String ISBN,String Title,String Publisher_name,String Publisher_address,String Publisher_phone
			,String []Authors_name,String Publisher_year,String Selling_price,String Category,String Threshold,String Available_quantity) {
		
    	String Sql="INSERT INTO BOOK VALUES('"+ISBN+"','"+Title+"','"
				+Publisher_name+"','"+Publisher_year+"','"+Category+"',"+Threshold
				+","+Available_quantity+","+Selling_price+");";
    	
		try {
    		ADD_New_Publisher(Publisher_name,Publisher_address,Publisher_phone);
    		stmt.addBatch(Sql);
    		ADD_NEW_Authors(Authors_name,ISBN);
        	stmt.executeBatch();
			return true;
		} catch (SQLException e) {
			return false;
		}
		
	}

	private void ADD_NEW_Authors(String[] authors_name, String iSBN) throws SQLException {
		for(int i=0;i<authors_name.length;i++){
			String Sql="INSERT INTO AUTHORS VALUES('"+authors_name[i]+"','"+iSBN+"');";
			stmt.addBatch(Sql);
		}		
	}

	private void ADD_New_Publisher(String Publisher_name, String Publisher_address, String Publisher_phone) throws SQLException {
		String Sql0="SELECT * FROM PUBLISHER WHERE Name='"+Publisher_name+"';";
		String Sql1="INSERT INTO PUBLISHER VALUES('"+Publisher_name+"','"+Publisher_address+"','"+Publisher_phone+"');";
    	//search if publisher name exist
		ResultSet rs=null;
		     rs=stmt.executeQuery(Sql0);
		
		     int size =0;
        	if (rs != null) 
        	{
        	  rs.last();    // moves cursor to the last row
        	  size = rs.getRow(); // get row id 
        	}
        	if(size==0){
        		stmt.addBatch(Sql1);
        	}
        
	}

	@Override
	public boolean Modify_existing_books(String OLd_ISBN,String New_ISBN,String Title,String Publisher_name1,String Publisher_name2,String Publisher_address,String Publisher_phone
			,String []Authors_name1,String []Authors_name2,String Publisher_year,String Selling_price,String Category,String Threshold,String Available_quantity) {
		 try {
	        	String Sql1="UPDATE BOOK SET Available_quantity="+Available_quantity+",ISBN='"+New_ISBN+"',Title='"+Title+"'"
	        			+ ",Publisher_year='"+Publisher_year+"',Selling_price="+Selling_price+",Category='"+Category+"',"
	        					+ "Threshold="+Threshold+" where ISBN='"+OLd_ISBN+"';";
	        	String Sql2="UPDATE PUBLISHER SET Name='"+Publisher_name2+"',Address='"+Publisher_address+"',Telephone='"+Publisher_phone+"' where Name='"+
	        			Publisher_name1+"';";
	        	System.out.println(Sql1);
	        	System.out.println(Sql2);
	        	stmt.addBatch(Sql1);
	        	stmt.addBatch(Sql2);
	        	
	        	for(int i=0;i<Authors_name1.length;i++){
	        		String Sql3="UPDATE AUTHORS SET Name='"+Authors_name2[i]+"',Book_ISBN='"+New_ISBN+"' where Book_ISBN='"+OLd_ISBN+"' and Name='"+
		    	        	Authors_name1[i]+"';";
		        	System.out.println(Sql3);
		        stmt.addBatch(Sql3);
		        	
	        	}
	        	stmt.executeBatch();
				return true;
			} catch (SQLException e) {
				return false;
			}
	}

	@Override
	public boolean Place_orders_on_books(String Book_ISBN,String Quantity) {
		try {
			String Sql="INSERT INTO MANAGER_ORDER(Book_ISBN,Order_date,Quantity) VALUES('"+Book_ISBN+
					 "',now(),"+Quantity+");";
			stmt.addBatch(Sql);
        	stmt.executeBatch();
			return true;
		} catch (SQLException e) {
			return false;
		}
		
	}

	@Override
	public boolean Confirm_orders(Object Order_num) {
		try {
			String Sql="DELETE FROM MANAGER_ORDER where Order_num="+Order_num+";";
			stmt.addBatch(Sql);
			stmt.executeBatch();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	@Override
	public ResultSet Search_for_books(int type,String ISBN,String Title,String Category,String Authors,String Publisher) throws SQLException {
		String Sql="";
		switch(type){
		case 0:
	    Sql="SELECT * FROM BOOK  WHERE ISBN='"+ISBN+"';";
		break;
		case 1:
		Sql="SELECT * FROM BOOK  WHERE Title='"+Title+"';";
		break;
		case 2:
			Sql="SELECT * FROM BOOK  WHERE Category='"+Category+"';";
		break;
		
		case 3:
			Sql="SELECT * FROM BOOK  WHERE ISBN IN (SELECT Book_ISBN FROM AUTHORS WHERE Name='"+Authors+"');";
		break;
		
		case 4:
			Sql="SELECT * FROM BOOK  WHERE Publisher_name='"+Publisher+"';";
		break;
		}
		
		 ResultSet rs=stmt.executeQuery(Sql);    	
	        	
		return rs;
	}

	/**/
	public String login(String Email,String Password){
		String Sql="SELECT * From USERS WHERE Email='"+Email+"';";
		System.out.println(Sql);
		ResultSet rs;
		try {
			rs = stmt.executeQuery(Sql);
			if (rs.next()){
		   		String truepass=rs.getString("Pass");
		   		if(truepass.equals(Password)){
		   			
		   			return "Login id="+rs.getString("User_id");
		   		}else{
		   			return "THE PASSWORD IS WRONG ";
		   		}
		   	}else{
		   		return "YOUR EMAIL DOESNOT EXSIST YOU MUST FIRST SIGN UP";
		   	}
		} catch (SQLException e) {
			return "ERROR IN DATABASE";
		}
			   
		   	
	}
	public boolean isManager(String id) throws SQLException{
		String sql="SELECT *  FROM MANAGER WHERE Manager_id ="+id+";";
		ResultSet rs;
		rs=stmt.executeQuery(sql);
		if(!rs.next()){
			return false;
		}
		return true;
	}
	
	public boolean SignUp(String First_name,String Last_name,String Email,String Password,String Shipping_address,String Phone_number,String User_name){
		String Sql="INSERT INTO USERS(First_name,Last_name,Email,Pass,Shipping_address,Phone_num,User_name) VALUES('"+
				First_name+"','"+Last_name+"','"+Email+"','"+Password+"','"+Shipping_address+"','"+Phone_number+"','"+User_name+"');";
		try {
			System.out.println(Sql);
			stmt.addBatch(Sql);
			stmt.executeBatch();
			return true;
		} catch (SQLException e) {
			return false;
		}
		
	}
	
	public boolean edit_personal_info(String User_id,String First_name,String Last_name,String Email,String Password,String Shipping_address,String Phone_number,String User_name){
		 try {
	        	String Sql="UPDATE USERS SET First_name='"+First_name+"',Last_name='"+Last_name+"',Email='"+Email+"'"
	        			+ ",Pass='"+Password+"',Shipping_address='"+Shipping_address+"',Phone_num='"+Phone_number+"',User_name='"+User_name+"' where User_id="+User_id+";";
	        	System.out.println(Sql);
	        	stmt.addBatch(Sql);
	        	stmt.executeBatch();
				return true;
			} catch (SQLException e) {
				return false;
			}
	}

	private float get_salary(String ISBN){
		String Sql="SELECT Selling_price FROM BOOK  WHERE ISBN='"+ISBN+"';";
		System.out.println(Sql);
		 try {
			ResultSet rs=stmt.executeQuery(Sql);
			if(rs.next()){
			return rs.getFloat("Selling_price");
			}else{
				return -1;
				}
		} catch (SQLException e) {
			return -1;
		}    	
	}
	
	
	
	public boolean Add_to_shoppingCart(String User_id,String Book_ISBN,String Quantity){
		try{
		float Selling_price=get_salary(Book_ISBN);
		if(Selling_price==-1){
			return false;
		}else{
			Selling_price=Selling_price*Integer.parseInt(Quantity);
			String Sql1="INSERT INTO BOOK_SALES_HISTORY(User_id,Book_ISBN,Quantity,Price,Order_time) VALUES("+User_id+",'"+Book_ISBN+
					 "',"+Quantity+","+Selling_price+",now());";
			System.out.println(Sql1);
			stmt.addBatch(Sql1);
			stmt.executeBatch();
			String Sql2="INSERT INTO SHOPPING_CART VALUES(LAST_INSERT_ID());";
			System.out.println(Sql2);
		stmt.addBatch(Sql2);
		stmt.executeBatch();
		return true;
		}
		}catch(Exception e){
			return false;
		}
	}

    public String get_total_salary(String User_id){
    	String Sql="SELECT sum(Price) as total FROM BOOK_SALES_HISTORY JOIN SHOPPING_CART where User_id="+User_id+" and Cart_id=Cart_num group by User_id;";
    	try {
			ResultSet rs=stmt.executeQuery(Sql);
			if(rs.next()){
			return rs.getString("total");
			}else{
				return "";
				}
		} catch (SQLException e) {
			return "";
		}    	
    }

    public ResultSet Show_items_in_cart(String User_id){
    String Sql="SELECT Cart_id,Book_ISBN,Quantity,Price,Order_time FROM BOOK_SALES_HISTORY JOIN SHOPPING_CART where User_id="+User_id+" and Cart_id=Cart_num;";
    
		ResultSet rs=null;
		try {
			rs = stmt.executeQuery(Sql);
			return rs;
		} catch (SQLException e) {
			return null;
		}
		
    }

  public boolean remove_item_from_cart(Object Cart_id){
	  String Sql1="DELETE FROM BOOK_SALES_HISTORY where Cart_id="+Cart_id+";";
	  String Sql2="DELETE FROM SHOPPING_CART where Cart_num="+Cart_id+";";
      System.out.println(Sql1); 
      System.out.println(Sql2); 

		try {
			stmt.addBatch(Sql2);
			stmt.addBatch(Sql1);
			stmt.executeBatch();
			return true;
		} catch (SQLException e) {
			return false;
		}
  }

  private String[][] get_available_cart_for_user(String User_id){
	  String Sql1="SELECT Book_ISBN,Cart_id,Quantity,Available_quantity,Title FROM BOOK_SALES_HISTORY,SHOPPING_CART,BOOK where User_id="+User_id+" and Cart_id=Cart_num and Book_ISBN=ISBN;";
	  String[][] result=new String[1000][3];
	  try {
		ResultSet rs=stmt.executeQuery(Sql1);
		int index=0;
		while(rs.next()){
			int x=rs.getInt("Quantity");
			String ISBN=rs.getString("Book_ISBN");
			String Cart_id=rs.getString("Cart_id");
			String Quantity=rs.getString("Quantity");
			String Title=rs.getString("Title");
				int y=rs.getInt("Available_quantity");
				int diff=y-x;
			if(diff>=0){
				result[index][0]=ISBN;
				result[index][1]=Quantity;
				result[index++][2]=Cart_id;
			}else{
				result[index++][0]=Title;
			}
		
		}
	} catch (SQLException e) {
		return null;
	}
   return result;
  }
  public LinkedList<String>  Checkout_shopping_cart(String User_id){
	     LinkedList<String> Order_not_available=new LinkedList<String>();
         String [][]book_available=get_available_cart_for_user(User_id);
         int index=0;
         try {
        	  connection.setAutoCommit(false);
			while(book_available[index][0]!=null&&index<20){
			if(book_available[index][1]!=null){
		           String Sql2="UPDATE BOOK SET Available_quantity=Available_quantity-"+book_available[index][1]+" where ISBN='"+book_available[index][0]+"';";
		     	   String Sql3="delete from SHOPPING_CART WHERE Cart_num="+book_available[index][2]+";";
		     	   System.out.println(Sql2);
		     	   System.out.println(Sql3);
		     	   stmt.executeUpdate(Sql2);  
		     	   stmt.executeUpdate(Sql3);  
				}else{
					Order_not_available.add(book_available[index][0]);
				}
     		  index++;
			}
			} catch (SQLException e) {
				return null;
			}
    return Order_not_available;
  }
  
   public boolean if_user_is_verify_check_out(boolean verify,long Credit){
	   try{
	   if(verify){
		   if(isValid(Credit)){
			   connection.commit();
		   }else{
			   connection.rollback();
			   return false;
		   }
	   }else{
		   connection.rollback();
	   }
 	  connection.setAutoCommit(true);
	   return true;
	   }catch(SQLException e){
		return false;   
	   }
   }

   
  public boolean Log_out(String User_id){
	  
	  String Sql="SELECT Cart_id FROM BOOK_SALES_HISTORY JOIN SHOPPING_CART where User_id="+User_id+" and Cart_id=Cart_num;";
      LinkedList<String>list=new LinkedList<String>();
	  System.out.println(Sql); 
	  try {
            ResultSet rs=stmt.executeQuery(Sql);
			while(rs.next()){
				list.add(rs.getString("Cart_id"));
			}
			for(int i=0;i<list.size();i++){
				remove_item_from_cart(list.get(i));
			}
			return true;
		} catch (SQLException e) {
			return false;
		}
		
  }
  

  public ResultSet total_sales_for_books()
  {
	  //where Order_time >=DATEADD(MONTH, DATEDIFF(MONTH, 0, GETDATE())-3, 0)" " and Order_time < DATEADD(MONTH, DATEDIFF(MONTH, 0, GETDATE()), 0)
	String Sql="SELECT Book_ISBN,Quantity,Price FROM BOOK_SALES_HISTORY where DATEDIFF(now(),Order_time)<=30 and Cart_id not in(select Cart_num from SHOPPING_CART);";
	System.out.println(Sql);
	try {
		ResultSet rs=stmt.executeQuery(Sql);
		return rs;
	} catch (SQLException e) {
		return null;
	}
	  
  }
  public ResultSet  top_5_customers(){
	  String Sql="SELECT User_id,User_name,sum(Price) as total from BOOK_SALES_HISTORY NATURAL JOIN USERS  group by User_id order by total DESC;";
	  try {
		  stmt.addBatch("call save_less_than_three_month()");
	      stmt.executeBatch();
			ResultSet rs=stmt.executeQuery(Sql);
			return rs;
		} catch (SQLException e) {
			return null;
		}
  }
  
  public ResultSet  top_10_selling_bookss(){
	  String Sql="SELECT Book_ISBN,sum(Quantity) as total from BOOK_SALES_HISTORY group by Book_ISBN order by total DESC;";
	  try {
		  stmt.addBatch("call save_less_than_three_month()");
	      stmt.executeBatch();
			ResultSet rs=stmt.executeQuery(Sql);
			return rs;
		} catch (SQLException e) {
			return null;
		}
  }
  
  public ResultSet viewBook(){
	  String Sql="SELECT ISBN,Title,a.Name as Authors,Available_quantity as Quantity,Selling_price as Price,Publisher_name,Publisher_year as Publishing_Year,Category FROM BOOK JOIN publisher as p JOIN authors as a WHERE ISBN=a.Book_ISBN AND Publisher_name=p.Name ;";
	  ResultSet rs = null;
	  System.out.println(Sql);
	try {
		rs = stmt.executeQuery(Sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return rs;
  }
  
  public ResultSet viewBookInfo(){
	  String Sql="SELECT ISBN,Title,a.Name as Authors,Publisher_year as Publishing_Year,Category,Available_quantity as Quantity,Selling_price as Price,Threshold,Publisher_name,Address as Publisher_Address,Telephone as Publisher_Phone FROM BOOK JOIN publisher as p JOIN authors as a WHERE ISBN=a.Book_ISBN AND Publisher_name=p.Name ;";
	  ResultSet rs = null;
	try {
		rs = stmt.executeQuery(Sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return rs;
  }
 
  public ResultSet viewOrders(){
	  String Sql="SELECT * FROM manager_order ;";
	  ResultSet rs = null;
	try {
		rs = stmt.executeQuery(Sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return rs;
  }
  public ResultSet viewUser(){
	  String Sql="SELECT User_id,First_name,Last_name,Email,Shipping_address,phone_num,User_name FROM users ;";
	  ResultSet rs = null;
	try {
		rs = stmt.executeQuery(Sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return rs;
  }

  public ResultSet get_user(String User_id){
	  String Sql="SELECT * FROM users where User_id="+User_id+";";
	  System.out.println(Sql);
	  ResultSet rs = null;
	try {
		rs = stmt.executeQuery(Sql);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return rs;
  }

  
  
@Override
public boolean add_manager(Object Manager_id){
	 String Sql="INSERT INTO MANAGER VALUES("+Manager_id+");";
	 try {
          stmt.addBatch(Sql);
          stmt.executeBatch();
		 return true;
		} catch (SQLException e) {
			return false;
		} 
 }


public boolean isValid(long number) 
{ 
   return (getSize(number) >= 13 &&  
           getSize(number) <= 16) &&  
           (prefixMatched(number, 4) ||  
            prefixMatched(number, 5) ||  
            prefixMatched(number, 37) ||  
            prefixMatched(number, 6)) &&  
          ((sumOfDoubleEvenPlace(number) +  
            sumOfOddPlace(number)) % 10 == 0); 
} 

// Get the result from Step 2 
public  int sumOfDoubleEvenPlace(long number) 
{ 
    int sum = 0; 
    String num = number + ""; 
    for (int i = getSize(number) - 2; i >= 0; i -= 2)  
        sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2); 
      
    return sum; 
} 

// Return this number if it is a single digit, otherwise, 
// return the sum of the two digits 
public int getDigit(int number) 
{ 
    if (number < 9) 
        return number; 
    return number / 10 + number % 10; 
} 

// Return sum of odd-place digits in number 
public  int sumOfOddPlace(long number) 
{ 
    int sum = 0; 
    String num = number + ""; 
    for (int i = getSize(number) - 1; i >= 0; i -= 2)  
        sum += Integer.parseInt(num.charAt(i) + "");         
    return sum; 
} 

// Return true if the digit d is a prefix for number 
public boolean prefixMatched(long number, int d) 
{ 
    return getPrefix(number, getSize(d)) == d; 
} 

// Return the number of digits in d 
public  int getSize(long d) 
{ 
    String num = d + ""; 
    return num.length(); 
} 

// Return the first k number of digits from  
// number. If the number of digits in number 
// is less than k, return number. 
public  long getPrefix(long number, int k) 
{ 
    if (getSize(number) > k) { 
        String num = number + ""; 
        return Long.parseLong(num.substring(0, k)); 
    } 
    return number; 
} 





}



package bookstoreimplement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;

public class Controller implements ActionListener, ChangeListener, MouseListener {
	private String pan=null;
	public view view=null;
	public view1 v=null;
	public MYOperation op;
	public int id,type;
	public String idStr;
	public String val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11;
	public Controller() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
	 view=new view();
	 view.panel.setVisible(true);
	 v=new view1();
	 v.panel_11.setVisible(true);
	 op=new MYOperation();
	 view.btnNewButton_1.addActionListener(this);
	 view.btnNewButton_2.addActionListener(this);
	 view.btnAdd.addActionListener(this);
	 view.btnAddToCart.addActionListener(this);
	 view.btnBack.addActionListener(this);
	 view.btnBack_1.addActionListener(this);
	 view.btnBack_2.addActionListener(this);
	 view.btnBackE.addActionListener(this);
	 view.btnBackU.addActionListener(this);
	 view.btnLogOut.addActionListener(this);
	 view.btnNewButton_4.addActionListener(this);
	 view.btnNewButton_8.addActionListener(this);
	 view.btnNewButton_9.addActionListener(this);
	 view.btnPersonalInfo.addActionListener(this);
	 view.btnRemove.addActionListener(this);
	 view.btnRemove_1.addActionListener(this);
	 view.btnSave.addActionListener(this);
	 view.btnSearch.addActionListener(this);
	 view.btnSearch_1.addActionListener(this);
	 view.btnSubmit.addActionListener(this);
	 view.btnUpdate.addActionListener(this);
	 view.comboBox_2.addActionListener(this);
	 view.comboBox_1.addActionListener(this);
	 view.comboBox.addActionListener(this);
	 view.btnCart.addActionListener(this);
	 view.btnMoreActions.addActionListener(this);
	 v.btnAddManager.addActionListener(this);
	 v.btnModifyBooks.addActionListener(this);
	 v.btnPlaceOrders.addActionListener(this);
	 v.btnViewReports.addActionListener(this);
	 view.btnBack_3.addActionListener(this);
	 view.btnBack_4.addActionListener(this);
	 view.btnBack_5.addActionListener(this);
	 view.btnConfirm.addActionListener(this);
	 view.btnInsert.addActionListener(this);
	 view.btnTop10Books.addActionListener(this);
	 view.btnShowTop5Customer.addActionListener(this);
	 view.btnShowTotalSales.addActionListener(this);
	 view.btnAddManager_1.addActionListener(this);
	 //view.scrollPane_2.addMouseListener();
	 view.btnCheckOut.addActionListener(this);
	 view.scrollPane_2.addMouseListener(this);
	 view.table_2.addMouseListener(this);
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonPressed = e.getActionCommand();
		
          if(buttonPressed.equals("Sign Up")){
        	  view.panel_1.setVisible(true);
        	  pan="panel_1";
        	  view.panel.setVisible(false);
				//view.getCard().show(view.getContentPane(),"signUp");	
          }else if(buttonPressed.equals("Log In")){
        	  view.panel_3.setVisible(true);
        	  pan="panel_3";
        	  view.panel.setVisible(false);
          }else if(buttonPressed.equals("Back")){
        	  if(pan=="panel_1"){
        		  view.panel_1.setVisible(false);
        		  view.panel.setVisible(true);
        	  }else if(pan=="panel_3"){
        		  view.panel_3.setVisible(false);
        		  view.panel.setVisible(true);
        	  }else if(pan=="panel_7"){
        		  view.panel_7.setVisible(false);
        		  view.panel_8.setVisible(false);
        		  view.panel_4.setVisible(true);
        		  view.panel_5.setVisible(true);
        		  view.table.setModel(DbUtils.resultSetToTableModel(op.viewBook()));
        	  }else if(pan=="panel_6"){
        		  view.panel_6.setVisible(false);
        		  view.panel_4.setVisible(true);
        		  view.panel_5.setVisible(true);
        		  view.table.setModel(DbUtils.resultSetToTableModel(op.viewBook()));
        	  }else if(pan=="panel_9"){
        		  view.panel_9.setVisible(false);
        		  view.panel_10.setVisible(false);
        		  view.panel_4.setVisible(true);
        		  view.panel_5.setVisible(true);
        		  view.table.setModel(DbUtils.resultSetToTableModel(op.viewBook()));
        	  }else if(pan=="panel_12"){
        		  view.panel_12.setVisible(false);
        		  view.panel_13.setVisible(false);
        		  view.panel_4.setVisible(true);
        		  view.panel_5.setVisible(true);
        		  view.table.setModel(DbUtils.resultSetToTableModel(op.viewBook()));
        	  }else if(pan=="panel_14"){
        		  view.panel_14.setVisible(false);
        		  view.panel_15.setVisible(false);
        		  view.panel_4.setVisible(true);
        		  view.panel_5.setVisible(true);
        		  view.table.setModel(DbUtils.resultSetToTableModel(op.viewBook()));
        	  }else if(pan=="panel_16"){
        		  view.panel_16.setVisible(false);
        		  view.panel_17.setVisible(false);
        		  view.panel_4.setVisible(true);
        		  view.panel_5.setVisible(true);
        		  view.table.setModel(DbUtils.resultSetToTableModel(op.viewBook()));
        	  }
        	  
          }else if(buttonPressed.equals("Submit")){
        		  if(pan=="panel_1"){
        			  if(view.textField_2.getText().isEmpty()|| view.textField_3.getText().isEmpty()|| view.textField_4.getText().isEmpty()|| view.passwordField.getText().isEmpty()|| view.textField_6.getText().isEmpty()|| view.textField_5.getText().isEmpty()||view.textField.getText().isEmpty()){
                		  JOptionPane.showMessageDialog(null, "Empty Field(s)");
        			  }else{
        				  if(op.SignUp(view.textField_2.getText(), view.textField_3.getText(), view.textField_4.getText(), view.passwordField.getText(), view.textField_6.getText(), view.textField_5.getText(),view.textField.getText())){
        		  				JOptionPane.showMessageDialog(null, "Successfully Sign Up Operation");
        		  				view.panel_1.setVisible(false);
        		  				view.panel_3.setVisible(true);
        		  				pan="panel_3";
        				  }else{
        					  JOptionPane.showMessageDialog(null, "Connection Error");
        				  }
        			  }
        		  }else if(pan=="panel_3"){
        			  if(view.textField_8.getText().isEmpty()||view.passwordField_2.getText().isEmpty()){
                		  JOptionPane.showMessageDialog(null, "Empty Field(s)");
        			  }else{
        				  if(op.login(view.textField_8.getText(), view.passwordField_2.getText()).contains("id")){
        					  idStr=op.login(view.textField_8.getText(), view.passwordField_2.getText()).substring(9);
        					  id=Integer.parseInt(idStr);
        					  JOptionPane.showMessageDialog(null, "Successfully Logged In");
        					  view.panel_3.setVisible(false);
        					  view.panel_4.setVisible(true);
        					  view.panel_5.setVisible(true);
        					  try {
        						  if (op.isManager(idStr)) {
        							  view.btnMoreActions.show();
        						  }
        					  } catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
        					  }
        					  view.table.setModel(DbUtils.resultSetToTableModel(op.viewBook()));
        				  }else{
        					  JOptionPane.showMessageDialog(null, op.login(view.textField_8.getText(), view.passwordField_2.getText()));
        				  }
        			  }
        	  }else if(pan=="panel_7"){
        		  LinkedList<String> not_available=op.Checkout_shopping_cart(idStr);
        		  if(not_available.size()!=0){
        			String message="";
        			  for(int i=0;i<not_available.size();i++){
        				  message+="there is not available quantity of "+not_available.get(i)+" book,";
        			  }
        			  message+="\n Do you want to confirm the reminder books";
        			  
        			  int confirmed = JOptionPane.showConfirmDialog(null, message, "confirm order ",JOptionPane.YES_NO_OPTION);

      				if (confirmed == JOptionPane.YES_OPTION) {
      					String credit_num=view.textField_13.getText();
    					//String expire_date=view.textField_14.getText();
    					long credit=Long.parseLong(credit_num);
    					if(op.if_user_is_verify_check_out(true,credit)){
	        			  JOptionPane.showMessageDialog(null, "The Books Will Be Delivered Within 5 Days");
	            		  view.table_1.setModel(DbUtils.resultSetToTableModel(op.Show_items_in_cart(idStr)));
    					}else{
    	        			  JOptionPane.showMessageDialog(null, "The number of credit cart is invalid");
    					}
      				}else{
      					op.if_user_is_verify_check_out(false,5196081888500645L);
      				}
        		  }else{
        			  String credit_num=view.textField_13.getText();
    					//String expire_date=view.textField_14.getText();
    					long credit=Long.parseLong(credit_num);
    					if(op.if_user_is_verify_check_out(true,credit)){
	        			  JOptionPane.showMessageDialog(null, "The Books Will Be Delivered Within 5 Days");
	            		  view.table_1.setModel(DbUtils.resultSetToTableModel(op.Show_items_in_cart(idStr)));
    					}else{
    	        			  JOptionPane.showMessageDialog(null, "The number of credit cart is invalid");
    					}
        		  }
        		  
        	  }
          }else if(buttonPressed.equals("Edit Personal Information")){
        		  ResultSet rs=op.get_user(idStr);
        		  try {
        			  if(rs.next()){
					view.textFieldName.setText(rs.getString("User_name"));
					view.passwordFieldPass.setText(rs.getString("Pass"));
					view.textFieldF.setText(rs.getString("First_name"));
					view.textFieldL.setText(rs.getString("Last_name"));
					view.textFieldE.setText(rs.getString("Email"));
					view.textFieldNum.setText(rs.getString("Phone_num"));
					view.textFieldAdd.setText(rs.getString("Shipping_address"));
        			  }
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	      view.panel_4.setVisible(false);
        		  view.panel_5.setVisible(false);
        		  view.panel_6.setVisible(true);
        		  pan="panel_6";
          }else if(buttonPressed.equals("Log Out")){
        	  if(op.Log_out(idStr)){
        		  view.panel_4.setVisible(false);
			  	  view.panel_5.setVisible(false);
			  	  view.panel_3.setVisible(true);
			  	   pan="panel_3";
			  	JOptionPane.showMessageDialog(null, "Successfully Logged Out");
        	  }
          }else if(buttonPressed.equals("Shopping Cart")){
        	  view.panel_4.setVisible(false);
			  view.panel_5.setVisible(false);
			  view.panel_7.setVisible(true);
			  view.panel_8.setVisible(true);
			  view.textField_12.setText(op.get_total_salary(idStr));
			  view.table_1.setModel(DbUtils.resultSetToTableModel(op.Show_items_in_cart(idStr)));
			  pan="panel_7";
          }else if(buttonPressed.equals("Add To Cart")){
        	 if(view.textField_10.getText().isEmpty()||view.textField_11.getText().isEmpty()){
        		 JOptionPane.showMessageDialog(null,"Empty Field(s)");
        	 }else{
        		 if(op.Add_to_shoppingCart(idStr, view.textField_10.getText(), view.textField_11.getText())){
        			 JOptionPane.showMessageDialog(null,"Book is Added to Shopping Cart");
        		 }else{
        			 JOptionPane.showMessageDialog(null,"Connection Error !");
        		 }
        	 }
          }else if(buttonPressed.equals("search")){
        	  view.lblSearchBy.show();
        	  view.comboBox_2 .show();
        	  
        }else if(buttonPressed.equals("Save")){
        	 if(view.textFieldF.getText().isEmpty()||view.textFieldL.getText().isEmpty()||view.textFieldE.getText().isEmpty()||view.passwordFieldPass.getText().isEmpty()||view.textFieldAdd.getText().isEmpty()||view.textFieldNum.getText().isEmpty()||view.textFieldName.getText().isEmpty()){
       		  JOptionPane.showMessageDialog(null,"Empty Field(s)");
       	  	}else{
       	  		if(op.edit_personal_info(idStr, view.textFieldF.getText(), view.textFieldL.getText(),view.textFieldE.getText(), view.passwordFieldPass.getText(), view.textFieldAdd.getText(), view.textFieldNum.getText(), view.textFieldName.getText())){
       	  			JOptionPane.showMessageDialog(null,"Your Information Has Been Modified");
       	  		}else{
       	  			JOptionPane.showMessageDialog(null,"Connection Error !");
       	  		}
        	 
       	  	}
        }else if(buttonPressed.equals("Sign Up!")){
        	 view.panel_3.setVisible(false);
        	 view.panel_1.setVisible(true);
        }else if(buttonPressed.equals("More Actions")){
        	v.setVisible(true);
        }else if(buttonPressed.equals("Modify Books")){
        	v.setVisible(false);
        	 view.panel_4.setVisible(false);
        	 view.panel_5.setVisible(false);
        	 view.panel_10.setVisible(true);
        	 view.panel_9.setVisible(true);
        	 view.table_2.setModel(DbUtils.resultSetToTableModel(op.viewBookInfo()));
        	 pan="panel_9";
        }else if(buttonPressed.equals("Place Orders")){
        	v.setVisible(false);
       	 view.panel_4.setVisible(false);
       	 view.panel_5.setVisible(false);
       	 view.panel_12.setVisible(true);
       	 view.panel_13.setVisible(true);
       	view.table_3.setModel(DbUtils.resultSetToTableModel(op.viewOrders()));
       	 pan="panel_12";
       }else if(buttonPressed.equals("Add Manager")){
       	v.setVisible(false);
      	 view.panel_4.setVisible(false);
      	 view.panel_5.setVisible(false);
      	 view.panel_16.setVisible(true);
      	 view.panel_17.setVisible(true);
			view.table_5.setModel(DbUtils.resultSetToTableModel(op.viewUser()));
      	 pan="panel_16";
      }else if(buttonPressed.equals("View Reports")){
         	v.setVisible(false);
         	 view.panel_4.setVisible(false);
         	 view.panel_5.setVisible(false);
         	 view.panel_14.setVisible(true);
         	 view.panel_15.setVisible(true);
         	/*try {
				view.table.setModel(DbUtils.resultSetToTableModel(op.viewBooks()));
			  } catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			  }*/
         	 pan="panel_14";
         }else if(e.getSource()==view.comboBox_2){
   		  JComboBox cb=(JComboBox) e.getSource();
   		  String msg=(String) cb.getSelectedItem();
   		  switch(msg){
   		  	case "ISBN":
   		  		view.lblPublisher.hide();
   		  		view.lblAuthor.hide();
   		  		view.lblTitle1.hide();
   		  		view.lblISBN.show();
		  		view.textField_9.show();
		  		view.btnSearch_1.show();
		  		view.comboBox_1.hide();
		  		type=0;
   		  	break;
   		  	
   		  	case "Title":
   		  		view.lblPublisher.hide();
   		  		view.lblAuthor.hide();
   		  		view.lblTitle1.show();
   		  		view.lblISBN.hide();
		  		view.textField_9.show();
		  		view.btnSearch_1.show();
		  		view.comboBox_1.hide();
				type=1;
   		  	break;
   		  	
   		  	case "Author":
   		  		view.lblPublisher.hide();
   		  		view.lblAuthor.show();
   		  		view.lblTitle1.hide();
   		  		view.lblISBN.hide();
		  		view.textField_9.show();
		  		view.btnSearch_1.show();
		  		view.comboBox_1.hide();
		  		type=3;
   		  	break;
   		  	
   		  	case "Publisher":
   		  		view.lblPublisher.show();
		  		view.lblAuthor.hide();
		  		view.lblTitle1.hide();
		  		view.lblISBN.hide();
   		  		view.textField_9.show();
   		  		view.btnSearch_1.show();
   		  		view.comboBox_1.hide();
   		  		type=4;
   		  	break;
   		  	
   		  	case "Category":
   		  		view.comboBox_1.show();
   		  		view.btnSearch_1.show();
   		  		view.lblPublisher.hide();
   		  		view.lblAuthor.hide();
   		  		view.lblTitle1.hide();
   		  		view.lblISBN.hide();
   		  		view.textField_9.hide();
   		  		type=2;
   	         break;
   		  }
   	 
     }else if(buttonPressed.equals("Check Out")){
  		 view.lblCardNo.show();
  		 view.textField_13.show();
  		 view.lblExpiryDate.show();
  		 view.textField_14.show();
  		 view.btnSubmit.show();
  		 pan="panel_7";
     }else if(buttonPressed.equals("Search")){
    	 switch(type){
    	 case 0:
    		 try {
 				view.table.setModel(DbUtils.resultSetToTableModel(op.Search_for_books(0, view.textField_9.getText(), null,null, null, null)));
 			} catch (SQLException e1) {
 				// TODO Auto-generated catch block
 				e1.printStackTrace();
 			}
    	 break;
    	 case 1:
    		 try {
					view.table.setModel(DbUtils.resultSetToTableModel(op.Search_for_books(1, null,view.textField_9.getText(),null, null, null)));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    	  break;
    	  
    	 case 2:
    		 try {
 				view.table.setModel(DbUtils.resultSetToTableModel(op.Search_for_books(2, null,null,view.comboBox_1.getSelectedItem().toString(), null, null)));
 			} catch (SQLException e1) {
 				// TODO Auto-generated catch block
 				e1.printStackTrace();
 			}
    	  break;
    	 case 3:
    		 try {
					view.table.setModel(DbUtils.resultSetToTableModel(op.Search_for_books(3, null,null,null, view.textField_9.getText(), null)));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    	 break;
    	 case 4:
    		 try {
 				view.table.setModel(DbUtils.resultSetToTableModel(op.Search_for_books(4, null,null,null, null, view.textField_9.getText())));
 			} catch (SQLException e1) {
 				// TODO Auto-generated catch block
 				e1.printStackTrace();
 			}
    	 break;
    	 }
     }else if(buttonPressed.equals("Remove")){
    	 if(pan=="panel_7"){
    		 DefaultTableModel model =(DefaultTableModel) view.table_1.getModel();
    		 try{
    			 int row=view.table_1.getSelectedRow();
    			 op.remove_item_from_cart(view.table_1.getValueAt(row, 0));
    			 model.removeRow(row);
    			 JOptionPane.showMessageDialog(null,"Item Removed");
    		 }catch(Exception ex){
    			 JOptionPane.showMessageDialog(null,ex);
    		 }
    	 }else if(pan=="panel_9"){
    		 DefaultTableModel model_1 =(DefaultTableModel) view.table_2.getModel();
    		 try{
    			 int row=view.table_2.getSelectedRow();
    			 model_1.removeRow(row);
    			 JOptionPane.showMessageDialog(null,"Item Removed");
    		 }catch(Exception ex){
    			 JOptionPane.showMessageDialog(null,ex);
    		 }
    	 }
     }else if(buttonPressed.equals("Check Out")){
    	 view.lblCardNo.show();
    	 view.textField_13.show();
    	 view.lblExpiryDate.show();
    	 view.textField_14.show();
    	 view.btnSubmit.show();
    	 pan="panel_7";
     }else if(buttonPressed.equals("Add")){
    	 if(view.textField_15.getText().isEmpty()||view.textField_16.getText().isEmpty()||view.textField_22.getText().isEmpty()||view.textField_23.getText().isEmpty()||view.textField_24.getText().isEmpty()||view.textField_17.getText().isEmpty()||view.textField_18 .getText().isEmpty()||view.textField_20.getText().isEmpty()||view.comboBox.getSelectedItem().equals(null)||view.textField_21.getText().isEmpty()||view.textField_19.getText().isEmpty()){
    		 JOptionPane.showMessageDialog(null,"Empty Field(s)");
    	 }else{
    		 if(op.Add_new_books(view.textField_15.getText(), view.textField_16.getText(), view.textField_22.getText(), view.textField_23.getText(), view.textField_24.getText(), view.textField_17.getText().split(","), view.textField_18 .getText(), view.textField_20.getText(), view.comboBox.getSelectedItem().toString(), view.textField_21.getText(), view.textField_19.getText())){
    			
    			 //DefaultTableModel model =(DefaultTableModel) view.table.getModel();
    			// model.setRowCount(0);
    			 view.table_2.setModel(DbUtils.resultSetToTableModel(op.viewBookInfo()));
    			 JOptionPane.showMessageDialog(null,"Book Added");
    		 }
    	 }
     }else if(buttonPressed.equals("Update")){
    	 if(op.Modify_existing_books(val1, view.textField_15.getText(), view.textField_16.getText(), val9, view.textField_22.getText(), view.textField_23.getText(), view.textField_24.getText(), val3.split(","), view.textField_17.getText().split(","), view.textField_18.getText(), view.textField_20.getText(), view.comboBox.getSelectedItem().toString(), view.textField_21.getText(), view.textField_19.getText())){
    		 JOptionPane.showMessageDialog(null,"Successfully Updated");
    		 view.table_2.setModel(DbUtils.resultSetToTableModel(op.viewBookInfo()));
    	 }else{
    		 JOptionPane.showMessageDialog(null,"An Error Has Occured");
    	 }
     }else if(buttonPressed.equals("Find With ISBN")){
    	 try {
				view.table_2.setModel(DbUtils.resultSetToTableModel(op.Search_for_books(0, view.textField_15.getText(), null,null, null, null)));
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
     }else if(buttonPressed.equals("Insert")){
    	 if(view.textField_25.getText().isEmpty()|| view.textField_26.getText().isEmpty()){
    		 JOptionPane.showMessageDialog(null,"Empty Field(s)");
    	 }else{
    		 if(op.Place_orders_on_books(view.textField_25.getText(), view.textField_26.getText())){
    			 JOptionPane.showMessageDialog(null,"Order is Placed");
    			 view.table_3.setModel(DbUtils.resultSetToTableModel(op.viewOrders()));
    			 
    		 }else{
    			 JOptionPane.showMessageDialog(null,"This Book Isn't Exists");
    		 }
    	 }
     }else if(buttonPressed.equals("Confirm")){
    	 DefaultTableModel model =(DefaultTableModel) view.table_3.getModel();
		 try{
			 int row=view.table_3.getSelectedRow();
			 op.Confirm_orders(view.table_3.getValueAt(row, 0));
			 model.removeRow(row);
			 JOptionPane.showMessageDialog(null,"Order Confirmed");
		 }catch(Exception ex){
			 JOptionPane.showMessageDialog(null,ex);
		 }
     }else if(buttonPressed.equals("Show Total Sales")){
    	 view.table_4.setModel(DbUtils.resultSetToTableModel(op.total_sales_for_books()));
     }else if(buttonPressed.equals("Show Top 5 Customers")){
    	 view.table_4.setModel(DbUtils.resultSetToTableModel(op.top_5_customers()));
     }else if(buttonPressed.equals("Show Top 10 Sold Books")){
    	 view.table_4.setModel(DbUtils.resultSetToTableModel(op.top_10_selling_bookss()));
     }else if(buttonPressed.equals("Promote As A Manager")){
    	 DefaultTableModel model =(DefaultTableModel) view.table_5.getModel();
			 int row=view.table_5.getSelectedRow();
			 if( op.add_manager(view.table_5.getValueAt(row, 0))){
				 JOptionPane.showMessageDialog(null,"A New Manager Was Added");
			 }else{
				 JOptionPane.showMessageDialog(null,"This Person Is Already A Manager");
			 }
			
     
     }
	
	}
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==view.table_2){
			int row=view.table_2.getSelectedRow();
			DefaultTableModel model =(DefaultTableModel) view.table_2.getModel();
			val1=view.table_2.getValueAt(row, 0).toString();
			val2=view.table_2.getValueAt(row, 1).toString();
			val3=view.table_2.getValueAt(row, 2).toString();
			val4=view.table_2.getValueAt(row, 3).toString();
			val5=view.table_2.getValueAt(row, 4).toString();
			val6=view.table_2.getValueAt(row, 5).toString();
			val7=view.table_2.getValueAt(row, 6).toString();
			val8=view.table_2.getValueAt(row, 7).toString();
			val9=view.table_2.getValueAt(row, 8).toString();
			val10=view.table_2.getValueAt(row, 9).toString();
			val11=view.table_2.getValueAt(row, 10).toString();
			view.textField_15.setText(val1);
			view.textField_16.setText(val2);
			view.textField_17.setText(val3);
			view.textField_18.setText(val4);
			view.comboBox.setSelectedItem(val5);
			view.textField_19.setText(val6);
			view.textField_20.setText(val7);
			view.textField_21.setText(val8);
			view.textField_22.setText(val9);
			view.textField_23.setText(val10);
			view.textField_24.setText(val11);
			
		}
		
	
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

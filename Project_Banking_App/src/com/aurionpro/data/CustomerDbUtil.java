package com.aurionpro.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.entity.Customer;
import com.aurionpro.entity.CustomerNameAndId;
import com.aurionpro.entity.Transaction;


public class CustomerDbUtil {
	

	private Connection connection= null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	
	
	public CustomerDbUtil() {
		super();
        try {
            // Initialize the connection and statement
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingappdb", "root", "root");
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	
	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingappdb","root","root");
			System.out.println("Connection successful");
			statement = connection.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ResultSet getAllAdminCredentials() {
		ResultSet dbUsers=null;
		try {
			dbUsers = statement.executeQuery("select * from admincredentials");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbUsers;
		
	}

	

	
	
	public boolean validateCredentialsForAdmin(String username,String password) {
		
		ResultSet dbUsers = getAllAdminCredentials();
		try {
			while(dbUsers.next()) {
				if(dbUsers.getString("username").equals(username)) {
					if(dbUsers.getString("password").equals(password)) {
						return true;
					}
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public ResultSet getAllCustomerCredentials() {
		ResultSet dbUsers=null;
		try {
			dbUsers = statement.executeQuery("select * from customercredentials");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbUsers;
		
	}
	
	public boolean validateCredentialsForCustomer(String username,String password) {
		
		ResultSet dbUsers = getAllCustomerCredentials();
		try {
			while(dbUsers.next()) {
				if(dbUsers.getString("username").equals(username)) {
					if(dbUsers.getString("password").equals(password)) {
						return true;
					}
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public int getLastCustomerId()
	{
		ResultSet dbCustomerData;
		int lastCustomerId =0;
		try {
			dbCustomerData = statement.executeQuery("select customerid from customercredentials");
			
			while(dbCustomerData.next()) {
				lastCustomerId= dbCustomerData.getInt("CustomerId");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lastCustomerId;
		
		
	}
	
	public int getLastTransactionId()
	{
		ResultSet dbCustomerData;
		int lastTransactionId =0;
		try {
			dbCustomerData = statement.executeQuery("select transactionid from transactions");
			
			while(dbCustomerData.next()) {
				lastTransactionId= dbCustomerData.getInt("transactionid");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lastTransactionId;
		
		
	}
	
	
	//working code
//	public void addNewCustomer(String username, String password, String firstName, String lastName) {
//		
//		
//		int customerId = getLastCustomerId() +1;
//		try {
//			preparedStatement = connection.prepareStatement("insert into customercredentials values(?,?,?,?,?)");
//		
//			preparedStatement.setInt(1, customerId);
//			preparedStatement.setString(2, username);
//			preparedStatement.setString(3, password);
//			preparedStatement.setString(4, firstName);
//			preparedStatement.setString(5, lastName);
//	
//			preparedStatement.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
	//testing code
	
	public void addNewCustomer(String username, String password, String firstName, String lastName) throws SQLException {
	    // Check if the username already exists
	    if (usernameExists(username)) {
	        throw new SQLException("Username already exists");
	    }

	    int customerId = getLastCustomerId() + 1;
	    try {
	        preparedStatement = connection.prepareStatement("INSERT INTO customercredentials (customerId, username, password, firstname, lastname) VALUES (?, ?, ?, ?, ?)");
	        preparedStatement.setInt(1, customerId);
	        preparedStatement.setString(2, username);
	        preparedStatement.setString(3, password);
	        preparedStatement.setString(4, firstName);
	        preparedStatement.setString(5, lastName);

	        preparedStatement.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	        throw e; // Rethrow exception to indicate failure
	    }
	}

	// Method to check if the username exists in the database
	private boolean usernameExists(String username) throws SQLException {
	    String query = "SELECT COUNT(*) FROM customercredentials WHERE username = ?";
	    try (PreparedStatement ps = connection.prepareStatement(query)) {
	        ps.setString(1, username);
	        try (ResultSet rs = ps.executeQuery()) {
	            if (rs.next()) {
	                return rs.getInt(1) > 0;
	            }
	        }
	    }
	    return false;
	}


	public List<Customer> getAllCustomers() {
		ResultSet dbCustomerData=null;
		List<Customer> customers = new ArrayList<Customer>();
		try {
			dbCustomerData = statement.executeQuery("SELECT c.firstname, c.lastname, a.accountnumber, a.balance FROM customercredentials c JOIN accounts a ON c.customerid = a.customerid ");
			while(dbCustomerData.next()) {
				customers.add(new Customer(dbCustomerData.getString(1) ,dbCustomerData.getString(2), dbCustomerData.getLong(3), dbCustomerData.getDouble(4)));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.reverse(customers);
		return customers;
	}
	
	
	 public List<Transaction> getAllTransactions() {
	        ResultSet dbTransactionData = null;
	        List<Transaction> transactions = new ArrayList<>();
	        try {
	            dbTransactionData = statement.executeQuery("SELECT * FROM transactions order by transactionid  desc");
	            while (dbTransactionData.next()) {
	                transactions.add(new Transaction(
	                    dbTransactionData.getInt("transactionId"),
	                    dbTransactionData.getString("sendersaccountNumber"),
	                    dbTransactionData.getString("recieversaccountNumber"),
	                    dbTransactionData.getString("typeOfTransfer"),
	                    dbTransactionData.getDouble("amount"),
	                    dbTransactionData.getDate("date")
	                ));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return transactions;
	    }
	 
	 

	 
	 
//		public String getFirstNameAndLastName(int customerId) {
//			ResultSet dbCustomerData=null;
//			CustomerNames customerNames =null;
//			String customerName = "";
////			List<Customer> customersNames = new ArrayList<Customer>();
//			try {
//				dbCustomerData = statement.executeQuery("SELECT c.firstname, c.lastname FROM customercredentials c WHERE customerid= " + customerId + ";");
//
////				customerNames = new CustomerNames(dbCustomerData.getString(1) ,dbCustomerData.getString(2));
////				customersNames.add(new CustomerNames(dbCustomerData.getString(1) ,dbCustomerData.getString(2)));
//				
//				//chatgpt code
//				
//	            if (dbCustomerData.next()) {
//	                String firstName = dbCustomerData.getString("firstname");
//	                String lastName = dbCustomerData.getString("lastname");
//	                customerName = firstName + " " + lastName;
//	                
//	            }
//
//
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return customerName;
//		}
	 
	 public String getFirstNameAndLastName(int customerId) {
	        String customerName = "";
	        ResultSet dbCustomerData = null;
	        try {
	            if (statement != null) {
	                String query = "SELECT firstname, lastname FROM customercredentials WHERE customerId = ?";
	                PreparedStatement preparedStatement = connection.prepareStatement(query);
	                preparedStatement.setInt(1, customerId);
	                dbCustomerData = preparedStatement.executeQuery();

	                if (dbCustomerData.next()) {
	                    String firstName = dbCustomerData.getString("firstname");
	                    String lastName = dbCustomerData.getString("lastname");
	                    customerName = firstName + " " + lastName;
	                }
	                preparedStatement.close();
	            } else {
	                throw new IllegalStateException("Statement is not initialized.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (dbCustomerData != null) {
	                    dbCustomerData.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        return customerName;
	    }
		
		
		
//		public String getCustomerNameById(String customerId) {
//	        String customerName = "";
//	        String query = "SELECT firstname, lastname FROM customercredentials WHERE customerId = ?";
//	        
//	        try (Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingappdb","root","root");
//	             PreparedStatement stmt = conn.prepareStatement(query)) {
//	            stmt.setString(1, customerId);
//	            ResultSet rs = stmt.executeQuery();
//	            
//	            if (rs.next()) {
//	                String firstName = rs.getString("firstname");
//	                String lastName = rs.getString("lastname");
//	                customerName = firstName + " " + lastName;
//	            }
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	        }
//	        
//	        return customerName;
//	    }
		
		public String getCustomerNameById(int customerId) {
		    String customerName = "";
		    ResultSet resultSet = null;

		    try {
		        // Prepare the query to fetch the customer's first and last names based on customerId
		        String query = "SELECT firstname, lastname FROM customercredentials WHERE customerId = ?";
		        preparedStatement = connection.prepareStatement(query);
		        preparedStatement.setInt(1, customerId);

		        // Execute the query and process the result
		        resultSet = preparedStatement.executeQuery();
		        if (resultSet.next()) {
		            String firstName = resultSet.getString("firstname");
		            String lastName = resultSet.getString("lastname");
		            customerName = firstName + " " + lastName;
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        // Close the ResultSet and PreparedStatement to avoid resource leakage
		        try {
		            if (resultSet != null) {
		                resultSet.close();
		            }
		            if (preparedStatement != null) {
		                preparedStatement.close();
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    return customerName;
		}
		
		public String getFirstNameOfCustomer(int customerId) {
		    String firstName = "";
		    ResultSet resultSet = null;

		    try {
		        // Prepare the query to fetch the customer's first and last names based on customerId
		        String query = "SELECT firstname FROM customercredentials WHERE customerId = ?";
		        preparedStatement = connection.prepareStatement(query);
		        preparedStatement.setInt(1, customerId);

		        // Execute the query and process the result
		        resultSet = preparedStatement.executeQuery();
		        if (resultSet.next()) {
		            firstName = resultSet.getString("firstname");
		            
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        // Close the ResultSet and PreparedStatement to avoid resource leakage
		        try {
		            if (resultSet != null) {
		                resultSet.close();
		            }
		            if (preparedStatement != null) {
		                preparedStatement.close();
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    return firstName;
		}
		
		public String getLastNameOfCustomer(int customerId) {
		    String lastName = "";
		    ResultSet resultSet = null;

		    try {
		        // Prepare the query to fetch the customer's first and last names based on customerId
		        String query = "SELECT lastname FROM customercredentials WHERE customerId = ?";
		        preparedStatement = connection.prepareStatement(query);
		        preparedStatement.setInt(1, customerId);

		        // Execute the query and process the result
		        resultSet = preparedStatement.executeQuery();
		        if (resultSet.next()) {
		            lastName = resultSet.getString("lastname");
		            
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        // Close the ResultSet and PreparedStatement to avoid resource leakage
		        try {
		            if (resultSet != null) {
		                resultSet.close();
		            }
		            if (preparedStatement != null) {
		                preparedStatement.close();
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    return lastName;
		}

		public void addAccount(String accountNumber, double balance, int customerId) {
			
			String firstName = getFirstNameOfCustomer(customerId);
			String lastName = getLastNameOfCustomer(customerId);
		    try {
		        // Create SQL statement to insert a new account
		        String sql = "INSERT INTO accounts  VALUES (?,?,?, ?, ?)";
		        preparedStatement = connection.prepareStatement(sql);

		        // Set parameters for the SQL statement
		        preparedStatement.setString(1, firstName);
		        preparedStatement.setString(2, lastName);
		        preparedStatement.setString(3, accountNumber);
		        preparedStatement.setDouble(4, balance);
		        preparedStatement.setInt(5, customerId);

		        // Execute the statement
		        preparedStatement.executeUpdate();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}	
		
		public int getCustomerIdFromUsername(String username) {
			
			ResultSet dbCustomerData;
			int customerId =0;
			try {
				dbCustomerData = statement.executeQuery("select customerid from customercredentials where username = '" + username + "'");
				
				while(dbCustomerData.next()) {
					customerId= dbCustomerData.getInt("CustomerId");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return customerId;
			
		}
		
//		public int getAccountNumberFromCustomerId(int customerId) {
//			ResultSet dbCustomerData;
//			int accountNumber =0;
//			try {
//				dbCustomerData = statement.executeQuery("select accountNumber from accounts where customerid = " + customerId);
//				
//				while(dbCustomerData.next()) {
//					accountNumber= dbCustomerData.getInt("accountNumber");
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			return accountNumber;
			
			
//			 ResultSet dbCustomerData;
//		        int accountNumber = 0;
//		        try {
//		            if (statement != null) {
//		                System.out.println("Executing query for customerId: " + customerId);
//		                dbCustomerData = statement.executeQuery("SELECT accountNumber FROM accounts WHERE customerid = " + customerId);
//
//		                if (dbCustomerData.next()) {
//		                    accountNumber = dbCustomerData.getInt("accountNumber");
//		                    System.out.println("Account number retrieved: " + accountNumber);
//		                } else {
//		                    System.out.println("No record found for customerId: " + customerId);
//		                }
//		            } else {
//		                System.out.println("Statement is null, cannot execute query.");
//		            }
//		        } catch (SQLException e) {
//		            e.printStackTrace();
//		        }
//
//		        return accountNumber;
//		    }
			
			public int getAccountNumberFromCustomerId(int customerId) {
			    int accountNumber = 0;
			    ResultSet dbCustomerData = null;

			    try {
			        if (statement != null) {
			            System.out.println("Executing query for customerId: " + customerId);
			            String query = "SELECT accountNumber FROM accounts WHERE customerid = " + customerId;
			            dbCustomerData = statement.executeQuery(query);

			            if (dbCustomerData.next()) {
			                accountNumber = dbCustomerData.getInt("accountNumber");
			                System.out.println("Account number retrieved: " + accountNumber);
			            } else {
			                System.out.println("No record found for customerId: " + customerId);
			            }
			        } else {
			            System.out.println("Statement is null, cannot execute query.");
			        }
			    } catch (SQLException e) {
			        e.printStackTrace();
			    } finally {
			        // Ensure resources are closed
			        try {
			            if (dbCustomerData != null) {
			                dbCustomerData.close();
			            }
			        } catch (SQLException e) {
			            e.printStackTrace();
			        }
			    }

			    return accountNumber;
			}


			public void editProfile(String username, String password, String firstName, String lastName,int customerId) {
				// TODO Auto-generated method stub
				
				try {
					preparedStatement = connection.prepareStatement("UPDATE customercredentials SET firstname = '"+ firstName + "' WHERE CustomerId =" + customerId);
					preparedStatement.executeUpdate();
					preparedStatement = connection.prepareStatement("UPDATE customercredentials SET lastname = '"+ lastName + "' WHERE CustomerId =" + customerId);
					preparedStatement.executeUpdate();
					preparedStatement = connection.prepareStatement("UPDATE customercredentials SET username = '"+ username + "' WHERE CustomerId =" + customerId);
					preparedStatement.executeUpdate();
					preparedStatement = connection.prepareStatement("UPDATE customercredentials SET Password = '"+ password + "' WHERE CustomerId =" + customerId);

			
					preparedStatement.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}


			public void addCreditTransaction(String sendersAccountNumber, int accountNumber, String amount, String formattedDate) {
				// TODO Auto-generated method stub
				int transactionId = getLastTransactionId() +1;
				String typeOfTransaction = "credit";
				try {
					preparedStatement = connection.prepareStatement("insert into transactions  values(?,?,?,?,?,?)");
				
					preparedStatement.setInt(1, transactionId);
					preparedStatement.setString(2, sendersAccountNumber);
					preparedStatement.setInt(3, accountNumber);
					preparedStatement.setString(4, typeOfTransaction);
					preparedStatement.setString(5, amount);
					preparedStatement.setString(6, formattedDate);
			
					preparedStatement.executeUpdate();
					
					creditBalance(amount,accountNumber);
					System.out.println("Credit Transaction Added");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
				
			}


			public void addDebitTransaction(String recieversAccountNumber, int accountNumber, String amount,String formattedDate) {
				// TODO Auto-generated method stub
				int transactionId = getLastTransactionId() +1;
				String typeOfTransaction = "debit";
				int balance = getCustomerBalance(accountNumber);
				int amountInt = Integer.parseInt(amount);
				try {
					if(balance >= amountInt) {
						preparedStatement = connection.prepareStatement("insert into transactions  values(?,?,?,?,?,?)");
						
						preparedStatement.setInt(1, transactionId);
						preparedStatement.setInt(2, accountNumber);
						preparedStatement.setString(3, recieversAccountNumber);
						preparedStatement.setString(4, typeOfTransaction);
						preparedStatement.setString(5, amount);
						preparedStatement.setString(6, formattedDate);
				
						preparedStatement.executeUpdate();
						debitBalance(amount,accountNumber);
						System.out.println("DebitTransaction Added");
					}
					

					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			public int  getCustomerBalance(int accountNumber) {
			
				ResultSet resultSet = null;
				int balance = 0;
				try {
					preparedStatement = connection.prepareStatement("select balance from accounts where accountNumber = ?");
				
					preparedStatement.setInt(1, accountNumber);
			
					resultSet = preparedStatement.executeQuery();
			        if (resultSet.next()) {
			            balance = resultSet.getInt("balance");
			            System.out.println("Balance retrieved from the method is: " + balance);
			        }
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return balance;
			}
			
			public void creditBalance(String amount,int accountNumber) {
				ResultSet resultSet = null;
				int amountToBeAdded = Integer.parseInt(amount);
				int balance = getCustomerBalance(accountNumber);
				int newBalance = amountToBeAdded +balance;
				try {
					preparedStatement = connection.prepareStatement("update accounts set balance = ? where accountNumber = ?");
				
					preparedStatement.setInt(1, newBalance);
					preparedStatement.setInt(2, accountNumber);
			
					preparedStatement.executeUpdate();
					System.out.println("balance changed");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			public void debitBalance(String amount,int accountNumber) {
				ResultSet resultSet = null;
				int debitAmount = Integer.parseInt(amount);
				int balance = getCustomerBalance(accountNumber);
				int newBalance = balance - debitAmount;
				try {
					preparedStatement = connection.prepareStatement("update accounts set balance = ? where accountNumber = ?");
				
					preparedStatement.setInt(1, newBalance);
					preparedStatement.setInt(2, accountNumber);
			
					preparedStatement.executeUpdate();
					System.out.println("balance changed");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			public List<CustomerNameAndId> getLastestThreeCustomers() {
				ResultSet dbCustomerData=null;
				List<CustomerNameAndId> customerNameAndId = new ArrayList<CustomerNameAndId>();
				try {
					dbCustomerData = statement.executeQuery("SELECT CustomerId,firstname, lastname FROM customercredentials  order by customerId desc limit 3 ");
					while(dbCustomerData.next()) {
						customerNameAndId.add(new CustomerNameAndId(dbCustomerData.getInt(1) ,dbCustomerData.getString(2), dbCustomerData.getString(3)));

					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return customerNameAndId;
			}






}

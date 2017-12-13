package co.simplon.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {

	private final static String BDPATH = "jdbc:mysql://localhost:3306/maisonhotedb";
	private final static String DBUSER = "root";
	private final static String DBPASSWORD = "root";
	
	private static Connection connection;
	
	//public static void main(String[] args) throws ClassNotFoundException, SQLException {
	public void initConnection() throws ClassNotFoundException, SQLException {
		// Load the database driver
		Class.forName("com.mysql.jdbc.Driver");
		
		// Create the jdbc connection
		connection = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);
			
		
		// At the end, close the connection
		//connection.close();
	}

	
	public static void insertData(String nom, String prenom) throws SQLException
	{
		Statement statement = null;

		try {
			statement = connection.createStatement();
			String sql = "INSERT INTO `apprenant` (`nom`, `prenom`) VALUES ('" + nom + "', '" + prenom + "')";
			statement.executeUpdate(sql);
		}
		catch(SQLException e){
			System.out.println("An error occured trying to insert the new data !");
		}
		finally{	 
			statement.close();
		}
	
		System.out.println();
	}
	
	public static ArrayList<Client> showData() throws SQLException
	{
		Statement statement = null;
		ResultSet rs = null;

		try {
			// Create the statement
			statement = connection.createStatement();
			String sql = "SELECT * FROM apprenant";
			
			// Execute the query
			rs = statement.executeQuery(sql);
		
			// Loop on the results extracted from the database
			System.out.println("Liste actuelle des apprenants :");
			while (rs.next()) {
				System.out.println("  - " + rs.getString("id_apprenant") + " : " + rs.getString("prenom") + " " +  rs.getString("nom"));
			}
		}
		catch(SQLException e){
			System.out.println("An error occured trying to read the data !");
		}
		finally{	 
			statement.close();
		}
		
		System.out.println();
	}
}

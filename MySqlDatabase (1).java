package src;
import java.sql.*;
import java.util.ArrayList;

import com.mysql.cj.jdbc.*;
public class MySqlDatabase {
	
public static OrganizationPartners op = new OrganizationPartners();
public static String url;
public static String username;
public static String password;
public static Connection connection;
public static Statement statement;


	public MySqlDatabase(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
		try {
			connection =  DriverManager.getConnection(url,username,password);
			statement = connection.createStatement();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void loadEntriesToDatabase(String[][] org, int organizationID) {
		try {
			statement.execute("INSERT INTO organization VALUES(" + organizationID + ", '" + org[0][1] + "', '" + org[1][1] + "', '" + org[2][1] + "', '" + org[3][1] + "');");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void loadEntriesToDatabase(ArrayList<String> additional, int organizationID) {
		int numOfOrganizations = additional.size() / 4;
		int counter = 0;
		int arrayListIterator = 0;
		do {
			try {
			statement.execute("INSERT INTO organization VALUES(" + organizationID + ", '" + additional.get(arrayListIterator) + "', '" + additional.get(arrayListIterator + 1) + "', '" + additional.get(arrayListIterator + 2) + "', '" + additional.get(arrayListIterator + 3) + "');");
			arrayListIterator += 4;
			organizationID++;
			}
			catch(Exception e) {
			System.out.println(e);
			}
			counter++;
		}while(counter < numOfOrganizations);
	}
	public static void filterData(String orgName) {
		ResultSet filter = null;
		try {
		 filter = statement.executeQuery("SELECT * FROM organization where organization_Name = '"+ orgName + "' ;");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
		    while (filter.next()) {
		        int id = filter.getInt("organization_ID");
		        String org_Name = filter.getString("organization_Name");
		        String orgType = filter.getString("organization_Type");
		        String orgResources = filter.getString("organization_resources");
		        String orgContactInfo = filter.getString("organization_contact");
		        
		        System.out.println("ID: " + id);
		        System.out.println("Organization Name: " + org_Name);
		        System.out.println("Organization Type: " + orgType);
		        System.out.println("Organization Resources: " + orgResources);
		        System.out.println("Organization Contact Info: " + orgContactInfo);
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	}
	public static void viewEntries() {
		ResultSet filter = null;
		try {
		 filter = statement.executeQuery("SELECT * FROM organization;");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
		    while (filter.next()) {
		        int id = filter.getInt("organization_ID");
		        String org_Name = filter.getString("organization_Name");
		        String orgType = filter.getString("organization_Type");
		        String orgResources = filter.getString("organization_resources");
		        String orgContactInfo = filter.getString("organization_contact");
		        
		        System.out.println("ID: " + id);
		        System.out.println("Organization Name: " + org_Name);
		        System.out.println("Organization Type: " + orgType);
		        System.out.println("Organization Resources: " + orgResources);
		        System.out.println("Organization Contact Info: " + orgContactInfo);
		    }
		} catch (SQLException e) {
		    e.printStackTrace();
		}
	}

}

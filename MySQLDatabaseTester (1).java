package src;

import java.util.Scanner;

public class MySQLDatabaseTester {
	public static MySqlDatabase msd;
	public static OrganizationPartners op;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the url for your mySQL database sever: ");
		String url = input.nextLine();
		System.out.println("Please enter the username for your mySQL database sever: ");
		String user = input.nextLine();
		System.out.println("Please enter the password for your mySQL database sever: ");
		String pass = input.nextLine();
		msd = new MySqlDatabase(url, user, pass);
		loadPresetOrganizations();
		OrganizationInterface oi = new OrganizationInterface();	
	}
	public static void loadPresetOrganizations() {
		msd.loadEntriesToDatabase(op.org1, 1);
		msd.loadEntriesToDatabase(op.org2, 2);
		msd.loadEntriesToDatabase(op.org3, 3);
		msd.loadEntriesToDatabase(op.org4, 4);
		msd.loadEntriesToDatabase(op.org5, 5);
		msd.loadEntriesToDatabase(op.org6, 6);
		msd.loadEntriesToDatabase(op.org7, 7);
		msd.loadEntriesToDatabase(op.org8, 8);
		msd.loadEntriesToDatabase(op.org9, 9);
		msd.loadEntriesToDatabase(op.org10, 10);
		msd.loadEntriesToDatabase(op.org11, 11);
		msd.loadEntriesToDatabase(op.org12, 12);
		msd.loadEntriesToDatabase(op.org13, 13);
		msd.loadEntriesToDatabase(op.org14, 14);
		msd.loadEntriesToDatabase(op.org15, 15);
		msd.loadEntriesToDatabase(op.org16, 16);
		msd.loadEntriesToDatabase(op.org17, 17);
		msd.loadEntriesToDatabase(op.org18, 18);
		msd.loadEntriesToDatabase(op.org19, 19);
		msd.loadEntriesToDatabase(op.org20, 20);
		msd.loadEntriesToDatabase(op.org21, 21);
		msd.loadEntriesToDatabase(op.org22, 22);
		msd.loadEntriesToDatabase(op.org23, 23);
		msd.loadEntriesToDatabase(op.org24, 24);
		msd.loadEntriesToDatabase(op.org25, 25);

	}

}

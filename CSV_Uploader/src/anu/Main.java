package anu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		try {

			CSVLoader loader = new CSVLoader(getCon());
			loader.loadCSV("D:\\ms3Interview.csv", "data", true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Connection getCon() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("11111111111111111111111111111111111111111111");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/csvupload", "root",
					"12345678");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}

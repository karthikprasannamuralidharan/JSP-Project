package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertCustomer {

	public static boolean saveCustomer(Customer customer) {
		int n = 0;
		String custName = customer.getCustName();
		String username = customer.getUsername();
		String password = customer.getPassword();
		int age = customer.getAge();
		String email = customer.getEmail();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql:///servlet", "root", "31103110");
			PreparedStatement st = conn.prepareStatement("insert into Customer value ('" + custName + "', '" + username
					+ "','" + password + "'," + age + ",'" + email + "')");
			n = st.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

		if (n == 1) {
			return true;
		} else {
			return false;
		}

	}

}

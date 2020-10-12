package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {

	public static boolean isAuthenticated(String email, String password) {

		Connection conn = DbConnection.getConnection();

		String sql = "SELECT * FROM employee WHERE email=? AND password=?";

		try {
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

}

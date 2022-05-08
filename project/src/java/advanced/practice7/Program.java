package advanced.practice7;

import java.sql.*;
import java.util.ResourceBundle;

public class Program {
    public static void main(String[] args) throws SQLException {
        ResourceBundle resource = ResourceBundle.getBundle("database");
        String url = resource.getString("db.url");
        String user = resource.getString("db.user");
        String pass = resource.getString("db.password");
        Connection connection = DriverManager.getConnection(url, user, pass);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM movies");
        //findMovieByYear(rs, "2001");
        //showStaffOfMovie(rs, "Avatar");
        //deleteOldMovie(st, rs);
    }

    private static void deleteOldMovie(Statement st, ResultSet rs) throws SQLException {
        while (rs.next()) {
            if (rs.getInt("released") < (2022 - 22)) {
                int res = st.executeUpdate("UPDATE movies SET movie, staff, released, country = ' ' WHERE id = " + rs.getInt("id"));
            }
        }
    }

    private static void showStaffOfMovie(ResultSet rs, String movie) throws SQLException {
        while (rs.next()) {
            if (rs.getString("movie").equals(movie))
                System.out.println(rs.getString("staff"));
        }
    }

    private static void findMovieByYear(ResultSet rs, String year) throws SQLException {
        while (rs.next()) {
            if (rs.getString("released").equals(year))
                System.out.println(rs.getString("movie"));
        }
    }
}

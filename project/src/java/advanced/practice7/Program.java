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
        deleteOldMovie(rs, 20);
    }

    private static void deleteOldMovie(ResultSet rsMovie, int year) throws SQLException {
        while (rsMovie.next()) {
            if (rsMovie.getInt("released") < (2022 - year)) {
                System.out.println(rsMovie.getString("movie"));
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

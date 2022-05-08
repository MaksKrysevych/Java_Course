package advanced.practice8;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public interface DAO {
    List<Movie> findAll();
    Movie findMovieById(int id);

    boolean delete(int id);
    boolean create(Movie t);
    boolean update(Movie t);
    default void close(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            // log
        }
    }
    default void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close(); // or connection return code to the pool
            }
        } catch (SQLException e) {
            // log
        }
    }
}

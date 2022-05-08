package advanced.practice8;

import junit.framework.TestCase;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MovieDAOTest extends TestCase {
    private Connection getConnection() throws SQLException {
        ResourceBundle resource = ResourceBundle.getBundle("database");
        String url = resource.getString("db.url");
        String user = resource.getString("db.user");
        String pass = resource.getString("db.password");
        Connection connection = DriverManager.getConnection(url, user, pass);
        return connection;
    }

    @Test
    public void testShowActorsInMovie() {

    }
    @Test
    public void testShowMovieByYear() {
    }
    @Test
    public void testDeleteOldMovie() {
    }
    @Test
    public void testFindAll() throws SQLException {
        MovieDAO movieDAO = new MovieDAO(getConnection());
        movieDAO.findAll();
        assertEquals(3, movieDAO.movies.size());
    }
    @Test
    public void testFindMovieById() throws SQLException {
        MovieDAO movieDAO = new MovieDAO(getConnection());
        movieDAO.findAll();

        assertEquals("Fast&Furios", movieDAO.findMovieById(1).getName());
    }
    @Test
    public void testDelete() throws SQLException {
        MovieDAO movieDAO = new MovieDAO(getConnection());
        Movie movie = new Movie();
        movieDAO.delete(4);
        movieDAO.findAll();
        assertEquals(3, movieDAO.movies.size());
    }

    @Test
    public void testCreate() throws SQLException {
        MovieDAO movieDAO = new MovieDAO(getConnection());

        Movie movie = new Movie();

        movie.setName("s");
        movie.setStaff("s");
        movie.setReleased(1);
        movie.setCountry("s");

        movieDAO.create(movie);
        movieDAO.findAll();

        assertEquals(4, movieDAO.movies.size());
    }

    @Test
    public void testUpdate() throws SQLException {
        MovieDAO movieDAO = new MovieDAO(getConnection());

        Movie movie = new Movie();
        movie.setName("s");
        movie.setStaff("s");
        movie.setReleased(1);
        movie.setCountry("s");

        movieDAO.create(movie);
        movieDAO.findAll();

        movie.setName("sa");

        movieDAO.update(movie);

        assertEquals("sa", movieDAO.movies.get(3).getName());
    }
}
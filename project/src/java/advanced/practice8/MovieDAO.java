package advanced.practice8;

import javax.swing.text.html.parser.Entity;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO implements DAO{
    List<Movie> movies = new ArrayList<>();
    final Connection connection;
    private static final String SQL_CREATE_MOVIE =
            "INSERT INTO movies (id, movie, staff, released, country) VALUES (DEFAULT, (?), (?), (?), (?))";

    private static final String SQL_SELECT_ALL_MOVIE =
            "SELECT id, movie, staff, released, country FROM movies";

    private static final String SQL_UPDATE_MOVIE =
            "UPDATE movies SET movie = (?), staff = (?), released = (?), country = (?) WHERE id = (?)";

    private static final String SQL_DELETE_MOVIE =
            "DELETE FROM movies WHERE id = ?";



    public MovieDAO(Connection connection) {
        this.connection = connection;
    }

    public void showActorsInMovie(String movie){
        for (var m: movies) {
            if (m.getName() == movie){
                System.out.println(m.getStaff());
            }
        }
    }

    public void showMovieByYear(int year){
        for (var movie: movies) {
            if (movie.getReleased() == year){
                System.out.println(movie.getName());
            }
        }
    }

    public void deleteOldMovie(int year){
        for (var movie: movies) {
            if (movie.getReleased() < (2022-year)){
                movies.remove(movie);
            }
        }
    }

    @Override
    public List<Movie> findAll() {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(SQL_SELECT_ALL_MOVIE);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                Movie movie = new Movie();
                movie.setId(resultSet.getInt("id"));
                movie.setName(resultSet.getString("movie"));
                movie.setStaff(resultSet.getString("staff"));
                movie.setReleased(resultSet.getInt("released"));
                movie.setCountry(resultSet.getString("country"));
                movies.add(movie);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return movies;
    }

    @Override
    public Movie findMovieById(int id) {
        return movies.get(id);
    }

    @Override
    public boolean delete(int id) {
        int result = 0;

        try (PreparedStatement statement = connection.prepareStatement(SQL_DELETE_MOVIE)) {
            statement.setInt(1, id);

            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public boolean create(Movie movie) {
        boolean result = false;

        try (PreparedStatement statement = connection.prepareStatement(SQL_CREATE_MOVIE)) {
            statement.setString(1, movie.getName());
            statement.setString(2, movie.getStaff());
            statement.setInt(3, movie.getReleased());
            statement.setString(4, movie.getCountry());

            result = statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public boolean update(Movie movie) {
        int result = 0;

        try (PreparedStatement statement = connection.prepareStatement(SQL_UPDATE_MOVIE)) {
            statement.setString(1, movie.getName());
            statement.setString(2, movie.getStaff());
            statement.setInt(3, movie.getReleased());
            statement.setString(4, movie.getCountry());
            statement.setInt(5, movie.getId());


            result = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}

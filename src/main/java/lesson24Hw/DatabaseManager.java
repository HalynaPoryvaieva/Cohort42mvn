package lesson24Hw;

import java.sql.*;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw24,Task 2
 * @version 11-Mar-24
 * @author Halyna Poryvaieva
 */
public class DatabaseManager {
    private Connection connection;

    public DatabaseManager(String url) throws SQLException {
        this.connection = DriverManager.getConnection(url);
    }

    public void addStudent(Student student) throws SQLException {
        String query = "INSERT INTO students (name, group_name) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, student.getName());
            statement.setString(2, student.getGroupName());
            statement.executeUpdate();
        }
    }

    public void viewAllStudents() throws SQLException {
        String query = "SELECT * FROM students";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " +
                        resultSet.getString("name") + " " +
                        resultSet.getString("group_name"));
            }
        }
    }

    public void updateStudent(int id, String name, String groupName) throws SQLException {
        String query = "UPDATE students SET name = ?, group_name = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setString(2, groupName);
            statement.setInt(3, id);
            statement.executeUpdate();
        }
    }

    public void deleteStudent(int id) throws SQLException {
        String query = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }

    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}

package lesson24;

import java.sql.*;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw24,Task 1
 * @version 11-Mar-24
 * @author Halyna Poryvaieva
 */
public class Lesson24 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/AIT/BasicJava/БазаДаних");
        Statement stmt = connection.createStatement();

        add("Vova", "cohort41.2", stmt);
        read(stmt);

        ResultSet rs = stmt.executeQuery("SELECT * FROM students;");

        while (rs.next()) {
            System.out.println(rs.getInt("id") + " " +
                    rs.getString("group_name") + " " + rs.getString("name"));
        }
        stmt.close();
        connection.close();
    }

    //CRUD -create,read,update,delete

    static void add(String name, String groupName, Statement stmt) throws SQLException {
        stmt.executeUpdate("INSERT INTO students (name,group_name) VALUES ('" + name + "','" + groupName + "')");
    }

    static void read(Statement stmt) throws SQLException {
        ResultSet rs = stmt.executeQuery("SELECT * FROM students;");

        while (rs.next()) {
            System.out.println(rs.getInt("id") + " " +
                    rs.getString("group_name") + " " + rs.getString("name"));
        }
    }

    static void delete(int id, Statement stmt) throws SQLException {
        stmt.executeUpdate("DELETE FROM students WHERE id = " + id);
    }

    static void update(String name, String group_name, Statement stmt) throws SQLException {
        stmt.executeUpdate("UPDATE students SET name = '" + name + "', group_name = '" + group_name);
    }
}
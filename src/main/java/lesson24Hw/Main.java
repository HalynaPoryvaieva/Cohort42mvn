package lesson24Hw;

import java.sql.SQLException;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw24,Task 2
 * @version 11-Mar-24
 * @author Halyna Poryvaieva
 */
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:/AIT/BasicJava/БазаДаних";

        DatabaseManager databaseManager = null;
        try {
            databaseManager = new DatabaseManager(url);

            // Add student
            Student student1 = new Student("John", "cohort1");
            databaseManager.addStudent(student1);

            // View all students
            databaseManager.viewAllStudents();

            // Update student
            databaseManager.updateStudent(1, "James", "cohort2");

            // Delete student
            databaseManager.deleteStudent(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Закрываем соединение с базой данных вне блока try
        if (databaseManager != null) {
            try {
                databaseManager.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

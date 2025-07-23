package basicPrograms;

import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD {

    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "Bhoomi@1909";

    private static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Create
    public static void createEmployee(String name, String email) {
        String sql = "INSERT INTO employees (name, email) VALUES (?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.executeUpdate();
            System.out.println("Employee added.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Read
    public static void readEmployees() {
        String sql = "SELECT * FROM employees";

        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("ID | Name | Email");
            while (rs.next()) {
                System.out.printf("%d | %s | %s%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update
    public static void updateEmployee(int id, String name, String email) {
        String sql = "UPDATE employees SET name = ?, email = ? WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, id);
            int rows = stmt.executeUpdate();
            if (rows > 0)
                System.out.println("Employee updated.");
            else
                System.out.println("Employee not found.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete
    public static void deleteEmployee(int id) {
        String sql = "DELETE FROM employees WHERE id = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0)
                System.out.println("Employee deleted.");
            else
                System.out.println("Employee not found.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Main menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Employee CRUD ===");
            System.out.println("1. Create Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    createEmployee(name, email);
                    break;

                case 2:
                    readEmployees();
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    updateEmployee(updateId, newName, newEmail);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    deleteEmployee(deleteId);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}


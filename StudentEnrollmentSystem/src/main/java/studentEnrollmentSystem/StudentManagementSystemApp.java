package studentEnrollmentSystem;

import java.util.List;
import java.util.Scanner;

public class StudentManagementSystemApp {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			StudentDao studentDao = new StudentDao();

			while (true) {
				System.out.println(" === Student Management Menu ===");
				System.out.println("1. Add Student");
				System.out.println("2. View All Students");
				System.out.println("3. View Student by ID");
				System.out.println("4. Update Student Name");
				System.out.println("5. Delete Student");
				System.out.println("6. Exit");
				System.out.print("Choose an option: ");

				int choice;
				try {
					choice = Integer.parseInt(scanner.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a number.");
					continue;
				}

				switch (choice) {
				case 1:
					System.out.print("Enter student ID: ");
					int id = Integer.parseInt(scanner.nextLine());

					System.out.print("Enter student name: ");
					String name = scanner.nextLine();

					studentDao.addStudent(id, name);
					System.out.println("Student added successfully.");
					break;

				case 2:
					List<String> students = studentDao.getAllStudents();
					if (students.isEmpty()) {
						System.out.println("No students found.");
					} else {
						students.forEach(System.out::println);
					}
					break;

				case 3:
					System.out.print("Enter student ID: ");
					int sid = Integer.parseInt(scanner.nextLine());

					String student = studentDao.getStudentById(sid);
					if (student != null) {
						System.out.println(student);
					} else {
						System.out.println("Student not found.");
					}
					break;

				case 4:
					System.out.print("Enter student ID to update: ");
					int uid = Integer.parseInt(scanner.nextLine());

					System.out.print("Enter new name: ");
					String newName = scanner.nextLine();

					studentDao.updateStudentName(uid, newName);
					System.out.println("Student name updated.");
					break;

				case 5:
					System.out.print("Enter student ID to delete: ");
					int did = Integer.parseInt(scanner.nextLine());

					studentDao.deleteStudent(did);
					System.out.println("Student deleted.");
					break;

				case 6:
					System.out.println("Exiting...");
					studentDao.close();
					return;

				default:
					System.out.println("Invalid option. Please choose between 1–6.");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

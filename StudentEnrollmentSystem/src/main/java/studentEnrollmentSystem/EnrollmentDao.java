package studentEnrollmentSystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentDao {
    public void enrollStudent(int studentId, int courseId, int facultyId) throws Exception {
        Connection con = DBConnect.getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO enrollement (student_id, course_id, faculty_id) VALUES (?, ?, ?)");
        st.setInt(1, studentId);
        st.setInt(2, courseId);
        st.setInt(3, facultyId);
        st.executeUpdate();
        con.close();
    }

    public List<String> getAllEnrollments() throws Exception {
        Connection con = DBConnect.getConnection();
        String sql = "SELECT e.id, s.name AS student_name, c.title AS course_title, f.name AS faculty_name " +
                     "FROM enrollement e " +
                     "JOIN student s ON e.student_id = s.id " +
                     "JOIN course c ON e.course_id = c.id " +
                     "JOIN Trainer f ON e.faculty_id = f.id";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        List<String> enrollments = new ArrayList<>();
        while (rs.next()) {
            enrollments.add("Enrollment ID: " + rs.getInt("id") +
                            ", Student: " + rs.getString("student_name") +
                            ", Course: " + rs.getString("course_title") +
                            ", Faculty: " + rs.getString("faculty_name"));
        }
        con.close();
        return enrollments;
    }
}

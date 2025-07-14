package studentEnrollmentSystem;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	 private Connection con;
	    public StudentDao() throws Exception {
	        this.con = DBConnect.getConnection();
	    }

    public void addStudent(int id, String name) throws Exception {
        Connection con = DBConnect.getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO student VALUES (?, ?)");
        st.setInt(1, id);
        st.setString(2, name);
        st.executeUpdate();
        con.close();
    }

    public List<String> getAllStudents() throws Exception {
        Connection con = DBConnect.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student");
        List<String> students = new ArrayList<>();
        while (rs.next()) {
            students.add("ID: " + rs.getInt("student_id") + ", Name: " + rs.getString("student_name"));
        }
        con.close();
        return students;
    }

    public String getStudentById(int id) throws Exception {
        Connection con = DBConnect.getConnection();
        PreparedStatement st = con.prepareStatement("SELECT * FROM student WHERE student_id = ?");
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();
        String student = null;
        if (rs.next()) {
            student = "ID: " + rs.getInt("student_id") + ", Name: " + rs.getString("student_name");
        }
        con.close();
        return student;
    }

    public void updateStudentName(int id, String newName) throws Exception {
        Connection con = DBConnect.getConnection();
        PreparedStatement st = con.prepareStatement("UPDATE student SET student_name = ? WHERE student_id = ?");
        st.setString(1, newName);
        st.setInt(2, id);
        st.executeUpdate();
        con.close();
    }

    public void deleteStudent(int id) throws Exception {
        Connection con = DBConnect.getConnection();
        PreparedStatement st = con.prepareStatement("DELETE FROM student WHERE student_id = ?");
        st.setInt(1, id);
        st.executeUpdate();
        con.close();
    }
    
    public void close() throws Exception {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }
}


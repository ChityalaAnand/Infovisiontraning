package studentEnrollmentSystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public void addCourse(int id, String title) throws Exception {
        Connection con = DBConnect.getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO course VALUES (?, ?)");
        st.setInt(1, id);
        st.setString(2, title);
        st.executeUpdate();
        con.close();
    }

    public List<String> getAllCourses() throws Exception {
        Connection con = DBConnect.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM course");
        List<String> courses = new ArrayList<>();
        while (rs.next()) {
            courses.add("ID: " + rs.getInt("id") + ", Title: " + rs.getString("title"));
        }
        con.close();
        return courses;
    }
}

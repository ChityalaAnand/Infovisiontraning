package studentEnrollmentSystem;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TrainerDao {
    public void addFaculty(int id, String name) throws Exception {
        Connection con = DBConnect.getConnection();
        PreparedStatement st = con.prepareStatement("INSERT INTO Trainer VALUES (?, ?)");
        st.setInt(1, id);
        st.setString(2, name);
        st.executeUpdate();
        con.close();
    }

    public List<String> getAllFaculty() throws Exception {
        Connection con = DBConnect.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Trainer");
        List<String> facultyList = new ArrayList<>();
        while (rs.next()) {
            facultyList.add("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
        }
        con.close();
        return facultyList;
    }
}
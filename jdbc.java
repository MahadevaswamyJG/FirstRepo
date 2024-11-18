import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/aicte";
        String user = "root"; // Add your username here
        String password = ""; // Add your password here
        String sql = "SELECT USN, NAME FROM DEPARTMENT_NAME WHERE DEPARTMENT_ID='D1'";

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                String usn = rs.getString("USN");
                String name = rs.getString("NAME");
                System.out.println("USN: " + usn);
                System.out.println("Name: " + name);
            } else {
                System.out.println("No results found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

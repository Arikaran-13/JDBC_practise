import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fetching {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            String un = "root";
            String pwd = "123456";
            String q = " select name from student_table where id =1";
            String q1 = "select * from student_table";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, un, pwd);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q1);
            String userdata = "";
            while (rs.next()) {

                userdata = rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3);
                System.out.println(userdata);
            }
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            String un = "root";
            String pwd = "123456";
            String q = " update student_table set name='alex cartner' where id=1";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, un, pwd);
            Statement st = con.createStatement();
            int rowsffected = st.executeUpdate(q);

            System.out.println(rowsffected);
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

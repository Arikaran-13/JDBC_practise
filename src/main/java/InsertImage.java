import com.mysql.cj.jdbc.ConnectionImpl;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            String un = "root";
            String pwd = "123456";
            String q = "insert into mytable(id,image) value(?,?)";
            String imagePath = "D://img1.jpg";
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url,un,pwd);
            PreparedStatement st = con.prepareStatement(q);
            FileInputStream fs = new FileInputStream(imagePath);
st.setString(1,"image");
            st.setBlob(2,fs);
            st.execute();
            System.out.println("Record inserted");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

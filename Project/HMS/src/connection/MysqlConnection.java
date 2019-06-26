
package connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class MysqlConnection {
public Connection connection=null;
ResultSet rs=null;
    Statement st=null;
public MysqlConnection()
       
{
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/db_hms","root","root");
	
	
	}
catch (Exception e) {
	// TODO Auto-generated catch block
	JOptionPane.showMessageDialog(null, e);
	
	} 
}
 public boolean update(String updateqry)
     {
         boolean b=false;
         try
         {
             st=connection.createStatement();
             st.executeUpdate(updateqry);
             b=true;
         }
         catch(SQLException e)
         {
             System.out.println(e);
         }
         return b;
     }
}

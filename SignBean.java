//SignBean.java
package ip;
import java.sql.*;
public class SignBean 
{
	String fname;
    String lname;
    String gender;
    String email;
    public SignBean()
    {
		
    }
     public void setFname(String fn)
{
	fname=fn;
}
public void setLname(String ln)
{
	lname=ln;
}
public void setGender(String gen)
{
	gender=gen;
}
public void setEmail(String em)
 {
        email = em;
}
public String getFname()
{
	return fname;
}
public String getLname()
{
	return lname;
}
public String getGender()
{
	return gender;
}
public String getEmail() 
{
   return email;
}
public boolean store()
{
	int res=0;
     try
     {
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","system","admin");
        PreparedStatement pst=con.prepareStatement("insert into sign values(?,?,?,?)");
        pst.setString(1,fname);
        pst.setString(2,lname);
        pst.setString(3,gender);
        pst.setString(4,email);
        res=pst.executeUpdate();
     }catch(Exception e)
     {
      System.out.println(e);
     }
     if(res>0)
          return true;
      else
           return false;
}//store()
}//InsertBean----javaBean

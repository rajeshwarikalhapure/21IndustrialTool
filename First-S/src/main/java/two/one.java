package two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/kites")

public class one extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		String x,y;
		x=req.getParameter("email");
		y=req.getParameter("pass");
		
		System.out.println(x);
		
		
		try
		{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Student","postgres","rajeshwari123");
			
			
			PreparedStatement ps=con.prepareStatement("select *from manager where memail= '"+x+"' and mpass='"+y+"' ");
			
			     ResultSet rs =ps.executeQuery();
			     if(rs.next())
			     {
			    	 System.out.println("Login succesfull");
			     }
			     else
			     {
			    	 System.out.println("login Fail..................");
			     }
			
			
			
			
		}
		catch(Exception e)
		{
			
		}
	}

}

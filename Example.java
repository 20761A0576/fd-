import java.sql.*;
class Example
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  //for loading drivers
			System.out.println("Loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC77","IPC77");
			System.out.println("Established");
			Statement sct=con.createStatement() ;
			String sql="insert into student values(77,'manoj')";
			int c=sct.executeUpdate(sql);
			System.out.println(c);
			//String s1="delete from student where roillno = "+77;
			//int x = sct.executeUpdate(s1);
			//System.out.println(x);
			String s="select * from student";
			ResultSet se=sct.executeQuery(s);
			while(se.next()){
			System.out.print(se.getString(1)+"\t");
			System.out.println(se.getString(2));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
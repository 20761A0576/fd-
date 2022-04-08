import java.sql.*;

class Creation
{
	public static void main(String args[])
	{
		try
		{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC77","IPC77");
			Statement sct=con.createStatement();
			//String s1="create table stu(rno int,name varchar(20))";
			//int c=sct.executeUpdate(s1);
			//System.out.println(c);
			String s2="insert into stu values(76,'jyo')";
			int c1=sct.executeUpdate(s2);
			System.out.println(c1);
			String s3="select * from stu";
			ResultSet re=sct.executeQuery(s3);
			while(re.next())
			{
				System.out.println(re.getInt(2)+"\t"+re.getString(1));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
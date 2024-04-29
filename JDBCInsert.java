import java.sql.*;
class JDBCInsert
{
	public static void main(String[] args){
		try{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/aitscsec","postgres","jkc");
			Statement stmt=con.createStatement();
			String iQuery="insert into empaits25 values(1,'ramu')";
			int i=stmt.executeUpdate(iQuery);
			if(i>0)
			{
				System.out.println(i+" record inserted");
			}
			else
			{
				System.out.println("no record inserted,insert operation unsuccessful");
			}
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException e){
			e.printStackTrace();
		}		
	}
}
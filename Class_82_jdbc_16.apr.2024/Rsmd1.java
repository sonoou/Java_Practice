import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Rsmd1{
	public static void main(String args[])throws Exception{
		Connection conn = getOracleConnection();

		Statement st = conn.createStatement();
		st.executeUpdate("drop table survey");
		st.executeUpdate("create table survey(id number(4), name varchar(30))");
		st.executeUpdate("insert into survey(id, name) values(9,'meesa')");
		ResultSet rs = st.executeQuery("SELECT * FROM survey");
		ResultSetMetaData rsmd = rs.getMetaData();
		int numberOfColumns = rsmd.getColumnCount();
		System.out.println("resultSet MetaData column Count = "+numberOfColumns);

		for(int i=1;i<=numberOfColumns;i++){
			System.out.println("column MetaData ");
			System.out.println("column number "+i);
			//indicates the designed column's normal maximum width in characters
			System.out.println("column size: "+rsmd.getColumnDisplaySize(i));
			// gets the designated column's suggested title for use in printouts and displays.
			System.out.println("column label: "+rsmd.getColumnLabel(i));
			// get the designated column's name.
			System.out.println("column name: "+rsmd.getColumnName(i));

			// get the designated column's SQL type.
			System.out.println("column type(interger): "+rsmd.getColumnType(i));//(Types.INTEGER==z)

			// get the designated column's type name.
			System.out.println("column type name: "+rsmd.getColumnTypeName(i));

			// get the designated column's class name.
			System.out.println("column class name: "+rsmd.getColumnClassName(i));

			// get the designated column's table name.
			System.out.println("column table name: "+rsmd.getTableName(i));

			// get the designated column's number of decimal digits.
			System.out.println("column left precision: "+rsmd.getPrecision(i));

			// get the designated column's number of digits to right of thedecimal point.
			System.out.println("column right precision: "+rsmd.getScale(i));

			// indicates whether the designated column is automatically numbered, thus read-only.
			System.out.println("column read-only: "+rsmd.isAutoIncrement(i));

			// indicates whether the designated column is a cash value.
			System.out.println("column cash: "+rsmd.isCurrency(i));

			// indicates whether a wirte on the designated column will succed.
			System.out.println("column writable: "+rsmd.isWritable(i));

			// indicates whether the nullablity of values in the designated column.
			System.out.println("column nullable: "+rsmd.isNullable(i));

			// indicates whether the designated column is definatly not writable.
			System.out.println("column read only: "+rsmd.isReadOnly(i));

			// indicates whether a column's case matters in the designated column.
			System.out.println("column case sensitive: "+rsmd.isCaseSensitive(i));

			// indicates whether a column's case matters in the designated column.
			System.out.println("column searchable: "+rsmd.isSearchable(i));

			// indicates whether values in the designated column are signed numbers.
			System.out.println("column singed: "+rsmd.isSigned(i));

			// get the designated column's table's catalog name.
			System.out.println("column catalog name: "+rsmd.getCatalogName(i));

			// get the designated column's table's schema name.
			System.out.println("column schema name: "+rsmd.getSchemaName(i));
		}
		st.close();
		conn.close();
	}
	public static Connection getOracleConnection()throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:5353:xe","System","Oracle10g");
	}
}

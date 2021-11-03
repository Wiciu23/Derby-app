import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String jdbcURL = "jdbc:derby://localhost:1527/seconddb";
        try {
            Connection connection = DriverManager.getConnection(jdbcURL);
            System.out.println("Connected to Derby server");
            String sql = "SELECT * FROM SECONDTABLE";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()){
                String odpowiedz = result.getString("id") + " " + result.getString("name");
                System.out.println(odpowiedz);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}




package databaseconnection;
import java.sql.*;




public class DatabaseConnection {

    
    public static void main(String[] args) throws SQLException {
        
            try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");//Establishing connection
                    System.out.println("Connected With the database successfully"); //Message after successful connection
                   // PreparedStatement preparedStatement =connection.prepareStatement("create table student(ID varchar(10),FistName varchar(20),LastName varchar(20),Major varchar(20))");
                  //  preparedStatement.execute();
                //  PreparedStatement preparedStatement =connection.prepareStatement("insert into student values(?,?,?,?)");
                //        preparedStatement.setString(1,"65020544");
                //        preparedStatement.setString(2,"marayut");
                //       preparedStatement.setString(3,"bungjak");
                //        preparedStatement.setString(4,"CPE");
                //  preparedStatement.executeUpdate();
                
                //  System.out.println("Data inserted Successfully");
                  PreparedStatement preparedStatement =connection.prepareStatement("SELECT * FROM student");
 
                //Creating Java ResultSet object
                ResultSet resultSet = preparedStatement.executeQuery();
                
                //Getting Results
                  while(resultSet.next()){
                            String id=resultSet.getString("ID");
                            String fname=resultSet.getString("FistName");
                            String lname=resultSet.getString("LastName");
                            String major=resultSet.getString("Major");
                //Printing Results
                            System.out.println("Roll no = "+id);
                            
                            System.out.println("Fist Name = "+fname);
                            
                            System.out.println("Last name = "+lname);
                            
                            System.out.println("major = "+major);
                            
                  }
            } catch (SQLException e) {
 
                    System.out.println("Error while connecting to the database"); //Message if something goes wrong while conneting to the database
 
                            }
    }
    
}


//Java Database Connectivity (JDBC) is an application programming interface (API) to connect and execute the query with the database
//JDBC is an application programming interface for the programming language Java, which defines how a client may access a database.

import java.sql.*;
public class conn {
    Connection c; //Before you can read or write data from and to a database via JDBC, you need to open a connection to the database
    Statement s; //The object used for executing a static SQL statement and returning the results it produces.
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//You must register the JDBC driver in your program before you use it.
            c = DriverManager.getConnection("jdbc:mysql:///LibraryDatabase","root",""); //The getConnection(String url) method of Java DriverManager class attempts to establish a connection to the database by using the given database URL
            s = c.createStatement();//Creates a Statement object for sending SQL statements to the database

        }
        catch(Exception e){
            System.out.println(e);
            }

    }
}

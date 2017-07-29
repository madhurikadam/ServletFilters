package servlet.filter;

import java.sql.Connection;

import javax.servlet.ServletRequest;
 
public class MyUtils {
 
   public static final String ATT_NAME = "MY_CONNECTION_ATTRIBUTE";
 
   // Store Connection to attribute of request
   // Information stored only exist during requests
   // until the data is returned to the user browser.
   public static void storeConnection(ServletRequest request, Connection conn) {
       request.setAttribute(ATT_NAME, conn);
   }
 
   // Get the Connection object has been stored in one attribute of the request.
   public static Connection getStoredConnection(ServletRequest request) {
       Connection conn = (Connection) request.getAttribute(ATT_NAME);
       return conn;
   }
}
package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;


public class Index implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

        html += "<body>

        <div id='mySidebar' class='sidebar'>
          <a href='javascript:void(0)' class='closebtn' onclick='closeNav()'>×</a>
          <a href='#''>About</a>
          <a href='#'>Services</a>
          <a href='#''>Clients</a>
          <a href='#'>Contact</a>
        </div>
        
        <div id='main'>
          <button class='openbtn' onclick='openNav()'>☰ Open Sidebar</button>  
          <h2>Collapsed Sidebar</h2>
          <p>Click on the hamburger menu/bar icon to open the sidebar, and push this content to the right.</p>
        </div>
        
        <script>
        function openNav() {
          document.getElementById('mySidebar').style.width = '250px';
          document.getElementById('main').style.marginLeft = '250px';
        }
        
        function closeNav() {
          document.getElementById('mySidebar').style.width = '0';
          document.getElementById('main').style.marginLeft= '0';
        }
        </script>
           
        </body>";
    }

}

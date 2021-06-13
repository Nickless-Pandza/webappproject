package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;


public class FactsPage implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/FactsPage";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";
        html += "<link rel='stylesheet' type='text/css' href='common.css' />";
        html += "<body>";

        html += "<meta charset='utf-8'>";
        html += "<div id='mySidebar' class='sidebar'>";
          html += "<a href='javascript:void(0)' class='closebtn' onclick='closeNav()'>×</a>";
          html += "<a href='/''>Landing Page</a>";
          html += "<a href='/FactsPage'>Facts Page</a>";
          html += "<a href='#''>Blank</a>";
          html += "<a href='#'>Blank</a>";
        html += "</div>";

        
        html += "<div id='main'>";
          html += "<button class='openbtn' onclick='openNav()'>☰</button>";
        html += "</div>";
        
        html += "<script>";
        html += "function openNav() {";
          html += "document.getElementById('mySidebar').style.width = '250px';";
          html += "document.getElementById('main').style.marginLeft = '250px';}";

        
        html += "function closeNav() {";
          html += "document.getElementById('mySidebar').style.width = '0';";
          html += "document.getElementById('main').style.marginLeft= '0';}";
        html += "</script>";
           

        html += "<h1>6</h1>";
        html += "<h1>   WEEKS</h1>";
        html += "<p>Is how long it can take for severe cases of</p>";
        html += "<p>COVID-19 to recover, if those who fell ill to</p>";
        html += "<p>those severe cases survive</p>";

        html += "<h1>ONE</h1>";
        html += "<h1>IN</h1>";
        html += "<h1>EIGHT</h1>";
        html += "<p>People suffer from long term health effects</p>";
        html += "<p>following a recovery of COVID-19</p>";

        html += "<h1>3,382,520</h1>";
        html += "<p>People have died as a result of COVID-19</p>";
        



        html += "</body>";

        html += "</html>";

        //Do not delete
        context.html(html);
    }

}

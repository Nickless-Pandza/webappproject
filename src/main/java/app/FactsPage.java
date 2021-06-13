package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;


public class FactsPage implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

    }

}

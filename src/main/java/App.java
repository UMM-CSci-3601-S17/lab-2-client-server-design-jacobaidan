// Trying out SparkJava

import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        staticFiles.location("/public");

        // Simple example route
        get("/hello", (req, res) -> "Hello World");

        // Redirects for the "home" page
        redirect.get("", "/");
        redirect.get("/", "/index.html");

        // Redirect for the "about" page
        redirect.get("/about", "/about.html");

        // Redirect for the Pet Form
        redirect.get("/petForm", "/petForm.html");
    }
}

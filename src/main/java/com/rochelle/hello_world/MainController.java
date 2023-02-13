package com.rochelle.hello_world;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
//? How to shorten it so no repetition -> not have to always keep typing /hello
// -> put @RequestMapping under rest controller for /hello and them remove it from the other routes
public class MainController {

    //* Note -> if just go to localhost:8080 wiill get the whitelabel error page -> since there is no controller set for this
    // -> spring will check static files for something
    // -> if go to static and make plain ol html it will show instead of the error page
    // -> can add regular tags from html -> even a link tag to act as the links to all the routes we created
    // -> it will look alot cleanerimport org.springframework.web.bind.annotation.RestController;

    @RequestMapping("")
    public String index(){
        // return whatever I want it to return when i go to this route
        
        // return "<h1>Hello World!</h1>";

        //~ What if want welcome to be an h1
        // -> if just returning a string can put the h1 tag around the welcome
            // -> if want to link it back to the index can just add anchor tag w/ the route
        return "<h1>Hello World!</h1><a href=\"/\">Home</a>";
    }

    //& Then, add a new route of your own /new_route that returns a message of your choosing!
    // @RequestMapping("/hello/today")
    @RequestMapping("/new_route")
    public String newRoute() {
        // return "<h3>Today we begin embarking on making web pages through Spring!</h3>";
        return "<h3>Today we begin embarking on making web pages through Spring Boot!</h3><a href=\"/\">Home</a>";
    }
}

package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
//@RequestMapping("hello")
public class HelloController {

    // Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    // lives /hello/goodbye bc of line 8
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Handles request of the form /hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST} )
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + ", you stinker!";
//    }

     // Handles requests of the form /hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name){
//        return "Hello, " + name + ", you fabulous creature!";
//    }

    public static String createMessage(String name, String language){
        String greeting = "";
        if (language.equals("english")) {
            greeting = "Hello";
        }
        else if (language.equals("french")) {
            greeting = "Bonjour";
        }
        else if (language.equals("spanish")) {
            greeting = "Hola";
        }
        else if (language.equals("japanese")) {
            greeting = "Konnichiwa";
        }
        else if (language.equals("korean")) {
           greeting = "Annyeong";
        }
        return greeting + ", " + name + "!";
    }

// lives /hello/form bc of line 8
//    @GetMapping("form")
//    public String helloForm(){
//        return "<html>" +
//                "<body>" +
//                "<form action='hello' method='post'>" + // submit a request to /hello
//                "<input type='text' name='name'>" +
//                "<input type='submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//
//    }

    @GetMapping("form-language")
    public String helloFormLanguage(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + // submit a request to /hello
                "<input type='text' name='name'>" +
                "<select name='language' id='lang-select'>" +
                "<option value=''> -- Please choose language --</option>" +
                "<option value='english'>English</option>" +
                "<option value='french'>French</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='japanese'>Japanese</option>" +
                "<option value='korean'>Korean</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";

    }

    @RequestMapping(value="hello", method = {RequestMethod.POST} )
    public String helloLangPost(@RequestParam String name, @RequestParam String language) {
        return createMessage(name, language);
    }

}

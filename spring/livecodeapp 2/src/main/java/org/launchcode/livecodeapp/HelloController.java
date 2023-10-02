package org.launchcode.livecodeapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello class!";
    }

    @GetMapping("/hello") //this will recognize it with or without the slash being added, but Mike (and many of us) like it with the slash better!
    public String getNameForm() {
        return "<form method='post' action='/hello/hello'>\n" +
                "  <label>What's your name?\n" +
                "    <input type='text' name='name' />\n" + //MAKE SURE THE VARIABLE IS THE SAME BETWEEN GET AND POST METHODS
                "  </label>\n" +
                "            <input type='submit' value='Submit' />\n" +
                "            </form>";
    }

    @PostMapping("/hello")
    public String handleForm(@RequestParam String name){ // MAKE SURE VARIABLE MATCHES THE GET MAPPING
        return "Hello, " + name + "!";
    }

    @GetMapping("/{name}")
    public String pathTest(@PathVariable String name){
        return "Sup, " + name + "!";
    }

}

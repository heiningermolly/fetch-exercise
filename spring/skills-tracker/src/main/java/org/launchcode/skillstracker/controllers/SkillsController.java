package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping("/")
    public String languages() {
        return "<html>\n" +
                "<head>\n" +
                "    <h1>\n" +
                "        Skills Tracker\n" +
                "    </h1>\n" +
                "    <h2> We have a few skills we would like to learn. Here is the list!\n" + "</h2>"+
                "        <ol>\n" +
                "            <li>JavaScript</li>\n" +
                "            <li>Java</li>\n" +
                "            <li>Python</li>\n" +
                "        </ol>\n" +
//                "    </h2>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "</body>\n" +
                "</html>";

    }

    @GetMapping("/form")
            public String favesForm() {
        return "<form method='post' action='/form'>\n" +
                "  <label>What's your name?\n" +
                "    <input type='text' name='name' />\n" + //MAKE SURE THE VARIABLE IS THE SAME BETWEEN GET AND POST METHODS
                "  </label>\n" + "<p>" + "<select name='firstFave' id='fave-select'>" +
                "<option value=''>--What is your first fave?--</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" + "<p>" +"<select name='secondFave' id='fave-select'>" +
                "<option value=''>--What is your second fave?--</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" + "<p>" + "<select name='thirdFave' id='fave-select'>" +
                "<option value=''>--What is your third fave?--</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +

                "            <input type='submit' value='Submit' />\n" +
                "            </form>";
            }

    @PostMapping("/form")
    public String handleForm(@RequestParam String name, @RequestParam String firstFave, @RequestParam String secondFave, @RequestParam String thirdFave) {

        return "<h1>" + name + "</h1><p>\n" +
                "<ol>\n" +
                "    <li>" + firstFave + "</li>\n" +
                "    <li>" + secondFave + "</li>\n" +
                "    <li>" + thirdFave + "</li>\n" +
                "</ol>";
    }

}

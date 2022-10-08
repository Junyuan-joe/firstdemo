package example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController{
    @GetMapping(value = "/")
    @ResponseBody
    public String index() {       
        return "<h1>Hi!</h1>";
    }
    
    @GetMapping(value = "/index")
    public String indexHTML() {
  
        return "index.html";

}
}//http://localhost:8080/demo/index.html
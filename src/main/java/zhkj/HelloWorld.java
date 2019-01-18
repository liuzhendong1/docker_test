package zhkj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequestMapping("/docker")
 public class HelloWorld {
     @RequestMapping("/hello")
     public String helloDocker(){
         return "hello docker!!!";
    }   
 }

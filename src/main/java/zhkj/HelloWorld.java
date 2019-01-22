package zhkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@SpringBootApplication
@RestController
public class HelloWorld {
     @RequestMapping("/")
     public String helloDocker(){
         return "hello docker!!!";
    } 
     
  
     public static void main(String[] args) {
    	 SpringApplication.run(HelloWorld.class,args);
     }
    	
 }

package com.ecochain.ledger;




import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
 


@SpringBootApplication
@RestController
public class Application {
	 

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
	
    @RequestMapping("/")
    public String home() {
        return "Hello leger World";
    }
    
   
    

}

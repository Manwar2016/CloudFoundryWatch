package com.cloudfoundry.app.restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	
@RequestMapping(value="/")	
public String welcomeMessage(){

return "Hello Welcome into Cloud Foundry Watch Application";
}
}

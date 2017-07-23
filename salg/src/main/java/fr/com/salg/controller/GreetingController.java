package fr.com.salg.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import fr.com.salg.entity.Greeting;
import fr.com.salg.entity.HelloMessage;

@Controller
public class GreetingController {
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	private Greeting greating (HelloMessage helloMsg) throws InterruptedException{
		
	        return new Greeting("Hello, " + helloMsg.getName() + "!");
		
	}
			
}

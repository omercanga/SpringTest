package com.abc.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import deneme.Deneme;
import deneme.Konus;





@SpringBootApplication
public class App 
{

	
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("Spring Deneme");
		System.out.println("Spring Deneme2");
		
		Deneme dene=new Deneme();
		System.out.println(dene.sayiBul());
		//TODO:burası yapılacak
		
		Konus cont=new Konus();
		
		System.out.println(cont.testSelam());
	
	
		
	
	}
	
	
	

}

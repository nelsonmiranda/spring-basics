package com.in28minutes.spring.basics.springin5minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5minutes.helpers.BubbleSortAlgorithm;
import com.in28minutes.spring.basics.springin5minutes.services.impl.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5MinutesApplication {

	//What are the beans
	//What are the dependencies of a bean
	//Where to search for beans?
	
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		//int result = binarySearch.binarySearch(new int[] {1,4,12,3}, 3);
		//System.out.println(result);
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5MinutesApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {1,4,12,3}, 3);
		System.out.println(result);
	}

}

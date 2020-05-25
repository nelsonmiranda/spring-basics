package com.in28minutes.spring.basics.springin5minutes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.basics.springin5minutes.helpers.BubbleSortAlgorithm;
import com.in28minutes.spring.basics.springin5minutes.helpers.SortAlgorithm;

@Component //INDICAMOS QUE ES UN BEAN
public class BinarySearchImpl {
	
	@Autowired //INDICAMOS QUE ES UNA DEPENDENCIA DEL BEAN BinarySearchImpl
	private SortAlgorithm sortAlgorithm;
		
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		// Implementing sorting logic
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortedNumbers);
		// Search the array

		return 3;
	}

	/*
	 * public int binarySearch(int[] numbers, int numberToSearchFor) {
	 * 
	 * //Implementing sorting logic BubbleSortAlgorithm bubbleSortAlgorithm = new
	 * BubbleSortAlgorithm(); int[] sortedNumbers =
	 * bubbleSortAlgorithm.sort(numbers);
	 * 
	 * //Search the array
	 * 
	 * return 3; }
	 */

}

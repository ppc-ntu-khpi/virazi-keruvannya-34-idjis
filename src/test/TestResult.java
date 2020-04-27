package test;

import domain.Exercise;
/**
 * Contains implementation of output of results
 * @author IT-Service
 */
public class TestResult extends Exercise{
	/**
	 * The method contains creating an array and outputting its element according to the condition of the task
	 * @param args - contains the arguments provided
	 */
    public static void main(String[] args) {
    	
    	int[] a = new int[10];
    	
    	for (int i = 0; i < a.length; i++) {
    	    a[i] = ((int)(Math.random() * 10));
    	}

        System.out.println("Число которое чаще всего повторяется " + Exercise.Calculate(a));
    }
}
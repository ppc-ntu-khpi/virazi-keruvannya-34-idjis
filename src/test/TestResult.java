package test;

import domain.Exercise;
import java.util.Arrays;
/**
 * Contains implementation of output of results
 * @author IT-Service
 */
public class TestResult {
	/**
	 * The method contains creating an array and outputting its element according to the condition of the task
	 * @param args - contains the arguments provided
	 */
    public static void main(String[] args) {
    	
    	int[] array = new int[10];
        int number=0;
        int reit=0;
        
    	for (int i = 0; i < array.length; i++) {
    	    array[i] = ((int)(Math.random() * 10));
    	}
    	
        System.out.println(Arrays.toString(array));
        
        for(int temp:array){
            int num=Exercise.Calculate(array, temp);
            if(reit<num){
            	number=temp;
                reit=num;
            }
        }
        System.out.println("The largest number of times is a repeated number: " + number);
    }
}

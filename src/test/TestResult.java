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
    	
    	int[] arr = new int[10];
        int n=0;
        int reit=0;
        
    	for (int i = 0; i < arr.length; i++) {
    	    arr[i] = ((int)(Math.random() * 10));
    	}
    	
        System.out.println(Arrays.toString(arr));
        
        for(int temp:arr){
            int num=Exercise.Calculate(arr, temp);
            if(reit<num){
                n=temp;
                reit=num;
            }
        }
        System.out.println("Найбільшу кількість разів повторюється число: " + n);
    }
}

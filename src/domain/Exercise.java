package domain;

import java.util.Arrays;
/**
 * Contains the implementation of the method
 * @author IT-Service
 */
public class Exercise {
	/**
	 * A method containing the implementation of a given task
	 * @param array - parameter that is used to solve the problem
	 * @return reit - return value
	 */
	public static int Calculate(int[] array){
		
    	int reit = 0;
        int number = 0;
        int arr[] = new int[array.length];
        int max = 0;
        int amount = 0;

        for (int x = 0; x < array.length; x++) {
            for (int j = 0; j < array.length; j++){
                if ((array[j] == array[x] ) && (j != x)){
                	++number;
                	}
            }
            arr[x] = number;
            number = 1;
        }
        
        for (int x = 0; x <= array.length-1; x++){
            if (arr[x] > amount)
            	amount = arr[x];
        }
        
        System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < array.length - 1; i++){
            if (max <= arr[i+1]){
                max = arr[i+1];}
        }
        
        for (int i = 0; i < arr.length; i++){
            if (max == arr[i]){
                reit = array[i];
                break;
            }
        }
        return reit;
    }
 }
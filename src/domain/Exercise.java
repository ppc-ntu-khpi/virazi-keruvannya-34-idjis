package domain;
/**
 * Contains the implementation of the method
 * @author IT-Service
 */
public class Exercise {
	/**
	 * A method containing the implementation of a given task
	 * @param arr - parameter that is used to solve the problem
	 * @param x - parameter that is used to solve the problem
	 * @return n - return value
	 */
    public static int Calculate(int[] arr, int x){
    	
        int n=0;
        
        for(int temp:arr){
            if(x==temp){
                n++;
            }
        }
        return n;
    }
}
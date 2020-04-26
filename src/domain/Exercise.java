package domain;
/**
 * Contains the implementation of the method
 * @author IT-Service
 */
public class Exercise {
	/**
	 * A method containing the implementation of a given task
	 * @param array - parameter that is used to solve the problem
	 * @param elem - parameter that is used to solve the problem
	 * @return n - return value
	 */
    public static int Calculate(int[] array, int x){
    	
    	int number=0;
        
        for(int temp:array){
            if(x==temp){
                number++;
            }
        }
        return number;
    }
}
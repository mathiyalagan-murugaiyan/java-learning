package programming_class;
import java.util.Arrays;

public class ArraysfindFristAndSecondMax {

	 public static void main(String[] args) {
	        int[] arr = {3, 1, 7, 5, 9, 2};
	        int[] maxAndSecondMax = findMaxAndSecondMax(arr);
	        int[] minAndSecondMin = findMinAndSecondMin(arr);
	        
	        System.out.println("Max: " + maxAndSecondMax[0]);
	        System.out.println("Second Max: " + maxAndSecondMax[1]);
	        System.out.println("First Min: " + minAndSecondMin[0]);
	        System.out.println("Second Min: " + minAndSecondMin[1]);
	       
	       
	    }
	    
	    public static int[] findMaxAndSecondMax(int[] arr) {
	        return Arrays.stream(arr)
	                .boxed() // Convert to Integer stream
	                .distinct() // Remove duplicates
	                .sorted((a, b) -> Integer.compare(b, a)) // Sort in descending order
	                .limit(2) // Take the first two elements (max and second max)
	                .mapToInt(Integer::intValue) // Convert back to int
	                .toArray(); // Convert to an array
	    }
	    
	    public static int[] findMinAndSecondMin(int[] arr) {
	        return Arrays.stream(arr)
	                .boxed() // Convert to Integer stream
	                .distinct() // Remove duplicates
	                .sorted(Integer::compareTo) // Sort in ascending order
	                .limit(2) // Take the first two elements (first min and second min)
	                .mapToInt(Integer::intValue) // Convert back to int
	                .toArray(); // Convert to an array
	    }
}

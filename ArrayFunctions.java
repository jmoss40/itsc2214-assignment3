import java.util.Arrays;
/*
 * This class implements the ArrayFunctionsInterface interface. Each method takes a generic
 * array and performs an operation on it. There is a Driver class that calls each method, one
 * using an array of Integers and one using an array of Strings.
 * 
 * @author Jordan Moss
 * @version January 30 2019
 */
public class ArrayFunctions<T> implements ArrayFunctionsInterface<T>{
	
	/**
	 * Creates and returns a sorted copy of the array. Sorted using Bubble Sort.
	 * @param array to sort
	 * @return sorted copy of the array
	 */
    @Override
    public T[] sortMe(T[] inArray){
    	T[] array = Arrays.copyOf(inArray, inArray.length);
        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length-i-1; j++)
                if (((Comparable<T>)array[j]).compareTo((T)array[j+1]) > 0){
                	//swap elements
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        return array;
    }
    
	/**
	 * Returns the maximum element in the array.
	 * @param array to be searched
	 * @return maximum number in the array
	 */
    @Override
    public T getMax(T[] array){
    	T max = array[0];
    	for(int i = 0; i < array.length; i++) {
    		if(((Comparable<T>)max).compareTo(array[i]) < 0)
    			max = array[i];
    	}
    	return max;
    }
    
	/**
	 * Returns the minimum element in the array.
	 * @param array to be searched
	 * @return minimum number in the array
	 */
    @Override
    public T getMin(T[] array){
    	T min = array[0];
    	for(int i = 0; i < array.length; i++) {
    		if(((Comparable<T>)min).compareTo(array[i]) > 0)
    			min = array[i];
    	}
    	return min;
    }
    
	/**
	 * Searches the array for the search value and returns the index at which it was found.
	 * @param the array to be searched
	 * @param the value to search for
	 * @return the first index in the array where the value was found, or -1 if not found.
	 */
    @Override
    public int whereAmI(T[] array, T searchValue){
    	for(int i = 0; i < array.length; i++) {
    		if(array[i].equals(searchValue))
    			return i;
    	}
    	return -1;
    }
    
	/**
	 * Creates and returns a new array containing the elements of the parameter array in reverse order.
	 * @param the array to be reversed
	 * @return the reversed copy of the array
	 */
    @Override
    public T[] reverseMe(T[] array){
//    	T[] new_array = (T[]) new Object[array.length];
    	T[] new_array = Arrays.copyOf(array, array.length);
    	for(int i = 0; i < array.length; i++) {
    		new_array[i] = array[array.length - i - 1];
    	}
    	return new_array;
    }
    
	/**
	 * Prints the contents of the array.
	 * @param the array to print
	 */
    @Override
    public void printMe(T[] array){
    	for(int i = 0; i < array.length; i++) {
    		System.out.print(((array[i] != null) ? array[i].toString() : "null") + " ");
    	}
    }
    
	/**
	 * Returns a new array containing the elements of the original but with double the capacity.
	 * @param the array to be doubled
	 * @return the new array with the extended capacity
	 */
    @Override
    public T[] doubleMyCapacity(T[] array){
    	return Arrays.copyOf(array, array.length * 2);
    }
}

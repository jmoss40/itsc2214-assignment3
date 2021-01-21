/**
 * An interface contains only public method headers.
 * If there are any fields they must be public, static and final.
 * They are used for design and for the is-a relationship
 * in inheritace.
 * 
 * A programmer implements an interface by overriding all
 * the methods specifed in the interface. That means the
 * programmer must write the code in a separate class file for each and
 * every method specified in the interface.
 *
 * Your task is to write all the method bodies in a separate
 * class named ArrayFunctions. This will be your class header:
 * 
 *  public class ArrayFunctions<T> implements ArrayFunctionsInterface<T>
 * 
 * 
 * @author Professor Lorrie Lehmann
 * @version January 30 2019
 */
public interface ArrayFunctionsInterface<T>{
    /** 
     * This method copies contents of the original array into a 
     * new array and then sorts this new array. A reference to the
     * new array is returned. You are to write your own sort method
     * and call the compareTo( ) method in your sort code.
     */
    T[] sortMe(T[] inArray);
   
    /**
     * This method accepts a reference to an array and 
     * returns a reference to the maximum element of the 
     * array. The maximum is found by calling the compareTo( ) method
     */
    T getMax(T[] array);
    
    /**
     * This method accepts a reference to an array and 
     * returns a reference to the minimum element of the 
     * array. The minimum is found by calling the compareTo() method
     */
    T getMin(T[] array);
    
    /**
     * This method accepts a reference to an array and a reference to
     * an object to search for. If the object is not in
     * the array, retrun a -1. You use the equals() method
     * in the search.
     */
    int whereAmI(T[] array, T searchValue);
    
    /**
     * This method copies contents of the original array into a 
     * new array in reverse order.
     */ 
    T[] reverseMe(T[] array);
	
    /**
     * This method prints the contents of the array to
     * the screen. This method calls the toString() method.
     */
    void printMe(T[] array);  
    
    /**
     * This method copies contents of the original array into a 
     * new array that is double the capacity of the original array.
     * The contents of the original array are copied to the new array.
     * The extra elements will automatically be assigned a value of null
     *  A reference to the new array is returned.
     */
    T[] doubleMyCapacity(T[] array);
}
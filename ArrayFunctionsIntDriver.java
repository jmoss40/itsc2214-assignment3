/*
 * This class is a driver for the ArrayFunctions class, where T is of type Integer. This class displays the
 * results of each method being called in the ArrayFunctions class.
 * 
 * @author Jordan Moss
 * @version January 30 2019
 */
public class ArrayFunctionsIntDriver{
    public static void main(String[] args){
        //Create an ArrayFunctions object where T is an Integer, initialize with values
        ArrayFunctions<Integer> instance = new ArrayFunctions<Integer>();
        Integer[] array = {13, 23, 5, 9, 29, 7};
        
        //Call each method and print the results
        System.out.print("Original: ");
        instance.printMe(array);
        
        System.out.print("\nSorted: ");
        instance.printMe(instance.sortMe(array));
        
        System.out.println("\nLargest element: " + instance.getMax(array));
        
        System.out.println("Smallest element: " + instance.getMin(array));

        System.out.println("Index of 3: " + instance.whereAmI(array, 3));
        System.out.println("Index of 5: " + instance.whereAmI(array, 5));
        
        System.out.print("Reversed: ");
        instance.printMe(instance.reverseMe(array));
        
        System.out.print("\nDoubled capacity: ");
        instance.printMe(instance.doubleMyCapacity(array));
    }
}

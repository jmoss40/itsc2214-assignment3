/*
 * This class is a driver for the ArrayFunctions class, where T is of type String. This class displays the
 * results of each method being called in the ArrayFunctions class.
 * 
 * @author Jordan Moss
 * @version January 30 2019
 */
public class ArrayFunctionsStringDriver{
    public static void main(String[] args){
        //Create an ArrayFunctions object where T is a String, initialize with values
        ArrayFunctions<String> instance = new ArrayFunctions<String>();
        String[] array = {"Zebra", "Balloon", "October", "Apple", "Red"};
        
        //Call each method and print the results
        System.out.print("Original: ");
        instance.printMe(array);
        
        System.out.print("\nSorted: ");
        instance.printMe(instance.sortMe(array));
        
        System.out.println("\n\"Largest\" element: " + instance.getMax(array));
        
        System.out.println("\"Smallest\" element: " + instance.getMin(array));
        
        System.out.println("Index of \"three\": " + instance.whereAmI(array, "three"));
        
        System.out.println("Index of \"Apple\": " + instance.whereAmI(array, "Apple"));
        
        System.out.print("Reversed: ");
        instance.printMe(instance.reverseMe(array));
        
        System.out.print("\nDoubled capacity: ");
        instance.printMe(instance.doubleMyCapacity(array));
    }
}

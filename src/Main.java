//Group 3, Code done by Sagar Vadalia, Saud


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //initialize an array with 10 elements
        int arr[] = new int[10];
        //create a scanner object for user input
        Scanner input = new Scanner(System.in);
        System.out.println("please enter 10 integers separated by an enter");
        //grab the first 10 user inputs and put them into our array
        for(int i = 0; i < 10; i ++){
            arr[i] = input.nextInt();
        }
        //initialize an int value for us to return
        int value;
        //call our valueReturning method with our array passed as a parameter
        //this will return the product of all the elements of the array and then store that into value;
        value = valueReturning(arr);
        //print to the console our product value
        System.out.println(value);
    }
    public static int valueReturning(int[] arr){
        //initialize a return value. Set it to 1 cause we are working with products
        int returnVal = 1;
        //accumulator that loops through our arr and multiplies the returnVal with our array elements.
        for(int i = 0; i < arr.length; i ++){
            returnVal *= arr[i];
        }
        //return our total product
        return returnVal;
    }
}

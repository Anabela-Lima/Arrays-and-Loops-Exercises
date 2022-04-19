import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list

        scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically

        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop


        // PSEUDOCODING

        // start with some variable (data type integer, call that variable i) i corresponds to index number
        // and start it from 0 goes all the way to end of list, so i= scottighIslands.size -1, and we increment by 1 so iterating code
        // every time 1 island is printed (so we can then print the next island name)


        //CODE


        for (int i = 0; i == scottishIslands.size() - 1; i++)

            System.out.println(scottishIslands);


        System.out.println(scottishIslands);

        // can use enhanced for loop too


        //        NUMBERS

        List<Integer> numbers = new ArrayList<>();
        
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

          System.out.println("numbers: " + numbers);

        //    1. Print out a list of the even integers

        List<Integer> evenNumbers = new ArrayList<>();   //  I want to Create an array list data type integer


        // start with some variable i position 0, ends at end at index size of array i.e. 11 -1- index 10   and increment every 1

        for (int i =0; i< numbers.size() -1; ++i)
        {
            if (i % 2 == 0)                          // if number is divisible by 2,
                evenNumbers.add(i);                 // add that number (i) to the Even number arrays

        }

        evenNumbers.remove(0);                      // remove the element at index 0, recall arrays start with
                                                    // element at index 0, we had set initial condition is i=0 that
                                                    // that will have index 0

        System.out.println("Even numbers:" + evenNumbers); // print even numbers : and the numbers

/*


//        2. Print the difference between the largest and smallest value

        // Find biggest number, find largest number, subtract and print


        // sort numbers from smallest to largest
        
        Collections.sort(numbers);
        
        // get one at last position = largest
        
        int largest = (numbers.get(numbers.size() - 1));
        
        System.out.println("Largest Number:" + largest);
        
        // get one at start position i.e index 0
        
        int smallest = (numbers.get(0));
        
        System.out.println("Smallest Number:" + smallest);

        int Difference = largest - smallest;
        System.out.println( "Difference: " + Difference);

        // Alternative method :

        //  System.out.println((Collections.max(numbers) -Collections.min(numbers)));


//        3. Print true if the list contains a 1 next to a 1 somewhere

        // First condition

        for (int i = 0; i < (numbers.size()); i++)               // For some integer i, at index 0
        {
            //Second condition

            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1)    // if number at index i (starting with index 0 item)
                                                                    //running  through length of number array
                                                                    //  if number at that index is equal to 1
                                                                    // and number next to it i.e. index i+1 is equal
                                                                    // to 1

                System.out.println( "1 next to 1 problem:  " + "true ");      // print true
        }
*/

/*

//        4. Print the sum of the numbers

        // Declare initial sum value for sum - > sum value will start with value 0

        int sum = 0;

        // set the condition

        for (int number : numbers)       // we have an integer called number
        remember:" number  : numbers "is basically saying get number at 0, 1,2...end
        {
            sum = sum + number;
        }

        System.out.println(sum);                        // print the end sum


*/


//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.

// ----------Enhanced loop solution -----------------

// let us declare the total  to have initial value 0
               
        int total = 0;    // let total be 0 at start

        for (int number : numbers) {            // we have a run through loop
            if (number == (13)) {              //if I find number 13 then
                break;                        //...break i.e. abandon loop and carry on with next line of code
            }                                   

            //We then sum up the numbers

            total = total + number;
        }
        System.out.println(total);
    }
}


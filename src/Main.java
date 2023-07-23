import java.util.*;
import java.util.ArrayList;




// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
      //  System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
      //  for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
        //    System.out.println("i = " + i);

            //This is a Map for  task 1.
            Map <String, Integer> map = new HashMap<>();
            map.put ("Sir Stripes the First", 12);
            map.put ("Sir Stripes The Second", 23);
            map.put ("Sir Stripes the Third", 24);
            map.put ("Barsik", 25);
            map.put ("BaltazarFefufofaltazar the Third", 0);
            map.put ("Splashie", 78);
            map.put ("Miss Tabby", 87);
            map.put ("Miss Purr", 45);
            map.put ("Rocco", 1);
            map.put ("Fluffers", 101);

            for (Map.Entry <String, Integer> mapping: map.entrySet()){
                System.out.println ("The name of the cat is (it is a key): " + mapping.getKey()+ "." + '\n' +
                        "And a quantity of mice catched by this cat is (it is a value): " + mapping.getValue());
            }

        //This is the ArrayList for task 2.

        ArrayList <String> arrL = new ArrayList<>();

        arrL.add ("Java");
        arrL.add ("PHP");
        arrL.add ("Perl");
        arrL.add ("C++");
        arrL.add ("Java");
        arrL.add ("C++");
        arrL.add ("C#");

        System.out.println(arrL.size());

        System.out.println (arrL.get(1));

        for (int i=0; i<arrL.size(); i++){
            System.out.print(arrL.get(i) + " ");
        }
        System.out.println();


        //Here is how the TreeSet Should be created from the ArrayList;

        TreeSet<String> treeSet = new TreeSet <String> (arrL);

        //Then we should print it.
        // So here is a new Collection, which has no repeated values.
        System.out.println(treeSet);

        //This is an ArrayList for task 3.
        ArrayList <Integer> array = new ArrayList<>();

        array.add (1);
        array.add (2);
        array.add (3);
        array.add (5);
        array.add (4);
        array.add (3);
        array.add (2);
        array.add (1);
        array.add (2);
        array.add (3);
        array.add (5);

        //Here we print out the "array".
        for (int i=0; i<array.size(); i++){
            System.out.print(array.get(i) + " ");
        }
        System.out.println();

        int someNumber = 2;
        int count = 0;

        for (int i = 0; i < array.size(); i++){
            if (array.get(i)==someNumber){
                count = count + 1;

            } else {
                count = count;
            }

        }

        System.out.println ("Here we counted how many times a number "
                + someNumber + " was repeated in array: " + count);


        }
    }

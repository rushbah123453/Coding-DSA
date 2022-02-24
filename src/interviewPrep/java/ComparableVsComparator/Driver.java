package interviewPrep.java.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Driver {


    public static void main(String[] args) {

        ArrayList<Laptop> laptops=new ArrayList<>();
        laptops.add(new Laptop("Dell",4,1200));
        laptops.add(new Laptop("Apple",8,35000));
        laptops.add(new Laptop("Acer",8,12500));



        //Now we need to sort this array list by name

        //We have 2 method

        //method 1) Implement Comparable to Laptop class and write the logic to sort

        Collections.sort(laptops);

        for (Laptop l:laptops){
            System.out.println(l);
        }


        //Method 2 , using comparator

        Collections.sort(laptops, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return o1.getPrice()<o2.getPrice()?1:-1;
            }
        });

        for (Laptop l:laptops){
            System.out.println(l);
        }





    }
}

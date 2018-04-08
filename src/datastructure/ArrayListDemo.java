package datastructure;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static <E> void main(String[] args) {
        int a[] = new int[5];

        ArrayList ar = new ArrayList();
        ar.add(10); //0
        ar.add(15); //1
        ar.add(20); //2

        System.out.println(ar.size());

        ar.add(25); //3
        ar.add(30); //4
        ar.add(30); //5

        ar.add("testing");
        ar.add('Z');




        System.out.println(ar.size());
        System.out.println(ar.get(4));

        for (int i=0; i<ar.size(); i++){
            System.out.println(ar.get(i));


        }

        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(8);

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("Zainab");

        ArrayList<E> ar3 = new ArrayList<E>();

    }

}
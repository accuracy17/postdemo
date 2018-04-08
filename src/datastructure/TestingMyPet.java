package datastructure;

import java.util.ArrayList;
import java.util.Iterator;


public class TestingMyPet {
    public static void main(String[] args) {

        MyPet p1 = new MyPet("Cat", 2, "Fluffy");
        MyPet p2 = new MyPet("Cat", 4, "Mia");
        MyPet p3 = new MyPet("Cat", 11, "Cupcake");

        ArrayList ar4 = new ArrayList();

        ar4.add(p1);
        ar4.add(p2);
        ar4.add(p3);

        //applying Iterator method
        Iterator<MyPet> it = ar4.iterator();
        while(it.hasNext()) {

            MyPet pet = it.next();
            System.out.println(pet.specie);
            System.out.println(pet.age);
            System.out.println(pet.name);

        }


    }

}

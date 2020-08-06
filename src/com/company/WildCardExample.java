package com.company;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {

    public class Animal{}
    public class Fish extends Animal{}
    public class CatFish extends Fish{}
    public class Bird extends Animal{}

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        List<Fish> fishList = new ArrayList<>();
        List<CatFish> catFishList = new ArrayList<>();
        List<Bird> birdList = new ArrayList<>();

        /*
        * 'birdList' and 'catFish' shows compilation error because the firstMethod() is lower bounded by the Fish object i.e
        * <? super Fish> in this case simply means the passed object must be of that object (Fish) or a parent of that object (Animal)
        * Use analogy : must be a specific type or its super type
        */
        //WildCardExample.firstMethod(birdList);
        //WildCardExample.firstMethod(catFishList);

        /*
         * 'animalList' would compile and run because the firstMethod() is lower bounded by the Fish object i.e <? super Fish>
         * in this case simply means the passed object must be of that object (Fish) or a parent of that object (Animal) and Animal is the parent
         */
        WildCardExample.firstMethod(animalList);

        /*
         * 'birdList' , 'catFishList' would compile and run because the secondMethod() is upper bounded by the Animal object i.e <? extends Animal>
         * in this case simply means the passed object must be a subtype ('B' is a subtype of 'A' if 'B' extends or implements 'A' ) of Animal
         * Use analogy : must be a specific type or its sub type
         */
        WildCardExample.secondMethod(catFishList);
        WildCardExample.secondMethod(birdList);

        //its unbounded so any item would work
        WildCardExample.thirdMethod(fishList);
        WildCardExample.thirdMethod(animalList);
        WildCardExample.thirdMethod(birdList);

        /*
        * so in summary
        *  - 'producer' extends ( uses the parameter type <? extends T> ) , is covariant are read only
        *  - 'consumer' super ( uses the parameter type <? super T> ) , is contravariant are write only
        *  - covariant : accepts subtypes
        *  - contravariant : accepts supertypes
        */

    }

    //lower bounded method
    public static void firstMethod(List <? super Fish> items) { }
    //upper bounded method
    public static void secondMethod(List <? extends Animal> items) { }
    //unbounded method
    public static void thirdMethod(List <?> items) { }
}

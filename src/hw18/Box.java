package hw18;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;
    public Box() {
        fruits = new ArrayList<> ();
    }
    public void addFruit(T fruit) {
        if (fruits.isEmpty() || fruits.getClass().equals (fruits.get(0).getClass())) {
            fruits.add (fruit);
        } else {
            System.out.println ("Cannot add  " + fruits.getClass().getSimpleName()
                    + " to the box of " + fruits.get (0).getClass().getSimpleName());
        }
    }
    public void addFruits(T[] fruitsArray) {
        for (T fruit : fruitsArray) {
            addFruit(fruit);
        }
    }
    public float getWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }
    public boolean compare(Box<?> otherBox) {
        return Math.abs (this.getWeight() - otherBox.getWeight()) < 0.0001;
    }
    public void merge(Box<T> otherBox) {
        if (fruits.isEmpty () || otherBox.fruits.isEmpty ()
                || fruits.get (0).getClass ().equals (otherBox.fruits.get (0).getClass ())){
            fruits.addAll (otherBox.fruits);
            otherBox.fruits.clear ();
        }
        else {
            System.out.println ("Cannot merge boxes of different fruit types.");
        }
    }
}



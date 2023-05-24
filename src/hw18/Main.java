package hw18;

public class Main {
    public static void main (String[] args) {
        Apple apple1 = new Apple ();
        Apple apple2 = new Apple ();
        Orange orange1 = new Orange ();
        Orange orange2 = new Orange ();

        Box<Apple> appleBox1 = new Box<> ();
        appleBox1.addFruit (apple1);
        appleBox1.addFruit (apple2);

        Box<Orange> orangeBox1 = new Box<> ();
        orangeBox1.addFruit (orange1);
        orangeBox1.addFruit (orange2);

        System.out.println ("Apple Box 1 weight: " + appleBox1.getWeight ());
        System.out.println ("Orange Box 1 weight: " + orangeBox1.getWeight ());

        Box<Apple> appleBox2 = new Box<> ();
        appleBox2.addFruit (apple1);
        appleBox2.addFruits (new Apple[]{apple2, new Apple ()});

        Box<Orange> orangeBox2 = new Box<> ();
        orangeBox2.addFruit (orange1);
        orangeBox2.addFruits (new Orange[]{orange2, new Orange ()});

        System.out.println ("Apple Box 2 weight: " + appleBox2.getWeight ());
        System.out.println ("Orange Box 2 weight: " + orangeBox2.getWeight ());
        System.out.println ("Are Apple Box 1 and Orange Box 1 equal weight? " + appleBox1.compare (orangeBox1));
        System.out.println ("Are Apple Box 1 and Apple Box 2 equal weight? " + appleBox1.compare (appleBox2));

        appleBox1.merge (appleBox2);
        System.out.println ("Apple Box 1 weight after merge: " + appleBox1.getWeight ());
        System.out.println ("Apple Box 2 weight after merge: " + appleBox2.getWeight ());
    }
}

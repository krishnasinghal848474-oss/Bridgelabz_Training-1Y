package Problem1;

public class Runner {
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.name = "Bruno";
        d.age = 3;

        Cat c = new Cat();
        c.name = "Mochi";
        c.age = 3;

        Bird b = new Bird();
        b.name = "pip";
        b.age = 2;

        d.makeSound();
        c.makeSound();
        b.makeSound();
    }

}


public class Inheritence {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(animal.sound());
        System.out.println(dog.sound());
        System.out.println(cat.sound());
    }
}

class Animal {

    public String sound() {
        return "Animal makes a sound";
    }
}

class Dog extends Animal {

    public String sound() {
        return "Dog barks";
    }
}

class Cat extends Animal {

    public String sound() {
        return "Cat meows";
    }
}


public class Inheritence {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Pig pig = new Pig();
        System.out.println(dog.sound());
        System.out.println(cat.sound());
        System.out.println(pig.sound());
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

class Pig extends Animal {
    public String sound() {
        return "Pig oinks";
    }
}


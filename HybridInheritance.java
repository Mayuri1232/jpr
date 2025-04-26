// Interface 1
interface CanFly {
    void fly();
}

// Interface 2
interface CanSwim {
    void swim();
}

// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

// Derived class using hybrid (inherit from class + implement interfaces)
class Duck extends Animal implements CanFly, CanSwim {
    public void fly() {
        System.out.println("Duck can fly.");
    }

    public void swim() {
        System.out.println("Duck can swim.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.eat();
        duck.fly();
        duck.swim();
    }
}

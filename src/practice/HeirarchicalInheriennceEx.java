package practice;

public class HeirarchicalInheriennceEx {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.sound();
        p.weeps();
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal Sounds");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("Dog Barks");
    }
}

class Puppy extends  Animal {
    void weeps(){
        System.out.println("Puppy weeps");
    }
}
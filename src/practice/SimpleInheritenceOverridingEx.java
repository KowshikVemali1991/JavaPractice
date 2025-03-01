package practice;

public class SimpleInheritenceOverridingEx {
    public static void main(String[] args) {
        Car c = new Car();
        c.model();
        Vehicle v = new Car();
        v.model();
        Vehicle v1 = new Vehicle();
        v1.model();
        System.out.println("*********");
        Car c1 = new Car();
        c1.model();

    }
}

class Vehicle {
    void model(){
        System.out.println("Sports Car");
    }
}

class Car extends Vehicle {
    void model(){
        super.model();
        System.out.println("Normal Car");
    }
}
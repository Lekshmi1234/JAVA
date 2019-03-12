class A{
    public void Car(){
        System.out.println("Audi car");
    }
}

class B extends A{
    public void Bike()
    {
        System.out.println("Duke bike");

    }
}

public class Inheritance{
    public static void main(String[] args) {
        B ob=new B();
        ob.Car();
    }
}
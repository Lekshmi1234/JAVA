class A{
    public void Car(){
        System.out.println("audi car");
    }
}
class B extends A{
    public void Bike()
    {
      System.out.println("Duke bike");
    }
}
class C  extends B{
    public void cycle()
    {
      System.out.println("ladybird");
    }
}
public class multiinheritance{
    public static void main(String[] args) {
        C ob=new C();
        ob.Car();
        ob.Bike();
        ob.cycle();
    }
}

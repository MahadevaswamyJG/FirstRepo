package OO_Demo;

//The type Circle must implement the inherited abstract method Abstraction.draw() and Abstraction.size()

public class CircleAbstract extends Abstraction {

    //When object created for this class the constructor will execute

    public CircleAbstract(){
        System.out.println("Circle Constructor");
    }
    void draw(){
        System.out.println("Circle draw");
    }

    void size(){
        System.out.println("Circle size");
    }
    
}

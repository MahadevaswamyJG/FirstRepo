package OO_Demo;

public class RectangleAbstract extends Abstraction {

    //When object created for this class the constructor will execute

    RectangleAbstract(){
        System.out.println("Rectangle Constructor");
    }
    void draw(){
        System.out.println("Circle draw");
    }

    void size(){
        System.out.println("Circle size");
    }
    
}

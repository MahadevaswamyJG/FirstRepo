package OO_Demo;

public class MainAbstract{
    public static void main(String[] args) {

//When cir object of CircleAbstract(child) referce to Abstraction class then it calls Abstaction(parent) class constuctor
        Abstraction cir = new CircleAbstract();
        cir.draw();
        cir.size();

// Reference is parent class and object are child class

        Abstraction rec = new RectangleAbstract();
        rec.draw();
        rec.size();

//        Abstraction ab = new Abstraction();
// Above line shows error beacause abstract class can't instantiate explicitly and only instanciated by child class
        
    }
}
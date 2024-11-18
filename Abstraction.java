package OO_Demo;

public abstract class Abstraction {

    //Execute when child class object referce to the base class
    Abstraction(){
        System.out.println("Base class");
    }

    //In abstract class we declare methods without implementation(method defination)
    abstract void draw();
    abstract void size();

}

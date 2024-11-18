package OO_Demo;

public class MehodOverriding {
    public static void main(String[] args) {
        MORparent parent = new MORparent();
        parent.draw();
        parent.size();

//child object takes reference from parent class        
        MORparent child = new MORChild();
        child.draw();
        child.size();
    }
}

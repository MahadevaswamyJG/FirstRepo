package OO_Demo;

public class InherChild extends Inher {
    private int C;
    InherChild(int a,int b, int c){
        super(a,b);
        this.C=c;
    }

    public static void main(String[] args) {
        InherChild childobj = new InherChild(5,7,8);
        childobj.printData();
        System.out.println(childobj.B); //Parent class instance use protected or public access 
        System.out.println(childobj.C); //This class instance
    }
}

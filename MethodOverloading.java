package OO_Demo;

public class MethodOverloading {
    int multiply(int a,int b){
        return (a*b);
    }
    int multiply(int a, int b, int c){
        return (a*b*c);
    }

    double multiply(double a, double b){
        return (a*b);
    }

    public static void main(String[] args) {
        MethodOverloading mol = new MethodOverloading();
        System.out.println(mol.multiply(5,10));
        System.out.println(mol.multiply(20, 5,10));
        System.out.println(mol.multiply(5.5, 3.5));
        System.out.println();
        
    }
}

package OO_Demo;

import java.util.Scanner;

public class Encapsulation {
    private String name;
    private int rollNo;
    private float perct;
    // Hiding properties(instances) is Data Encapsulation
    Scanner scan = new Scanner(System.in);
    Encapsulation(int rollNo, String name, float perct){
        this.rollNo=rollNo;
        this.name=name;
        this.perct=perct;
    }
    public void setData(){
        
        this.rollNo=scan.nextInt();
        this.name=scan.nextLine();
        this.perct=scan.nextFloat();
    }
    public void getData(){
        System.out.println(rollNo+"\n"+name+"\n"+perct);
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation(1, "ABC", 70);
        obj.getData();
    }
    
}

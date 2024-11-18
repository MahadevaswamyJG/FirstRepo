import java.util.List;
import java.util.ArrayList;


public class exampleList
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		List<Example> ex = new ArrayList<>();
		Example el = new Example();
		Example ell = new Example();
		el.id=1;
		el.name="ok";
		ell.id=2;
		ell.name="done";
		ex.add(el);
		ex.add(ell);
		for(Example e: ex){
		System.out.println("ID: " + e.id + ", Name: " + e.name);
		}
	}
}
class Example{
    protected int id;
    protected String name;
    
    // @Override
    //  public String toString() {
    //     return "Example{id=" + id + ", name='" + name + "'}";
    // }
}
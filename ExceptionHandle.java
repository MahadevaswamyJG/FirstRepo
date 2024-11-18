package OO_Demo;

public class ExceptionHandle {
    public static void main(String[] args) {
        try {//block1
            try {//block 2
                try{//block 3
                    int a[]={1,2,3,4};
                    System.out.println(a[4]);
                    System.out.println("No exceptions in the try block");
                }
                catch(IndexOutOfBoundsException e){
                    System.out.println("Index out of bond error in block 3: "+e.getMessage());
                    throw e;

                // throw the exception to the next block
                }
            } 
            catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfBoundsException in block 2: "+e.getMessage());
                throw e;
            // throw the exception to the next block

            }
        } 

        catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bond error in block 1: "+e.getMessage());
            throw e;
        // here only one catch block will execute so it cannot throw exeption 
        }
        catch (Exception e) {
            System.out.println("Index out of bond error in block 1 2nd catch: "+e.getMessage());
        }
        finally{
            System.out.println("This block always executes");
        }

//below block did not use try-catch so it wont compile after exception occour

        // int a[]={1,2,3,4};
        // System.out.println(a[4]);
        // System.out.println("No exceptions in the try block");

    }
}

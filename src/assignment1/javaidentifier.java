package assignment1;

public class javaidentifier {
    public void method()
    {
        System.out.println("method one");
    }
   public static void method1()
   {

       System.out.println("method two");
   }
     String flower="Rose";
    static String animal="cow";


    public static void main(String[] args) {
        //String flower="Rose";
        javaidentifier object1=new javaidentifier();
        object1.method();
        javaidentifier.method1();
        System.out.println(javaidentifier.animal);
        System.out.println(object1.flower);

    }

}

package assignment1;

public class javaconstructorandmethod {
    // constructor
    public javaconstructorandmethod()
    {
        System.out.println("This is a constructor");
    }
    //method
    public void methodnumber()
    {
        System.out.println("This is a method");
    }
    int time;
    String fruit;
    public int number()
    {
        return 9;
    }

    public static void main(String[] args) {
        javaconstructorandmethod myobject=new javaconstructorandmethod();
        myobject.fruit="mango";
        myobject.time=10;
        System.out.println(myobject.number());
        myobject.methodnumber();
    }
}

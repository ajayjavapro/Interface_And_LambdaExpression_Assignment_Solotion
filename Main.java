interface Computer
{
    void compileCode();
    default void config()
    {

    }
}

class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors");
    }
}

class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("you got 5 errors, faster");

    }
}

class Developer
{
    public void buildApp(Computer obj)//1.pass Desktop reference with type
    {
        System.out.println("Building App");
        obj.compileCode();
        //obj1.compileCode();
    }  
}

public class Main {
    public static void main(String[] args) {

       // Laptop obj = new Laptop();
       //Computer obj1=new  Desktop();
        Computer obj = new Laptop();
        Developer dev = new Developer();
        dev.buildApp(obj);//1. If we uncommnet Desktop object then pass its reference in buildApp
       

    }
}

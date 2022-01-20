import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class demo {
    private int a;
    protected int b;
    public int c;
    int d;

    public demo() {}

    public demo(int x,int y) {}

    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}

}

class ReflectDemo
{
    public static void main(String[] args)
    {
        Class c=demo.class;

        Field field[]=c.getDeclaredFields();

        Method meth[]=c.getMethods();

        for(Method m:meth)
            System.out.println(m);

        Parameter param[]=meth[0].getParameters();

        for(Parameter p:param)
        {
            System.out.println(p);
        }

    }
}

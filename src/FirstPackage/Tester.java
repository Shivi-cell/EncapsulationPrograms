package FirstPackage;

interface Inter
{
    void m1(int a);
}
abstract class Abs
{
    abstract void m1(Integer a);
}
public class Tester extends Abs implements Inter
{

    @Override
    public void m1(int a) {
        System.out.println("int method invoked "+a);
    }

    @Override
    void m1(Integer a) {
        System.out.println("Integer method invoked "+a);
    }

    public static void main(String[] args) {
        Abs obj = new Tester(); // upcasting
        Tester t = (Tester) obj; // down-casting
        Inter obj3 = t;
        Inter inter = new Tester();
        Integer a = new Integer(100);
        obj.m1(10);
        inter.m1(a);
    }
}

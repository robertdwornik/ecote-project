/*
Successful case:
We test 5 cases;
-Already declared "Runnable" interface in library with no arguemnts
-Decalred Interface with 3 paramaters and using this parametrs in lambda body
-Interface with one parameter not used in lambda body
-Interface with six parameters used in lambda body
-Interface with one parameter used in lambda body

*/
interface Interface{
   public void foo(Object n, Object l, Object p);
}

interface Interface2{
    public void foo2(Object n);
}

interface Interface3{
    public void foo3(Object x, Object y, Object z,Object a, Object b, Object c);
}

interface Interface4{
    public void foo4(Object n);
}

public class Case1 {
    public static void main(String[] args) {

        Runnable run = () -> {
            System.out.println("Hello");
        };


        Interface foo = (x,y,z) -> {
            System.out.println(x);
            Integer v = (Integer) x;
            v++;
        };


        Interface2 foo2 = (x) -> {
            System.out.println("hello");
        };


        Interface3 foo3 = (x,y,z,a,b,c) -> {
            System.out.println("hello");
            Integer v = (Integer) a;
            v++;
            Integer o = (Integer) b;
            o++;
        };

        Interface4 foo4 = (x) -> {
            System.out.println(x);
        };



    }
}

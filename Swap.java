public class Swap {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println("a value before swap="+a);
        System.out.println("b value before swap="+b);
        // using temparory variable
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
        // using xor operation
        int i=10;
        int j=20;
        System.out.println("i value before swap="+i);
        System.out.println("j value before swap="+j);
        i=i^j;
        j=i^j;
        i=i^j;
        System.out.println(i);
        System.out.println(j);
        //using arthmatic operator(+ & -)
        int x=20;
        int y=30;
        System.out.println("x value before swap="+x);
        System.out.println("y value before swap="+y);
        x=x-y;
        y=x+y;
        x=y-x;
        System.out.println(x);
        System.out.println(y);
        //using arthmatic operator(* & /)
        int u=50;
        int v=100;
        System.out.println("u value before swap="+u);
        System.out.println("v value before swap="+v);
        u=u*v;
        v=u/v;
        u=u/v;
        System.out.println(u);
        System.out.println(v);
    }
}

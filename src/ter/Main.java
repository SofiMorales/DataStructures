package ter;

public class Main {

    public static void main(String[] args) {
        A a=new A();
        A b=new A(0);
        A c=new A(-4);
        A d=new A(-10);
        A e=new A(2,2,5);
        A f=new A();
        A g=new A();
        A h=new A();
        A i=new A();
        A j=new A();
        A k=new A();
        
        System.out.println("Begin...");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        
        
        System.out.println("suma");
       A a2=new A(5,7);
       A a3=new A(-5,12);
       A a4=new A();
        System.out.println(a4.s(a2, a3));
//        System.out.println(g);
//        System.out.println(h);
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(k);
    }
}

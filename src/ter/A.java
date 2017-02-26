package ter;

public class A {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a == 0) {
            a = 0;
        } else {
            this.a = a;
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public A() {
        this.b = 1;
    }

    public A(int a) {
        this.b = a;
    }

    public A(double a) {
        this.b = (int) a;
    }

    public A(int a, int b) {
        int c = a(a, b);
        this.a = a / c;
        this.b = b / c;
    }

    public A simplifi(int a, int b) {
        A z = null;
        int c = a(a, b);
        this.a = a / c;
        this.b = b / c;
        z.a = this.a;
        z.b = this.b;
        return z;
    }

    public int a(int a, int b) {
        while (a != b) {
            if (a < b) {
                b -= a;
            } else {
                a -= b;
            }
        }
        return (a);
    }

    public A s(A a, A b) {
        A z = null;
        if (a.b == 0 && b.b == 0) {

        }
        return z;
    }
    
    public A(int a,int b,int c){
        a=a*c;
        a+=b;
        System.out.println(a);
        System.out.println(c);
        float a2=a;
        float c2=c;
        float f2=(float)(a2/c2);
    }

    @Override
    public String toString() {
        String c = "";
        if (b == 1 && a == 0) {
            c += ((float) b) + "";
        } else if (a == 0 && b == 0) {
            c += a + "." + b;
        } else if (a == 0 && b < 0) {
            c += b + "." + a;
        } else if (a < 0 && b > 0) {
            double a2=a/b;
            c += "value is: " + a2+"bitch";
        } else {
            c += "value is: " + a + "/" + b;
        }
        return c;
    }
//    public int s(int a,int b){
//        
//        return a+b;
//    }

//    int s(MotorM a, MotorM b) {
//        
//        return 
//    }
}
/*
return  a+"/"+b;
String a="";
        if(b==1){
            a+=((float) b)+"";
        }else{
            a+="value is: "+a+"/"+b;
        }
        return  a;
 */

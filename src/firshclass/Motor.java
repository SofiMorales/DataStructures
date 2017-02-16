package firshclass;

public class Motor {

    private int a, b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    //construc area
    public Motor(int a){
        System.out.println(a);
    }
    public Motor(float a){
        System.out.println("..."+a);
    }
    
//    public String a(int getA, int getB){
//        return "Fra: "+a+"/"+b;
//    }
//    
//    public String b(int getA,int getB){
//        int a=getA;
//        int b=getB;
//        String c="";
//        if(a<0){
//            c="1";
//        }else if(b<0){
//            c="1";
//        }else{
//            c=a+"/"+b;
//        }
//        return c;
//    }
}

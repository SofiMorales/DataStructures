package ter;

public class MotorM {

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

    public MotorM() {
        this.b = 1;
    }

    public MotorM (int a) {
        this.b = a;
    }

    public MotorM(double a) {
        this.b = (int) a;
    }
    public MotorM(int a, int b) {
        int c = a(a, b);
        this.a = a / c;
        this.b = b / c;
    }
    public MotorM simplifi(int a,int b) {
        MotorM z=null;
        int c = a(a, b);
        this.a = a / c;
        this.b = b / c;
        z.a=this.a;
        z.b=this.b;
        return z;
    }
    
    public int a(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return a(b, a % b);
        }
    }
    public MotorM s(MotorM a, MotorM b){
        MotorM z=null;
        if(a.b==0 && b.b==0){
            
        }
        return z;
    }

    @Override
    public String toString() {
        String c = "";
        if (b == 1 && a == 0) {
            c += ((float) b) + "";
        } else if(a==0 && b==0){
            c+=a+"."+b;
        }else if(a==0&&b<0){
            c+=b+"."+a;
        }else{c += "value is: " + a + "/" + b;
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

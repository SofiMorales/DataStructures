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

    public Motor(int a, int b) {
        this.a = a;
        this.b = b;
    }

    
    public String a(int getA, int getB){
        return "Fra: "+a+"/"+b;
    }
}

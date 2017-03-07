package pilasandcolas;

public class B {
//    private int b;
//    private int[] a = new int[b];
//    private int c;

    private int c;
    int[] b = new int[0];

    public B(int a) {
        b = new int[a];
        c = 0;
    }

    //inserta
    public void C(int a) {
        b[c++] = a;
    }

    //muestra
    public int D() {
        int a2 = 0;
        for (int i = 0; i < b.length; i++) {
            return a2 = b[i];
        }

        return a2;
    }

    //elimina
    public void E(int a) {
        //NOT FOUND
        if (b[a] == 0) {

        }
    }

//    public int E(int a){
//        
//    }
//    public void D(int a){
//        b[a]=
//    }
}

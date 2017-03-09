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
    public String D() {
        String a2 = "";
        for (int i = 0; i < b.length; i++) {
            if (b[i]==0) {
            }else{
                a2 += b[i] + "\n";
            }
        }
        return a2;
    }

    //eliminar
    public boolean E(int a) {
        boolean a2 = true;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == a) {
                a2 = true;
                b[i] = 0;
                break;
            } else {
                a2 = false;
            }
        }
        return a2;
    }

    //buscar
    public String F(int a) {
        String a2 = "";
        for (int i = 0; i < b.length; i++) {
            if(b[i]==a){
                a2="Lo encontré";
                break;
            }else{
                a2="No lo encontré";
            }
        }
        return a2;
    }

//    public int E(int a){
//        
//    }
//    public void D(int a){
//        b[a]=
//    }
}

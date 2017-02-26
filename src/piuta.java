public class piuta {
    // Algoritmo de Euclides

    public int mcd(int a, int b) {
        while (a != b) {
            if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }
        }

        return (a);
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        piuta max = new piuta();
        int c= max.mcd(a, b);
        a/=c;
        b/=c;
        System.out.println(a+"/"+b);
    }
}

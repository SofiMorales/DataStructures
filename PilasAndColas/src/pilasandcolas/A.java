package pilasandcolas;

public class A {
        /*
        .................................................................................
        .               ...debe poder hacerlo con entero y con objetos....              .              .
        .    *-crear el arreglo.                                                        .
        .    *-mostrar las poscicones.                                                  .
        .    *-insertar en la posicion de enseguida.                                    .
        .    *-debe poder simular las pilas, es decir priero en entrar ultimo en salir. .
        .    *-debe pdoer simular las cola, y las listas.                               .
        .................................................................................
         */
    public static void main(String[] args) {
        B b = new B(100);
        for (int i = 0; i < 10; i++) {
            b.C((int) (Math.random() * (99 + 1)));
            System.out.println("aprender de esa cosa");
        }
        System.out.println(b.D()+"\n");
//        System.out.println(b.D(8));
//        b.E(7);
//        System.out.println(b.D(8));
//        
    }

}

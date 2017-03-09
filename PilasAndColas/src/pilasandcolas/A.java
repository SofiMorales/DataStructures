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
        /*proposito general*/
        B b = new B(100);
        //ingresa
        b.C(10);
        b.C(1);
        b.C(2);
        b.C(3);
        b.C(5);
        b.C(7);
        b.C(9);
        //muestra
        System.out.println(b.D());
        //eliminar
        System.out.println("se eliminó? "+b.E(1)+"\n");
        //muestra nuevo arreglo
        System.out.println(b.D());
        //buscar
        System.out.println(b.F(1));
        
        /*simulando pilas*/
        
    }

}

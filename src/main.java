public class main {
    public static void main(String[] args) {
        LinkedList linkedList =  new LinkedList();
        linkedList.agregarValorAlInicio(61);
        linkedList.agregarFinal(30);
        linkedList.agregarFinal(15);
        linkedList.agregarFinal(26);
        linkedList.agregarPorPosicion(1, 14);
        linkedList.agregarPorPosicion(2, 18);

        linkedList.imprimirLista();
        System.out.print("\n");

        System.out.println(linkedList.obtenerPorPosicion(0));
        System.out.println(linkedList.obtenerPorPosicion(1));
        System.out.println(linkedList.obtenerPorPosicion(2));
        System.out.println(linkedList.obtenerPorPosicion(3));
        System.out.print("\n");

        linkedList.eliminarEnfrente();

        linkedList.imprimirLista();
        System.out.print("\n");

        linkedList.eliminarFinal();

        linkedList.imprimirLista();
        System.out.print("\n");

        linkedList.EliminarPorPosicion(1);

        linkedList.imprimirLista();
        System.out.print("\n");
    }
}
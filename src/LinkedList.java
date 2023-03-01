public class LinkedList {
    protected Node head = null;
    protected Node tail = null;

    public void agregarValorAlInicio(int valor){
        Node nuevoNodo = new Node(valor);
        nuevoNodo.next = head;
        head = nuevoNodo;
        if(nuevoNodo.next == null) {
            tail = nuevoNodo;
        }
    }

    public void agregarFinal(int valor) {
        Node nuevoNodo = new Node(valor);
        if(tail == null){
            head = nuevoNodo;
        } else {
            tail.next = nuevoNodo;
            tail = nuevoNodo;
        }
    }

    public void agregarPorPosicion(int posicion, int valor){
        if(posicion < 0) {
            throw new IndexOutOfBoundsException();
        } else if(posicion == 0){
            agregarValorAlInicio(valor);
        } else{
            Node nuevoNodo = new Node(valor);
            Node actual = head;
            for (int i = 0; i < posicion - 1; i++) {
                if(actual == null) {
                    throw new IndexOutOfBoundsException();
                }
                actual = actual.next;
            }
            if(actual.next == null){
                agregarFinal(valor);
            } else {
                nuevoNodo.next = actual.next;
                actual.next = nuevoNodo;
            }
        }
    }

    public int obtenerPorPosicion(int posicion){
        if(posicion < 0) throw new IndexOutOfBoundsException();
        Node actual = head;
        for (int i = 0; i < posicion; i++) {
            if(actual == null) throw new IndexOutOfBoundsException();
            actual = actual.next;
        }
        return actual.value;
    }

    public void eliminarEnfrente() {
        Node actual = head;
        if(actual == null) throw new IndexOutOfBoundsException();
        else {
            head = head.next;
        }
    }

    public void eliminarFinal() {

        Node actual = head;
        while(actual.next != tail){
            actual = actual.next;
        }
        actual.next = null;
        tail = actual;
    }

    public void EliminarPorPosicion(int posicion){
        if(posicion < 0) throw new IndexOutOfBoundsException();

        if(posicion == 0) eliminarEnfrente();
        else {
            Node actual = head;
            for (int i = 0; i < posicion - 1; i++) {
                if(actual == null) throw new IndexOutOfBoundsException();
                actual = actual.next;
            }

            if(actual == tail) eliminarFinal();
            else {
                actual.next = actual.next.next;
            }
        }
    }

    public void imprimirLista(){
        Node actual = head;
        while(actual != null){
            System.out.println(actual.value);
            actual = actual.next;
        }
    }
}

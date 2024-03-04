public class LEGConUltimo <E> {
    protected NodoLEG<E> primero, ultimo;
    public LEGConUltimo(){
        primero = null;
        ultimo = null;
    }
    public void insertar(E x){
        primero = new NodoLEG<E>(x,primero);
        if (ultimo == null) ultimo = primero;
    }
}

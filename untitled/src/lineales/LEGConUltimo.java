package lineales;
import modelos.I_ListaConUltimo;

public class LEGConUltimo <E> {
    //atributos
    protected NodoLEG<E> primero, ultimo;
    //constructores
    public LEGConUltimo(){
        primero = null;
        ultimo = null;
    }
    //metodos
    public void insertar(E x){
        primero = new NodoLEG<E>(x,primero);
        if (ultimo == null) ultimo = primero;
    }
    public void insertarEnFin(E x){
        NodoLEG<E>nuevo = new NodoLEG<E>(x);
        if(ultimo != null) ultimo.siguiente = nuevo;
        else primero = nuevo;
        ultimo = nuevo;
    }
    public boolean eliminar(E x){
        NodoLEG<E> aux = primero, ant = null;
        while(aux != null && !aux.dato.equals(x)){
            ant = aux;
            aux = aux.siguiente;
        }
        if(aux==null) return false;
        else ant.siguiente = aux.siguiente;
        if(aux.siguiente == null) ultimo = ant;
        return true;
    }

    @Override
    public String toString() {
        return "LEGConUltimo{" +
                "primero=" + primero +
                ", ultimo=" + ultimo +
                '}';
    }
}

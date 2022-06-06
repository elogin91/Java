package nodos;

public class Pila3 {
	
	class Nodo {
	    int info;
	    Nodo sig;
	}
	
    private Nodo raiz;
    
    Pila3 () {
        raiz=null;
    }
    
    public void insertar(int x) {
    	Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if (raiz==null)
        {
            nuevo.sig = null;
            raiz = nuevo;
        }
        else
        {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    
    
    public int printFirst ()
    {
        if (raiz!=null)
        {
            int informacion = raiz.info;
            return informacion;
        }
        else
        {
            return Integer.MAX_VALUE;
        }
    }
    
    
    
    public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco!=null) {
            System.out.print(reco.info+"-");
            reco=reco.sig;
        }
        System.out.println();
    }
    
    public boolean vacia() {
        if (raiz==null) {
            return true;
        } else {
    	    return false; 
        }
    }
    
    public int cantidad() {
        int cant=0;
        Nodo reco=raiz;
        while (reco!=null) {
            cant++;
            reco=reco.sig;
        }
        return cant;
    }
    
    public static void main(String[] ar) {
        Pila3 pila1=new Pila3();
        pila1.insertar(10);
        pila1.insertar(40);
        pila1.insertar(3);
        pila1.imprimir();
        System.out.println("La cantidad de nodos de la lista es:"+pila1.cantidad());
        if (pila1.vacia()==false) {
        	System.out.println("La información del primer nodo de la Pila es:");
            System.out.println(pila1.printFirst());
        }
    }
}

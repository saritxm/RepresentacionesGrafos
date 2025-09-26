package grafos;


public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(4);

        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 2);
        grafo.agregarArista(1, 3);

        grafo.generarMatrizIncidencia();

        grafo.mostrarMatrizAdyacencia();
        grafo.mostrarListaAdyacencia();
        grafo.mostrarListaAristas();
        grafo.mostrarMatrizIncidencia();
    }
}

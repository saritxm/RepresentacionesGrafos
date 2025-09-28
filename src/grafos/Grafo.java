package grafos;


import java.util.*;

public class Grafo {
    private int numVertices;
    private List<int[]> listaAristas;
    private int[][] matrizAdyacencia;
    private List<List<Integer>> listaAdyacencia;
    private int[][] matrizIncidencia;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        this.listaAristas = new ArrayList<>();
        this.matrizAdyacencia = new int[numVertices][numVertices];
        this.listaAdyacencia = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            listaAdyacencia.add(new ArrayList<>());
        }
    }

    // Agregar arista entre dos vértices
    public void agregarArista(int origen, int destino) {
        // lista de aristas
        listaAristas.add(new int[]{origen, destino});

        // matriz de adyacencia
        matrizAdyacencia[origen][destino] = 1;
        matrizAdyacencia[destino][origen] = 1; // si es no dirigido

        // lista de adyacencia
        listaAdyacencia.get(origen).add(destino);
        listaAdyacencia.get(destino).add(origen); // si es no dirigido
    }

    // Generar matriz de incidencia
    public void generarMatrizIncidencia() {
        int numAristas = listaAristas.size();
        matrizIncidencia = new int[numVertices][numAristas];

        for (int j = 0; j < numAristas; j++) {
            int[] arista = listaAristas.get(j);
            int origen = arista[0];
            int destino = arista[1];

            matrizIncidencia[origen][j] = 1;
            matrizIncidencia[destino][j] = 1;
        }
    }

    // Mostrar matriz de adyacencia
    public void mostrarMatrizAdyacencia() {
        System.out.println("Matriz de Adyacencia:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Mostrar lista de adyacencia
    public void mostrarListaAdyacencia() {
        System.out.println("Lista de Adyacencia:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");
            for (int vecino : listaAdyacencia.get(i)) {
                System.out.print(vecino + " ");
            }
            System.out.println();
        }
    }

    // Mostrar lista de aristas
    public void mostrarListaAristas() {
        System.out.println("Lista de Aristas:");
        for (int[] arista : listaAristas) {
            System.out.println(arista[0] + " - " + arista[1]);
        }
    }

    // Mostrar matriz de incidencia
    public void mostrarMatrizIncidencia() {
        System.out.println("Matriz de Incidencia:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < listaAristas.size(); j++) {
                System.out.print(matrizIncidencia[i][j] + " ");
            }
            System.out.println();
        }
    }
}

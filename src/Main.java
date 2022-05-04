public class Main {

    public static void main(String[] args) {
        // Voy a crear una instancia de GenericCollection
        GenericCollection<String> listaNombres = new GenericCollection<String>(10);

        GenericCollection<Integer> listaNumeros = new GenericCollection<Integer>(3);

        // Voy a crear una instancia utilizando el segundo constructor.
        GenericCollection<Float> listaFlotantes = new GenericCollection<Float>();

        // Colección pequeñita para trastear
        GenericCollection<String> miniLista = new GenericCollection<String>(3);
        System.out.println("Estado inicial de la colección");
        System.out.println(miniLista);
        miniLista.insert("Juan", 0);
        System.out.println(miniLista);
        miniLista.insert("Alejandro", 1);
        miniLista.insert("Malena", 2);
        System.out.println(miniLista);
        miniLista.insert("Óscar", 1);
        System.out.println(miniLista);
        miniLista.insert("Manuel", 1);
        System.out.println(miniLista);
        miniLista.add("Gabriel");
        System.out.println(miniLista);
        miniLista.delete(2);
        System.out.println(miniLista);

        String elemento = miniLista.getElement(1);
        System.out.println(elemento);

        int numeroElementos = miniLista.getNumObjects();
        System.out.println("El número de elementos de miniLista es: " + numeroElementos);
    }
}

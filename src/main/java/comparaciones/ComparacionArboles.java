package comparaciones;

import arboles.BinarySearchTree;
import java.util.TreeSet;
import java.util.TreeMap;
/**
 *
 * @author STEVEN AF
 */
public class ComparacionArboles {

    public static void main(String[] args) {

        BinarySearchTree<Integer> abb = new BinarySearchTree<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        int[] numeros = {50, 30, 70, 20, 40, 60, 80};

        //Inserción en ABB
        for (int n : numeros) abb.insert(n);

        //Inserción en TreeSet
        for (int n : numeros) treeSet.add(n);

        //Inserción en TreeMap
        for (int n : numeros) treeMap.put(n, "valor" + n);

        //Busquedas
        System.out.println("ABB busca 40: " + abb.search(40));
        System.out.println("TreeSet busca 40: " + treeSet.contains(40));
        System.out.println("TreeMap busca 40: " + treeMap.containsKey(40));

        //Ordenamientos
        System.out.println("\nTreeSet (orden natural): " + treeSet);
        System.out.println("TreeMap keys (orden natural): " + treeMap.keySet());

        System.out.println("\nRecorrido ABB InOrder (ordenado):");
        abb.inOrder();
    }
}

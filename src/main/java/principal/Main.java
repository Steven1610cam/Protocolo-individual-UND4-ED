package principal;

import arboles.BinarySearchTree;
/**
 *
 * @author STEVEN AF
 */
public class Main {
    public static void main(String[] args) {

        BinarySearchTree<Integer> abb = new BinarySearchTree<>();

        abb.insert(50);
        abb.insert(30);
        abb.insert(70);
        abb.insert(20);
        abb.insert(40);
        abb.insert(60);
        abb.insert(80);

        System.out.println("InOrder:");
        abb.inOrder();

        System.out.println("Buscar 40: " + abb.search(40));
        System.out.println("Buscar 90: " + abb.search(90));
    }
}


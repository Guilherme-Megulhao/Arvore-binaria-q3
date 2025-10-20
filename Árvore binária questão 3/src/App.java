public class App {
    public static void main(String[] args) throws Exception {
       int[] elementos = {1, 2, 3, 10, 4, 5, 9, 7, 8, 6};

        BST bst = new BST();
        for (int e : elementos)
            bst.root = bst.insert(bst.root, e);

        System.out.println("Árvore Binária de Busca (in-order):");
        bst.inorder(bst.root);

        System.out.println("\n");

        AVLTree avl = new AVLTree();
        for (int e : elementos)
            avl.root = avl.insert(avl.root, e);

        System.out.println("Árvore AVL (in-order):");
        avl.inorder(avl.root);
    }
}

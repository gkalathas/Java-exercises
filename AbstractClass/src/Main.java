public class Main {
    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
        String stringData = "5 7 8 3 5 6 7 89 0 31 4";
        String [] data = stringData.split(" ");
        //for each
        for(String s : data){
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());
    }
}
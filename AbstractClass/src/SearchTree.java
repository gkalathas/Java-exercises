public class SearchTree implements NodeList{
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            //it means that the tree is empty, it becomes the root
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0){
                //new item is greater, move right if is possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    // there is no node to the right, add at this position
                    currentItem.setNext(newItem);
                    return true;
                }
            }else if(comparison > 0){
                //newItem is less, move left
                if(currentItem.previous() != null){
                    currentItem= currentItem.previous();
                }else{
                    //there's no node to the left so add at this position
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    return true;
                }
            }else{
                //equal so don't add
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;

    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting item "+ item.getValue());
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                //found the node to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                //if comparison is > 0
                //we are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }
        //we have reached the end of the list
        //without finding anything to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        //recursive method
        if(root.previous() != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }

    }
}

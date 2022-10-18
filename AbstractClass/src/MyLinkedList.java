
public class MyLinkedList implements NodeList{
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }


    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            //it means that the list is empty so it becomes the head item
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
                    // there is no next, insert at the end of the list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }else if(comparison > 0){
                //newItem is less, insert before
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                }else{
                    //the node with a previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }else{
                //equal
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
       ListItem parentItem = currentItem;
       while(currentItem != null){
           int comparison = (currentItem.compareTo(item));
           if(comparison < 0){
               parentItem = currentItem;
               currentItem = currentItem.next();
           }else if(comparison > 0){
               parentItem = currentItem;
               currentItem = currentItem.previous();
           }else{
               //item found so remove it
               performRemoval(currentItem, parentItem);
               return true;
           }
       }
       return false;
    }
    private void performRemoval(ListItem item, ListItem parent){
        //remove item
        if(item.next() == null){
            //no right so we make parent point to the left
            if(parent.next() == item){
                //item is right child of its parent
                parent.setNext(item.previous());
            }else if(parent.previous() == item){
                //item is left child of parent
                parent.setPrevious(item.previous());
            }else{
                this.root = item.previous();
            }
        }else if(item.previous() == null){
            //no left so we make parent point to the left
            if(parent.next() == item){
                //item is right child of its parent
                parent.setNext(item.next());
            }else if(parent.previous() == item){
                //item is a left child
                parent.setPrevious(item.next());
            }else{
                this.root = item.next();
            }
        }else{
            //neither left nor right are null. from the right subtree we need to find the smallest value
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while(current.previous() != null){
                leftmostParent = current;
                current = current.previous();
            }
            //we need to put our smallest value into our node to be deleted
            item.setValue(current.getValue());
            //delete smallest
            if(leftmostParent == item){
                //there wasn't leftmost node, so current points to the smallest
                item.setNext(current.next());
            }else{
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
//        another way using recursive
//        if(root != null){
//        System.out.println(root.getValue());
//        traverse(root.next());
//        }
    }
}

// Create a generic class Item<T> that can store any type of object. Create the appropriate
//constructor, ge ers and se ers. Display the item present.
public class Item<T>{

    T item;
    public Item(T item){
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printItem(){
        System.out.println("Item: " + item);
    }
}

package iterator.modern;

import iterator.Iterator;

import java.util.ArrayList;

/**
 * Box containing an array-list of modern items.
 */
public class ModernBox {
    /* Since modern items will be containing all the latest items,
    * and also, new items can be added to the list. The moder box
    * is comprised of items contained in an ArrayList.*/

    private ArrayList<String> modernItems = new ArrayList<>();

    /**
     * Method to add a new item in the modern box.
     *
     * @param item String item.
     */
    public void addItem(String item) {
        modernItems.add(item);
    }

    /**
     * Method to remove a containing item from the modern box.
     *
     * @param item String item.
     */
    public void removeItem(String item) {
        if (modernItems.contains(item))
            modernItems.remove(item);
    }

    /**
     * Iterator for iterating through the modern items.
     * @return Iterator.
     */
    public Iterator createIterator() {
        return new ModernItemIterator(modernItems);
    }
}

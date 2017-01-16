package iterator.ancient;

import iterator.Iterator;

/**
 * Box containing an array of ancient items.
 */
public class AncientBox {
/*  Since this ancient box is only going to
    contain ancient items, it is going to contain an
    array of items, so that, no item can be added or removed.*/

    private String[] ancientItems = new String[5]; // Contains five items.

    /**
     * Permanently setting items in the ancient box.
     */
    public AncientBox() {
        ancientItems[0] = "Golden Compass";
        ancientItems[1] = "Mjölnir (Thor's Hammer)";
        ancientItems[2] = "Amitabh Bachchan";
        ancientItems[3] = "Batman";
        ancientItems[4] = "Reynold's Razor Gel";
    }

    /**
     * Iterator for iterating through the ancient items.
     * @return Iterator.
     */
    public Iterator createIterator() {
        return new AncientItemIterator(ancientItems);
    }
}

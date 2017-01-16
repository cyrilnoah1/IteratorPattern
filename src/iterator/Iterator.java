package iterator;

/**
 * Iterator for cycling through items.
 */
public interface Iterator {
    /**
     * @return boolean value based on whether the item-list has any more items.
     */
    boolean hasNext();

    /**
     * Iterating through the items in the item-list provided.
     *
     * @return the next item in the item-list.
     */
    Object next();
}

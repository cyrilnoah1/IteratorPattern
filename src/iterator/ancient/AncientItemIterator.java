package iterator.ancient;

import iterator.Iterator;

/**
 * Iterator for iterating through the list of ancient items.
 */
public class AncientItemIterator implements Iterator {
    private String[] items;
    int position = 0;

    public AncientItemIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        String item = items[position];
        position += 1;
        return item;
    }
}

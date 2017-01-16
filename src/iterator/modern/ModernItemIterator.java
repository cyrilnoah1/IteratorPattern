package iterator.modern;

import iterator.Iterator;

import java.util.ArrayList;

/**
 * Iterator for iterating through list of modern items.
 */
public class ModernItemIterator implements Iterator {
    private ArrayList<String> items;
    int position = 0;

    public ModernItemIterator(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        String item = items.get(position);
        position += 1;
        return item;
    }
}

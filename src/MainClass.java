import iterator.Iterator;
import iterator.ancient.AncientBox;
import iterator.modern.ModernBox;

import java.util.ArrayList;

/**
 * Class containing the main method.
 */
public class MainClass {

    /**
     * Main method.
     *
     * @param args String arguments.
     */
    public static void main(String args[]) {
        // Iterating and showing the required output.
        iterateAllItems();
    }

    /**
     * To make all the required iterations
     */
    private static void iterateAllItems() {
        ArrayList<String> allBoxItems = new ArrayList<>();

        AncientBox ancientBox = new AncientBox();
        ModernBox modernBox = new ModernBox();

        // Adding items to the modern box.
        modernBox.addItem("Hyperloop");
        modernBox.addItem("Jio SIM");

        // Collecting ancient items.
        Iterator ancientIterator = ancientBox.createIterator();
        while (ancientIterator.hasNext()) {
            allBoxItems.add((String) ancientIterator.next());
        }

        // Collecting modern items.
        Iterator modernIterator = modernBox.createIterator();
        while (modernIterator.hasNext()) {
            allBoxItems.add((String) modernIterator.next());
        }

        // Printing all the items collected from
        // the ancient box and the modern box.
        System.out.println("All items: \n");
        for (String item : allBoxItems) {
            System.out.println(item);
        }
    }
}

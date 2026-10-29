package prak10_latihangeneric;

import java.util.ArrayList;

public class BelajarPboList<T extends Comparable<T>> extends ArrayList<T> {

    public void printList() {
        PrintUtil.printList(this);
    }

    public void printListSorted() {
        PrintUtil.printListSorted(this);
    }
}
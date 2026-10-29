package prak10_latihangeneric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintUtil {

    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static <T> void printList(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static <T extends Printable> void printPrintableList(List<T> list) {
        for (T item : list) {
            System.out.println(item.getPrintDetail());
        }
    }

    public static <T extends Printable> void printPrintableList(T[] array) {
        for (T item : array) {
            System.out.println(item.getPrintDetail());
        }
    }

    public static <T extends Comparable<? super T>> void printListSorted(List<T> list) {
        List<T> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        for (T item : sortedList) {
            System.out.println(item);
        }
    }

    public static <T extends Comparable<? super T>> void printListSorted(T[] array) {
        T[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        for (T item : sortedArray) {
            System.out.println(item);
        }
    }
}
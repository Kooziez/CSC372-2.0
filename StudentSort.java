package criticalThinking6;

import java.util.Comparator;
import java.util.List;

public class StudentSort {

    //Selection Sort 
    public static <T> void selectionSort(List<T> list, Comparator<T> comp) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (comp.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap
            T temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}

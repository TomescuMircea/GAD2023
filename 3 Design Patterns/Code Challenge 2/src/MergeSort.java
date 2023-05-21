import java.util.Arrays;

public class MergeSort implements SortingStrategy {
    private void merge(Integer[] list, int left, int right) {
        if (right - left > 1 && left<right) {
            merge(list, left, (left+right) / 2);
            merge(list, (((left+right) / 2) + 1), right);
            Integer[] listCopy = new Integer[right - left + 1];
            int i = left;
            int j = ((left+right) / 2) + 1;
            int k = 0;
            while (i <=( (left+right) / 2) && j <= right) {
                if (list[i] < list[j]) {
                    listCopy[k] = list[i];
                    i++;
                } else {
                    listCopy[k] = list[j];
                    j++;
                }
                k++;
            }
            while (i <= (left+right) / 2) {
                listCopy[k++] = list[i];
                i++;
            }
            while (j <= right) {
                listCopy[k++] = list[j];
                j++;
            }
            k=0;
            for(i=left;i<=right;i++)
                list[i]=listCopy[k++];
        }
    }

    public void sort(Integer[] list) {
        int left = 0;
        int right = list.length - 1;
        merge(list, left, right);
    }
}

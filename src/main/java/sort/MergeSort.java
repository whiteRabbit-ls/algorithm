package sort;

/**
 * 归并排序
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] a = {4,2,1,3,6,5};
        mergeSort(a, 0, a.length - 1);

    }

    public static void mergeSort(int[] a, int p, int r){
        if (p >= r){
            return;
        }
        int q = (p + r)/2;
        mergeSort(a, p, q);
        mergeSort(a, q+1, r);
        merge(a, p, q, r);
    }

    private static void merge(int[] a, int p, int q, int r){
        int i = p;
        int j = q + 1;
        int k = 0;
        int[] tempArr = new int[r - p + 1];
        while(i <= q && j <= r){
            if (a[i] < a[j]){
                tempArr[k++] = a[i++];
            }else {
                tempArr[k++] = a[j++];
            }
        }
        int start = i;
        int end = q;
        if (j <= r){
            start = j;
            end = r;
        }

        while(start <= end){
            tempArr[k++] = a[start++];
        }
        for (int x = 0; x < r-p+1; x++) {
            a[p + x] = tempArr[x];
        }
        print(a);
    }

    /**
     * 打印数组元素
     * @param a 数组
     */
    private static void print(int[] a) {
        for (int x:a) {
            System.out.print(x + ",");
        }
        System.out.println();
    }
}

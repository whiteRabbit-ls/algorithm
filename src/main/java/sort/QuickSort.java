package sort;

/**
 * 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] a = {4,2,1,3,6,5};
        quickSort(a, 0, a.length - 1);
    }

    public static void quickSort(int[] a, int p, int r){
        if (p >= r) {
            return;
        }
        int q = qartition(a, p, r);
        quickSort(a, p, q-1);
        quickSort(a, q+1, r);
    }

    private static int qartition(int[] a, int p, int r) {
        int pivot = a[r];
        int i = p;
        for (int j = p; j < r; j++) {
            if (a[j] < pivot) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, r);
        print(a);
        return i;
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

    /**
     * 数组元素交换
     * @param a 数组
     * @param i 下标
     * @param j 下标
     */
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

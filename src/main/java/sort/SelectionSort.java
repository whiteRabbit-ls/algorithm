package sort;

/**
 * 选择排序
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {4,2,1,3,6,5};
        sort(a);
    }

    public static void sort(int[] a){
        int n = a.length;
        for (int i = 0; i< n; i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (a[j] < a[minIndex]){
                    minIndex = j;
                }
            }
            swap(a, i, minIndex);
            print(a);
        }
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

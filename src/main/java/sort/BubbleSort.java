package sort;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {4,2,1,3,6,5};
        sort(a);
    }

    public static void sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++){
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++){
                if (a[j]> a[j+1]){
                    swap(a, j, j + 1);
                    flag = true;
                }
            }
            print(a);
            if (!flag){
                break;
            }
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

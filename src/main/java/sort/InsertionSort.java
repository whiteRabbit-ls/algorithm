package sort;

/**
 * 插入排序
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {4,2,1,3,6,5};
        sort(a);
    }

    public static void sort(int[] a){
        int n = a.length;
        for (int i = 1; i < n; i++){
            int value = a[i];
            int j = i-1;
            for (; j >= 0; j--){
                if (a[j] > value){
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = value;
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
}

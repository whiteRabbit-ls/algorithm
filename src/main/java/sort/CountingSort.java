package sort;

/**
 * 计数排序
 */
public class CountingSort {

    public static void main(String[] args) {
        int[] a = {4,2,1,3,6,5};
        countingSort(a);
    }

    public static void countingSort(int[] a) {
        int max = a[0];
        int length = a.length;
        //取最大值
        for (int i = 1; i < length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        //申请一个计数数组，下标[0,max]
        int[] c = new int[max + 1];
        for (int i = 0; i <= max; i++) {
            c[i] = 0;
        }
        //计算每个值的个数
        for (int i = 0; i < length; i++) {
            c[a[i]] ++;
        }
        System.out.print("计数数组为：");
        print(c);
        //依次累加
        for (int i = 1; i <= max; i++) {
            c[i] += c[i - 1];
        }
        System.out.print("累加后的计数数组为：");
        print(c);
        //临时数组，存放排序后的结果
        int[] r = new int[length];
        for (int i = length - 1; i >= 0; i--){
            int index = c[a[i]] - 1;
            r[index] = a[i];
            c[a[i]] --;
        }

        for (int i = 0; i < length; i++){
            a[i] = r[i];
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

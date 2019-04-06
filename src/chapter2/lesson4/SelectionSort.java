package chapter2.lesson4;

/**
 * Created by luzhiyuan on 2018/12/11.
 *
 * 2-4 测试算法的性能
 *
 * O（n*2）: n指的是数据量，当数据量增长一定倍数m时，其执行时间会增长m的平方倍
 */
public class SelectionSort {

    // 我们的算法类不允许产生任何实例
    private SelectionSort(){}

    public static void sort(Comparable[] arr){

        int n = arr.length;
        for( int i = 0 ; i < n ; i ++ ){
            // 寻找[i, n)区间里的最小值的索引
            int minIndex = i;
            for( int j = i + 1 ; j < n ; j ++ )
                // 使用compareTo方法比较两个Comparable对象的大小
                if( arr[j].compareTo( arr[minIndex] ) < 0 )
                    minIndex = j;

            swap( arr , i , minIndex);
        }
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        // 测试排序算法辅助函数
        int N = 100000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("chapter2.lesson4.SelectionSort", arr);

        return;
    }

}

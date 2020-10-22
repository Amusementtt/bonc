import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {101,34,119,1};
        /*
            {101,34,119,1} insertVal = 34
            {101,101,119,1} => {34,101,119,1}

            {34,101,119,1} insertVal = 119 => {34,101,119,1}

            {34,101,119,1} insertVal = 1 insertIndex = 3
            {34,101,119,119} inserIndex = 2
            {34,101,101,119} insertIndex = 1
            {34,34,101,119} insertIndex = 0
            => {1,34,101,109}
         */
        insertSort(arr);
    }

    public static void insertSort(int[] arr) {
        //第一轮{101,34,119,1}=>{34,101,119,1}
        //使用for循环
        for (int i = 1; i < arr.length; i++) {
            //定义待插入的数
            int insertVal = arr[i];
            int insertIndex = i - 1;

            //给insertVal找到插入的位置
            //说明
            //insertIndex >= 0 保证在给insertVal找插入位置,不越界
            //insertVal  < arr[insertIndex] 待插入的数,还没有找到插入位置
            //需要将arr[insertIndex]后移
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            //当退出while循环时,插入的位置找到,插入的位置为insertIndex + 1
            arr[insertIndex + 1] = insertVal;
            System.out.println("第"+ i + "轮插入");
            System.out.println(Arrays.toString(arr));
        }
    }
}

//return the index of a number in an arry

import java.util.Scanner;

public class ArryFind {
    public static void main(String[] args) {

        int[] arr={19,28,37,46,50};
        Scanner sc = new Scanner(System.in);
        int i;
        int index =-1;

        System.out.println("请输入你想查找的数字");
        int num = sc.nextInt();

        for (i=0;i<arr.length;i++){
            if (arr[i]==num){
                index =i;
                break;//为什么会终止for循环而不是if？
            }
        }
        System.out.println(num+"的索引是"+index);
    }
}

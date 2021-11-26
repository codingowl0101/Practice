package ArrySum;

import java.util.Scanner;

//键盘输入5个数，求这5个数的和
public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int[] num = new int[5];
        int i;
        int sum = 0;

        for (i=0;i<num.length;i++){
            System.out.println("请输入第"+(i+1)+"个整数：");
            num[i]= sc.nextInt();
            sum = sum +num[i];
        }

        System.out.println("您输入的"+num.length+"个整数的和是"+sum);

    }
}

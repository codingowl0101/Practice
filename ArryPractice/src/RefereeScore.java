//recieve scores from 6 referees
// and calculate the average excluding the max and mim

import java.util.Scanner;

public class RefereeScore {
    public static void main(String[] args) {
        System.out.println("请输入裁判的打分");

        double[] score=new double[6];
        Scanner sc=new Scanner(System.in);
        int i;
        //得到6位评委的打分
        for (i =0;i<score.length;i++){
            score[i]=sc.nextInt();
        }

        //得到max和min
        double max=score[0];
        double min=score[0];

        for (i =0;i<score.length;i++){
            if (score[i]>max) {
                max=score[i];
            }
            if (score[i]<min) {
                min=score[i];
            }
        }
        //求和
        double sum=0;
        for (i =0;i<score.length;i++){
            sum =sum +score[i];
        }
        //求平均数
        double average = (sum-max-min)/(score.length-2);
        System.out.println("去掉一个最高分和一个最低分后平均成绩是"+average);

    }
}

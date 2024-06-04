import java.util.Arrays;

public class Re {
    public static void main(String[] args) {
  int a = 10; //시작은 10
        while (a >= 0){
            System.out.println(a);
            a--;
        }

        int n = 1;
        int sum = 0;
        while (n <=100){
            sum +=n++;
        }  System.out.println(sum);

        int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
        int i = 0;
        int sum2 = 0;
        while (i < numbers.length){
            sum2 += numbers[i];
            i++;
        }
        System.out.println(sum2/numbers.length);

        int[] numbers2 = {10, 5, 8, 20, 3, 15, 9, 2};
        int i2 = 1, max = 0 , b = 0;
        while (i2 < numbers2.length){
            if (numbers2[b] < numbers2[i2]){
                max = numbers2[i2];

            }
            i2++;
        }System.out.println(max);

        int[] numbers3 = {4, -2, -9, -7, 5, 1, -3, 6, -1, 8};
        int i3 = 0, pos = 0, neg = 0;
        while (i3 < numbers3.length){
            if(numbers3[i3] > 0){
                pos += numbers3[i3];
            } else {
                neg += numbers3[i3];
            }
            i3++;
        }
        System.out.println(pos);
        System.out.println(neg);

        int sumq = 0;
        for (int q = 1; q <= 100; q++){
            if (q % 2 ==0){
                sumq +=q;
            }
        }
        System.out.println(sumq);


        int sumw = 0;
        for(int w = 1; w <= 20; w++){
            if (w % 3 == 0 && w % 5 == 0){
                sumw +=w;
            }
        }
        System.out.println(sumw); //15


        int[] fi = new int[10]; //10개를 출력할 것이므로
        fi[0] = 1;
        fi[1] = 1;
        for(int e =2; e<fi.length; e++){
            fi[e] = fi[e-2] + fi[e-1];
            //피보나치 수열의 기본이다.
            // e번째 항은 두번째 전 항과 첫번째 전 항을 더한 값
        }
        System.out.println(Arrays.toString(fi));

        for (int r = 100; r >= 1; r--){
            if (r % 2 == 0){
                System.out.println(r);
            }
        }

        for (int t = 1; t <= 9; t++){
            for (int y = 1; y <= 9; y++){
                System.out.println(t + "X" + y + "=" + t*y);
            }
        }

        int u = 2;
        for (int o = 1; o <=9; o++){
            System.out.println(u + "X" + o + "=" + u*o);
        }


        for (int p = 1; p <=10; p++){
            if (p==4 || p==7){
                continue;
            }
            System.out.println(p);
        }

        int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
        int sums = 0;
        int avg = 0;
        for (int f :scores) {
            sums +=f;
            avg = sums / scores.length;
        }
        System.out.println(sums);
        System.out.println(avg);


        String[] names = {"Ruby","Rascal","Morgan","Jiyeon","Envyy","Eunjin"};
        for (String g : names){
            if (g.length() >=5){
                System.out.println(g);
            }


        }


    }
}

/*
import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Jun4 {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5){
            System.out.println("현재 i의 값은 = " + i);
            i++;

        int count = 10;
        while (count >= 0) {
            System.out.println("b의 값은" + count);
            count--;
        }
        System.out.println("카운트 종료");


        int n = 1, sum = 0;
        while (n <= 100) {
            sum += n;
            n++;  // sum += n ++; 이런식으로 작성도 가능
        }
        System.out.println(sum);

        int[] arr = {5, 2, 9, 1, 7, 4, 6, 3, 8};
        int num = 0, sum2 = 0;
        while (num < arr.length){
            sum2 += arr[num];
            num++;
        }
        System.out.println( sum2 / arr.length);

        int i = 1;
        while(i<=300){
            if (i%3==0) {
                System.out.println(i);
            }
            i++;

        }

        int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
        int a = 0, max = 0;
        while (a < numbers.length){
            if (max < numbers[a]){
                max = numbers[i];
            }
            a++;
        }
        System.out.println(max);

        //풀이
        int max = numbers[0];
        int i = 1; //0번 인덱스와 나머지를 비교하기위해 1부터 시작
        while(i<numbers.length){
            if (numbers[i] > max){
                max = numbers[i];
            }
        } i++;
        System.out.println(max);

        //배열에서 양수의 합과 음수의 합을 각각 구함
        int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
        int idx = 0, po = 0, neg = 0;
        while(idx < numbers.length){
            if (numbers[idx] > 0){
                po += numbers[idx];
            } else {
                neg += numbers[idx];
            }
            idx++;
        }
        System.out.println(po);
        System.out.println(neg);

    }
    //실무에서는 일케씁니다
    int posNum = IntStream.of(numbers).filter(num -> num >0).sum();
    int neNum = IntStream.of(numbers).filter(num ->num < 0).sum();



    for(int i=1; i<=5; i++){
        //초기식 조건식 증감식
        System.out.println("현재 i의 값은 = "+ i);
    }

        int sum = 0;
        for (int i = 1 ; i<=100 ; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        int sum2 = 0;
        for (int n = 1 ; n <= 20 ; n++){
            if (n % 3 == 0 && n % 5 ==0){
                sum2 += n;
            }
        }
        System.out.println(sum2);


        //피보나치
        int[] arr = new int[10] ;
        arr[0]=1;
        arr[1]=1;
        int sum = 0;
        for (int n =2; n < 10; n++){
            arr[n] = arr[n-2] + arr[n-1];
            sum += arr[n];
        }
        System.out.println(sum); //why 0이 나오냐


        //해설
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 1;
        for (int n = 2; n<arr.length;n++);{
            arr[n] = arr[n-2] + arr[n-1];
        }

        //내림차순?
        for (int i = 100; i >=1 ; i--);{
            System.out.println(i);
        }
        for (int u = 0; u>= -100; u--);{
            if (u % 2 ==0){
                System.out.println(u);
            }
        }
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = 1;
        for (int n = 2; n < arr.length ; n++){
            arr[n] = arr[n-2] + arr[n-1];
        }
        System.out.println(Arrays.toString(arr));

        //이것 또한 피보나치.
        Arrays.setAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]);


        for (int num1 = 1; num1 >=9 ; num1++){
            for (int num2 = 1; num2 >=9; num2++){
                int mul = num1 * num2;
                System.out.println("num1"+"X"+"num2"+"=mul");
            }
        }


    }
}


*/

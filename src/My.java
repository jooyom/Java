import java.util.Scanner;

public class My {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //잘못된 입력일때 다시 재입력 받는건? 안되나
        System.out.println("계절을 맞춰보세요!");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("봄");
                break;
            case 2:
                System.out.println("여름");
                break;
            case 3:
                System.out.println("가을");
                break;
            case 4:
                System.out.println("겨울");
                break;
            default:
                System.out.println("잘못된 입력입니다!");
                break; //break; 까먹지 않기 주의..
               /* int num2 = sc.nextInt();*/
        }
        sc.close();
    }
}

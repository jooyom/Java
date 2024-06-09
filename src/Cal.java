import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber, firstNum, secondNum;
        do {
            System.out.println("원하는 기능을 입력하세요.");
            System.out.println("1. 덧셈 / 2. 뺄셈 / 3. 곱셈 / 4. 나눗셈 / 0. 종료");
            userNumber = sc.nextInt();
            sc.nextLine();
            System.out.println("첫 번째 값을 입력하고 엔터를 누르세요.");
            firstNum = sc.nextInt();
            sc.nextLine();
            System.out.println("두 번째 값력하고 엔터를 누르세요.");
            secondNum = sc.nextInt();
            sc.nextLine();
        } while (userNumber == 0);{

            if (userNumber == 1) {
                System.out.println(firstNum + secondNum);
            }
            else if(userNumber == 2) {
                System.out.println(firstNum - secondNum);
            }
            else if(userNumber == 3) {
                System.out.println(firstNum * secondNum);
            }
            else if(userNumber == 4) {
                System.out.println(firstNum / secondNum);
            }
            else {
                System.out.println("올바른 입력이 아닙니다.");
            }



        }


    }
}


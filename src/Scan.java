import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력해주세요.");
        int a = sc.nextInt();

        System.out.println("제가 입력한 값은" + a + "입니다.");


        //특징 및 유의사항
        System.out.println("정수를 입력하세요");
        int number = sc.nextInt(); //int로 정수를 받음
        sc.nextLine(); //엔터를 받음
        System.out.println("문자열을 입력하세요");
        String Line = sc.nextLine(); //알트엔터 지역변수 빨리빨리 할수있어요
        //글자 받을때는 nextLine으로

        System.out.println("정수는 = " + number);
        System.out.println("문자열은 = " + Line);

        sc.close();

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
            //잘못된 입력일때 다시 재입력 받는건? 안되나
        }
        sc.close();


       Random random = new Random();

        int u = random.nextInt(6); //0부터 6까지 양수로만 나오게됨
        int y = random.nextInt(6)+1; //1부터 6까지 양수로만 나오게됨
        System.out.println(u);


//        //로또 번호
//        Random lotto = new Random();
//        int[] lo = new int[45] ;
//        // while을 써서 lo의 길이가 6이 될때 까지?
//        for (int o = 0; o < 6; o++ ){
//           int p = lotto.nextInt(45)+1;
//            System.out.println(p);
//            }
//        } //이게 무슨코드임? 그냥 랜덤으로 6개 숫자만 뽑아내느거같은데,
//
//       //해설을 들읍시다
//        Random lot = new Random();
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        //integer타입의(int 정수형) arraylist , int는 클래스형으로 Integer 이래요
//        //추가가 되는 리스트 배열은 추가가 안된다.
//
//        while (list.size() < 6) {
//            int number = lot.nextInt(45) + 1;
//
//            if (!list.contains(number)) {
//                //if를 그대로 써서 continue로 길게 하는것보다 부정연산자를 활용하여 없다면! 리스트에 추가로 바꿈
//                list.add(number);
//            }
//
//        }
//        for (int date : list) {
//            System.out.println(data);
//        }*/
//
//        Random ran = new Random();
//        Scanner sca = new Scanner(System.in);
//        int g = ran.nextInt(100) + 1;
//        while (true) {
//            System.out.println("숫자를 입력해 보세요");
//            int h = sca.nextInt();
//            if (g > h) {
//                System.out.println("random값이 큽니다.");
//            } else if (g < h) {
//                System.out.println("random값이 작습니다");
//            } else {
//                System.out.println("정답입니다!");
//                break;    //여기다가 써야돼!!!!
//            }  //아이씨 break 문을 여기 밖에다 써서 한번쓰면 무조건 끝나게 되어버림 ㅠ
//
//        }
//
//        sc.close();
//
//
//
//        Scanner name = new Scanner(System.in);
//        Scanner people = new Scanner(System.in);
//        Scanner who = new Scanner(System.in);
//        Scanner phone = new Scanner(System.in);
//        String inName = name.nextLine();
//        int inPeople = people.nextInt();
//        String inWho = who.nextLine();
//        int inPhone = phone.nextInt();
//        System.out.println("====영화 티켓 예매 정보====");
//        System.out.println("영화 제목: " + inName);
//        System.out.println("관람 인원: " + inPeople);
//        System.out.println("예매자 이름: " + inWho);
//        System.out.println("예매자 전화번호: " + inPhone);
//
//        System.out.println("금액: " + inPeople*10000);
//



        }
    }




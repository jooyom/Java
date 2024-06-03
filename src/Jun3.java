public class Jun3 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 3;

        int sum = number1 + number2;
        int diff = number2 - number1; //-7
        int diff2 = number1 - number2; //7

        int product = number1 * number2;
        int quot = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("덧셈" + sum);
        System.out.println("뺄셈1" + diff);
        System.out.println("뺄셈2" + diff2);
        System.out.println("곱셈" + product);
        System.out.println("나누기" + quot);
        System.out.println("나머지" + remainder);

        byte a = 1;
        byte b = 1;
       // byte c = a + b; //int타입으로 변환되는데 byte로 선언해서
        int d = a + b;
        int c = (int) a + b;

        int q = 10;
        int w = 4;
        int e = q/w;
        double r = q/w;
        //int 연산을 해서 결과를 int로 해야되는데 이렇게 되면 2로 되고 2.0으로 실수화를한다.
        //2.5를 얻고싶다면  double d = (double) a/b; 로 하면 된다.

        char c1 = 'A' + 1; // B 유니코드
        char c2 = 'A';
       // char c3 = c2 + 1; // c2 + 1 이 int가 되어버렸다! int보다 작은값이라,
        int c4 = c2 + 1;


        String str1 = "안녕하세요";
        String str2 = "만나서 반갑습니다.";
        String  str3 = str1 + str2;

        System.out.println(str3);



        StringBuilder sb = new StringBuilder();
        sb.append(123);
        sb.append(456);
        sb.append("Hello");
        System.out.println(sb);

        int num1 = 10;
        int num2 = 34;
        System.out.println(num1>num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);
        System.out.println(num1<num2);

        System.out.println(num1==num2);
        System.out.println(num1!= num2); // ! = 이다

        String A = new String();
        String B = new String();
        System.out.println(A==B); //주소값이 달라서 다르다.
        System.out.println(A.equals(B)); //참조타입은 이렇게 비교해야함.

        System.out.println('A' < 'B'); //유니코드로 변경되어 비교함 크게 많이 쓰진 않음

        //&& 모든 값이 true 여야 true
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false


        //하나라도 true이면 true 둘다 false 여야 false겠죠?
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        //xor 둘이 달라야 true && ||보다 많이 사용하진 않음.
        System.out.println(true ^ true); //false
        System.out.println(true ^ false); //true
        System.out.println(false ^ true); //true
        System.out.println(false ^ false); //false

       int score = 95;
       char grade = (score > 90) ? 'A' :  'B'; //참일때 A, 거짓일때 B
       String grade2 = (score ==95 && score%5 ==0) ? "good" : "bad" ;

        int score2 = 95;
        if(score > 90){
            System.out.println('A');
        }
        else {
            System.out.println('B');
        }
        //char를 선언하고 해도 됨
        /*char grade;
        if (scroe > 90){
            grade = 'A';
        } else{
            grad = 'B';
        }*/

        int number = 20;
        if(number > 10){
            System.out.println("number는 10보다 큽니다.");
        } else if(number < 10){
            System.out.println("number는 10보다 작습니다.");
        } if (number > 5){
            System.out.println("number는 5보다 큽니다."); //if 중복 가능
        } else {
            System.out.println("number는 5입니다.");
        }

        int x = 7;
        int g = 4;
        if (x > g){
            System.out.println("a is greater than b");
        } else if (x == g){
            System.out.println("a and b are equal");
        } else {
            System.out.println("a is less than b");
        }
        int s = 5;
        int k = 3;
        String z = (s > k) ? "s is bigger than k" : (s == k) ? "s and k are equal" : "s is less than k";
        System.out.println(z);

       /* //퀴즈으
        int y = 10;
        if (x > 0) {
            System.out.println("x는 양수입니다.");
        } else if ( x < 0){
            System.out.println("x는 음수입니다.");
        } else {
            System.out.println("x는 0입니다.");
        }
        System.out.println(
                (x > 0) ? "x는 양수입니다" : (x < 0) ? "x는 음수입니다." : "x는 0입니다."
        );

        int score = 75;
        if (score >= 90){
            System.out.println("A");
        } else if (score >= 80 ){
            System.out.println("B");
        } else if (score >= 70){
            System.out.println("C");
        } else if ( score >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }

       int year = 2023;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + "는 윤년입니다.");
        } else {
            System.out.println(year + "는 윤년이 아닙니다.");
        }

        int a3 = 10;
        int b3 = 20;
        int c3 = 30;
        if (a3 > b3 && a3 > c3){
            System.out.println("a가 가장 큽니다.");
        } else if (b3 > a3 && b3 > c3){
            System.out.println("b가 가장 큽니다.");
        } else if (c3 > a3 && c3 > a3){
            System.out.println("c가 가장 큽니다.");
        } else {
            System.out.println("a, b, c 는 모두 같습니다.");
        }
        //파이썬에서는 a>b>c 한번에 비교가 가능한데 java에서는 지원하지 않으므로 ,

        int passScore = 60;
        int myScore = 75;
        if (myScore >= passScore){
            System.out.println("합격입니다.");
        } else{
            System.out.println("불합격입니다.");
        }

        System.out.println(
                (myScore >= passScore) ? "합격입니다." : "불합격입니다."
        );

        int a = 10;
        int b = 5;
        boolean result1 = (a>5) && (b<10); //true && true -> true
        boolean result2 = (a>5) || (b>10); //true || false -> true
        boolean result3 = !(a>5) || (b>10); //!ture -> false

        int three = 3;
        int five = 5;
        int two = 2;
        boolean result = (five > three) || (five < two) && (five < three);
        //true || false && false -> true or false 는 무조건 true (하나라도 잇으니까)
        //연산자 우선순위 때문에 && 먼저 처리된다.
        System.out.println(result); //true
        //우아 어렵다아아아
       boolean x = true, y = false, z = true;

       if (x && !y){
           System.out.println("조건 1 충족");
       }if ((y&&z)|| (!x&&!z)) {
           System.out.println("조건2 충족");
       }if (x || y || z) {
           System.out.println("적어도 하나는 참");
       }if (!x && !y && !z)
           System.out.println("모두 거짓");
       }

        int data = 10;
        switch (data) {
            case 1:
                System.out.println("1입니다.");
                break;
            case 2:
                System.out.println("2입니다.");
                break;
            case 10:
                System.out.println("10입니다.");
                break;
            default:
                System.out.println("dasdfa");
        }

        String day = "수요일";
        switch (day) {
            case "월요일":
                System.out.println("책 읽기");
                break;
            case "화요일":
                System.out.println("잠 자기");
                break;
            case "수요일":
                System.out.println("영화 보기");
                break;
            case "목요일":
                System.out.println("외출 하기");
                break;
            case "금요일":
                System.out.println("피자 먹기");
                break;
            default:
                System.out.println("알 수 없는 요일");
                break;
        }

        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'E':
                System.out.println("Fail");
                break;
            default:
                System.out.println("성적을 입력하세요.");
        }

        char operator = '+';
        int num1 = 3, num2 = 2;
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }

        String color = "blue";
        switch (color){
            case "red":
                System.out.println("Apple");
                break;
            case "green":
                System.out.println("Grass");
                break;
            case "blue":
                System.out.println("Sky");
                break;
        }

        int score = 49;
        switch (score/10){
            case 10,9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

        String language = "Java";
        switch (language){
            case "Java":
                System.out.println("Java는 강타입 언어입니다.");
                break;
            case "Python":
                System.out.println("Python은 모르겠습니다.");
                break;
            case "C++":
                System.out.println("C++");
                break;
            case "JavaScript":
                System.out.println("JSJSJSJSJS");
                break;
        }*/

    }
}

import javax.lang.model.element.NestingKind;

public class May31 {
    public static void main(String[] args) {

        String firstName = "Joo Young";
        String secondName = "Kim";
        String phone = "iphone";
        String status = "sleepy";
        System.out.println("나는" + secondName + " " + firstName + "입니다.");
        System.out.println("내" + phone+ "은" + status);

        System.out.println(firstName=secondName);
    String a = "hello";
    String  b = new String("berserker");
    System.out.println(a.equals(b)); //true
        System.out.println(a == b); //false 메모리 주소값을 비교

        String aa = "Hello World!";
        System.out.println(aa.indexOf("g"));
        System.out.println(aa.contains("World")); //a가 World를 포함하고 있는지

        String bb = "ESTSOFT";
        System.out.println(bb.contains("SOFT")); //대소문자를 구분하니 유의

        String findChar = "What is your hobby";
        System.out.println(findChar.charAt(13) + "" + findChar.charAt(14) + "" + findChar.charAt(15) + "" + findChar.charAt(16) + "" + findChar.charAt(17) + "");

        String d = "Hello World!";
        /*System.out.println(d.replaceAll());*/

        String dd = "WEEEE ASKE ;ND"; //끝위치는 +1할것!
        System.out.println(d.substring(0, 3) + d.substring(8, 10) + d.substring(12, 14));
        System.out.println(d.substring(0,d.length()-1));

        String e = "a:b:c:d";
        e.split(":"); //split에서 알트엔터 하면 아래처럼 나옴 지역변수 삽입
         String[] split = e.split(":");


         String result = "Hello";

        System.out.println(result+"!");
        result.concat("!");

        String name1 = "Tim";
        int age1 = 30;

        String name2 = "Anna";
        int age2 = 45;

        String.format("%s의 나이는 %s세 입니다", name1, age1); //첫번째 %s가 name1, 두번째 %s가 age1으로 대응된다.
        String.format("%s의 나이는 %s세 입니다", name2, age2);

        String result2 = "";
        result2  += "Hello";
        result2  += "java";
        result2 += "World";
        System.out.println(result2);
        StringBuilder sb = new StringBuilder();
        sb.append("Hello"); //append 문자열 추가하는거임 반드시 해야됨
        sb.append("java");
        sb.append("World");
        System.out.println(sb);  //(sb.toString()) 으로 해야되는 경우도 있다


        StringBuffer sf = new StringBuffer();
        sf.append("Hello");
        sf.append("java");
        sf.append("World");
        System.out.println(sf);

        StringBuffer ssb = new StringBuffer();
        sb.append("HELLO");
        sb.insert(0, "WORLD");
        sb.insert(0, "WORLD");
        sb.insert(0, "WORLD");
        sb.insert(0, "WORLD");
        System.out.println(sb);

        int[] arr = new int[100]; //길이가 100인 배열
        String[] arr2 = new String[1000];  //천개의 문자를 받는 배열
        System.out.println(arr); //배열의 주소가 나오게됨
        System.out.println(arr[0]); //0
        System.out.println(arr2[0]); //null 값이 없어서

        //배열의 가장 큰 값 구하기
        int [] arr3 = {1, 2, 3};
        System.out.println(arr[3]); //out of bounds 범위 초과 에러남


        int positive = 10;
        int negative = -10;

        System.out.println("양의 부호 연산자 적용" + (+positive));
        System.out.println("음의 부호 연산자 적용" + (-positive));
        System.out.println("음의 부호 연산자로 부호 반전" + (-negative));

        int x = 5;
        int y = 5;
        System.out.println("전위 증가 연산자: "+ (++x)); //6
        System.out.println("후위 증가 연산자: "+ (y++)); //5
        System.out.println("======================");
        System.out.println("x는" + x); //6
        System.out.println("y는" + y); //6


        int A = 100;
        int B = 100;
        System.out.println("전위 감소 연산자: "+ (--A)); //99
        System.out.println("후위 감소 연산자: "+ (B--)); //100
        System.out.println("전위 감소 연산자: "+ (--A)); //98
        System.out.println("후위 감소 연산자: "+ (B--)); //99
        System.out.println("전위 감소 연산자: "+ (--A)); //97
        System.out.println("후위 감소 연산자: "+ (B--)); //98

        boolean isRaining = true;
        if (isRaining) {
            System.out.println("하늘에서 비가와요");
        }
        if (isRaining){
            System.out.println("?");
        }
        boolean isSunny = false;
        if (isSunny) {
            System.out.println("날씨가 맑아요");
        }else {
            System.out.println("집에서 쉬어야죠");
        }



    }
}

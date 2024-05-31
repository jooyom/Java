import javax.lang.model.element.NestingKind;

public class May31 {
    public static void main(String[] args) {

        /*String firstName = "Joo Young";
        String secondName = "Kim";
        String phone = "iphone";
        String status = "sleepy";
        System.out.println("나는" + secondName + " " + firstName + "입니다.");
        System.out.println("내" + phone+ "은" + status);

        System.out.println(firstName=secondName);*/
    /*String a = "hello";
    String c = new String(o)
    String  b = new String(original.:"hello");
    System.out.println(a.equals(b)); //true
        System.out.println(a == b); //false 메모리 주소값을 비교*/

        String a = "Hello World!";
        System.out.println(a.indexOf("g"));
        System.out.println(a.contains("World")); //a가 World를 포함하고 있는지

        String b = "ESTSOFT";
        System.out.println(b.contains("SOFT")); //대소문자를 구분하니 유의

        String findChar = "What is your hobby";
        System.out.println(findChar.charAt(13) + "" + findChar.charAt(14) + "" + findChar.charAt(15) + "" + findChar.charAt(16) + "" + findChar.charAt(17) + "");

      /*  String d = "Hello World!";
        System.out.println(d.replaceAll();*/

        String d = "WEEEE ASKE ;ND"; //끝위치는 +1할것!
        System.out.println(d.substring(0, 3) + d.substring(8, 10) + d.substring(12, 14));
        System.out.println(d.substring(0,d.length()-1));

        String e = "a:b:c:d";
        e.split(":"); //split에서 알트엔터 하면 아래처럼 나옴 지역변수 삽입
         String[] split = e.split(":");


         String result = "Hello";

        System.out.println(result+"!");
        result.concat("!");

    }
}

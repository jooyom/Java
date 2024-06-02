import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        float myFloat = 9.75f;
        float anotherFloat = myFloat * 2;
        System.out.println("Original float value: " + (int) myFloat);
        System.out.println("Calculated float value: " + (byte) anotherFloat);

        boolean isTure = true;

        if (isTure) {
            System.out.println("이건트루입니다.");
        } else {
            System.out.println("이건펄스입니다.");
        }


        int[] arr = {1, 2, 3, 4, 5}; //안에 값은 정수
        int a = 10;
        System.out.println(arr);
        int[] arr2 = new int[5];
        System.out.println(arr[0]);

        String name = "berserker";
        String name2 = new String("berserker"); //이렇게 해도 같다.

        System.out.println(name);
        System.out.println(name2);


        //Arrays 도 씀
        List<Integer> list = Arrays.asList(1, 2, 3); //Integer는 숫자형 String은 문자형
        //배열을 List로 바꾸는데 사용
        List<String> li = new ArrayList<>();

        System.out.println(list.get(0));
        int ii = 10;

        int num1 = 123_456_789;
       // int num2 = 123,456,789; 쉼표는 사용할 수 없다
    }
}
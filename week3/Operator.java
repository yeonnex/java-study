import java.util.Arrays;
import java.util.OptionalInt;

public class Operator {

    public static void main(String[] args) {
//        System.out.println(xor());
        System.out.println(xor());
        String str = (1.8 + "java");
        System.out.println(str);
    }

    /**
     * 어떠한 int 배열이 존재하는데 단 한개만 짝이 없는 숫자라 할때 그 숫자가 무엇인지 구해라
     *
     * 상호 배타적인 xor 의 특징을 이용.
     * 같으면 0이 나오고 다르면 그 숫자가 나옴.
     */
    public static int xor(){
        int[] arr = {1, 1, 2, 2, 4, 5, 4};
        int answer = 0;
        for (int value : arr) {
            answer ^= value;
        }
        return answer;
    }
}

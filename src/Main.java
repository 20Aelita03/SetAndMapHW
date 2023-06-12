import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println("Задание 1");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        //Задание 2
        System.out.println("Задание 2");
        Collections.sort(nums);
        int result = Integer.MIN_VALUE;
        for (int num2 : nums) {
            if (num2 % 2 == 0 && num2 != result){
                System.out.println(num2);
                result = num2;
            }
        }
        //Задание 3
        System.out.println("Задание 3");
        List<String> str = new ArrayList<>(List.of("ab","bcc", "bcc", "bac","cae", "dar", "dar"));
        Set<String> str2 = new HashSet<>(str);
        System.out.println(str2);

        //Задание 4
        System.out.println("Задание 4");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String,Integer> dubl = strings.stream().collect(Collectors.toMap(e -> e, e -> 1,Integer::sum));
        System.out.println(dubl);

    }
}
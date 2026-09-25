import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sorting {

    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }

        };

        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(31);
        nums.add(25);
        nums.add(98);
        nums.add(39);
        // System.out.println(nums);
        // for sorting use comparable
        Collections.sort(nums, com);
        for (int n : nums) {
            System.out.println(n);
        }

    }
}

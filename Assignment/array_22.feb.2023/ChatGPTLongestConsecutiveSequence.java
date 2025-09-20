import java.util.*;

public class ChatGPTLongestConsecutiveSequence {

    public void consecutiveSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num); // Duplicates will be ignored automatically
        }

        int longestLength = 0;
        int startOfLongest = 0;

        for (int num : set) {
            // Check only if current number is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }

                if (length > longestLength) {
                    longestLength = length;
                    startOfLongest = num;
                }
            }
        }

        int endOfLongest = startOfLongest + longestLength - 1;
        System.out.println(startOfLongest + "  " + endOfLongest);
    }

    public static void main(String[] args) {
        int[] a = MyArrayHelper.input(); // Assumes you already have this method for input
        new ChatGPTLongestConsecutiveSequence().consecutiveSequence(a);
    }
}

package logic;

import java.util.HashSet;

public class HashSetDS {

    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate : " + num);
            }
        }
    }

    public static boolean hasDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : arr) {
            if (set.contains(n)) {
                return true; // duplicate found
            } else {
                set.add(n);
            }
        }

        return false; // no duplicate
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 3, 7, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate: " + num);
            } else {
                set.add(num);
            }
        }


    }
}

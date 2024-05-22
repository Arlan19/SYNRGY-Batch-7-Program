package ch1.pertemuan5;

import java.util.*;

public class DistinctNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,2,2,8,8,8,8,8,4,4,4,4,10,2,2,2,2,6,6,6,6,6,2,2,2,2,2,2);
        Set<Integer> distinctNumbers = new HashSet<>();
        for(int number: numbers){
            distinctNumbers.add(number);
        }
        numbers = new ArrayList<>();
        for (int distinctNumber: distinctNumbers){
            numbers.add(distinctNumber);
        }
        System.out.println(numbers);
    }
}

package com.dev.java.techie.accolite;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesInSortedArray {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,2,3,4,4,5,5,6);

        //input : 1,2,3,4,4,5,5,6
        //output : 4,5
        Predicate<Integer> isPrime = x -> x%2 == 0;

        list.stream().filter(x -> (x / x == 1) ).forEach(System.out::println);



    }
}

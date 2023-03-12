package com.dev.java.techie.coforge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OccurenceCheckWithDistinct {
    public static void main(String [] args){
        /*problem statement :
        * Given an integer array nums, return true if any value appears at least twice in the array,
        * and return false if every element is distinct.*/

        /*input : 1,2,3,4,4,5,6,7,8*/

        List<Integer> inputList = Arrays.asList(1,2,3,4,4,5,6,7,8);

        boolean flag = inputList.stream().distinct().count() < inputList.size();

        if(flag){
            System.out.println("Contains Duplicate " + flag);
        }else{
            System.out.println("Not Contains Duplicate "+flag);
        }

    }
}

package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int count = 0;
        Integer[] noElement = new Integer[]{};
        String remove = "";
        for(Integer a: array) {
            remove += a.toString();
        }

        if(maxNumberOfDuplications==0 || maxNumberOfDuplications==1) {
            return noElement;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i].equals(array[j])) {
                    count++;
                }
            }
            if(count >= maxNumberOfDuplications) {
                remove = remove.replace(array[i].toString(), "");
            }
            count = 0;
        }

        Integer[] newArray = new Integer[remove.length()];
        for (int i = 0; i < remove.length(); i++) {
            newArray[i] = Integer.parseInt(String.valueOf(remove.charAt(i)));
        }
        return newArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String remove = "";
        int count = 0;
        for (Integer a: array) {
            remove += a.toString();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i].equals(array[j])) {
                    count++;
                }
            }
            if(count==exactNumberOfDuplications) {
                 remove = remove.replace(array[i].toString(), "");
            }
            count = 0;
        }

        Integer[] newArray = new Integer[remove.length()];
        for (int i = 0; i < remove.length(); i++) {
            newArray[i] = Integer.valueOf(String.valueOf(remove.charAt(i)));
        }
        return newArray;

    }
}

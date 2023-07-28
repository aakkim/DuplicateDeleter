package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int counter = 0;
        String[] noElement = new String[]{};
        String remove = "";
        for (String a: array) {
            remove += (a + " ");
        }
        if(maxNumberOfDuplications==0 || maxNumberOfDuplications==1) {
            return noElement;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i].equals(array[j])) {
                    counter ++;
                }
            }
            if(counter >= maxNumberOfDuplications) {
                remove = remove.replace(array[i] + " ", "");
            }
            counter = 0;
        }
        String[] newArray = remove.split(" ");

        return newArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int count = 0;
        String remove = "";
        for (String a:array) {
            remove += (a + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i].equals(array[j])) {
                    count ++;
                }
            }

            if(count == exactNumberOfDuplications) {
                remove = remove.replace(array[i] + " ", "");
            }
            count = 0;
        }

        String[] newArray = remove.split(" ");
        return newArray;
    }
}

/**
* Java 1. Homework 3
*
* @ author Elena Zavarzina
* @ version 31.03.2022
*/

import java.util.Arrays;

class HomeWorkThree {

    public static void main(String[] args) {
        

        int[] arr = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
        System.out.println(Arrays.toString(changing(arr)));
        System.out.println(Arrays.toString(changing(arr)));
        
 
        System.out.println(Arrays.toString(createArray()));
        
        
        int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        modifierForArrayes(arrayNumbers);
        System.out.println(Arrays.toString(arrayNumbers));
        
        
        createSquareArray(5);
        
        
        System.out.println(Arrays.toString(create(5, 10)));
        
    }


    static int[] changing(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0)? 1 : 0;
        }
        return arr;
    }
    
    static int[] createArray() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i+1;
        }
        return array;
    }
    
    
    static void modifierForArrayes(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] < 6) {
                array[i] *= 2;
            }
        }
    }    
                
    static void createSquareArray(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }
    
    static int[] create(int len, int initialValue) {
        int[] arrayfive = new int[len];
        for(int i = 0; i < arrayfive.length; i++) {
            arrayfive[i] = initialValue;
        }
        return arrayfive;
    }        
}


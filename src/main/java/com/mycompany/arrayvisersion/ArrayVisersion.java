/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayvisersion;

/**
 *
 * @author 26032270
 */
public class ArrayVisersion {
    public static void main(String[] args) {
        int total = 0;
        int countMarks = 0;
        int [] marks = {65, 48, 72, 81, 39};
        for(int i = 0; i<marks.length; i++ ){
            System.out.println(marks[i]);
            total +=marks[i];
            if(marks[i]>50){
                countMarks++;
            }
        }
        System.out.println("Numbers abouve 50: "+countMarks);
        System.out.println("The total of all marks: "+total);
    }
}

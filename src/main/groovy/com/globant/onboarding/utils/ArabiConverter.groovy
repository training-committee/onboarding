package com.globant.onboarding.utils

class ArabiConverter {
    Map simbol = [
            1 : "I", 4: "IV", 5: "V",
            9 : "IX", 10: "X", 40: "XL",
            50: "L", 90: "XC", 100: "C"
    ]

    String convert(int input) {
        String s = "";
        int[] values = [100, 90, 50, 40, 10, 9, 5, 4, 1]
        for (int i = 0; i < values.length; i++) {
            int number = values[i]
            while (input >= number) {
                s += simbol[number];
                input -= number;
            }
        }
        return s;

    }

    /*

       String convert(Integer number) {

           if (simbol[number] != null) {
               return simbol[number]
           }

           int[] values = [1, 3, 5, 8, 10, 40, 40, 50, 50, 90, 90, 100]

           for (int i = 0; i < values.length; i = i + 2) {
               if (isBetween(number, values[i + 1], values[i])) {
                   return concat(number, values[i])
               }
           }

       }

       private boolean isBetween(int number, int max, int min) {
           return number <= max && number > min
       }

       private String concat(int number, int sub) {
           return convert(sub) + convert(number - sub)
       }*/


}


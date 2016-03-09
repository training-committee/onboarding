package com.expedia.webinar.tdd

class ArabiConverter {
    static final Map SIMBOLO = [1: "I", 4: "IV", 5: "V", 9: "IX", 10: 'X', 40: "XL", 50: "L", 90: "XC", 100: "C"]

    String toRomano(int numero) {
        StringBuilder out = new StringBuilder()
        numerosOrdenados().each { int it -> numero = convertToRoman(numero, it, out) }
        return out.toString()
    }

    private static int convertToRoman(int numero, int it, StringBuilder out) {
        while (numero >= it && ((numero -= it) >= 0)) {
            out.append(SIMBOLO[it])
        }
        return numero
    }

    static List numerosOrdenados() {
        return SIMBOLO.keySet().toSorted().reverse()
    }
}

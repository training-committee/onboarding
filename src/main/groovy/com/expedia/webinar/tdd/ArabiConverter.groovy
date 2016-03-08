package com.expedia.webinar.tdd


class ArabiConverter {
    static final Map SIMBOLO = [1: "I", 4: "IV", 5: "V", 9: "IX", 10: 'X', 40: "XL", 50: "L", 90: "XC", 100: "C"]
    static final List NUMEROS_ESPECIALES = [100, 90, 50, 40, 10, 9, 5, 4, 1]

    String toRomano(int numero) {
        StringBuilder out = new StringBuilder()
        NUMEROS_ESPECIALES.each { int numeroEspecial ->
            while (numero >= numeroEspecial) {
                out.append(SIMBOLO[numeroEspecial])
                numero = numero - numeroEspecial
            }
        }
        return out.toString()
    }
}

package models


 data class Complex(var num1: Int = 0, var num2: Int = 0){

    fun add(otherComplex: Complex): Complex? {
        return Complex(
            num1 = this.num1 + otherComplex.num1,
            num2 = this.num2 + otherComplex.num2
        )

    }
}

object ComplexUtil {
    fun add(originComplex: Complex, otherComplex: Complex): Complex? {
        return Complex(
            num1 = originComplex.num1 + otherComplex.num1,
            num2 = originComplex.num2 + otherComplex.num2
        )

    }
}
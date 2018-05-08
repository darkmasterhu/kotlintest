package hu.testing.kotlinspek

open class Calculator {
    fun add(vararg x: Int) = x.sum()
    fun substract(x: Int, y: Int) = x - y
    fun divide(x: Int, y: Int): Int {
        if (y == 0) {
            throw IllegalArgumentException("Division with zero!")
        }
        return x / y
    }
}
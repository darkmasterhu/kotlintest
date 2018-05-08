package hu.testing.kotlinspek

class AdvancedCalculator: Calculator() {
    fun pow(base: Int, exponent: Int) = Math.pow(base.toDouble(), exponent.toDouble()).toInt()
}
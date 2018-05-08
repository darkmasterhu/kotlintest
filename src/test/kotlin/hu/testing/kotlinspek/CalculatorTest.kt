package hu.testing.kotlinspek

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.*
import kotlin.test.assertEquals

object CalculatorSpec : Spek({

    describe("Calculator") {
        val calculator = Calculator()

        it("should return the summary of two numbers") {
            val sum = calculator.add(2, 4)
            assertEquals(6, sum)
        }

        it("should return the substraction of two numbers") {
            val subtract = calculator.substract(4, 2)
            assertEquals(2, subtract)
        }

        it("should return the quotient of two numbers") {
            val division = calculator.divide(4, 2)
            assertEquals(2, division)
        }
    }

    describe("Advanced Calculator") {
        val calculator = AdvancedCalculator()

        it("should return the power of two numbers") {
            val power = calculator.pow(2, 3)
            assertThat(power).isEqualTo(8)
        }

        it("should throw exception: division with zero") {
            assertThatIllegalArgumentException()
                    .isThrownBy { calculator.divide(5, 0) }
                    .withMessage("Division with zero!")
        }
    }
})
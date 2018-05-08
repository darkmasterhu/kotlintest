package hu.testing.kotlinspek

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import kotlin.test.assertEquals

object CalculatorSpec2 : Spek({

    given("a calculator") {
        val calculator = Calculator()

        on("addition") {
            val sum = calculator.add(2, 4)
            it("should return the summary of two numbers") {
                assertEquals(6, sum)
            }
        }

        on("subtraction") {
            val subtract = calculator.substract(4, 2)

            it("should return the substraction of two numbers") {
                assertEquals(2, subtract)
            }
        }

        on("division") {
            val division = calculator.divide(4, 2)

            it("should return the quotient of two numbers") {
                assertEquals(2, division)
            }
        }
    }

    given("Advanced Calculator") {
        val calculator = AdvancedCalculator()

        on("power") {
            val power = calculator.pow(2, 3)

            it("should return the power of two numbers") {
                assertThat(power).isEqualTo(8)
            }
        }

        on("division with zero") {
            it("should throw exception: division with zero") {
                assertThatIllegalArgumentException()
                        .isThrownBy { calculator.divide(5, 0) }
                        .withMessage("Division with zero!")
            }
        }
    }
})
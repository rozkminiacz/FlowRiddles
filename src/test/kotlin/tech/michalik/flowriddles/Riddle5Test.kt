package tech.michalik.flowriddles

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList

class Riddle5Test : StringSpec({
    "it should negate previous emitted value"{
        val givenStream = flowOf(Unit, Unit, Unit)
        val givenInitialValue = false

        val expected = listOf(false, true, false, true)

        val actual = Riddle5.solve(givenInitialValue, givenStream).toList()

        actual shouldBe expected
    }
})
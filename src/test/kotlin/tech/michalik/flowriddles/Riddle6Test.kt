package tech.michalik.flowriddles

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList

class Riddle6Test : StringSpec({
    "it should sum corresponding values of two flows"{
        val givenSource1 = flowOf(2, 4, 7, 9)
        val givenSource2 = flowOf(3, 8, 1, 13)

        val expected = listOf(5, 12, 8, 22)

        val actual = Riddle6.solve(givenSource1, givenSource2).toList()

        actual shouldBe expected
    }
})

package tech.michalik.flowriddles

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList

class Riddle7Test : StringSpec({
    "it should filter out repetitions"{
        val givenFlow = flowOf(0, 0, 0, 2, 2, 2, 3, 2, 0)
        val expected = listOf(0, 2, 3, 2, 0)
        val actual = Riddle7.solve(givenFlow).toList()

        actual shouldBe expected
    }
})
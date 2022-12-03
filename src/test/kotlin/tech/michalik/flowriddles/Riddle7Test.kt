package tech.michalik.flowriddles

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
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

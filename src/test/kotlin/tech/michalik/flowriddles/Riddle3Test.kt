package tech.michalik.flowriddles

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.toList

class Riddle3Test : StringSpec({
    "it should emmit only even numbers"{
        val givenFlow = (0..10).asFlow()
        val expected = listOf(0, 2, 4, 6, 8, 10)

        val actual = Riddle3.solve(givenFlow).toList()

        actual shouldBe expected
    }
})

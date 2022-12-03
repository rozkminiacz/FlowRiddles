package tech.michalik.flowriddles

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList

class Riddle2Test : StringSpec({
    "it should increment each value emitted by source by 1"{
        val givenFlow = flowOf(0, -2, 6)
        val expectedResult = listOf(1, -1, 7)

        val result = Riddle2.solve(givenFlow)
            .toList()

        result shouldBe expectedResult
    }
})

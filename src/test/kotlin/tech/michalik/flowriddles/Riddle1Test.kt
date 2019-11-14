package tech.michalik.flowriddles

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import kotlinx.coroutines.flow.toList

class Riddle1Test : StringSpec({
    "it should transform given value to flow and then complete"{
        val givenValue = 3
        val collection = Riddle1.solve(givenValue)
            .toList()

        collection shouldBe listOf(givenValue)
    }
})
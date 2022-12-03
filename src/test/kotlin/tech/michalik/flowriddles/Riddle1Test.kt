package tech.michalik.flowriddles

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.flow.toList

class Riddle1Test : StringSpec({
    "it should transform given value to flow and then complete"{
        val givenValue = 3
        val collection = Riddle1.solve(givenValue)
            .toList()

        collection shouldBe listOf(givenValue)
    }
})

package tech.michalik.flowriddles

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.flow.toList

class Riddle4Test : StringSpec({
    "it should transform collection to flow"{
        val givenList = listOf(1, 2, 6, 11)

        val actual = Riddle4.solve(givenList).toList()

        actual shouldBe listOf(1, 2, 6, 11)
    }
})

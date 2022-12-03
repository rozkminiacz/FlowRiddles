package tech.michalik.flowriddles

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList

class Riddle11Test : StringSpec({
    "it should apply flow transformation for each flow element"{
        val givenSource = flowOf(1, 2, 3)
        val givenTransformation: suspend (Int) -> Flow<String> = {
            flow {
                emit("${it}_a")
                emit("${it}_b")
            }
        }
        val expected = listOf("1_a", "1_b", "2_a", "2_b", "3_a", "3_b")
        val actual = Riddle11.solve(givenTransformation, givenSource).toList()

        actual shouldBe expected
    }
})

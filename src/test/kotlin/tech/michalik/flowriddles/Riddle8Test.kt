package tech.michalik.flowriddles

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.toList

class Riddle8Test : StringSpec({
    "when flow emits value then return that value"{
        val givenFlow = flowOf(42)
        val givenDefaultValue = 137

        val expected = listOf(42)

        val actual = Riddle8.solve(givenDefaultValue, givenFlow).toList()

        actual shouldBe expected
    }
    "when flow emits error then return default value"{
        val givenFlow = flow<Int> {
            throw Error()
        }
        val givenDefaultValue = 42

        val expected = listOf(42)

        val actual = Riddle8.solve(givenDefaultValue, givenFlow).toList()

        actual shouldBe expected
    }
})

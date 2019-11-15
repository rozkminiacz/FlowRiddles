package tech.michalik.flowriddles

import io.kotlintest.matchers.collections.shouldHaveSize
import io.kotlintest.specs.StringSpec
import kotlinx.coroutines.flow.toList

class Riddle10Test: StringSpec({
    "it should emit n values"{
        val givenValueCount = 13
        val actual = Riddle10.solve(givenValueCount).toList()

        actual shouldHaveSize 13
    }
})
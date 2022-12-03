package tech.michalik.flowriddles

import io.kotest.assertions.assertSoftly
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContainInOrder
import io.kotest.matchers.collections.shouldHaveSize
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.currentTime
import kotlinx.coroutines.test.runBlockingTest

class Riddle14Test : StringSpec({
    "it should delay each value emitted by given flow by 10ms"{

        runBlockingTest { ->

            val givenFlow = flowOf(1, 2, 3, 4, 5, 6)

            val actual = Riddle14.solve(givenFlow).map {
                it to currentTime
            }.toList()

            val expected = (1..6).map { it to it * 10L }

            assertSoftly {
                actual shouldHaveSize expected.size
                actual shouldContainInOrder expected
            }
        }
    }
})

package tech.michalik.flowriddles

import io.kotlintest.assertSoftly
import io.kotlintest.matchers.collections.shouldContainInOrder
import io.kotlintest.matchers.collections.shouldHaveSize
import io.kotlintest.specs.StringSpec
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runBlockingTest

class Riddle12Test : StringSpec({

    "it should filter out emissions in 300ms time frame"{
        runBlockingTest { ->

            val givenFlow = flow {
                repeat(10) {
                    emit(Unit)
                    delay(100)
                }
            }

            val actualFlow = Riddle12.solve(givenFlow)

            val actual = actualFlow.map { currentTime }.toList()

            assertSoftly {
                actual shouldHaveSize 3
                actual shouldContainInOrder listOf(300L, 600L, 900L)
            }
        }
    }
})
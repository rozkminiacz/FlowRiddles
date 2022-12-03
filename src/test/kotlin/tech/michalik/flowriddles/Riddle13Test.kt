package tech.michalik.flowriddles

import io.kotest.assertions.assertSoftly
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContainInOrder
import io.kotest.matchers.collections.shouldHaveSize
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.currentTime
import kotlinx.coroutines.test.runBlockingTest

class Riddle13Test : StringSpec({
    "it should emit next Int values from 0 to 21 with 20ms delay after each emission"{

        runBlockingTest { ->

            val actual = Riddle13.solve().map {
                it to currentTime
            }.toList()

            val expected = (0..20).map { it to it * 20L }

            assertSoftly {
                actual shouldHaveSize expected.size
                actual shouldContainInOrder expected
            }
        }
    }
})

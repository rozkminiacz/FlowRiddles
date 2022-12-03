package tech.michalik.flowriddles

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first

class Riddle9Test : StringSpec({
    "when value is null, then emit IllegalStateException"{
        val givenValue: Int? = null

        val error = runCatching {
            Riddle9.solve(givenValue).collect()
        }.exceptionOrNull()

        error!!::class shouldBe IllegalArgumentException::class
    }
    "when value is not null, then emit that value"{
        val givenValue: Int = 42

        val actual = Riddle9.solve(givenValue).first()

        actual shouldBe 42
    }
})

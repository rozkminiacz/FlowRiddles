package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.zip

object Riddle6Solution {
    /**
     * Combine two flows - sum corresponding values of [source1] and [source2].
     */
    fun solve(source1: Flow<Int>, source2: Flow<Int>): Flow<Int> {
        return source1.zip(other = source2, transform = { a, b ->
            a + b
        })
    }
}
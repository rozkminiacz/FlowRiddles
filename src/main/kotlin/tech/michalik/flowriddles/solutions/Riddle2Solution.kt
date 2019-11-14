package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

object Riddle2Solution {
    /**
     * Increment each emitted value of the given [source] by 1.
     *
     * Use case: You want to transform the data.
     */
    fun solve(source: Flow<Int>): Flow<Int> {
        return source.map {
            it.inc()
        }
    }
}
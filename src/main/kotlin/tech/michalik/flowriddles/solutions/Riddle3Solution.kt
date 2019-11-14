package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.filter

object Riddle3Solution {
    /**
     * Don't emit odd numbers from the [source] Flow.
     *
     * Use case: You want to filter certain items out.
     */
    fun solve(source: Flow<Int>): Flow<Int> {
        return source.filter { it % 2 == 0 }
    }
}

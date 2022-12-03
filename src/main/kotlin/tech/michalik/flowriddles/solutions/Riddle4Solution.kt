package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow

object Riddle4Solution {
    /**
     * Build Flow that emits the all values from [list] and then completes.
     *
     * Use case: You want to transform some collection of values to the Flow.
     */
    fun solve(list: List<Int>): Flow<Int> {
        return list.asFlow()
    }

    /* Same as:
    flow {
        list.forEach { emit(it) }
    }
     */
}

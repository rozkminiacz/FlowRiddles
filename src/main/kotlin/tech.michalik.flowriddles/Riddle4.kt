package tech.michalik.flowriddles

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow

object Riddle4 {
    /**
     * Build Flow that emits the all values from [list] and then completes.
     *
     * Use case: You want to transform some collection of values to the Flow.
     */
    fun solve(list: List<Int>): Flow<Int> {
        return list.asFlow()
    }
}
package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.distinctUntilChanged

object Riddle7Solution {
    /**
     * Filter out repetitions from [source].
     * Example: [source] emits [0,0,0,2,2,2,3,2,0], then your flow should emit [0,2,3,2,0]
     */
    fun solve(source: Flow<Int>): Flow<Int> {
        return source.distinctUntilChanged()
    }
}
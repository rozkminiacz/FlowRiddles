package tech.michalik.flowriddles

import kotlinx.coroutines.flow.Flow

object Riddle7 {
    /**
     * Filter out repetitions from [source].
     * Example: [source] emits [0,0,0,2,2,2,3,2,0], then your flow should emit [0,2,3,2,0]
     */
    fun solve(source: Flow<Int>): Flow<Int> {
        TODO()
    }
}
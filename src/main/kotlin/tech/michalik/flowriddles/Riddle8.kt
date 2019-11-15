package tech.michalik.flowriddles

import kotlinx.coroutines.flow.Flow

object Riddle8 {
    /**
     * Given [source] emits value, emit that value
     * Given [source] emits [Error], emit default value
     */
    fun solve(defaultValue: Int, source: Flow<Int>): Flow<Int> {
        TODO()
    }
}
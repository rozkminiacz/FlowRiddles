package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch

object Riddle8Solution {
    /**
     * Given [source] emits value, emit that value
     * Given [source] emits [Error], emit default value
     */
    fun solve(defaultValue: Int, source: Flow<Int>): Flow<Int> {
        return source.catch {
            emit(defaultValue)
        }
    }
}
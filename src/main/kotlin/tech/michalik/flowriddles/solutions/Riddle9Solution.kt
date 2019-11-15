package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object Riddle9Solution {
    /**
     * Given [value] is null, emit [IllegalArgumentException]
     * Given [value] is not null, emit that value
     */
    fun solve(value: Int?): Flow<Int> {
        return flow {
            value?.let { emit(it) } ?: throw IllegalArgumentException()
        }
    }
}
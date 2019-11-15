package tech.michalik.flowriddles

import kotlinx.coroutines.flow.Flow

object Riddle11 {
    /**
     * For each item emitted by [source] create new flow using provided [transformation] and flatten the results.
     */
    fun solve(transformation: suspend (Int) -> Flow<String>, source: Flow<Int>): Flow<String> {
        TODO()
    }
}
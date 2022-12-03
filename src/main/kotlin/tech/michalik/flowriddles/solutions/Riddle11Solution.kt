package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flatMapLatest

object Riddle11Solution {
    /**
     * For each item emitted by [source] create new flow using provided [transformation] and flatten the results.
     */
    fun solve(transformation: suspend (Int) -> Flow<String>, source: Flow<Int>): Flow<String> {
        return source.flatMapLatest(transformation)
    }

    /* same as:
    flow {
        source.collect {
            val res = transformation(it)
            emitAll(res)
        }
    }
     */
}

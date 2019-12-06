package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.onEach

object Riddle14Solution {
    /**
     * Create flow that will delay each element emitted by [source] by 10ms
     */

    fun solve(source: Flow<Int>): Flow<Int> {
        return source.onEach {
            delay(10)
        }
    }
}
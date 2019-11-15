package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object Riddle10Solution {
    /**
     * Create Flow that will emit [n] values and then complete
     */
    fun solve(n: Int): Flow<Unit> {
        return flow {
            repeat(n) {
                emit(Unit)
            }
        }
    }
}
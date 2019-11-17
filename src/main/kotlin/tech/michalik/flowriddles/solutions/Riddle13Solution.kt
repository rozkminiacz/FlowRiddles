package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object Riddle13Solution {
    /**
     * Create flow that will emit next Int values from 0 to 20 with 20ms delay after each emission
     */
    fun solve(): Flow<Int> {
        return flow {
            repeat(21) {
                emit(it)
                delay(20)
            }
        }
    }
}
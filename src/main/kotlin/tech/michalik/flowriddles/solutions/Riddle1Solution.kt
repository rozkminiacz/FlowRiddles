package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object Riddle1Solution {
    /**
     * Transform the given [value] into an Flow that emits the value and then completes.
     *
     * Use case: You want to transform some value to the Kotlin Flow world.
     */
    fun solve(value: Int): Flow<Int> {
        return flow {
            emit(value)
        }
    }

    // same as `fun solve(value: Int): Flow<Int> = flow { emit(value) }`
}

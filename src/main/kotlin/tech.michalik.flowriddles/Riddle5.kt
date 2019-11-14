package tech.michalik.flowriddles

import kotlinx.coroutines.flow.Flow

object Riddle5 {
    /**
     * Implement toggle mechanism.
     * Initially return [initialValue],
     * then each time [source] emits value,
     * negate value previously emitted by your Flow.
     */
    fun solve(initialValue: Boolean, source: Flow<Unit>): Flow<Boolean> {
        TODO()
    }
}
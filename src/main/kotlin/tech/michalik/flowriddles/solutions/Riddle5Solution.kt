package tech.michalik.flowriddles.solutions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.scan

object Riddle5Solution {
    /**
     * Implement toggle mechanism.
     * Initially return [initialValue],
     * then each time [source] emits value,
     * negate value previously emitted by your Flow.
     */
    fun solve(initialValue: Boolean, source: Flow<Unit>): Flow<Boolean> {
        // 'scan' is an alias for 'runningFold'
        return source.scan(initial = initialValue, operation = { previousValue, _ ->
            previousValue.not()
        })
    }
}

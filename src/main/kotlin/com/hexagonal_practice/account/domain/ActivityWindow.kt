package com.hexagonal_practice.account.domain

import java.time.LocalDateTime

class ActivityWindow(
    private val activities: List<Activity>,
) {
    fun startTimestamp(): LocalDateTime? = activities.minOfOrNull { it.localDateTime }

    fun endTimestamp(): LocalDateTime? = activities.maxOfOrNull { it.localDateTime }
}

package com.hexagonal_practice.account.domain

import java.time.LocalDateTime

class ActivityWindow(
    private val activities: MutableList<Activity>,
) {
    fun addActivity(activity: Activity) {
        this.activities.add(activity)
    }

    fun getActivities(): List<Activity> = activities.toList()

    fun startTimestamp(): LocalDateTime? = activities.minOfOrNull { it.localDateTime }

    fun endTimestamp(): LocalDateTime? = activities.maxOfOrNull { it.localDateTime }
}

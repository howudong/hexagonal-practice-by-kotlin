package com.hexagonal_practice.account.domain

import java.time.LocalDateTime

class Activity(
    val id: ActivityId? = null,
    val ownerAccountId: Account.AccountId,
    val sourceAccountId: Account.AccountId,
    val targetAccountId: Account.AccountId,
    val localDateTime: LocalDateTime,
    val money: Money,
) {
    @JvmInline
    value class ActivityId(
        private val value: Long,
    )
}

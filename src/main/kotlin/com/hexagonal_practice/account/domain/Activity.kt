package com.hexagonal_practice.account.domain

import java.time.LocalDateTime

class Activity(
    private val id: ActivityId? = null,
    private val ownerAccountId: Account.AccountId,
    private val sourceAccountId: Account.AccountId,
    private val targetAccountId: Account.AccountId,
    private val localDateTime: LocalDateTime,
    private val money: Money,
) {
    @JvmInline
    value class ActivityId(
        private val value: Long,
    )
}

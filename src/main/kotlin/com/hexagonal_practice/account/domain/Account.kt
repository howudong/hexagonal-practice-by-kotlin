package com.hexagonal_practice.account.domain

import java.time.LocalDateTime

class Account(
    private val id: AccountId? = null,
    private val baselineBalance: Money? = null,
    private val activityWindow: ActivityWindow,
) {
    @JvmInline
    value class AccountId(
        private val value: Long,
    )

    fun withdraw(
        money: Money,
        targetAccountId: AccountId,
    ): Boolean {
        // 비즈니스 유효성 검사
        if (!mayWithdraw(money)) {
            return false
        }
        val withdrawal =
            Activity(
                ownerAccountId = id!!,
                sourceAccountId = id,
                targetAccountId = targetAccountId,
                localDateTime = LocalDateTime.now(),
                money = money,
            )

        this.activityWindow.addActivity(withdrawal)
        return true
    }

    private fun mayWithdraw(money: Money): Boolean {
        // todo : 비즈니스 유효성 검사
        return true
    }
}

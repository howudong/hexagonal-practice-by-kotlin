package com.hexagonal_practice.account.domain

class Account(
    private val id: AccountId? = null,
    private val baselineBalance: Money? = null,
    private val activityWindow: ActivityWindow? = null,
) {
    @JvmInline
    value class AccountId(
        private val value: Long,
    )
}

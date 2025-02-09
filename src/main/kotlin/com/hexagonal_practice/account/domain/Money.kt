package com.hexagonal_practice.account.domain

import java.math.BigInteger

@JvmInline
value class Money(
    private val amount: BigInteger,
) {
    companion object {
        fun of(value: Long) = Money(BigInteger.valueOf(value))

        fun zero() = of(0L)
    }
}

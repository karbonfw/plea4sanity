package karbonfw.p4s.domain.geographic.entity

data class Address(
        val key: AddressKey,
        val name: String,
        val street: String,
        val houseNumber: String,
        val appartmentNumber: String?,
        val zipCode: String,
        val city: String
)

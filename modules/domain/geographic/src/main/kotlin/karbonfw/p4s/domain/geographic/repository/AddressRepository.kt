package karbonfw.p4s.domain.geographic.repository

import karbonfw.p4s.domain.geographic.entity.Address
import karbonfw.p4s.domain.geographic.entity.AddressKey
import kotlinx.coroutines.flow.Flow

interface AddressRepository {

    suspend fun findAll(): Flow<Address>

    suspend fun findByKey(addressKey: AddressKey): Address?

    suspend fun save(address: Address): Address?

    suspend fun delete(addressKey: AddressKey): Address?
}

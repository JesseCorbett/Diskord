package com.jessecorbett.diskord.api.gateway.events

import com.jessecorbett.diskord.api.common.User
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class GuildMemberRemove(
    @SerialName("guild_id") val guildId: String,
    @SerialName("user") val user: User
)

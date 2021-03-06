package com.jessecorbett.diskord.api.gateway.events

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class WebhookUpdate(
    @SerialName("guild_id") val guildId: String,
    @SerialName("channel_id") val channelId: String
)

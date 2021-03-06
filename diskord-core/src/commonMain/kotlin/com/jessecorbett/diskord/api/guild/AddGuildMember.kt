package com.jessecorbett.diskord.api.guild

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class AddGuildMember(
    @SerialName("access_token") val accessToken: String,
    @SerialName("nick") val nickname: String? = null,
    @SerialName("roles") val roleIds: List<String> = emptyList(),
    @SerialName("mute") val mute: Boolean = false,
    @SerialName("deaf") val deaf: Boolean = false
)

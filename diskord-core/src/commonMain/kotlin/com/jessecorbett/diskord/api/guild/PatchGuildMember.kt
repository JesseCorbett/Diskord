package com.jessecorbett.diskord.api.guild

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class PatchGuildMember(
    @SerialName("nick") val nickname: String? = null,
    @SerialName("roles") val roleIds: List<String>? = null,
    @SerialName("mute") val mute: Boolean? = null,
    @SerialName("deaf") val deaf: Boolean? = null,
    @SerialName("channel_id") val channelId: String? = null
)

/**
 * Conceptually the same data object as [PatchGuildMember], but [channelId] has different null behavior.
 */
@Serializable
public data class PatchGuildMemberMoveVoiceChannel(
    @SerialName("channel_id") val channelId: String? = null
)

package com.jessecorbett.diskord.api.guild

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
public data class CreateTemplate(
    @SerialName("name") val name: String,
    @SerialName("description") val description: String?
)

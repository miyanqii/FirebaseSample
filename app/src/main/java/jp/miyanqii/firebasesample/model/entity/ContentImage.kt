package jp.miyanqii.firebasesample.model.entity

import org.threeten.bp.LocalDateTime

data class ContentImage(val id: String,
                        val order: Int,
                        val created: LocalDateTime,
                        val title: String,
                        val description: String,
                        val url: String)
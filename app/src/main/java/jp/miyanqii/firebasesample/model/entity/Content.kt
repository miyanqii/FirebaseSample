package jp.miyanqii.firebasesample.model.entity

import org.threeten.bp.LocalDateTime

data class Content(val id: String,
                   val order: Int,
                   val author: String,
                   val created: LocalDateTime,
                   val category: ContentCategory,
                   val title: String,
                   val description: String,
                   val images: List<ContentImage>)


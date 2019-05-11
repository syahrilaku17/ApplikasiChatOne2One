package com.example.applikasichatone2one.model

import com.example.applikasichatone2one.data.Tools


class ChatMessage(var text: String?, var timestamp: String?, var friendId: String?, var friendName: String?, var friendPhoto: String?, var senderId: String?, var senderName: String?, var senderPhoto: String?, var isRead: Boolean?) {

    val readableTime: String?
        get() {
            return try {
                Tools.formatTime(java.lang.Long.valueOf(timestamp))
            } catch (ignored: NumberFormatException) {
                null
            }

        }

    val receiver: Friend
        get() = Friend(friendId!!, friendName!!, friendPhoto!!)

    val sender: Friend
        get() = Friend(senderId!!, senderName!!, senderPhoto!!)

    val comparableTimestamp: Long
        get() = java.lang.Long.parseLong(timestamp)


}

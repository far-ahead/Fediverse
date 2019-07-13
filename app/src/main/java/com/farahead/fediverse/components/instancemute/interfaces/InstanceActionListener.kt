package com.farahead.fediverse.components.instancemute.interfaces

interface InstanceActionListener {
    fun mute(mute: Boolean, instance: String, position: Int)
}
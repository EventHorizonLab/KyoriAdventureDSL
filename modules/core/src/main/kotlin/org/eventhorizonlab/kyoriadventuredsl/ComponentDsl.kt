package org.eventhorizonlab.kyoriadventuredsl

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.TextComponent

fun textComponent(builder: TextComponent.Builder.() -> Unit) = Component.text().apply(builder).build()
package io.github.mthli.styleHandlers

import android.graphics.Typeface
import android.text.style.StyleSpan

abstract class StyleHandler {
    abstract fun getStyleSpan() : Any
}

class BoldStyleHandler : StyleHandler() {
    override fun getStyleSpan(): Any = StyleSpan(Typeface.BOLD)
}
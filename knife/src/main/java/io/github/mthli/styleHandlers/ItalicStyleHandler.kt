package io.github.mthli.styleHandlers

import android.graphics.Typeface
import android.text.style.StyleSpan

class ItalicStyleHandler : StyleHandler() {
    override fun getStyleSpan(): Any =  StyleSpan(Typeface.ITALIC)
}
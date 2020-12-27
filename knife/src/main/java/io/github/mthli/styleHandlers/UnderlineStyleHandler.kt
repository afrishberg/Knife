package io.github.mthli.styleHandlers

import android.text.style.UnderlineSpan

class UnderlineStyleHandler : StyleHandler() {
    override fun getStyleSpan(): Any =  UnderlineSpan()
}
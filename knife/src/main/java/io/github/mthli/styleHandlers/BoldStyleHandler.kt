package io.github.mthli.styleHandlers

import android.graphics.Typeface
import android.text.Spanned
import android.text.style.StyleSpan

abstract class StyleHandler {
    abstract fun getStyleSpan() : Any

    open fun getSpans(text: Spanned, startIndex: Int, endIndex: Int) : Array<Any> {
        return text.getSpans(startIndex, endIndex, getStyleSpan().javaClass)
    }
}

abstract class TypeFaceStyleHandler : StyleHandler() {
    abstract fun getTypeFace() : Int

    override fun getStyleSpan(): Any = StyleSpan(getTypeFace())

    override fun getSpans(text: Spanned, startIndex: Int, endIndex: Int): Array<Any> {
        return text.getSpans(startIndex, endIndex, StyleSpan::class.java).filter {
            it?.style == getTypeFace()
        }.toTypedArray()
    }
}

class BoldStyleHandler : TypeFaceStyleHandler() {

    override fun getTypeFace(): Int  = Typeface.BOLD
}
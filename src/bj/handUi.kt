package bj

import kotlinext.js.js
import kotlinx.html.style
import react.RBuilder
import react.dom.b
import react.dom.div

fun RBuilder.handUi() {
    div {
        attrs.style = js {
            width = "10rem"
            height = "10rem"
            padding = "1rem"
            marginTop = "1rem"
            marginRight = "1rem"
            background = "cyan"
        }
        div { b { +"Player Hand" } }
        div { b { +"cards go here" } }
        div { b { +"12 cards" } }
    }
}
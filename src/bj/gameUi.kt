package bj

import kotlinext.js.js
import kotlinx.html.style
import kotlinx.html.title
import react.RBuilder
import react.dom.div
import react.dom.h1

fun RBuilder.gameUi() {
    div {
        h1 {
            + "Blackjack"
        }
        div {
            attrs.title = "Hands" //shows title when you hover on this div
            attrs.style = js {
                display = "flex" //keeps hands side-by-side
            }

            handUi()
            handUi()
        }
    }
}
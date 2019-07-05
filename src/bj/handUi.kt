package bj

import react.RBuilder
import react.dom.b
import react.dom.div

fun RBuilder.handUi() {
    div {
        div { b { +"Player Hand" } }
        div { b { +"cards go here" } }
        div { b { +"12 cards" } }
    }
}
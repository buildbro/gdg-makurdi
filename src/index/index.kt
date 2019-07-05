package index

import react.dom.b
import react.dom.div
import react.dom.h1
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
    val rootDiv = document.getElementById("root")
    render(rootDiv) {
        div {
            h1 {
                + "Blackjack"
            }
            div {
                div {
                    div { b { + "Player Hand"} }
                    div { b { + "cards go here" } }
                    div { b { + "12 cards" } }
                }
            }
        }
    }
}

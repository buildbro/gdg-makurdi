package index

import kotlinx.html.style
import kotlinx.html.title
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
                attrs.title = "Hands" //shows title when you hover on this div
                attrs.style = kotlinext.js.js {
                    display = "flex" //keeps hands side-by-side
                }
                
                div {
                    div { b { + "Player Hand"} }
                    div { b { + "cards go here" } }
                    div { b { + "12 cards" } }
                }

                div {
                    div { b { + "Dealer Hand"} }
                    div { b { + "cards go here" } }
                    div { b { + "14 cards" } }
                }
            }
        }
    }
}

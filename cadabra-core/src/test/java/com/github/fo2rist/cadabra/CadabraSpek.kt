package com.github.fo2rist.cadabra

import org.spekframework.spek2.Spek

class CadabraSpek : Spek({
    group("construction") {
        test("can create instance") {
            val cadabra = Cadabra.instance
        }
    }
})

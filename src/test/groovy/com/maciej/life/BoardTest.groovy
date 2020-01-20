package com.maciej.life

import spock.lang.Specification

class BoardTest extends Specification {
    def "ToString"() {
        given:
            Board board = new Board(2,3)
            board.setField(0,0, true)
            board.setField(1,1,true)
            board.setField(2,1,true)
        when:
            String ret = board.toString();
        println ret
        then:
            ret == '\n#.\n.#\n.#'
    }
}

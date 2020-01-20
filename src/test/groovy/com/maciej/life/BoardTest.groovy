package com.maciej.life

import spock.lang.Specification
import spock.lang.Unroll

class BoardTest extends Specification {

    def "ToString and row height validation on non square table"() {
        given:
        Board board = new Board(2, 3)
        board.setField(0, 0, true)
        board.setField(1, 1, true)
        board.setField(2, 1, true)
        when:
        String ret = board.toString();
        println ret
        then:
        ret == '\n#.\n.#\n.#'
    }

    @Unroll
    def "calculate neighbours "() {
        given:
        Board board = new Board(2, 3)
        board.setField(0, 0, true)
        board.setField(1, 1, true)
        board.setField(2, 1, true)
        expect:
        result == board.countNeighbours(row, column)
        where:
        row | column || result
        0   | 0      || 1
        0   | 1      || 2
        2   | 0      || 2
        2   | 1      || 1
    }

}

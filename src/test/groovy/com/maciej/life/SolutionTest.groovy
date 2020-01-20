package com.maciej.life

import spock.lang.Specification

class SolutionTest extends Specification {
    def "calculate neighbours "() {
        Solution s = new Solution();
        given:
        Board board = new Board(6, 6)
        board.setField(2, 2, true)
        board.setField(2, 3, true)
        board.setField(3, 2, true)
        board.setField(3, 3, true)
        board.setField(3, 1, true)
        board.setField(2, 4, true)
        Board board2 = new Board(6, 6)
        board2.setField(1, 3, true)
        board2.setField(4, 2, true)
        board2.setField(2, 1, true)
        board2.setField(3, 1, true)
        board2.setField(2, 4, true)
        board2.setField(3, 4, true)
        when:
        println board
        def result = s.tick(board)
        println result
        then:
        result == board2

        when:
        def result2 = s.tick(result)
        println result2
        then:
        result2 == board
    }
}

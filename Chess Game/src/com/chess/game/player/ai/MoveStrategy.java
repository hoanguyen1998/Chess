package com.chess.game.player.ai;

import com.chess.game.board.Board;
import com.chess.game.board.Move;

public interface MoveStrategy {

    long getNumBoardsEvaluated();

    Move execute(Board board);

}

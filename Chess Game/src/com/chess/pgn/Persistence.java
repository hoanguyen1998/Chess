package com.chess.pgn;

import com.chess.game.board.Board;
import com.chess.game.board.Move;
import com.chess.game.player.Player;

public interface Persistence {

    void persistGame(Game game);

    Move getNextBestMove(Board board, Player player, String gameText);

}

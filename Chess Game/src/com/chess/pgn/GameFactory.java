package com.chess.pgn;

public class GameFactory {

    public static Game createGame(final GameTags tags,
                                  final String gameText,
                                  final String outcome) {
        try {
            return new ValidGame(tags, Utilities.processMoveText(gameText), outcome);
        } catch(final ParseException e) {
            return new InvalidGame(tags, gameText, outcome);
        }
    }
}
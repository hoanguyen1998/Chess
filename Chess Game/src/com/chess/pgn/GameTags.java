package com.chess.pgn;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class GameTags {

    private final Map<String,String> gameTags;

    private GameTags(final TagsBuilder builder) {
        this.gameTags = ImmutableMap.copyOf(builder.gameTags);
    }

    @Override
    public String toString() {
        return this.gameTags.toString();
    }

    public static class TagsBuilder {

        final Map<String,String> gameTags;

        public TagsBuilder() {
            this.gameTags = new HashMap<>();
        }

        public TagsBuilder addTag(final String tagKey,
                                  final String tagValue) {
            this.gameTags.put(tagKey, tagValue);
            return this;
        }

        public GameTags build() {
            return new GameTags(this);
        }

    }

}

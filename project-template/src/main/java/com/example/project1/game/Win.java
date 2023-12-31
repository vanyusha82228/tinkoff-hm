package com.example.project1.game;

import com.example.project1.game.GuessResult;
import org.jetbrains.annotations.NotNull;

public record Win(char[] state, int attempt, int maxAttempts, String message) implements GuessResult {
    @Override
    public char[] state() {
        return state;
    }

    @Override
    public int attempt() {
        return attempt;
    }

    @Override
    public int maxAttempts() {
        return maxAttempts;
    }

    @Override
    public @NotNull String message() {
        return message;
    }
}

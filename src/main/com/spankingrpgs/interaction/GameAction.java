package com.spankingrpgs.interaction;

import com.spankingrpgs.model.GameState;

/**
 * A GameAction is any action performed that requires nothing but the game's current state, typically in response to
 * input from the player.
 */
public interface GameAction {

    /**
     * Do the action.
     *
     * @param gameGameState  The game's current state.
     */
    void act(GameState gameGameState);
}

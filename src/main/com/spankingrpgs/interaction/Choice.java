package com.spankingrpgs.interaction;

/**
 * A interaction is an action the player can select, along with the response to that action. This class is immutable.
 */
public class Choice {

    private final String actionDescription;
    private final GameAction action;

    /**
     * Constructor.
     *
     * @param actionDescription  The text displayed to the user describing this action. For example, this may be a line
     * of dialogue in a conversation.
     * @param action  The action to perform if the player makes this interaction.
     */
    public Choice(String actionDescription, GameAction action) {
        this.actionDescription = actionDescription;
        this.action = action;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public GameAction getAction() {
        return action;
    }

    @Override
    public String toString() {
        return actionDescription;
    }
}

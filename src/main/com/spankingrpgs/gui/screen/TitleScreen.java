package com.spankingrpgs.gui.screen;

import javax.swing.*;

/**
 * Describes the layout of the title screen of the game.
 */
public class TitleScreen {
    private JPanel canvas;
    private JLabel title;
    private JPanel commands;
    private JButton startGame;
    private JButton loadGame;
    private JButton thanks;
    private JButton exit;

    /**
     *  Sets the title of the game.
     * @param title  The desired title
     */
    public void setTitle(String title) {
       this.title.setText(title);
    }
}

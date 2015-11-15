package com.spankingrpgs.gui.screen;

import javax.swing.*;

/**
 * Created by andrewRussell on 11/15/2015.
 */
public class DungeonScreen {
    private JPanel canvas;
    private JPanel commands;
    private JPanel optionsExit;
    private JButton options;
    private JButton exit;
    private JPanel saveLoad;
    private JButton save;
    private JButton load;
    private JLabel title;
    private JPanel leftCharacterBar;
    private JPanel character1;
    private JButton character1Name;
    private JLabel energy;
    private JPanel rightCharacterBar;
    /**
     * The dungeon view is laid out as nested BorderLayouts, giving us quintents:
     * topQuintant
     * leftQuintant
     * rightQuintant
     * bottomQuintant
     * centerQuintant
     *
     * Where each region in each quintent corresponds to a dungeon square. This allows us to see at most 25 x 25
     * squares at any given time.
     */
    private JPanel dungeonView;
    private JPanel topQuinant;
    private JPanel leftQuintant;
    private JPanel rightQuinant;
    private JPanel bottomQuintant;
    private JPanel centerQuintant;
}

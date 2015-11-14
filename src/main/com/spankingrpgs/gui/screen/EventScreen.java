package com.spankingrpgs.gui.screen;

import com.spankingrpgs.interaction.Choice;

import javax.swing.*;
import javax.swing.text.Document;
import java.util.List;

/**
 * Defines the layout of the event window.
 */
public class EventScreen {
    private JPanel canvas;
    private JTextPane page;
    private JScrollPane pageWindow;
    private JPanel commands;
    private JComboBox<Choice> choiceInput;
    private JLabel title;
    private JPanel choiceCommand;
    private JLabel choiceInstructions;
    private JButton options;
    private JButton save;
    private JButton load;
    private JButton exit;
    private JPanel optionsExit;
    private JPanel saveLoad;
    private JButton confirmChoice;

    /**
     * Sets the title of the event, displayed at the top of the screen.
     *
     * @param titleString  The title for the event.
     */
    public void setTitle(String titleString) {
        title.setText(titleString);
    }

    /**
     * Displays the text represented by the passed in document.
     *
     * @param document  The document to be displayed.
     */
    public void displayText(Document document) {
        page.setDocument(document);
    }

    public void setChoices(List<Choice> choices) {
        choices.stream().forEach(choiceInput::addItem);
    }
}


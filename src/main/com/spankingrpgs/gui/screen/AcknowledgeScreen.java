package com.spankingrpgs.gui.screen;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Responsible for displaying text that does not require any user input except an acknowledgment. The only part of
 * the screen that is interactive is a button (with shortcut the Enter key) that the user presses to acknowledge the
 * dsiplayed text.
 */
public class AcknowledgeScreen {
    private JPanel canvas;
    private JLabel title;
    private JScrollPane textScrollField;
    private JTextPane page;
    private JButton acknowledge;

    public void setTitle(String newTitle) {
        title.setText(newTitle);
    }

    public void displayText(Document newText) {
        page.setDocument(newText);
    }

    /**
     * Adds a listener to listen for when the player acknowledges.
     *
     * @param listener  The listener to be registered
     */
    public void registerListener(ActionListener listener) {
        acknowledge.addActionListener(listener);
    }

    /**
     * Removes all listeners from this screen.
     */
    public void removeAllListeners() {
        Arrays.stream(acknowledge.getActionListeners()).forEach(this::removeListener);
    }

    /**
     * Removes the specified listener.
     *
     * @param listener  The listener to be removed.
     */
    public void removeListener(ActionListener listener) {
        acknowledge.removeActionListener(listener);
    }

    /**
     * Replaces all listeners currently registered with the new listener.
     * <p>
     * This method is syntactic sugar for:
     * removeAllListeners();
     * registerListener(listener)
     *
     * @param listener  The listener to replace all others.
     */
    public void replaceAllListeners(ActionListener listener) {
        removeAllListeners();
        registerListener(listener);
    }

    /**
     * Replaces a listener.
     *
     * @param oldListener  The listener to be replaced
     * @param newListener  The listener to replace the old
     */
    public void replaceListener(ActionListener oldListener, ActionListener newListener) {
        acknowledge.removeActionListener(oldListener);
        acknowledge.addActionListener(newListener);
    }
}

/*
 * CrimsonGlow is an adult computer roleplaying game with spanking content.
 * Copyright (C) 2015 Andrew Russell
 *
 *      This program is free software: you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation, either version 3 of the License, or
 *      (at your option) any later version.
 *
 *      This program is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.
 *
 *      You should have received a copy of the GNU General Public License
 *      along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.spankingrpgs.model.characters;

import javafx.beans.DefaultProperty;

/**
 * Statistics are values that control how good a character is at doing things (fighting, convincing others to do
 * something, etc). All statistics need to be able to provide an integer representation of their value, and need to
 * be able to increment and decrement them
 */
public interface Statistic {

    /**
     * Returns the value of the statistic.
     *
     * @return The value of the statistic.
     */
    int getValue();

    /**
     * Increment the statistic by the specified amount.
     *
     * @param amount  The amount to increment the statistic by
     */
    void increment(int amount);

    /**
     * Increment the statistic by one.
     */
    default void increment() {
        increment(1);
    }

    /**
     * Decrement the statistic by the specified amount.
     *
     * @param amount  The amount to decrement the statistic by
     */
    void decrement(int amount);

    /**
     * Decrement the statistic by one.
     */
    default void decrement() {
        decrement(1);
    }
}

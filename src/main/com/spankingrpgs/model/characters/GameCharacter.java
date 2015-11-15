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

import java.util.Collections;
import java.util.Set;

/**
Models the characters that appear in the game.
 */
public class GameCharacter {

    private final String name;
    private final Set<Statistic> primaryStatistics;
    private final Set<Statistic> secondaryStatistics;
    private final Appearance appearance;

    /**
     * Constructor.
     *
     * @param name  The name of the character
     * @param primaryStatistics  The primary statistics of the character
     * @param secondaryStatistics  The secondary statistics of the character
     * @param appearance  The character's appearance
     */
    public GameCharacter(
            String name,
            Set<Statistic> primaryStatistics,
            Set<Statistic> secondaryStatistics,
            Appearance appearance
    ) {
        this.name = name;
        this.primaryStatistics = primaryStatistics;
        this.secondaryStatistics = secondaryStatistics;
        this.appearance = appearance;
    }

    /**
     * Constructor.
     * Defaults secondaryStatistics to the empty set.
     *
     * @param name  The name of the character
     * @param primaryStatistics  The characters primary statistics
     * @param appearance  The character's appearance
     */
    public GameCharacter(String name, Set<Statistic> primaryStatistics, Appearance appearance) {
        this(name, primaryStatistics, Collections.emptySet(), appearance);
    }
}

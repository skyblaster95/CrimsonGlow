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
package com.spankingrpgs.crimsonglow;

import com.spankingrpgs.model.characters.AppearanceElement;
import com.spankingrpgs.util.ListUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Enumerates the hair colors available to characters.
 */
public enum HairColor implements AppearanceElement {
    BLONDE("blonde", "golden", "light"),
    BROWN("brown", "dark"),
    RED("red", "fiery"),
    BLACK("black", "dark", "raven");

    private List<String> adjectives;

    private final Random generator;

    HairColor(String... adjectives) {
        this.adjectives = Arrays.asList(adjectives);
        generator = new Random();
    }

    @Override
    public String getLowerCaseName() {
        return name().toLowerCase();
    }

    @Override
    public String generateAdjective() {
        return ListUtils.choice(adjectives);
    }
}

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

/**
 * Enumeration of possible eye color.
 */
public enum EyeColor implements AppearanceElement {
    BLUE("blue"),
    BROWN("brown"),
    GREEN("green"),
    HAZEL("hazel"),
    GREY("grey");

    private final List<String> adjectives;

    EyeColor(String... adjectives) {
        this.adjectives = Arrays.asList(adjectives);
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

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

/**
 * AppearanceElement are units of appearance. They may be things like skin color, hair color, body type, body
 * height, etc. Anything that defines what a character looks like.
 */
public interface AppearanceElement {

    /**
     * Returns the name in all lower case.
     *
     * @return The name in all lower case.
     */
    String getLowerCaseName();

    /**
     * Returns the name with the first letter capitalized.
     *
     * @return The name with the first letter capitalized
     */
    default String getCapitalizedName() {
        String lowerCasName = getLowerCaseName();
        return Character.toUpperCase(lowerCasName.charAt(0)) + lowerCasName.substring(1);
    }

    /**
     * Returns an adjective based on this element, for use in game text.
     *
     * @return An adjective based on this element
     */
    String generateAdjective();

}

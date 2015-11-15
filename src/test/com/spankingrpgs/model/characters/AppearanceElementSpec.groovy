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
package com.spankingrpgs.model.characters

import spock.lang.Specification
import spock.lang.Unroll

class AppearanceElementSpec extends Specification {

    @Unroll
    def "The capitalized form of #name is #expected"() {
        given: "An appearance element object"
        AppearanceElement element = new AppearanceElement() {
            @Override
            String getLowerCaseName() {
                return "test"
            }

            @Override
            String generateAdjective() {
                return null
            }
        }

        expect: "getCapitalizedName returns the expected"
        element.getCapitalizedName() == "Test"
    }
}

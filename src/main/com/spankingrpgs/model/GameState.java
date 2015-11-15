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
package com.spankingrpgs.model;

import com.spankingrpgs.model.characters.GameCharacter;
import com.spankingrpgs.model.location.Dungeon;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Map;
import java.util.Set;

/**
 * Encapsulates the game's state. This is a singleton.
 */
public class GameState {

    private static GameState instance;
    private final Map<String, GameCharacter> characters;
    private final GameCharacter playerCharacter;
    private final Set<String> keywords;
    private Dungeon dungeon;

    private GameState(
            GameCharacter playerCharacter,
            Map<String, GameCharacter> characters,
            Set<String> keywords,
            Dungeon dungeon
    ) {
        this.playerCharacter = playerCharacter;
        this.characters = characters;
        this.keywords = keywords;
        this.dungeon = dungeon;
    }

    /**
     * Constructs the game state.
     *
     * @param playerCharacter The player character.
     * @param characters  The initial list of characters (may be empty)
     * @param keywords  The initial list of keywords the player has accumulated (may be empty)
     * @param dungeon   The initial dungeon
     */
    public static void createInstance(
            GameCharacter playerCharacter,
            Map<String, GameCharacter> characters,
            Set<String> keywords,
            Dungeon dungeon
    ) {
        if (instance != null) {
            throw new IllegalStateException("Tried to initialize a state that is already initialized.");
        } else {
            instance = new GameState(playerCharacter, characters, keywords, dungeon);
        }
    }

    /**
     *  Get the game state.
     *
     * @return The game state.
     * @throws IllegalStateException If the game state has not yet been initialized.
     */
    public static GameState getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Tried to get game state before it was initialized. Run createInstance" +
                    " first.");
        }
        return instance;
    }

    public void addCharacter(GameCharacter character) {
        throw new NotImplementedException();
    }

    public GameCharacter getNonPlayerCharacter(String characterName) {
        throw new NotImplementedException();
    }

    public GameCharacter getPlayerCharacter() {
        return playerCharacter;
    }

    public void addKeyword(String keyword) {
        keywords.add(keyword);
    }

    public void removeKeyword(String keyword) {
        keywords.remove(keyword);
    }

    public void setDungeon(Dungeon dungeon) {
        this.dungeon = dungeon;
    }

    /**
     * Saves state to the specified file.
     *
     * @param fileName The name of the file to save the game to
     */
    public void save(String fileName) {
        throw new NotImplementedException();
    }

    /**
     * Loads the state specified in the file.
     *
     * @param fileName  The name of the file to load the game from
     */
    public void load(String fileName) {
        throw new NotImplementedException();
    }

}

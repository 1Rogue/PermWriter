/*
 * Copyright (C) 2013 Spencer Alderman
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.rogue.permwriter.gui;

import com.rogue.permwriter.PermWriter;

/**
 * Manages the GUI for the project
 *
 * @since 1.0.0
 * @author 1Rogue
 * @version 1.0.0
 */
public class GUIManager {
    
    private PermWriter project;
    private PWWindow window;
    
    /**
     * Initializes the GUI Manager. Use GUIManager.start() to create the window
     * 
     * @since 1.0.0
     * @version 1.0.0
     * 
     * @param project The {@link PermWriter} instance
     */
    public GUIManager(PermWriter project) {
        this.project = project;
    }
    
    /**
     * Builds the GUI window.
     * 
     * @since 1.0.0
     * @version 1.0.0
     */
    public void init() {
        this.window = new PWWindow(this.project);
    }
    
    /**
     * Gets the main GUI window
     * 
     * @since 1.0.0
     * @version 1.0.0
     * 
     * @return The {@link PWWindow} in use
     */
    public PWWindow getWindow() {
        return this.window;
    }

}

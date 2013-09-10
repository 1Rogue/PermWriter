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
package com.rogue.permwriter;

/**
 * Initial starting class, used for getting the command arguments
 * 
 * @version 1.0.0
 * @author 1Rogue
 * @since 1.0.0
 */
public class Start {
    
    protected static PermWriter instance;

    /**
     * Main method for starting.
     * 
     * Arguments:
     *  -nogui      : Disables the GUI interface
     * 
     * @since 1.0.0
     * @version 1.0.0
     * 
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args[0].equalsIgnoreCase("-nogui")) {
                instance = new PermWriter(false);
                return;
            }
        }
        instance = new PermWriter(true);
    }
    
}

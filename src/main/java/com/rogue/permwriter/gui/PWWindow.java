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
import java.awt.GridBagLayout;
import javax.swing.JFrame;

/**
 * An instantiable GUI window for {@link SimpleProject}
 *
 * @since 1.0.0
 * @author 1Rogue
 * @version 1.0.0
 */
public class PWWindow extends JFrame {

    private PermWriter project;

    /**
     * Initializes the GUI window
     *
     * @since 1.0.0
     * @version 1.0.0
     *
     * @param project The {@link SimpleProject} instance
     */
    public PWWindow(PermWriter project) {
        this.project = project;
        this.setTitle("SimpleProject");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new GridBagLayout());
        this.setSize(750, 475);
    }
}

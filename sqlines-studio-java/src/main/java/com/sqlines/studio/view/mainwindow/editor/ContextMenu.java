/*
 * Copyright (c) 2021 SQLines
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sqlines.studio.view.mainwindow.editor;

import org.jetbrains.annotations.NotNull;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

/**
 * A popup control that appears when you right-click on the {@link CodeEditor}.
 * <p>
 * Contains the following menu items:
 * <li>Undo
 * <li>Redo
 * <li>Select All
 * <li>Cut
 * <li>Copy
 * <li>Paste
 *
 * @apiNote Initially, all menu items are active.
 */
class ContextMenu extends javafx.scene.control.ContextMenu {
    private final MenuItem undoMenuItem = new MenuItem();
    private final MenuItem redoMenuItem = new MenuItem();
    private final MenuItem selectAllMenuItem = new MenuItem();
    private final MenuItem cutMenuItem = new MenuItem();
    private final MenuItem copyMenuItem = new MenuItem();
    private final MenuItem pasteMenuItem = new MenuItem();

    public ContextMenu() {
        undoMenuItem.setText("Undo");
        redoMenuItem.setText("Redo");
        selectAllMenuItem.setText("Select All");
        cutMenuItem.setText("Cut");
        copyMenuItem.setText("Copy");
        pasteMenuItem.setText("Paste");

        getItems().addAll(undoMenuItem, redoMenuItem);
        getItems().add(new SeparatorMenuItem());
        getItems().addAll(selectAllMenuItem, cutMenuItem, copyMenuItem, pasteMenuItem);
    }

    /**
     * Defines the state of the Undo menu item.
     *
     * @param isEnabled makes the menu item enabled if true, disabled otherwise
     */
    public void setUndoState(boolean isEnabled) {
        undoMenuItem.setDisable(!isEnabled);
    }

    /**
     * Defines the state of the Redo menu item.
     *
     * @param isEnabled makes the menu item enabled if true, disabled otherwise
     */
    public void setRedoState(boolean isEnabled) {
        redoMenuItem.setDisable(!isEnabled);
    }

    /**
     * Sets the action which is invoked when the Undo menu item is clicked.
     *
     * @param action the action to register
     */
    public void setOnUndoAction(@NotNull EventHandler<ActionEvent> action) {
        undoMenuItem.setOnAction(action);
    }

    /**
     * Sets the action which is invoked when the Redo menu item is clicked.
     *
     * @param action the action to register
     */
    public void setOnRedoAction(@NotNull EventHandler<ActionEvent> action) {
        redoMenuItem.setOnAction(action);
    }

    /**
     * Sets the action which is invoked when the Select All menu item is clicked.
     *
     * @param action the action to register
     */
    public void setOnSelectAllAction(@NotNull EventHandler<ActionEvent> action) {
        selectAllMenuItem.setOnAction(action);
    }

    /**
     * Sets the action which is invoked when the Cut menu item is clicked.
     *
     * @param action the action to register
     */
    public void setOnCutAction(@NotNull EventHandler<ActionEvent> action) {
        cutMenuItem.setOnAction(action);
    }

    /**
     * Sets the action which is invoked when the Copy menu item is clicked.
     *
     * @param action the action to register
     */
    public void setOnCopyAction(@NotNull EventHandler<ActionEvent> action) {
        copyMenuItem.setOnAction(action);
    }

    /**
     * Sets the action which is invoked when the Paste menu item is clicked.
     *
     * @param action the action to register
     */
    public void setOnPasteAction(@NotNull EventHandler<ActionEvent> action) {
        pasteMenuItem.setOnAction(action);
    }
}

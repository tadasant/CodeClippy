/*
 * Copyright (c) 2017 SolutionLoft.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.solutionloft.codeclippy.controller;

import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainWindowFactory implements ToolWindowFactory, DumbAware {

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);
        Content content = toolWindow.getContentManager().getFactory().createContent(view, "", false);
        toolWindow.getContentManager().addContent(content);

//        browser.loadHTML(this.getHtmlEntryPoint());
        browser.loadHTML("<html><body><h1>Hello World!</h1></body></html>");
    }

    private String getHtmlEntryPoint() {
        InputStream resourceAsStream = this.getClass().getResourceAsStream("/ui-build/index.html");
        String html = null;
        try (BufferedReader urlReader = new BufferedReader(new InputStreamReader(resourceAsStream))) {
            StringBuilder builder = new StringBuilder();
            String row;
            while ((row = urlReader.readLine()) != null) {
                builder.append(row);
            }
            html = builder.toString();
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
        return html;
    }
}
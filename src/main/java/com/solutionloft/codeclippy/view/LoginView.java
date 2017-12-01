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

package com.solutionloft.pyclippy.view;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LoginView extends JPanel {
    public LoginView() {
        super();
        add(loginPanel);
    }

    private JPanel loginPanel;
    private JPanel fieldPanel;
    private JPanel valuePanel;
    private JPanel submitPanel;
    private JPasswordField passwordField;
    private JTextField usernameField;
    private JButton submitButton;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
}

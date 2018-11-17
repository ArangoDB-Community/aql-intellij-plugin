/*
 * Copyright 2018 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.machak.aql.file;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

import static com.machak.aql.file.AqlLanguage.*;

public class AqlFileType extends LanguageFileType {
    public static final AqlFileType INSTANCE = new AqlFileType();

    public static final Icon ICON = IconLoader.getIcon("/com/machak/aql/icons/aql-small.png");

    private AqlFileType() {
        super(AQL_LANGUAGE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Simple file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "AQL language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "aql";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ICON;
    }
}


/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nwagu.contacts.widget;

import android.view.MenuItem;
import android.view.View;

/**
 * An adapter for the contextual menu.
 */
public interface ContextMenuAdapter extends View.OnCreateContextMenuListener {

    /**
     * See {@link android.app.Activity#onContextItemSelected}.
     */
    boolean onContextItemSelected(MenuItem item);
}

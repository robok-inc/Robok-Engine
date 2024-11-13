/*
 * Copyright (C) 2008 The Android Open Source Project
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

package org.robok.engine.core.components.utils;

import static android.os.Build.VERSION_CODES;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;

public final class Utilities {

  @ChecksSdkIntAtLeast(api = VERSION_CODES.S)
  public static final boolean ATLEAST_S = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S;
}
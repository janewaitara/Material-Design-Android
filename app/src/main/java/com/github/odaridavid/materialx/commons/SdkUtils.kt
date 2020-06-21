/**
 *
 * Copyright 2020 David Odari
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *            http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 **/
package com.github.odaridavid.materialx.commons

import android.os.Build
import android.os.Build.VERSION.SDK_INT
import androidx.annotation.IntRange


internal fun versionFrom(
    @IntRange(
        from = Build.VERSION_CODES.BASE_1_1.toLong(),
        to = Build.VERSION_CODES.Q.toLong()
    ) version: Int
): Boolean = SDK_INT >= version
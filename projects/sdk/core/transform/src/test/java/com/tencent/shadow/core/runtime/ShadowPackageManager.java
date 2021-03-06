/*
 * Tencent is pleased to support the open source community by making Tencent Shadow available.
 * Copyright (C) 2019 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *     https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.tencent.shadow.core.runtime;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;


/**
 * 将插件中的PackageManager部分方法转调到本类上来，以达到修改PackageManager的行为
 */
public class ShadowPackageManager {


    public static ApplicationInfo getApplicationInfo(ClassLoader classLoader, PackageManager packageManager, String packageName, int flags) {
        return null;
    }


    public static ActivityInfo getActivityInfo(ClassLoader classLoader, PackageManager packageManager, ComponentName component, int flags) {
        return null;
    }


    public static PackageInfo getPackageInfo(ClassLoader classLoader, PackageManager packageManager, String packageName, int flags) {
        return null;
    }


    public static ProviderInfo resolveContentProvider(ClassLoader classLoader, PackageManager packageManager, String name, int flags) {

        return null;
    }


}

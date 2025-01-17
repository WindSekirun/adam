/*
 * Copyright (C) 2019 Anton Malinskiy
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
rootProject.name = "adm"
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}
include(":adam")
include(":transport-ktor")
include(":android-junit4")
include(":android-junit4-test-annotation-producer")
include(":android-testrunner-contract")
include(":server:server-stub")
include(":server:server-stub-junit4")
include(":server:server-stub-junit5")

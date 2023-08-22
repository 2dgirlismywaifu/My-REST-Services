/*
 * Copyright By @2dgirlismywaifu (2023)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.notelysia.restservices.legacykeygen.model.officekey;

public class Office97 {
    String XXXXKey = new XXXXKey().generateOffice97Key();
    String XXXXXXXKey = new XXXXXXXKey().generateKey();
    String office97Key = XXXXKey + "-" + XXXXXXXKey;

    public String getOffice97Key() {
        return office97Key;
    }
    
}
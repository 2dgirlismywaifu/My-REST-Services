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

import lombok.Getter;

public class Office95 {
    String XXXKey = new XXXKey().generateOffice95Key();
    String XXXXXXXKey = new XXXXXXXKey().generateKey();
    @Getter
    String office95Key = XXXKey + "-" + XXXXXXXKey;

}

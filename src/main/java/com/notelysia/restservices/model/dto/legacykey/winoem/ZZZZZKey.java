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

package com.notelysia.restservices.model.dto.legacykey.winoem;

import java.util.Random;

public class ZZZZZKey {
  // Generate random number with 5 digits
  public String generateKey() {
    Random rnd = new Random();
    int number = rnd.nextInt(99999) + 1;
    return String.format("%05d", number);
  }
}

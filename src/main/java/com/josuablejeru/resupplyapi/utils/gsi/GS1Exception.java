package com.josuablejeru.resupplyapi.utils.gsi;

/**
 * A custom exception class to differentiate exceptions raised by the utility
 * class from other sources of error.
 *
 * @author Copyright (c) 2019-2021 GS1 AISBL.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * <p>
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class GS1Exception extends Exception {

    static final long serialVersionUID = 1L;

    public GS1Exception(String message) {
        super(message);
    }

}
/*
 * Copyright 2017-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.mapping.actions;

/**
 * Presentation of a single mapping action.
 */
public interface MappingAction {

    /**
     * Represents the type of mapping action.
     */
    enum Type {

        /**
         * Signifies that the traffic requires no action.
         */
        NO_ACTION,

        /**
         * Signifies that the traffic requires native forwarding.
         */
        NATIVE_FORWARD,

        /**
         * Signifies that the traffic requires forwarding with mapping information.
         */
        FORWARD,

        /**
         * Signifies that the traffic should be dropped.
         */
        DROP
    }

    /**
     * Returns the type of mapping action.
     *
     * @return type of mapping action
     */
    Type type();
}

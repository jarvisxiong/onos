/*
 * Copyright 2015-present Open Networking Laboratory
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
package org.onosproject.net.behaviour;

import com.google.common.annotations.Beta;

import java.util.Set;

import org.onlab.packet.MplsLabel;
import org.onosproject.net.PortNumber;
import org.onosproject.net.driver.HandlerBehaviour;

/**
 * A HandlerBehaviour to check the capability of MPLS.
 */
@Beta
public interface MplsQuery extends HandlerBehaviour {

    /**
     * Returns set of MplsLabels which can be used at the port.
     *
     * @param port to be checked for the available resources.
     * @return Set of MplsLabels which can be used at the port.
     */
    Set<MplsLabel> queryMplsLabels(PortNumber port);

}
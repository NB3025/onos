/*
 * Copyright 2017-present Open Networking Foundation
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

package org.onosproject.net.pi.runtime;

import com.google.common.annotations.Beta;
import org.onlab.util.Identifier;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Identifier of an action of a match+action table in a protocol-independent pipeline.
 */
@Beta
public final class PiActionId extends Identifier<String> {

    /**
     * Creates an action identifier.
     *
     * @param name action name
     */
    private PiActionId(String name) {
        super(name);
    }

    /**
     * Returns the name of the action.
     *
     * @return action name
     */
    public String name() {
        return this.identifier;
    }

    /**
     * Returns an action identifier with the given name.
     *
     * @param name action name
     * @return action identifier
     */
    public static PiActionId of(String name) {
        checkNotNull(name);
        checkArgument(!name.isEmpty(), "Name can't be empty");
        return new PiActionId(name);
    }
}

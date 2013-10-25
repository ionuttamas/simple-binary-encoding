/*
 * Copyright 2013 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.sbe.generation.java;

/**
 * Interface for repeating groups
 */
public interface GroupFlyweight
{
    /**
     * Reset the flyweight to begin decoding from the current position
     */
    void resetForDecode();

    /**
     * Reset the flyweight to begin encoding for the current position for size of repeat count.
     *
     * @param size of the the times the groups will repeat.
     */
    void resetForEncode(final int size);

    /**
     * Get the number of times the group repeats.
     *
     * @return the number of times the group repeats.
     */
    int size();

    /**
     * Advance the group forward to next element. The cursor initially starts at -1.
     *
     * @return true is the advance succeeds due to sufficient space.
     */
    boolean next();
}

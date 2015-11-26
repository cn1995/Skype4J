/*
 * Copyright 2015 Sam Sun <me@samczsun.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.samczsun.skype4j.events.error;

/**
 * Represents an error which cannot be recovered from.
 * This event should be handled accordingly.
 */
public class MajorErrorEvent extends ErrorEvent {
    private Throwable error;
    private ErrorSource source;

    public MajorErrorEvent(ErrorSource source) {
        this(source, null);
    }

    public MajorErrorEvent(ErrorSource source, Throwable error) {
        this.source = source;
        this.error = error;
    }

    public Throwable getError() {
        return this.error;
    }

    public ErrorSource getSource() {
        return this.source;
    }

    public enum ErrorSource {
        POLLING_SKYPE,
        SESSION_KEEPALIVE,
        SESSION_ACTIVE,
        THREAD_POOL_DEAD
    }
}

/*
 * Copyright 2017 original authors
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
package org.particleframework.web.router.exceptions;

import org.particleframework.core.type.Argument;

/**
 * An exception thrown when the an {@link org.particleframework.core.type.Argument} to a {@link org.particleframework.web.router.Route} cannot be satisfied
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public class UnsatisfiedRouteException extends RoutingException {
    private final Argument<?> argument;
    public UnsatisfiedRouteException(Argument<?> argument) {
        super(buildMessage(argument));
        this.argument = argument;
    }

    /**
     * @return The argument
     */
    public Argument<?> getArgument() {
        return argument;
    }

    private static String buildMessage(Argument<?> argument) {
        return "Required argument [" + argument + "] not specified";
    }
}

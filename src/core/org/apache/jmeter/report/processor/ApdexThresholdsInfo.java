/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.apache.jmeter.report.processor;

/**
 * The class ApdexThresholdsInfo provides a container for APDEX threshold
 * information.
 *
 * @since 2.14
 */
public class ApdexThresholdsInfo {
    private long satisfiedThreshold;
    private long toleratedThreshold;

    /**
     * Gets the satisfied users threshold (T).
     *
     * @return the satisfied threshold
     */
    public final long getSatisfiedThreshold() {
        return satisfiedThreshold;
    }

    /**
     * Sets the satisfied users threshold (T).
     *
     * @param satisfiedThreshold
     *            the satisfied threshold to set
     */
    public final void setSatisfiedThreshold(long satisfiedThreshold) {
        this.satisfiedThreshold = satisfiedThreshold;
    }

    /**
     * Gets the tolerated threshold (F).
     *
     * @return the tolerated threshold
     */
    public final long getToleratedThreshold() {
        return toleratedThreshold;
    }

    /**
     * Sets the tolerated threshold (F).
     *
     * @param toleratedThreshold
     *            the tolerated threshold to set
     */
    public final void setToleratedThreshold(long toleratedThreshold) {
        this.toleratedThreshold = toleratedThreshold;
    }
}

/*
 * Copyright 2012 Stormpath, Inc.
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
package com.stormpath.sdk.tenant.impl;

import com.stormpath.sdk.ds.DataStore;
import com.stormpath.sdk.resource.impl.AbstractResource;
import com.stormpath.sdk.tenant.Tenant;

import java.util.Map;

/**
 * @since 0.1
 */
public class DefaultTenant extends AbstractResource implements Tenant {

    private static final String NAME = "name";
    private static final String KEY = "key";

    public DefaultTenant(DataStore dataStore) {
        super(dataStore);
    }

    public DefaultTenant(DataStore dataStore, Map<String,Object> properties) {
        super(dataStore, properties);
    }

    @Override
    public String getName() {
        return getStringProperty(NAME);
    }

    @Override
    public String getKey() {
        return getStringProperty(KEY);
    }
}
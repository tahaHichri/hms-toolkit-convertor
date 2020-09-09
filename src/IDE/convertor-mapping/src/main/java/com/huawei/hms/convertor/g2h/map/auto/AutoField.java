/*
 * Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.hms.convertor.g2h.map.auto;

import com.huawei.hms.convertor.g2h.map.desc.Desc;

import com.google.gson.annotations.Expose;

/**
 * field that support automatic convert
 *
 * @since 2020-07-06
 */
public class AutoField {
    @Expose
    private String oldFieldName;

    @Expose
    private String newFieldName;

    @Expose
    private Desc desc;

    public AutoField(String oldClassName, String newClassName, Desc desc) {
        oldFieldName = oldClassName;
        newFieldName = newClassName;
        this.desc = desc;
    }

    public Desc getDesc() {
        return desc;
    }

}

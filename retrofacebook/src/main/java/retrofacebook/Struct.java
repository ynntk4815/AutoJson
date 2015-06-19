/*
 * Copyright (C) 2015 8tory, Inc.
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
package retrofacebook;

import auto.json.AutoJson;
import android.support.annotation.Nullable;
import com.bluelinelabs.logansquare.typeconverters.*;

/**
 * <pre>
 * Struct {
 *   id: numeric string,
 *   post_id: string,
 * }
 * </pre>
 */
@AutoJson
public abstract class Struct {
    @Nullable
    @AutoJson.Field
    public abstract String id();
    @Nullable
    @AutoJson.Field(name = "post_id")
    public abstract String postId();
    @Nullable
    @AutoJson.Field
    public abstract boolean success();
}

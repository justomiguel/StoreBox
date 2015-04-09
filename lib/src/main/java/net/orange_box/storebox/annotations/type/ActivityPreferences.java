/*
 * Copyright 2015 Martin Bella
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

package net.orange_box.storebox.annotations.type;

import net.orange_box.storebox.enums.PreferencesMode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation which should be used at interface-level to define that the
 * preferences private to the Activity should be used.
 * 
 * When this annotation is used an {@link android.app.Activity} context needs
 * to be passed in when instantiating the interface using
 * {@link net.orange_box.storebox.StoreBox}.
 * 
 * @see net.orange_box.storebox.enums.PreferencesType#ACTIVITY
 * @see android.app.Activity#getPreferences(int)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ActivityPreferences {
    
    PreferencesMode mode() default PreferencesMode.MODE_PRIVATE;
}

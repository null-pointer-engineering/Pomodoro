/*
 * Copyright (c) 2013 Efstratios Xakoustos.
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

package com.nullpointerengineering.android.pomodoro.persistence;

/**
 * Created with IntelliJ IDEA.
 * User: Stratos
 * Date: 01/07/13
 * Time: 5:22 PM
 * To change this template use File | Settings | File Templates.
 */
public interface TaskRepository {
    Task createTask(String title, int priority, int estimate);

    Task findTaskById(long id);

    void saveTask(Task task);

    int deleteTask(long id);
}

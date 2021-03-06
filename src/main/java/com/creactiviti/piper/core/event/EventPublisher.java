/*
 * Copyright 2016-2018 the original author or authors.
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
package com.creactiviti.piper.core.event;

/**
 * 
 * @author Arik Cohen
 * @since Jun 4, 2017
 */
public interface EventPublisher {

  /**
   * Notify all <strong>matching</strong> listeners registered with this
   * application of an application event. 
   * @param event the event to publish
   */
  void publishEvent (PiperEvent event);
  
}

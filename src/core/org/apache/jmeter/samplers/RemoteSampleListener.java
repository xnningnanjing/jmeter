// $Header$
/*
 * Copyright 2001-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
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

package org.apache.jmeter.samplers;

import java.rmi.RemoteException;

/**
 * Allows notification on events occuring during the sampling process.
 * Specifically, when sampling is started,
 * when a specific sample is obtained,
 * and when sampling is stopped.
 * 
 * @version $Revision$
 */
public interface RemoteSampleListener extends java.rmi.Remote
{
    public void testStarted() throws RemoteException;

    public void testStarted(String host) throws RemoteException;

    public void testEnded() throws RemoteException;

    public void testEnded(String host) throws RemoteException;

    /**
     * A sample has started and stopped.
     */
    public void sampleOccurred(SampleEvent e) throws RemoteException;

    /**
     * A sample has started.
     */
    public void sampleStarted(SampleEvent e) throws RemoteException;

    /**
     * A sample has stopped.
     */
    public void sampleStopped(SampleEvent e) throws RemoteException;
}

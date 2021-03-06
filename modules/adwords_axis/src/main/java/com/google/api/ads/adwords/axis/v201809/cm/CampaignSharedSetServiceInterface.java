// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * CampaignSharedSetServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;

public interface CampaignSharedSetServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of CampaignSharedSets based on the given selector.
     * 
     * @param selector the selector specifying the query
     *         
     * @return a list of CampaignSharedSet entities that meet the criterion
     * specified
     *         by the selector
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201809.cm.CampaignSharedSetPage get(com.google.api.ads.adwords.axis.v201809.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201809.cm.ApiException;

    /**
     * Applies the list of mutate operations.
     *         
     * @param operations the operations to apply
     *         
     * @return the modified list of CampaignSharedSet associations
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201809.cm.CampaignSharedSetReturnValue mutate(com.google.api.ads.adwords.axis.v201809.cm.CampaignSharedSetOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201809.cm.ApiException;

    /**
     * Returns the list of CampaignSharedSets that match the query.
     * 
     *         
     * @param query The SQL-like AWQL query string
     *         
     * @returns A list of CampaignSharedSets
     *         
     * @throws ApiException when the query is invalid or there are errors
     * processing the request.
     */
    public com.google.api.ads.adwords.axis.v201809.cm.CampaignSharedSetPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201809.cm.ApiException;
}

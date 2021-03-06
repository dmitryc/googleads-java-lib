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


package com.google.api.ads.adwords.jaxws.v201806.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageOnePromotedBiddingScheme.StrategyGoal.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PageOnePromotedBiddingScheme.StrategyGoal">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAGE_ONE"/>
 *     &lt;enumeration value="PAGE_ONE_PROMOTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PageOnePromotedBiddingScheme.StrategyGoal")
@XmlEnum
public enum PageOnePromotedBiddingSchemeStrategyGoal {


    /**
     * 
     *                 First page on google.com.
     *               
     * 
     */
    PAGE_ONE,

    /**
     * 
     *                 Top slots of the first page on google.com.
     *               
     * 
     */
    PAGE_ONE_PROMOTED;

    public String value() {
        return name();
    }

    public static PageOnePromotedBiddingSchemeStrategyGoal fromValue(String v) {
        return valueOf(v);
    }

}

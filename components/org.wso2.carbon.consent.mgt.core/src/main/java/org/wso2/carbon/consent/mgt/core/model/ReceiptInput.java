/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.consent.mgt.core.model;

import java.util.List;
import java.util.Map;

public class ReceiptInput {

    private String consentReceiptId;
    private String version;
    private String jurisdiction;
    private String collectionMethod;
    private String language;
    private String piiPrincipalId;
    private List<ReceiptServiceInput> services;
    private String policyUrl;
    private String state;
    private String tenantDomain;
    private int tenantId;
    private Map<String, String> properties;

    public String getConsentReceiptId() {

        return consentReceiptId;
    }

    public void setConsentReceiptId(String consentReceiptId) {

        this.consentReceiptId = consentReceiptId;
    }

    public String getVersion() {

        return version;
    }

    public void setVersion(String version) {

        this.version = version;
    }

    public String getJurisdiction() {

        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {

        this.jurisdiction = jurisdiction;
    }

    public String getCollectionMethod() {

        return collectionMethod;
    }

    public void setCollectionMethod(String collectionMethod) {

        this.collectionMethod = collectionMethod;
    }

    public String getLanguage() {

        return language;
    }

    public void setLanguage(String language) {

        this.language = language;
    }

    public String getPiiPrincipalId() {

        return piiPrincipalId;
    }

    public void setPiiPrincipalId(String piiPrincipalId) {

        this.piiPrincipalId = piiPrincipalId;
    }

    public List<ReceiptServiceInput> getServices() {

        return services;
    }

    public void setServices(List<ReceiptServiceInput> services) {

        this.services = services;
    }

    public String getPolicyUrl() {

        return policyUrl;
    }

    public void setPolicyUrl(String policyUrl) {

        this.policyUrl = policyUrl;
    }

    public String getState() {

        return state;
    }

    public void setState(String state) {

        this.state = state;
    }

    public Map<String, String> getProperties() {

        return properties;
    }

    public void setProperties(Map<String, String> properties) {

        this.properties = properties;
    }

    public String getTenantDomain() {

        return tenantDomain;
    }

    public void setTenantDomain(String tenantDomain) {

        this.tenantDomain = tenantDomain;
    }

    public int getTenantId() {

        return tenantId;
    }

    public void setTenantId(int tenantId) {

        this.tenantId = tenantId;
    }
}

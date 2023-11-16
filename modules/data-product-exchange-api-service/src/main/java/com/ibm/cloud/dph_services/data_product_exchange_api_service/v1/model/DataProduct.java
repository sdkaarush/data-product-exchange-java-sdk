/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Data Product.
 */
public class DataProduct extends GenericModel {

  protected String id;
  protected ContainerReference container;
  protected String name;

  protected DataProduct() { }

  /**
   * Gets the id.
   *
   * Data product identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the container.
   *
   * Data product exchange container.
   *
   * @return the container
   */
  public ContainerReference getContainer() {
    return container;
  }

  /**
   * Gets the name.
   *
   * Name to refer to the data product.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}


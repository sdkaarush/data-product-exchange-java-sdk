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

import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.DeliverDataProductVersionOptions;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.ItemReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.model.OrderReference;
import com.ibm.cloud.dph_services.data_product_exchange_api_service.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeliverDataProductVersionOptions model.
 */
public class DeliverDataProductVersionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeliverDataProductVersionOptions() throws Throwable {
    ItemReference itemReferenceModel = new ItemReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .build();
    assertEquals(itemReferenceModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");

    OrderReference orderReferenceModel = new OrderReference.Builder()
      .id("2b0bf220-079c-11ee-be56-0242ac120002")
      .items(java.util.Arrays.asList(itemReferenceModel))
      .build();
    assertEquals(orderReferenceModel.id(), "2b0bf220-079c-11ee-be56-0242ac120002");
    assertEquals(orderReferenceModel.items(), java.util.Arrays.asList(itemReferenceModel));

    DeliverDataProductVersionOptions deliverDataProductVersionOptionsModel = new DeliverDataProductVersionOptions.Builder()
      .id("testString")
      .order(orderReferenceModel)
      .build();
    assertEquals(deliverDataProductVersionOptionsModel.id(), "testString");
    assertEquals(deliverDataProductVersionOptionsModel.order(), orderReferenceModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeliverDataProductVersionOptionsError() throws Throwable {
    new DeliverDataProductVersionOptions.Builder().build();
  }

}
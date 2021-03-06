package org.openapitools.openapidiff.core;

import static org.openapitools.openapidiff.core.TestUtils.assertOpenApiAreEquals;
import static org.openapitools.openapidiff.core.TestUtils.assertOpenApiChangedEndpoints;

import org.junit.jupiter.api.Test;

public class AllOfDiffTest {

  private final String OPENAPI_DOC1 = "allOf_diff_1.yaml";
  private final String OPENAPI_DOC2 = "allOf_diff_2.yaml";
  private final String OPENAPI_DOC3 = "allOf_diff_3.yaml";
  private final String OPENAPI_DOC4 = "allOf_diff_4.yaml";

  @Test
  public void testDiffSame() {
    assertOpenApiAreEquals(OPENAPI_DOC1, OPENAPI_DOC1);
  }

  @Test
  public void testDiffSameWithAllOf() {
    assertOpenApiAreEquals(OPENAPI_DOC1, OPENAPI_DOC2);
  }

  @Test
  public void testDiffDifferent1() {
    assertOpenApiChangedEndpoints(OPENAPI_DOC1, OPENAPI_DOC3);
  }

  @Test
  public void testDiffDifferent2() {
    assertOpenApiChangedEndpoints(OPENAPI_DOC1, OPENAPI_DOC4);
  }
}

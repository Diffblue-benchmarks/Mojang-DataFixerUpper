// Copyright (c) Diffblue Limited. All rights reserved.
// Licensed under the MIT license.

package com.mojang.datafixers.util;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.google.common.base.Objects;
import com.mojang.datafixers.util.Pair;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class PairTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @PrepareForTest({Objects.class})
  @Test
  public void hashCodeOutputZero() throws Exception {

    // Setup mocks
    mockStatic(Objects.class);

    // Arrange
    final Pair objectUnderTest = new Pair(null, null);
    PowerMockito.doReturn(0).when(Objects.class);
    Objects.hashCode(or(isA(Object[].class), isNull(Object[].class)));

    // Act
    final int retval = objectUnderTest.hashCode();

    // Assert result
    Assert.assertEquals(0, retval);
  }

  @Test
  public void equalsInputNullOutputFalse() {
    // Arrange
    final Pair objectUnderTest = new Pair(null, null);
    final Object obj = null;
    // Act
    final boolean retval = objectUnderTest.equals(obj);
    // Assert result
    Assert.assertEquals(false, retval);
  }

  @Test
  public void toStringOutputNotNull() {
    // Arrange
    final Unit objectUnderTest = Unit.INSTANCE;
    // Act
    final String retval = objectUnderTest.toString();
    // Assert result
    Assert.assertEquals("Unit", retval);
  }

  @Test
  public void valuesOutput1() {
    // Act
    final Unit[] retval = Unit.values();
    // Assert result
    Assert.assertArrayEquals(new Unit[] {Unit.INSTANCE}, retval);
  }
}

// Copyright (c) Diffblue Limited. All rights reserved.
// Licensed under the MIT license.

package com.mojang.datafixers.functions;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.mojang.datafixers.functions.PointFree;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class PointFreeTest {

  @Rule public ExpectedException thrown = ExpectedException.none();

  @PrepareForTest({StringUtils.class})
  @Test
  public void indentInputZeroOutputNotNull() throws Exception {

    // Setup mocks
    mockStatic(StringUtils.class);

    // Arrange
    final int level = 0;
    PowerMockito.doReturn("").when(StringUtils.class);
    StringUtils.repeat(or(isA(String.class), isNull(String.class)), anyInt());

    // Act
    final String retval = PointFree.indent(level);

    // Assert result
    Assert.assertEquals("", retval);
  }
}

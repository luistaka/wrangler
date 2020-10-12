/*
 *  Copyright © 2020 Cask Data, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 */

package io.cdap.functions;

public final class NumberFunctions {

  /**
   * @return The number as double.
   */
  public static double AsDouble(Number value) {
    return value.doubleValue();
  }

  /**
   * @return The number as float.
   */
  public static float AsFloat(Number value) {
    return value.floatValue();
  }

  /**
   * @return The number as integer.
   */
  public static int AsInteger(Number value) {
    return value.intValue();
  }

  /**
   * @return Returns the mantissa from the given decimal. Mantissa definition is used from
   * https://www.wolframalpha.com/input/?i=mantissa
   */
  public static double MantissaFromDecimal(Number value) {
    return getMantissa(value.toString());
  }

  /**
   * @return Returns the mantissa from the given number.
   */
  public static double MantissaFromDFloat(Number value) {
    return getMantissa(value.toString());
  }

  private static double getMantissa(String number) {
    if (number.indexOf('.') < 0) {
      return 0d;
    }
    return Double.valueOf(number.substring(number.indexOf('.') + 1));
  }
}

/**
 * Compiled for SuperSonic Line API Lite
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum ServiceCode implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  TALK(1),
  SQUARE(2);

  private final int value;

  private ServiceCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ServiceCode findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return TALK;
      case 2:
        return SQUARE;
      default:
        return null;
    }
  }
}
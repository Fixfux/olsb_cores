/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.0)", date = "2019-11-06")
public enum EmailConfirmationStatus implements org.apache.thrift.TEnum {
  NOT_SPECIFIED(0),
  NOT_YET(1),
  DONE(3);

  private final int value;

  private EmailConfirmationStatus(int value) {
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
  @org.apache.thrift.annotation.Nullable
  public static EmailConfirmationStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return NOT_SPECIFIED;
      case 1:
        return NOT_YET;
      case 3:
        return DONE;
      default:
        return null;
    }
  }
}
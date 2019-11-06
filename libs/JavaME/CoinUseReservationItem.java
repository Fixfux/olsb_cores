/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.Hashtable;
import java.util.Vector;
import java.util.Enumeration;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class CoinUseReservationItem implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("CoinUseReservationItem");

  private static final TField ITEM_ID_FIELD_DESC = new TField("itemId", TType.STRING, (short)1);
  private static final TField ITEM_NAME_FIELD_DESC = new TField("itemName", TType.STRING, (short)2);
  private static final TField AMOUNT_FIELD_DESC = new TField("amount", TType.I32, (short)3);

  private String itemId;
  private String itemName;
  private int amount;

  // isset id assignments
  private static final int __AMOUNT_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public CoinUseReservationItem() {
  }

  public CoinUseReservationItem(
    String itemId,
    String itemName,
    int amount)
  {
    this();
    this.itemId = itemId;
    this.itemName = itemName;
    this.amount = amount;
    setAmountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CoinUseReservationItem(CoinUseReservationItem other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetItemId()) {
      this.itemId = other.itemId;
    }
    if (other.isSetItemName()) {
      this.itemName = other.itemName;
    }
    this.amount = other.amount;
  }

  public CoinUseReservationItem deepCopy() {
    return new CoinUseReservationItem(this);
  }

  public void clear() {
    this.itemId = null;
    this.itemName = null;
    setAmountIsSet(false);
    this.amount = 0;
  }

  public String getItemId() {
    return this.itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public void unsetItemId() {
    this.itemId = null;
  }

  /** Returns true if field itemId is set (has been assigned a value) and false otherwise */
  public boolean isSetItemId() {
    return this.itemId != null;
  }

  public void setItemIdIsSet(boolean value) {
    if (!value) {
      this.itemId = null;
    }
  }

  public String getItemName() {
    return this.itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public void unsetItemName() {
    this.itemName = null;
  }

  /** Returns true if field itemName is set (has been assigned a value) and false otherwise */
  public boolean isSetItemName() {
    return this.itemName != null;
  }

  public void setItemNameIsSet(boolean value) {
    if (!value) {
      this.itemName = null;
    }
  }

  public int getAmount() {
    return this.amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
    setAmountIsSet(true);
  }

  public void unsetAmount() {
    __isset_vector[__AMOUNT_ISSET_ID] = false;
  }

  /** Returns true if field amount is set (has been assigned a value) and false otherwise */
  public boolean isSetAmount() {
    return __isset_vector[__AMOUNT_ISSET_ID];
  }

  public void setAmountIsSet(boolean value) {
    __isset_vector[__AMOUNT_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CoinUseReservationItem)
      return this.equals((CoinUseReservationItem)that);
    return false;
  }

  public boolean equals(CoinUseReservationItem that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_itemId = true && this.isSetItemId();
    boolean that_present_itemId = true && that.isSetItemId();
    if (this_present_itemId || that_present_itemId) {
      if (!(this_present_itemId && that_present_itemId))
        return false;
      if (!this.itemId.equals(that.itemId))
        return false;
    }

    boolean this_present_itemName = true && this.isSetItemName();
    boolean that_present_itemName = true && that.isSetItemName();
    if (this_present_itemName || that_present_itemName) {
      if (!(this_present_itemName && that_present_itemName))
        return false;
      if (!this.itemName.equals(that.itemName))
        return false;
    }

    boolean this_present_amount = true;
    boolean that_present_amount = true;
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (this.amount != that.amount)
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(Object otherObject) {
    if (!getClass().equals(otherObject.getClass())) {
      return getClass().getName().compareTo(otherObject.getClass().getName());
    }

    CoinUseReservationItem other = (CoinUseReservationItem)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetItemId(), other.isSetItemId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemId()) {
      lastComparison = TBaseHelper.compareTo(this.itemId, other.itemId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetItemName(), other.isSetItemName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItemName()) {
      lastComparison = TBaseHelper.compareTo(this.itemName, other.itemName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetAmount(), other.isSetAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount()) {
      lastComparison = TBaseHelper.compareTo(this.amount, other.amount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ITEM_ID
          if (field.type == TType.STRING) {
            this.itemId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // ITEM_NAME
          if (field.type == TType.STRING) {
            this.itemName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // AMOUNT
          if (field.type == TType.I32) {
            this.amount = iprot.readI32();
            setAmountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.itemId != null) {
      oprot.writeFieldBegin(ITEM_ID_FIELD_DESC);
      oprot.writeString(this.itemId);
      oprot.writeFieldEnd();
    }
    if (this.itemName != null) {
      oprot.writeFieldBegin(ITEM_NAME_FIELD_DESC);
      oprot.writeString(this.itemName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
    oprot.writeI32(this.amount);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("CoinUseReservationItem(");
    boolean first = true;

    sb.append("itemId:");
    if (this.itemId == null) {
      sb.append("null");
    } else {
      sb.append(this.itemId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("itemName:");
    if (this.itemName == null) {
      sb.append("null");
    } else {
      sb.append(this.itemName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("amount:");
    sb.append(this.amount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

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

public class TMessageBoxWrapUpResponse implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("TMessageBoxWrapUpResponse");

  private static final TField MESSAGE_BOX_WRAP_UP_LIST_FIELD_DESC = new TField("messageBoxWrapUpList", TType.LIST, (short)1);
  private static final TField TOTAL_SIZE_FIELD_DESC = new TField("totalSize", TType.I32, (short)2);

  private Vector messageBoxWrapUpList;
  private int totalSize;

  // isset id assignments
  private static final int __TOTALSIZE_ISSET_ID = 0;
  private boolean[] __isset_vector = new boolean[1];

  public TMessageBoxWrapUpResponse() {
  }

  public TMessageBoxWrapUpResponse(
    Vector messageBoxWrapUpList,
    int totalSize)
  {
    this();
    this.messageBoxWrapUpList = messageBoxWrapUpList;
    this.totalSize = totalSize;
    setTotalSizeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMessageBoxWrapUpResponse(TMessageBoxWrapUpResponse other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetMessageBoxWrapUpList()) {
      Vector __this__messageBoxWrapUpList = new Vector();
      for (Enumeration other_enum = other.messageBoxWrapUpList.elements(); other_enum.hasMoreElements(); ) {
        TMessageBoxWrapUp other_element = (TMessageBoxWrapUp)other_enum.nextElement();
        __this__messageBoxWrapUpList.addElement(new TMessageBoxWrapUp(other_element));
      }
      this.messageBoxWrapUpList = __this__messageBoxWrapUpList;
    }
    this.totalSize = other.totalSize;
  }

  public TMessageBoxWrapUpResponse deepCopy() {
    return new TMessageBoxWrapUpResponse(this);
  }

  public void clear() {
    this.messageBoxWrapUpList = null;
    setTotalSizeIsSet(false);
    this.totalSize = 0;
  }

  public int getMessageBoxWrapUpListSize() {
    return (this.messageBoxWrapUpList == null) ? 0 : this.messageBoxWrapUpList.size();
  }

  public Enumeration getMessageBoxWrapUpListEnumeration() {
    return (this.messageBoxWrapUpList == null) ? null : this.messageBoxWrapUpList.elements();
  }

  public void addToMessageBoxWrapUpList(TMessageBoxWrapUp elem) {
    if (this.messageBoxWrapUpList == null) {
      this.messageBoxWrapUpList = new Vector();
    }
    this.messageBoxWrapUpList.addElement(elem);
  }

  public Vector getMessageBoxWrapUpList() {
    return this.messageBoxWrapUpList;
  }

  public void setMessageBoxWrapUpList(Vector messageBoxWrapUpList) {
    this.messageBoxWrapUpList = messageBoxWrapUpList;
  }

  public void unsetMessageBoxWrapUpList() {
    this.messageBoxWrapUpList = null;
  }

  /** Returns true if field messageBoxWrapUpList is set (has been assigned a value) and false otherwise */
  public boolean isSetMessageBoxWrapUpList() {
    return this.messageBoxWrapUpList != null;
  }

  public void setMessageBoxWrapUpListIsSet(boolean value) {
    if (!value) {
      this.messageBoxWrapUpList = null;
    }
  }

  public int getTotalSize() {
    return this.totalSize;
  }

  public void setTotalSize(int totalSize) {
    this.totalSize = totalSize;
    setTotalSizeIsSet(true);
  }

  public void unsetTotalSize() {
    __isset_vector[__TOTALSIZE_ISSET_ID] = false;
  }

  /** Returns true if field totalSize is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalSize() {
    return __isset_vector[__TOTALSIZE_ISSET_ID];
  }

  public void setTotalSizeIsSet(boolean value) {
    __isset_vector[__TOTALSIZE_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TMessageBoxWrapUpResponse)
      return this.equals((TMessageBoxWrapUpResponse)that);
    return false;
  }

  public boolean equals(TMessageBoxWrapUpResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_messageBoxWrapUpList = true && this.isSetMessageBoxWrapUpList();
    boolean that_present_messageBoxWrapUpList = true && that.isSetMessageBoxWrapUpList();
    if (this_present_messageBoxWrapUpList || that_present_messageBoxWrapUpList) {
      if (!(this_present_messageBoxWrapUpList && that_present_messageBoxWrapUpList))
        return false;
      if (!this.messageBoxWrapUpList.equals(that.messageBoxWrapUpList))
        return false;
    }

    boolean this_present_totalSize = true;
    boolean that_present_totalSize = true;
    if (this_present_totalSize || that_present_totalSize) {
      if (!(this_present_totalSize && that_present_totalSize))
        return false;
      if (this.totalSize != that.totalSize)
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

    TMessageBoxWrapUpResponse other = (TMessageBoxWrapUpResponse)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetMessageBoxWrapUpList(), other.isSetMessageBoxWrapUpList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessageBoxWrapUpList()) {
      lastComparison = TBaseHelper.compareTo(this.messageBoxWrapUpList, other.messageBoxWrapUpList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetTotalSize(), other.isSetTotalSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalSize()) {
      lastComparison = TBaseHelper.compareTo(this.totalSize, other.totalSize);
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
        case 1: // MESSAGE_BOX_WRAP_UP_LIST
          if (field.type == TType.LIST) {
            {
              TList _list171 = iprot.readListBegin();
              this.messageBoxWrapUpList = new Vector(_list171.size);
              for (int _i172 = 0; _i172 < _list171.size; ++_i172)
              {
                TMessageBoxWrapUp _elem173;
                _elem173 = new TMessageBoxWrapUp();
                _elem173.read(iprot);
                this.messageBoxWrapUpList.addElement(_elem173);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TOTAL_SIZE
          if (field.type == TType.I32) {
            this.totalSize = iprot.readI32();
            setTotalSizeIsSet(true);
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
    if (this.messageBoxWrapUpList != null) {
      oprot.writeFieldBegin(MESSAGE_BOX_WRAP_UP_LIST_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.messageBoxWrapUpList.size()));
        for (Enumeration _iter174_enum = this.messageBoxWrapUpList.elements(); _iter174_enum.hasMoreElements(); )         {
          TMessageBoxWrapUp _iter174 = (TMessageBoxWrapUp)_iter174_enum.nextElement();
          _iter174.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(TOTAL_SIZE_FIELD_DESC);
    oprot.writeI32(this.totalSize);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("TMessageBoxWrapUpResponse(");
    boolean first = true;

    sb.append("messageBoxWrapUpList:");
    if (this.messageBoxWrapUpList == null) {
      sb.append("null");
    } else {
      sb.append(this.messageBoxWrapUpList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalSize:");
    sb.append(this.totalSize);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

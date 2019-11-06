/**
 * Autogenerated by Thrift Compiler (0.14.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class FriendChannelMatricesResponse : TBase
{
  private long _expires;
  private List<FriendChannelMatrix> _matrices;

  public long Expires
  {
    get
    {
      return _expires;
    }
    set
    {
      __isset.expires = true;
      this._expires = value;
    }
  }

  public List<FriendChannelMatrix> Matrices
  {
    get
    {
      return _matrices;
    }
    set
    {
      __isset.matrices = true;
      this._matrices = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool expires;
    public bool matrices;
  }

  public FriendChannelMatricesResponse() {
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.I64) {
              Expires = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                Matrices = new List<FriendChannelMatrix>();
                TList _list76 = iprot.ReadListBegin();
                for( int _i77 = 0; _i77 < _list76.Count; ++_i77)
                {
                  FriendChannelMatrix _elem78;
                  _elem78 = new FriendChannelMatrix();
                  _elem78.Read(iprot);
                  Matrices.Add(_elem78);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public void Write(TProtocol oprot) {
    oprot.IncrementRecursionDepth();
    try
    {
      TStruct struc = new TStruct("FriendChannelMatricesResponse");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.expires) {
        field.Name = "expires";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Expires);
        oprot.WriteFieldEnd();
      }
      if (Matrices != null && __isset.matrices) {
        field.Name = "matrices";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Matrices.Count));
          foreach (FriendChannelMatrix _iter79 in Matrices)
          {
            _iter79.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("FriendChannelMatricesResponse(");
    bool __first = true;
    if (__isset.expires) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Expires: ");
      __sb.Append(Expires);
    }
    if (Matrices != null && __isset.matrices) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Matrices: ");
      __sb.Append(Matrices);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

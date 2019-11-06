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
public partial class CoinHistoryResult : TBase
{
  private List<CoinHistory> _historys;
  private Coin _balance;
  private bool _hasNext;

  public List<CoinHistory> Historys
  {
    get
    {
      return _historys;
    }
    set
    {
      __isset.historys = true;
      this._historys = value;
    }
  }

  public Coin Balance
  {
    get
    {
      return _balance;
    }
    set
    {
      __isset.balance = true;
      this._balance = value;
    }
  }

  public bool HasNext
  {
    get
    {
      return _hasNext;
    }
    set
    {
      __isset.hasNext = true;
      this._hasNext = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool historys;
    public bool balance;
    public bool hasNext;
  }

  public CoinHistoryResult() {
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
            if (field.Type == TType.List) {
              {
                Historys = new List<CoinHistory>();
                TList _list56 = iprot.ReadListBegin();
                for( int _i57 = 0; _i57 < _list56.Count; ++_i57)
                {
                  CoinHistory _elem58;
                  _elem58 = new CoinHistory();
                  _elem58.Read(iprot);
                  Historys.Add(_elem58);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              Balance = new Coin();
              Balance.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Bool) {
              HasNext = iprot.ReadBool();
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
      TStruct struc = new TStruct("CoinHistoryResult");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Historys != null && __isset.historys) {
        field.Name = "historys";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Historys.Count));
          foreach (CoinHistory _iter59 in Historys)
          {
            _iter59.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (Balance != null && __isset.balance) {
        field.Name = "balance";
        field.Type = TType.Struct;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        Balance.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (__isset.hasNext) {
        field.Name = "hasNext";
        field.Type = TType.Bool;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(HasNext);
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
    StringBuilder __sb = new StringBuilder("CoinHistoryResult(");
    bool __first = true;
    if (Historys != null && __isset.historys) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Historys: ");
      __sb.Append(Historys);
    }
    if (Balance != null && __isset.balance) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Balance: ");
      __sb.Append(Balance== null ? "<null>" : Balance.ToString());
    }
    if (__isset.hasNext) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("HasNext: ");
      __sb.Append(HasNext);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

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

public class ChannelInfo implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("ChannelInfo");

  private static final TField CHANNEL_ID_FIELD_DESC = new TField("channelId", TType.STRING, (short)1);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)3);
  private static final TField ENTRY_PAGE_URL_FIELD_DESC = new TField("entryPageUrl", TType.STRING, (short)4);
  private static final TField DESCRIPTION_TEXT_FIELD_DESC = new TField("descriptionText", TType.STRING, (short)5);
  private static final TField PROVIDER_FIELD_DESC = new TField("provider", TType.STRUCT, (short)6);
  private static final TField PUBLIC_TYPE_FIELD_DESC = new TField("publicType", TType.I32, (short)7);
  private static final TField ICON_IMAGE_FIELD_DESC = new TField("iconImage", TType.STRING, (short)8);
  private static final TField PERMISSIONS_FIELD_DESC = new TField("permissions", TType.LIST, (short)9);
  private static final TField ICON_THUMBNAIL_IMAGE_FIELD_DESC = new TField("iconThumbnailImage", TType.STRING, (short)11);
  private static final TField CHANNEL_CONFIGURATIONS_FIELD_DESC = new TField("channelConfigurations", TType.LIST, (short)12);

  private String channelId;
  private String name;
  private String entryPageUrl;
  private String descriptionText;
  private ChannelProvider provider;
  private PublicType publicType;
  private String iconImage;
  private Vector permissions;
  private String iconThumbnailImage;
  private Vector channelConfigurations;

  // isset id assignments

  public ChannelInfo() {
  }

  public ChannelInfo(
    String channelId,
    String name,
    String entryPageUrl,
    String descriptionText,
    ChannelProvider provider,
    PublicType publicType,
    String iconImage,
    Vector permissions,
    String iconThumbnailImage,
    Vector channelConfigurations)
  {
    this();
    this.channelId = channelId;
    this.name = name;
    this.entryPageUrl = entryPageUrl;
    this.descriptionText = descriptionText;
    this.provider = provider;
    this.publicType = publicType;
    this.iconImage = iconImage;
    this.permissions = permissions;
    this.iconThumbnailImage = iconThumbnailImage;
    this.channelConfigurations = channelConfigurations;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChannelInfo(ChannelInfo other) {
    if (other.isSetChannelId()) {
      this.channelId = other.channelId;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetEntryPageUrl()) {
      this.entryPageUrl = other.entryPageUrl;
    }
    if (other.isSetDescriptionText()) {
      this.descriptionText = other.descriptionText;
    }
    if (other.isSetProvider()) {
      this.provider = new ChannelProvider(other.provider);
    }
    if (other.isSetPublicType()) {
      this.publicType = other.publicType;
    }
    if (other.isSetIconImage()) {
      this.iconImage = other.iconImage;
    }
    if (other.isSetPermissions()) {
      Vector __this__permissions = new Vector();
      for (Enumeration other_enum = other.permissions.elements(); other_enum.hasMoreElements(); ) {
        String other_element = (String)other_enum.nextElement();
        __this__permissions.addElement(other_element);
      }
      this.permissions = __this__permissions;
    }
    if (other.isSetIconThumbnailImage()) {
      this.iconThumbnailImage = other.iconThumbnailImage;
    }
    if (other.isSetChannelConfigurations()) {
      Vector __this__channelConfigurations = new Vector();
      for (Enumeration other_enum = other.channelConfigurations.elements(); other_enum.hasMoreElements(); ) {
        ChannelConfiguration other_element = (ChannelConfiguration)other_enum.nextElement();
        __this__channelConfigurations.addElement(other_element);
      }
      this.channelConfigurations = __this__channelConfigurations;
    }
  }

  public ChannelInfo deepCopy() {
    return new ChannelInfo(this);
  }

  public void clear() {
    this.channelId = null;
    this.name = null;
    this.entryPageUrl = null;
    this.descriptionText = null;
    this.provider = null;
    this.publicType = null;
    this.iconImage = null;
    this.permissions = null;
    this.iconThumbnailImage = null;
    this.channelConfigurations = null;
  }

  public String getChannelId() {
    return this.channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public void unsetChannelId() {
    this.channelId = null;
  }

  /** Returns true if field channelId is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelId() {
    return this.channelId != null;
  }

  public void setChannelIdIsSet(boolean value) {
    if (!value) {
      this.channelId = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getEntryPageUrl() {
    return this.entryPageUrl;
  }

  public void setEntryPageUrl(String entryPageUrl) {
    this.entryPageUrl = entryPageUrl;
  }

  public void unsetEntryPageUrl() {
    this.entryPageUrl = null;
  }

  /** Returns true if field entryPageUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetEntryPageUrl() {
    return this.entryPageUrl != null;
  }

  public void setEntryPageUrlIsSet(boolean value) {
    if (!value) {
      this.entryPageUrl = null;
    }
  }

  public String getDescriptionText() {
    return this.descriptionText;
  }

  public void setDescriptionText(String descriptionText) {
    this.descriptionText = descriptionText;
  }

  public void unsetDescriptionText() {
    this.descriptionText = null;
  }

  /** Returns true if field descriptionText is set (has been assigned a value) and false otherwise */
  public boolean isSetDescriptionText() {
    return this.descriptionText != null;
  }

  public void setDescriptionTextIsSet(boolean value) {
    if (!value) {
      this.descriptionText = null;
    }
  }

  public ChannelProvider getProvider() {
    return this.provider;
  }

  public void setProvider(ChannelProvider provider) {
    this.provider = provider;
  }

  public void unsetProvider() {
    this.provider = null;
  }

  /** Returns true if field provider is set (has been assigned a value) and false otherwise */
  public boolean isSetProvider() {
    return this.provider != null;
  }

  public void setProviderIsSet(boolean value) {
    if (!value) {
      this.provider = null;
    }
  }

  /**
   * 
   * @see PublicType
   */
  public PublicType getPublicType() {
    return this.publicType;
  }

  /**
   * 
   * @see PublicType
   */
  public void setPublicType(PublicType publicType) {
    this.publicType = publicType;
  }

  public void unsetPublicType() {
    this.publicType = null;
  }

  /** Returns true if field publicType is set (has been assigned a value) and false otherwise */
  public boolean isSetPublicType() {
    return this.publicType != null;
  }

  public void setPublicTypeIsSet(boolean value) {
    if (!value) {
      this.publicType = null;
    }
  }

  public String getIconImage() {
    return this.iconImage;
  }

  public void setIconImage(String iconImage) {
    this.iconImage = iconImage;
  }

  public void unsetIconImage() {
    this.iconImage = null;
  }

  /** Returns true if field iconImage is set (has been assigned a value) and false otherwise */
  public boolean isSetIconImage() {
    return this.iconImage != null;
  }

  public void setIconImageIsSet(boolean value) {
    if (!value) {
      this.iconImage = null;
    }
  }

  public int getPermissionsSize() {
    return (this.permissions == null) ? 0 : this.permissions.size();
  }

  public Enumeration getPermissionsEnumeration() {
    return (this.permissions == null) ? null : this.permissions.elements();
  }

  public void addToPermissions(String elem) {
    if (this.permissions == null) {
      this.permissions = new Vector();
    }
    this.permissions.addElement(elem);
  }

  public Vector getPermissions() {
    return this.permissions;
  }

  public void setPermissions(Vector permissions) {
    this.permissions = permissions;
  }

  public void unsetPermissions() {
    this.permissions = null;
  }

  /** Returns true if field permissions is set (has been assigned a value) and false otherwise */
  public boolean isSetPermissions() {
    return this.permissions != null;
  }

  public void setPermissionsIsSet(boolean value) {
    if (!value) {
      this.permissions = null;
    }
  }

  public String getIconThumbnailImage() {
    return this.iconThumbnailImage;
  }

  public void setIconThumbnailImage(String iconThumbnailImage) {
    this.iconThumbnailImage = iconThumbnailImage;
  }

  public void unsetIconThumbnailImage() {
    this.iconThumbnailImage = null;
  }

  /** Returns true if field iconThumbnailImage is set (has been assigned a value) and false otherwise */
  public boolean isSetIconThumbnailImage() {
    return this.iconThumbnailImage != null;
  }

  public void setIconThumbnailImageIsSet(boolean value) {
    if (!value) {
      this.iconThumbnailImage = null;
    }
  }

  public int getChannelConfigurationsSize() {
    return (this.channelConfigurations == null) ? 0 : this.channelConfigurations.size();
  }

  public Enumeration getChannelConfigurationsEnumeration() {
    return (this.channelConfigurations == null) ? null : this.channelConfigurations.elements();
  }

  public void addToChannelConfigurations(ChannelConfiguration elem) {
    if (this.channelConfigurations == null) {
      this.channelConfigurations = new Vector();
    }
    this.channelConfigurations.addElement(elem);
  }

  public Vector getChannelConfigurations() {
    return this.channelConfigurations;
  }

  public void setChannelConfigurations(Vector channelConfigurations) {
    this.channelConfigurations = channelConfigurations;
  }

  public void unsetChannelConfigurations() {
    this.channelConfigurations = null;
  }

  /** Returns true if field channelConfigurations is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelConfigurations() {
    return this.channelConfigurations != null;
  }

  public void setChannelConfigurationsIsSet(boolean value) {
    if (!value) {
      this.channelConfigurations = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ChannelInfo)
      return this.equals((ChannelInfo)that);
    return false;
  }

  public boolean equals(ChannelInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_channelId = true && this.isSetChannelId();
    boolean that_present_channelId = true && that.isSetChannelId();
    if (this_present_channelId || that_present_channelId) {
      if (!(this_present_channelId && that_present_channelId))
        return false;
      if (!this.channelId.equals(that.channelId))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_entryPageUrl = true && this.isSetEntryPageUrl();
    boolean that_present_entryPageUrl = true && that.isSetEntryPageUrl();
    if (this_present_entryPageUrl || that_present_entryPageUrl) {
      if (!(this_present_entryPageUrl && that_present_entryPageUrl))
        return false;
      if (!this.entryPageUrl.equals(that.entryPageUrl))
        return false;
    }

    boolean this_present_descriptionText = true && this.isSetDescriptionText();
    boolean that_present_descriptionText = true && that.isSetDescriptionText();
    if (this_present_descriptionText || that_present_descriptionText) {
      if (!(this_present_descriptionText && that_present_descriptionText))
        return false;
      if (!this.descriptionText.equals(that.descriptionText))
        return false;
    }

    boolean this_present_provider = true && this.isSetProvider();
    boolean that_present_provider = true && that.isSetProvider();
    if (this_present_provider || that_present_provider) {
      if (!(this_present_provider && that_present_provider))
        return false;
      if (!this.provider.equals(that.provider))
        return false;
    }

    boolean this_present_publicType = true && this.isSetPublicType();
    boolean that_present_publicType = true && that.isSetPublicType();
    if (this_present_publicType || that_present_publicType) {
      if (!(this_present_publicType && that_present_publicType))
        return false;
      if (!this.publicType.equals(that.publicType))
        return false;
    }

    boolean this_present_iconImage = true && this.isSetIconImage();
    boolean that_present_iconImage = true && that.isSetIconImage();
    if (this_present_iconImage || that_present_iconImage) {
      if (!(this_present_iconImage && that_present_iconImage))
        return false;
      if (!this.iconImage.equals(that.iconImage))
        return false;
    }

    boolean this_present_permissions = true && this.isSetPermissions();
    boolean that_present_permissions = true && that.isSetPermissions();
    if (this_present_permissions || that_present_permissions) {
      if (!(this_present_permissions && that_present_permissions))
        return false;
      if (!this.permissions.equals(that.permissions))
        return false;
    }

    boolean this_present_iconThumbnailImage = true && this.isSetIconThumbnailImage();
    boolean that_present_iconThumbnailImage = true && that.isSetIconThumbnailImage();
    if (this_present_iconThumbnailImage || that_present_iconThumbnailImage) {
      if (!(this_present_iconThumbnailImage && that_present_iconThumbnailImage))
        return false;
      if (!this.iconThumbnailImage.equals(that.iconThumbnailImage))
        return false;
    }

    boolean this_present_channelConfigurations = true && this.isSetChannelConfigurations();
    boolean that_present_channelConfigurations = true && that.isSetChannelConfigurations();
    if (this_present_channelConfigurations || that_present_channelConfigurations) {
      if (!(this_present_channelConfigurations && that_present_channelConfigurations))
        return false;
      if (!this.channelConfigurations.equals(that.channelConfigurations))
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

    ChannelInfo other = (ChannelInfo)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetChannelId(), other.isSetChannelId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelId()) {
      lastComparison = TBaseHelper.compareTo(this.channelId, other.channelId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetName(), other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetEntryPageUrl(), other.isSetEntryPageUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntryPageUrl()) {
      lastComparison = TBaseHelper.compareTo(this.entryPageUrl, other.entryPageUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetDescriptionText(), other.isSetDescriptionText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescriptionText()) {
      lastComparison = TBaseHelper.compareTo(this.descriptionText, other.descriptionText);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetProvider(), other.isSetProvider());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProvider()) {
      lastComparison = this.provider.compareTo(other.provider);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetPublicType(), other.isSetPublicType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPublicType()) {
      lastComparison = TBaseHelper.compareTo(this.publicType, other.publicType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetIconImage(), other.isSetIconImage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIconImage()) {
      lastComparison = TBaseHelper.compareTo(this.iconImage, other.iconImage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetPermissions(), other.isSetPermissions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPermissions()) {
      lastComparison = TBaseHelper.compareTo(this.permissions, other.permissions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetIconThumbnailImage(), other.isSetIconThumbnailImage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIconThumbnailImage()) {
      lastComparison = TBaseHelper.compareTo(this.iconThumbnailImage, other.iconThumbnailImage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetChannelConfigurations(), other.isSetChannelConfigurations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelConfigurations()) {
      lastComparison = TBaseHelper.compareTo(this.channelConfigurations, other.channelConfigurations);
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
        case 1: // CHANNEL_ID
          if (field.type == TType.STRING) {
            this.channelId = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // ENTRY_PAGE_URL
          if (field.type == TType.STRING) {
            this.entryPageUrl = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // DESCRIPTION_TEXT
          if (field.type == TType.STRING) {
            this.descriptionText = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // PROVIDER
          if (field.type == TType.STRUCT) {
            this.provider = new ChannelProvider();
            this.provider.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // PUBLIC_TYPE
          if (field.type == TType.I32) {
            this.publicType = PublicType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // ICON_IMAGE
          if (field.type == TType.STRING) {
            this.iconImage = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // PERMISSIONS
          if (field.type == TType.LIST) {
            {
              TList _list0 = iprot.readListBegin();
              this.permissions = new Vector(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                String _elem2;
                _elem2 = iprot.readString();
                this.permissions.addElement(_elem2);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // ICON_THUMBNAIL_IMAGE
          if (field.type == TType.STRING) {
            this.iconThumbnailImage = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 12: // CHANNEL_CONFIGURATIONS
          if (field.type == TType.LIST) {
            {
              TList _list3 = iprot.readListBegin();
              this.channelConfigurations = new Vector(_list3.size);
              for (int _i4 = 0; _i4 < _list3.size; ++_i4)
              {
                ChannelConfiguration _elem5;
                _elem5 = ChannelConfiguration.findByValue(iprot.readI32());
                this.channelConfigurations.addElement(_elem5);
              }
              iprot.readListEnd();
            }
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
    if (this.channelId != null) {
      oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
      oprot.writeString(this.channelId);
      oprot.writeFieldEnd();
    }
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.entryPageUrl != null) {
      oprot.writeFieldBegin(ENTRY_PAGE_URL_FIELD_DESC);
      oprot.writeString(this.entryPageUrl);
      oprot.writeFieldEnd();
    }
    if (this.descriptionText != null) {
      oprot.writeFieldBegin(DESCRIPTION_TEXT_FIELD_DESC);
      oprot.writeString(this.descriptionText);
      oprot.writeFieldEnd();
    }
    if (this.provider != null) {
      oprot.writeFieldBegin(PROVIDER_FIELD_DESC);
      this.provider.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.publicType != null) {
      oprot.writeFieldBegin(PUBLIC_TYPE_FIELD_DESC);
      oprot.writeI32(this.publicType.getValue());
      oprot.writeFieldEnd();
    }
    if (this.iconImage != null) {
      oprot.writeFieldBegin(ICON_IMAGE_FIELD_DESC);
      oprot.writeString(this.iconImage);
      oprot.writeFieldEnd();
    }
    if (this.permissions != null) {
      oprot.writeFieldBegin(PERMISSIONS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.permissions.size()));
        for (Enumeration _iter6_enum = this.permissions.elements(); _iter6_enum.hasMoreElements(); )         {
          String _iter6 = (String)_iter6_enum.nextElement();
          oprot.writeString(_iter6);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.iconThumbnailImage != null) {
      oprot.writeFieldBegin(ICON_THUMBNAIL_IMAGE_FIELD_DESC);
      oprot.writeString(this.iconThumbnailImage);
      oprot.writeFieldEnd();
    }
    if (this.channelConfigurations != null) {
      oprot.writeFieldBegin(CHANNEL_CONFIGURATIONS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.channelConfigurations.size()));
        for (Enumeration _iter7_enum = this.channelConfigurations.elements(); _iter7_enum.hasMoreElements(); )         {
          ChannelConfiguration _iter7 = (ChannelConfiguration)_iter7_enum.nextElement();
          oprot.writeI32(_iter7.getValue());
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("ChannelInfo(");
    boolean first = true;

    sb.append("channelId:");
    if (this.channelId == null) {
      sb.append("null");
    } else {
      sb.append(this.channelId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("entryPageUrl:");
    if (this.entryPageUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.entryPageUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("descriptionText:");
    if (this.descriptionText == null) {
      sb.append("null");
    } else {
      sb.append(this.descriptionText);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("provider:");
    if (this.provider == null) {
      sb.append("null");
    } else {
      sb.append(this.provider);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("publicType:");
    if (this.publicType == null) {
      sb.append("null");
    } else {
      sb.append(this.publicType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("iconImage:");
    if (this.iconImage == null) {
      sb.append("null");
    } else {
      sb.append(this.iconImage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("permissions:");
    if (this.permissions == null) {
      sb.append("null");
    } else {
      sb.append(this.permissions);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("iconThumbnailImage:");
    if (this.iconThumbnailImage == null) {
      sb.append("null");
    } else {
      sb.append(this.iconThumbnailImage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("channelConfigurations:");
    if (this.channelConfigurations == null) {
      sb.append("null");
    } else {
      sb.append(this.channelConfigurations);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}


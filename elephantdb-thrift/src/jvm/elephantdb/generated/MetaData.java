/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package elephantdb.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetaData implements org.apache.thrift.TBase<MetaData, MetaData._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MetaData");

  private static final org.apache.thrift.protocol.TField DOMAIN_METADATAS_FIELD_DESC = new org.apache.thrift.protocol.TField("domain_metadatas", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetaDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MetaDataTupleSchemeFactory());
  }

  private Map<String,DomainMetaData> domain_metadatas; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DOMAIN_METADATAS((short)1, "domain_metadatas");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DOMAIN_METADATAS
          return DOMAIN_METADATAS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DOMAIN_METADATAS, new org.apache.thrift.meta_data.FieldMetaData("domain_metadatas", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DomainMetaData.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MetaData.class, metaDataMap);
  }

  public MetaData() {
  }

  public MetaData(
    Map<String,DomainMetaData> domain_metadatas)
  {
    this();
    this.domain_metadatas = domain_metadatas;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetaData(MetaData other) {
    if (other.is_set_domain_metadatas()) {
      Map<String,DomainMetaData> __this__domain_metadatas = new HashMap<String,DomainMetaData>();
      for (Map.Entry<String, DomainMetaData> other_element : other.domain_metadatas.entrySet()) {

        String other_element_key = other_element.getKey();
        DomainMetaData other_element_value = other_element.getValue();

        String __this__domain_metadatas_copy_key = other_element_key;

        DomainMetaData __this__domain_metadatas_copy_value = new DomainMetaData(other_element_value);

        __this__domain_metadatas.put(__this__domain_metadatas_copy_key, __this__domain_metadatas_copy_value);
      }
      this.domain_metadatas = __this__domain_metadatas;
    }
  }

  public MetaData deepCopy() {
    return new MetaData(this);
  }

  @Override
  public void clear() {
    this.domain_metadatas = null;
  }

  public int get_domain_metadatas_size() {
    return (this.domain_metadatas == null) ? 0 : this.domain_metadatas.size();
  }

  public void put_to_domain_metadatas(String key, DomainMetaData val) {
    if (this.domain_metadatas == null) {
      this.domain_metadatas = new HashMap<String,DomainMetaData>();
    }
    this.domain_metadatas.put(key, val);
  }

  public Map<String,DomainMetaData> get_domain_metadatas() {
    return this.domain_metadatas;
  }

  public void set_domain_metadatas(Map<String,DomainMetaData> domain_metadatas) {
    this.domain_metadatas = domain_metadatas;
  }

  public void unset_domain_metadatas() {
    this.domain_metadatas = null;
  }

  /** Returns true if field domain_metadatas is set (has been assigned a value) and false otherwise */
  public boolean is_set_domain_metadatas() {
    return this.domain_metadatas != null;
  }

  public void set_domain_metadatas_isSet(boolean value) {
    if (!value) {
      this.domain_metadatas = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DOMAIN_METADATAS:
      if (value == null) {
        unset_domain_metadatas();
      } else {
        set_domain_metadatas((Map<String,DomainMetaData>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DOMAIN_METADATAS:
      return get_domain_metadatas();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DOMAIN_METADATAS:
      return is_set_domain_metadatas();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetaData)
      return this.equals((MetaData)that);
    return false;
  }

  public boolean equals(MetaData that) {
    if (that == null)
      return false;

    boolean this_present_domain_metadatas = true && this.is_set_domain_metadatas();
    boolean that_present_domain_metadatas = true && that.is_set_domain_metadatas();
    if (this_present_domain_metadatas || that_present_domain_metadatas) {
      if (!(this_present_domain_metadatas && that_present_domain_metadatas))
        return false;
      if (!this.domain_metadatas.equals(that.domain_metadatas))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_domain_metadatas = true && (is_set_domain_metadatas());
    builder.append(present_domain_metadatas);
    if (present_domain_metadatas)
      builder.append(domain_metadatas);

    return builder.toHashCode();
  }

  public int compareTo(MetaData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    MetaData typedOther = (MetaData)other;

    lastComparison = Boolean.valueOf(is_set_domain_metadatas()).compareTo(typedOther.is_set_domain_metadatas());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_domain_metadatas()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domain_metadatas, typedOther.domain_metadatas);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MetaData(");
    boolean first = true;

    sb.append("domain_metadatas:");
    if (this.domain_metadatas == null) {
      sb.append("null");
    } else {
      sb.append(this.domain_metadatas);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_domain_metadatas()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'domain_metadatas' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MetaDataStandardSchemeFactory implements SchemeFactory {
    public MetaDataStandardScheme getScheme() {
      return new MetaDataStandardScheme();
    }
  }

  private static class MetaDataStandardScheme extends StandardScheme<MetaData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MetaData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DOMAIN_METADATAS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map10 = iprot.readMapBegin();
                struct.domain_metadatas = new HashMap<String,DomainMetaData>(2*_map10.size);
                for (int _i11 = 0; _i11 < _map10.size; ++_i11)
                {
                  String _key12; // optional
                  DomainMetaData _val13; // required
                  _key12 = iprot.readString();
                  _val13 = new DomainMetaData();
                  _val13.read(iprot);
                  struct.domain_metadatas.put(_key12, _val13);
                }
                iprot.readMapEnd();
              }
              struct.set_domain_metadatas_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MetaData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.domain_metadatas != null) {
        oprot.writeFieldBegin(DOMAIN_METADATAS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.domain_metadatas.size()));
          for (Map.Entry<String, DomainMetaData> _iter14 : struct.domain_metadatas.entrySet())
          {
            oprot.writeString(_iter14.getKey());
            _iter14.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MetaDataTupleSchemeFactory implements SchemeFactory {
    public MetaDataTupleScheme getScheme() {
      return new MetaDataTupleScheme();
    }
  }

  private static class MetaDataTupleScheme extends TupleScheme<MetaData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MetaData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.domain_metadatas.size());
        for (Map.Entry<String, DomainMetaData> _iter15 : struct.domain_metadatas.entrySet())
        {
          oprot.writeString(_iter15.getKey());
          _iter15.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MetaData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map16 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.domain_metadatas = new HashMap<String,DomainMetaData>(2*_map16.size);
        for (int _i17 = 0; _i17 < _map16.size; ++_i17)
        {
          String _key18; // optional
          DomainMetaData _val19; // required
          _key18 = iprot.readString();
          _val19 = new DomainMetaData();
          _val19.read(iprot);
          struct.domain_metadatas.put(_key18, _val19);
        }
      }
      struct.set_domain_metadatas_isSet(true);
    }
  }

}

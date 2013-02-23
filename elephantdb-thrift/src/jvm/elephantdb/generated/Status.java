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

public class Status implements org.apache.thrift.TBase<Status, Status._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Status");

  private static final org.apache.thrift.protocol.TField DOMAIN_STATUSES_FIELD_DESC = new org.apache.thrift.protocol.TField("domain_statuses", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StatusTupleSchemeFactory());
  }

  private Map<String,DomainStatus> domain_statuses; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DOMAIN_STATUSES((short)1, "domain_statuses");

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
        case 1: // DOMAIN_STATUSES
          return DOMAIN_STATUSES;
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
    tmpMap.put(_Fields.DOMAIN_STATUSES, new org.apache.thrift.meta_data.FieldMetaData("domain_statuses", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DomainStatus.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Status.class, metaDataMap);
  }

  public Status() {
  }

  public Status(
    Map<String,DomainStatus> domain_statuses)
  {
    this();
    this.domain_statuses = domain_statuses;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Status(Status other) {
    if (other.is_set_domain_statuses()) {
      Map<String,DomainStatus> __this__domain_statuses = new HashMap<String,DomainStatus>();
      for (Map.Entry<String, DomainStatus> other_element : other.domain_statuses.entrySet()) {

        String other_element_key = other_element.getKey();
        DomainStatus other_element_value = other_element.getValue();

        String __this__domain_statuses_copy_key = other_element_key;

        DomainStatus __this__domain_statuses_copy_value = new DomainStatus(other_element_value);

        __this__domain_statuses.put(__this__domain_statuses_copy_key, __this__domain_statuses_copy_value);
      }
      this.domain_statuses = __this__domain_statuses;
    }
  }

  public Status deepCopy() {
    return new Status(this);
  }

  @Override
  public void clear() {
    this.domain_statuses = null;
  }

  public int get_domain_statuses_size() {
    return (this.domain_statuses == null) ? 0 : this.domain_statuses.size();
  }

  public void put_to_domain_statuses(String key, DomainStatus val) {
    if (this.domain_statuses == null) {
      this.domain_statuses = new HashMap<String,DomainStatus>();
    }
    this.domain_statuses.put(key, val);
  }

  public Map<String,DomainStatus> get_domain_statuses() {
    return this.domain_statuses;
  }

  public void set_domain_statuses(Map<String,DomainStatus> domain_statuses) {
    this.domain_statuses = domain_statuses;
  }

  public void unset_domain_statuses() {
    this.domain_statuses = null;
  }

  /** Returns true if field domain_statuses is set (has been assigned a value) and false otherwise */
  public boolean is_set_domain_statuses() {
    return this.domain_statuses != null;
  }

  public void set_domain_statuses_isSet(boolean value) {
    if (!value) {
      this.domain_statuses = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DOMAIN_STATUSES:
      if (value == null) {
        unset_domain_statuses();
      } else {
        set_domain_statuses((Map<String,DomainStatus>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DOMAIN_STATUSES:
      return get_domain_statuses();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DOMAIN_STATUSES:
      return is_set_domain_statuses();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Status)
      return this.equals((Status)that);
    return false;
  }

  public boolean equals(Status that) {
    if (that == null)
      return false;

    boolean this_present_domain_statuses = true && this.is_set_domain_statuses();
    boolean that_present_domain_statuses = true && that.is_set_domain_statuses();
    if (this_present_domain_statuses || that_present_domain_statuses) {
      if (!(this_present_domain_statuses && that_present_domain_statuses))
        return false;
      if (!this.domain_statuses.equals(that.domain_statuses))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_domain_statuses = true && (is_set_domain_statuses());
    builder.append(present_domain_statuses);
    if (present_domain_statuses)
      builder.append(domain_statuses);

    return builder.toHashCode();
  }

  public int compareTo(Status other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Status typedOther = (Status)other;

    lastComparison = Boolean.valueOf(is_set_domain_statuses()).compareTo(typedOther.is_set_domain_statuses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_domain_statuses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domain_statuses, typedOther.domain_statuses);
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
    StringBuilder sb = new StringBuilder("Status(");
    boolean first = true;

    sb.append("domain_statuses:");
    if (this.domain_statuses == null) {
      sb.append("null");
    } else {
      sb.append(this.domain_statuses);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_domain_statuses()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'domain_statuses' is unset! Struct:" + toString());
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

  private static class StatusStandardSchemeFactory implements SchemeFactory {
    public StatusStandardScheme getScheme() {
      return new StatusStandardScheme();
    }
  }

  private static class StatusStandardScheme extends StandardScheme<Status> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Status struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DOMAIN_STATUSES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.domain_statuses = new HashMap<String,DomainStatus>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  String _key2; // required
                  DomainStatus _val3; // required
                  _key2 = iprot.readString();
                  _val3 = new DomainStatus();
                  _val3.read(iprot);
                  struct.domain_statuses.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.set_domain_statuses_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Status struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.domain_statuses != null) {
        oprot.writeFieldBegin(DOMAIN_STATUSES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.domain_statuses.size()));
          for (Map.Entry<String, DomainStatus> _iter4 : struct.domain_statuses.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            _iter4.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StatusTupleSchemeFactory implements SchemeFactory {
    public StatusTupleScheme getScheme() {
      return new StatusTupleScheme();
    }
  }

  private static class StatusTupleScheme extends TupleScheme<Status> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Status struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.domain_statuses.size());
        for (Map.Entry<String, DomainStatus> _iter5 : struct.domain_statuses.entrySet())
        {
          oprot.writeString(_iter5.getKey());
          _iter5.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Status struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.domain_statuses = new HashMap<String,DomainStatus>(2*_map6.size);
        for (int _i7 = 0; _i7 < _map6.size; ++_i7)
        {
          String _key8; // optional
          DomainStatus _val9; // required
          _key8 = iprot.readString();
          _val9 = new DomainStatus();
          _val9.read(iprot);
          struct.domain_statuses.put(_key8, _val9);
        }
      }
      struct.set_domain_statuses_isSet(true);
    }
  }

}

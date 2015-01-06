/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package test.example;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Stru05Record extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Stru05Record\",\"namespace\":\"test.example\",\"fields\":[{\"name\":\"comItemA\",\"type\":{\"type\":\"record\",\"name\":\"ComItemA\",\"fields\":[{\"name\":\"comItemB\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":7,\"scale\":2}}]}},{\"name\":\"comItemC\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ComItemC\",\"fields\":[{\"name\":\"comItemB\",\"type\":\"int\"}]}}},{\"name\":\"comItemD\",\"type\":{\"type\":\"record\",\"name\":\"ComItemD\",\"fields\":[{\"name\":\"comItemE\",\"type\":{\"type\":\"record\",\"name\":\"ComItemE\",\"fields\":[{\"name\":\"comItemB\",\"type\":\"string\"}]}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public test.example.ComItemA comItemA;
  @Deprecated public java.util.List<test.example.ComItemC> comItemC;
  @Deprecated public test.example.ComItemD comItemD;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Stru05Record() {}

  /**
   * All-args constructor.
   */
  public Stru05Record(test.example.ComItemA comItemA, java.util.List<test.example.ComItemC> comItemC, test.example.ComItemD comItemD) {
    setComItemA(comItemA);
    setComItemC(comItemC);
    setComItemD(comItemD);
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return comItemA;
    case 1: return comItemC;
    case 2: return comItemD;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: comItemA = (test.example.ComItemA)value$; break;
    case 1: comItemC = (java.util.List<test.example.ComItemC>)value$; break;
    case 2: comItemD = (test.example.ComItemD)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'comItemA' field.
   */
  public test.example.ComItemA getComItemA() {
    return comItemA;
  }

  /**
   * Sets the value of the 'comItemA' field.
   * @param value the value to set.
   */
  public void setComItemA(test.example.ComItemA value) {
    this.comItemA = value;
  }

  /**
   * Gets the value of the 'comItemC' field.
   */
  public java.util.List<test.example.ComItemC> getComItemC() {
    return comItemC;
  }

  /**
   * Sets the value of the 'comItemC' field.
   * @param value the value to set.
   */
  public void setComItemC(java.util.List<test.example.ComItemC> value) {
    this.comItemC = value;
  }

  /**
   * Gets the value of the 'comItemD' field.
   */
  public test.example.ComItemD getComItemD() {
    return comItemD;
  }

  /**
   * Sets the value of the 'comItemD' field.
   * @param value the value to set.
   */
  public void setComItemD(test.example.ComItemD value) {
    this.comItemD = value;
  }

  /** Creates a new Stru05Record RecordBuilder */
  public static test.example.Stru05Record.Builder newBuilder() {
    return new test.example.Stru05Record.Builder();
  }
  
  /** Creates a new Stru05Record RecordBuilder by copying an existing Builder */
  public static test.example.Stru05Record.Builder newBuilder(test.example.Stru05Record.Builder other) {
    return new test.example.Stru05Record.Builder(other);
  }
  
  /** Creates a new Stru05Record RecordBuilder by copying an existing Stru05Record instance */
  public static test.example.Stru05Record.Builder newBuilder(test.example.Stru05Record other) {
    return new test.example.Stru05Record.Builder(other);
  }
  
  /**
   * RecordBuilder for Stru05Record instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Stru05Record>
    implements org.apache.avro.data.RecordBuilder<Stru05Record> {

    private test.example.ComItemA comItemA;
    private java.util.List<test.example.ComItemC> comItemC;
    private test.example.ComItemD comItemD;

    /** Creates a new Builder */
    private Builder() {
      super(test.example.Stru05Record.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(test.example.Stru05Record.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.comItemA)) {
        this.comItemA = data().deepCopy(fields()[0].schema(), other.comItemA);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.comItemC)) {
        this.comItemC = data().deepCopy(fields()[1].schema(), other.comItemC);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.comItemD)) {
        this.comItemD = data().deepCopy(fields()[2].schema(), other.comItemD);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Stru05Record instance */
    private Builder(test.example.Stru05Record other) {
            super(test.example.Stru05Record.SCHEMA$);
      if (isValidValue(fields()[0], other.comItemA)) {
        this.comItemA = data().deepCopy(fields()[0].schema(), other.comItemA);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.comItemC)) {
        this.comItemC = data().deepCopy(fields()[1].schema(), other.comItemC);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.comItemD)) {
        this.comItemD = data().deepCopy(fields()[2].schema(), other.comItemD);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'comItemA' field */
    public test.example.ComItemA getComItemA() {
      return comItemA;
    }
    
    /** Sets the value of the 'comItemA' field */
    public test.example.Stru05Record.Builder setComItemA(test.example.ComItemA value) {
      validate(fields()[0], value);
      this.comItemA = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'comItemA' field has been set */
    public boolean hasComItemA() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'comItemA' field */
    public test.example.Stru05Record.Builder clearComItemA() {
      comItemA = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'comItemC' field */
    public java.util.List<test.example.ComItemC> getComItemC() {
      return comItemC;
    }
    
    /** Sets the value of the 'comItemC' field */
    public test.example.Stru05Record.Builder setComItemC(java.util.List<test.example.ComItemC> value) {
      validate(fields()[1], value);
      this.comItemC = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'comItemC' field has been set */
    public boolean hasComItemC() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'comItemC' field */
    public test.example.Stru05Record.Builder clearComItemC() {
      comItemC = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'comItemD' field */
    public test.example.ComItemD getComItemD() {
      return comItemD;
    }
    
    /** Sets the value of the 'comItemD' field */
    public test.example.Stru05Record.Builder setComItemD(test.example.ComItemD value) {
      validate(fields()[2], value);
      this.comItemD = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'comItemD' field has been set */
    public boolean hasComItemD() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'comItemD' field */
    public test.example.Stru05Record.Builder clearComItemD() {
      comItemD = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Stru05Record build() {
      try {
        Stru05Record record = new Stru05Record();
        record.comItemA = fieldSetFlags()[0] ? this.comItemA : (test.example.ComItemA) defaultValue(fields()[0]);
        record.comItemC = fieldSetFlags()[1] ? this.comItemC : (java.util.List<test.example.ComItemC>) defaultValue(fields()[1]);
        record.comItemD = fieldSetFlags()[2] ? this.comItemD : (test.example.ComItemD) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
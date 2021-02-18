/**
 * Office.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Office  implements java.io.Serializable {
    private java.lang.String officeNumber;

    private java.lang.String buildingAddress;

    private java.lang.String ventilationSetting;

    private int temperatureSetting;

    public Office() {
    }

    public Office(
           java.lang.String officeNumber,
           java.lang.String buildingAddress,
           java.lang.String ventilationSetting,
           int temperatureSetting) {
           this.officeNumber = officeNumber;
           this.buildingAddress = buildingAddress;
           this.ventilationSetting = ventilationSetting;
           this.temperatureSetting = temperatureSetting;
    }


    /**
     * Gets the officeNumber value for this Office.
     * 
     * @return officeNumber
     */
    public java.lang.String getOfficeNumber() {
        return officeNumber;
    }


    /**
     * Sets the officeNumber value for this Office.
     * 
     * @param officeNumber
     */
    public void setOfficeNumber(java.lang.String officeNumber) {
        this.officeNumber = officeNumber;
    }


    /**
     * Gets the buildingAddress value for this Office.
     * 
     * @return buildingAddress
     */
    public java.lang.String getBuildingAddress() {
        return buildingAddress;
    }


    /**
     * Sets the buildingAddress value for this Office.
     * 
     * @param buildingAddress
     */
    public void setBuildingAddress(java.lang.String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }


    /**
     * Gets the ventilationSetting value for this Office.
     * 
     * @return ventilationSetting
     */
    public java.lang.String getVentilationSetting() {
        return ventilationSetting;
    }


    /**
     * Sets the ventilationSetting value for this Office.
     * 
     * @param ventilationSetting
     */
    public void setVentilationSetting(java.lang.String ventilationSetting) {
        this.ventilationSetting = ventilationSetting;
    }


    /**
     * Gets the temperatureSetting value for this Office.
     * 
     * @return temperatureSetting
     */
    public int getTemperatureSetting() {
        return temperatureSetting;
    }


    /**
     * Sets the temperatureSetting value for this Office.
     * 
     * @param temperatureSetting
     */
    public void setTemperatureSetting(int temperatureSetting) {
        this.temperatureSetting = temperatureSetting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Office)) return false;
        Office other = (Office) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.officeNumber==null && other.getOfficeNumber()==null) || 
             (this.officeNumber!=null &&
              this.officeNumber.equals(other.getOfficeNumber()))) &&
            ((this.buildingAddress==null && other.getBuildingAddress()==null) || 
             (this.buildingAddress!=null &&
              this.buildingAddress.equals(other.getBuildingAddress()))) &&
            ((this.ventilationSetting==null && other.getVentilationSetting()==null) || 
             (this.ventilationSetting!=null &&
              this.ventilationSetting.equals(other.getVentilationSetting()))) &&
            this.temperatureSetting == other.getTemperatureSetting();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOfficeNumber() != null) {
            _hashCode += getOfficeNumber().hashCode();
        }
        if (getBuildingAddress() != null) {
            _hashCode += getBuildingAddress().hashCode();
        }
        if (getVentilationSetting() != null) {
            _hashCode += getVentilationSetting().hashCode();
        }
        _hashCode += getTemperatureSetting();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Office.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Office"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OfficeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BuildingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ventilationSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VentilationSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temperatureSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TemperatureSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

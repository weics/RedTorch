/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcExchangeSequenceField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeSequenceField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeSequenceField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcExchangeSequenceField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeSequenceField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeSequenceField_ExchangeID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeSequenceField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeSequenceField_SequenceNo_get(swigCPtr, this);
  }

  public void setMarketStatus(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeSequenceField_MarketStatus_set(swigCPtr, this, value);
  }

  public char getMarketStatus() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeSequenceField_MarketStatus_get(swigCPtr, this);
  }

  public CThostFtdcExchangeSequenceField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcExchangeSequenceField(), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ogmacorp.ogmaneo;

public class Vec2f {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Vec2f(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Vec2f obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jogmaneoJNI.delete_Vec2f(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(float value) {
    jogmaneoJNI.Vec2f_x_set(swigCPtr, this, value);
  }

  public float getX() {
    return jogmaneoJNI.Vec2f_x_get(swigCPtr, this);
  }

  public void setY(float value) {
    jogmaneoJNI.Vec2f_y_set(swigCPtr, this, value);
  }

  public float getY() {
    return jogmaneoJNI.Vec2f_y_get(swigCPtr, this);
  }

  public Vec2f() {
    this(jogmaneoJNI.new_Vec2f__SWIG_0(), true);
  }

  public Vec2f(float X, float Y) {
    this(jogmaneoJNI.new_Vec2f__SWIG_1(X, Y), true);
  }

  public Vec2f(int X, int Y) {
    this(jogmaneoJNI.new_Vec2f__SWIG_2(X, Y), true);
  }

}

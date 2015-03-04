package org.hl7.fhir.instance.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Tue, Mar 3, 2015 17:16+1100 for FHIR v0.4.0

import java.util.*;

import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.instance.model.annotations.ResourceDef;
import org.hl7.fhir.instance.model.annotations.SearchParamDefinition;
import org.hl7.fhir.instance.model.annotations.Block;
import org.hl7.fhir.instance.model.annotations.Child;
import org.hl7.fhir.instance.model.annotations.Description;
/**
 * Describes a measurement, calculation or setting capability of a medical device.
 */
@ResourceDef(name="DeviceMetric", profile="http://hl7.org/fhir/Profile/DeviceMetric")
public class DeviceMetric extends DomainResource {

    public enum MetricOperationalStatus {
        /**
         * The DeviceMetric is operating and will generate DeviceObservations.
         */
        ON, 
        /**
         * The DeviceMetric is not operating.
         */
        OFF, 
        /**
         * The DeviceMetric is operating, but will not generate any DeviceObservations.
         */
        STANDBY, 
        /**
         * added to help the parsers
         */
        NULL;
        public static MetricOperationalStatus fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("on".equals(codeString))
          return ON;
        if ("off".equals(codeString))
          return OFF;
        if ("standby".equals(codeString))
          return STANDBY;
        throw new Exception("Unknown MetricOperationalStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case ON: return "on";
            case OFF: return "off";
            case STANDBY: return "standby";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ON: return "";
            case OFF: return "";
            case STANDBY: return "";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ON: return "The DeviceMetric is operating and will generate DeviceObservations.";
            case OFF: return "The DeviceMetric is not operating.";
            case STANDBY: return "The DeviceMetric is operating, but will not generate any DeviceObservations.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ON: return "on";
            case OFF: return "off";
            case STANDBY: return "standby";
            default: return "?";
          }
        }
    }

  public static class MetricOperationalStatusEnumFactory implements EnumFactory<MetricOperationalStatus> {
    public MetricOperationalStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("on".equals(codeString))
          return MetricOperationalStatus.ON;
        if ("off".equals(codeString))
          return MetricOperationalStatus.OFF;
        if ("standby".equals(codeString))
          return MetricOperationalStatus.STANDBY;
        throw new IllegalArgumentException("Unknown MetricOperationalStatus code '"+codeString+"'");
        }
    public String toCode(MetricOperationalStatus code) {
      if (code == MetricOperationalStatus.ON)
        return "on";
      if (code == MetricOperationalStatus.OFF)
        return "off";
      if (code == MetricOperationalStatus.STANDBY)
        return "standby";
      return "?";
      }
    }

    public enum MetricColor {
        /**
         * Color for representation - black.
         */
        BLACK, 
        /**
         * Color for representation - red.
         */
        RED, 
        /**
         * Color for representation - green.
         */
        GREEN, 
        /**
         * Color for representation - yellow.
         */
        YELLOW, 
        /**
         * Color for representation - blue.
         */
        BLUE, 
        /**
         * Color for representation - magenta.
         */
        MAGENTA, 
        /**
         * Color for representation - cyan.
         */
        CYAN, 
        /**
         * Color for representation - white.
         */
        WHITE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static MetricColor fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("black".equals(codeString))
          return BLACK;
        if ("red".equals(codeString))
          return RED;
        if ("green".equals(codeString))
          return GREEN;
        if ("yellow".equals(codeString))
          return YELLOW;
        if ("blue".equals(codeString))
          return BLUE;
        if ("magenta".equals(codeString))
          return MAGENTA;
        if ("cyan".equals(codeString))
          return CYAN;
        if ("white".equals(codeString))
          return WHITE;
        throw new Exception("Unknown MetricColor code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case BLACK: return "black";
            case RED: return "red";
            case GREEN: return "green";
            case YELLOW: return "yellow";
            case BLUE: return "blue";
            case MAGENTA: return "magenta";
            case CYAN: return "cyan";
            case WHITE: return "white";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case BLACK: return "";
            case RED: return "";
            case GREEN: return "";
            case YELLOW: return "";
            case BLUE: return "";
            case MAGENTA: return "";
            case CYAN: return "";
            case WHITE: return "";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case BLACK: return "Color for representation - black.";
            case RED: return "Color for representation - red.";
            case GREEN: return "Color for representation - green.";
            case YELLOW: return "Color for representation - yellow.";
            case BLUE: return "Color for representation - blue.";
            case MAGENTA: return "Color for representation - magenta.";
            case CYAN: return "Color for representation - cyan.";
            case WHITE: return "Color for representation - white.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case BLACK: return "col-black";
            case RED: return "col-red";
            case GREEN: return "col-green";
            case YELLOW: return "col-yellow";
            case BLUE: return "col-blue";
            case MAGENTA: return "col-magenta";
            case CYAN: return "col-cyan";
            case WHITE: return "col-white";
            default: return "?";
          }
        }
    }

  public static class MetricColorEnumFactory implements EnumFactory<MetricColor> {
    public MetricColor fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("black".equals(codeString))
          return MetricColor.BLACK;
        if ("red".equals(codeString))
          return MetricColor.RED;
        if ("green".equals(codeString))
          return MetricColor.GREEN;
        if ("yellow".equals(codeString))
          return MetricColor.YELLOW;
        if ("blue".equals(codeString))
          return MetricColor.BLUE;
        if ("magenta".equals(codeString))
          return MetricColor.MAGENTA;
        if ("cyan".equals(codeString))
          return MetricColor.CYAN;
        if ("white".equals(codeString))
          return MetricColor.WHITE;
        throw new IllegalArgumentException("Unknown MetricColor code '"+codeString+"'");
        }
    public String toCode(MetricColor code) {
      if (code == MetricColor.BLACK)
        return "black";
      if (code == MetricColor.RED)
        return "red";
      if (code == MetricColor.GREEN)
        return "green";
      if (code == MetricColor.YELLOW)
        return "yellow";
      if (code == MetricColor.BLUE)
        return "blue";
      if (code == MetricColor.MAGENTA)
        return "magenta";
      if (code == MetricColor.CYAN)
        return "cyan";
      if (code == MetricColor.WHITE)
        return "white";
      return "?";
      }
    }

    public enum MetricCategory {
        /**
         * DeviceObservations generated for this DeviceMetric are measured.
         */
        MEASUREMENT, 
        /**
         * DeviceObservations generated for this DeviceMetric is a setting that will influence the behavior of the Device.
         */
        SETTING, 
        /**
         * DeviceObservations generated for this DeviceMetric are calculated.
         */
        CALCULATION, 
        /**
         * The category of this DeviceMetric is unspecified.
         */
        UNSPECIFIED, 
        /**
         * added to help the parsers
         */
        NULL;
        public static MetricCategory fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("measurement".equals(codeString))
          return MEASUREMENT;
        if ("setting".equals(codeString))
          return SETTING;
        if ("calculation".equals(codeString))
          return CALCULATION;
        if ("unspecified".equals(codeString))
          return UNSPECIFIED;
        throw new Exception("Unknown MetricCategory code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case MEASUREMENT: return "measurement";
            case SETTING: return "setting";
            case CALCULATION: return "calculation";
            case UNSPECIFIED: return "unspecified";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case MEASUREMENT: return "";
            case SETTING: return "";
            case CALCULATION: return "";
            case UNSPECIFIED: return "";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case MEASUREMENT: return "DeviceObservations generated for this DeviceMetric are measured.";
            case SETTING: return "DeviceObservations generated for this DeviceMetric is a setting that will influence the behavior of the Device.";
            case CALCULATION: return "DeviceObservations generated for this DeviceMetric are calculated.";
            case UNSPECIFIED: return "The category of this DeviceMetric is unspecified.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case MEASUREMENT: return "measurement";
            case SETTING: return "setting";
            case CALCULATION: return "calculation";
            case UNSPECIFIED: return "unspecified";
            default: return "?";
          }
        }
    }

  public static class MetricCategoryEnumFactory implements EnumFactory<MetricCategory> {
    public MetricCategory fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("measurement".equals(codeString))
          return MetricCategory.MEASUREMENT;
        if ("setting".equals(codeString))
          return MetricCategory.SETTING;
        if ("calculation".equals(codeString))
          return MetricCategory.CALCULATION;
        if ("unspecified".equals(codeString))
          return MetricCategory.UNSPECIFIED;
        throw new IllegalArgumentException("Unknown MetricCategory code '"+codeString+"'");
        }
    public String toCode(MetricCategory code) {
      if (code == MetricCategory.MEASUREMENT)
        return "measurement";
      if (code == MetricCategory.SETTING)
        return "setting";
      if (code == MetricCategory.CALCULATION)
        return "calculation";
      if (code == MetricCategory.UNSPECIFIED)
        return "unspecified";
      return "?";
      }
    }

    public enum MetricCalibrationType {
        /**
         * TODO.
         */
        UNSPECIFIED, 
        /**
         * TODO.
         */
        OFFSET, 
        /**
         * TODO.
         */
        GAIN, 
        /**
         * TODO.
         */
        TWOPOINT, 
        /**
         * added to help the parsers
         */
        NULL;
        public static MetricCalibrationType fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("unspecified".equals(codeString))
          return UNSPECIFIED;
        if ("offset".equals(codeString))
          return OFFSET;
        if ("gain".equals(codeString))
          return GAIN;
        if ("two-point".equals(codeString))
          return TWOPOINT;
        throw new Exception("Unknown MetricCalibrationType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case UNSPECIFIED: return "unspecified";
            case OFFSET: return "offset";
            case GAIN: return "gain";
            case TWOPOINT: return "two-point";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case UNSPECIFIED: return "";
            case OFFSET: return "";
            case GAIN: return "";
            case TWOPOINT: return "";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case UNSPECIFIED: return "TODO.";
            case OFFSET: return "TODO.";
            case GAIN: return "TODO.";
            case TWOPOINT: return "TODO.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case UNSPECIFIED: return "unspecified";
            case OFFSET: return "offset";
            case GAIN: return "gain";
            case TWOPOINT: return "two-point";
            default: return "?";
          }
        }
    }

  public static class MetricCalibrationTypeEnumFactory implements EnumFactory<MetricCalibrationType> {
    public MetricCalibrationType fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("unspecified".equals(codeString))
          return MetricCalibrationType.UNSPECIFIED;
        if ("offset".equals(codeString))
          return MetricCalibrationType.OFFSET;
        if ("gain".equals(codeString))
          return MetricCalibrationType.GAIN;
        if ("two-point".equals(codeString))
          return MetricCalibrationType.TWOPOINT;
        throw new IllegalArgumentException("Unknown MetricCalibrationType code '"+codeString+"'");
        }
    public String toCode(MetricCalibrationType code) {
      if (code == MetricCalibrationType.UNSPECIFIED)
        return "unspecified";
      if (code == MetricCalibrationType.OFFSET)
        return "offset";
      if (code == MetricCalibrationType.GAIN)
        return "gain";
      if (code == MetricCalibrationType.TWOPOINT)
        return "two-point";
      return "?";
      }
    }

    public enum MetricCalibrationState {
        /**
         * The metric has not been calibrated.
         */
        NOTCALIBRATED, 
        /**
         * The metric needs to be calibrated.
         */
        CALIBRATIONREQUIRED, 
        /**
         * The metric has been calibrated.
         */
        CALIBRATED, 
        /**
         * The state of calibration of this metric is unspecified.
         */
        UNSPECIFIED, 
        /**
         * added to help the parsers
         */
        NULL;
        public static MetricCalibrationState fromCode(String codeString) throws Exception {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("not-calibrated".equals(codeString))
          return NOTCALIBRATED;
        if ("calibration-required".equals(codeString))
          return CALIBRATIONREQUIRED;
        if ("calibrated".equals(codeString))
          return CALIBRATED;
        if ("unspecified".equals(codeString))
          return UNSPECIFIED;
        throw new Exception("Unknown MetricCalibrationState code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case NOTCALIBRATED: return "not-calibrated";
            case CALIBRATIONREQUIRED: return "calibration-required";
            case CALIBRATED: return "calibrated";
            case UNSPECIFIED: return "unspecified";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case NOTCALIBRATED: return "";
            case CALIBRATIONREQUIRED: return "";
            case CALIBRATED: return "";
            case UNSPECIFIED: return "";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case NOTCALIBRATED: return "The metric has not been calibrated.";
            case CALIBRATIONREQUIRED: return "The metric needs to be calibrated.";
            case CALIBRATED: return "The metric has been calibrated.";
            case UNSPECIFIED: return "The state of calibration of this metric is unspecified.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case NOTCALIBRATED: return "not-calibrated";
            case CALIBRATIONREQUIRED: return "calibration-required";
            case CALIBRATED: return "calibrated";
            case UNSPECIFIED: return "unspecified";
            default: return "?";
          }
        }
    }

  public static class MetricCalibrationStateEnumFactory implements EnumFactory<MetricCalibrationState> {
    public MetricCalibrationState fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("not-calibrated".equals(codeString))
          return MetricCalibrationState.NOTCALIBRATED;
        if ("calibration-required".equals(codeString))
          return MetricCalibrationState.CALIBRATIONREQUIRED;
        if ("calibrated".equals(codeString))
          return MetricCalibrationState.CALIBRATED;
        if ("unspecified".equals(codeString))
          return MetricCalibrationState.UNSPECIFIED;
        throw new IllegalArgumentException("Unknown MetricCalibrationState code '"+codeString+"'");
        }
    public String toCode(MetricCalibrationState code) {
      if (code == MetricCalibrationState.NOTCALIBRATED)
        return "not-calibrated";
      if (code == MetricCalibrationState.CALIBRATIONREQUIRED)
        return "calibration-required";
      if (code == MetricCalibrationState.CALIBRATED)
        return "calibrated";
      if (code == MetricCalibrationState.UNSPECIFIED)
        return "unspecified";
      return "?";
      }
    }

    @Block()
    public static class DeviceMetricCalibrationComponent extends BackboneElement {
        /**
         * Describes the type of the calibration method.
         */
        @Child(name="type", type={CodeType.class}, order=1, min=0, max=1)
        @Description(shortDefinition="unspecified | offset | gain | two-point", formalDefinition="Describes the type of the calibration method." )
        protected Enumeration<MetricCalibrationType> type;

        /**
         * Describes the state of the calibration.
         */
        @Child(name="state", type={CodeType.class}, order=2, min=0, max=1)
        @Description(shortDefinition="not-calibrated | calibration-required | calibrated | unspecified", formalDefinition="Describes the state of the calibration." )
        protected Enumeration<MetricCalibrationState> state;

        /**
         * Describes the time last calibration has been performed.
         */
        @Child(name="time", type={InstantType.class}, order=3, min=0, max=1)
        @Description(shortDefinition="Describes the time last calibration has been performed", formalDefinition="Describes the time last calibration has been performed." )
        protected InstantType time;

        private static final long serialVersionUID = 407720126L;

      public DeviceMetricCalibrationComponent() {
        super();
      }

        /**
         * @return {@link #type} (Describes the type of the calibration method.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public Enumeration<MetricCalibrationType> getTypeElement() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DeviceMetricCalibrationComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new Enumeration<MetricCalibrationType>(new MetricCalibrationTypeEnumFactory()); // bb
          return this.type;
        }

        public boolean hasTypeElement() { 
          return this.type != null && !this.type.isEmpty();
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (Describes the type of the calibration method.). This is the underlying object with id, value and extensions. The accessor "getType" gives direct access to the value
         */
        public DeviceMetricCalibrationComponent setTypeElement(Enumeration<MetricCalibrationType> value) { 
          this.type = value;
          return this;
        }

        /**
         * @return Describes the type of the calibration method.
         */
        public MetricCalibrationType getType() { 
          return this.type == null ? null : this.type.getValue();
        }

        /**
         * @param value Describes the type of the calibration method.
         */
        public DeviceMetricCalibrationComponent setType(MetricCalibrationType value) { 
          if (value == null)
            this.type = null;
          else {
            if (this.type == null)
              this.type = new Enumeration<MetricCalibrationType>(new MetricCalibrationTypeEnumFactory());
            this.type.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #state} (Describes the state of the calibration.). This is the underlying object with id, value and extensions. The accessor "getState" gives direct access to the value
         */
        public Enumeration<MetricCalibrationState> getStateElement() { 
          if (this.state == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DeviceMetricCalibrationComponent.state");
            else if (Configuration.doAutoCreate())
              this.state = new Enumeration<MetricCalibrationState>(new MetricCalibrationStateEnumFactory()); // bb
          return this.state;
        }

        public boolean hasStateElement() { 
          return this.state != null && !this.state.isEmpty();
        }

        public boolean hasState() { 
          return this.state != null && !this.state.isEmpty();
        }

        /**
         * @param value {@link #state} (Describes the state of the calibration.). This is the underlying object with id, value and extensions. The accessor "getState" gives direct access to the value
         */
        public DeviceMetricCalibrationComponent setStateElement(Enumeration<MetricCalibrationState> value) { 
          this.state = value;
          return this;
        }

        /**
         * @return Describes the state of the calibration.
         */
        public MetricCalibrationState getState() { 
          return this.state == null ? null : this.state.getValue();
        }

        /**
         * @param value Describes the state of the calibration.
         */
        public DeviceMetricCalibrationComponent setState(MetricCalibrationState value) { 
          if (value == null)
            this.state = null;
          else {
            if (this.state == null)
              this.state = new Enumeration<MetricCalibrationState>(new MetricCalibrationStateEnumFactory());
            this.state.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #time} (Describes the time last calibration has been performed.). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
         */
        public InstantType getTimeElement() { 
          if (this.time == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DeviceMetricCalibrationComponent.time");
            else if (Configuration.doAutoCreate())
              this.time = new InstantType(); // bb
          return this.time;
        }

        public boolean hasTimeElement() { 
          return this.time != null && !this.time.isEmpty();
        }

        public boolean hasTime() { 
          return this.time != null && !this.time.isEmpty();
        }

        /**
         * @param value {@link #time} (Describes the time last calibration has been performed.). This is the underlying object with id, value and extensions. The accessor "getTime" gives direct access to the value
         */
        public DeviceMetricCalibrationComponent setTimeElement(InstantType value) { 
          this.time = value;
          return this;
        }

        /**
         * @return Describes the time last calibration has been performed.
         */
        public Date getTime() { 
          return this.time == null ? null : this.time.getValue();
        }

        /**
         * @param value Describes the time last calibration has been performed.
         */
        public DeviceMetricCalibrationComponent setTime(Date value) { 
          if (value == null)
            this.time = null;
          else {
            if (this.time == null)
              this.time = new InstantType();
            this.time.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> childrenList) {
          super.listChildren(childrenList);
          childrenList.add(new Property("type", "code", "Describes the type of the calibration method.", 0, java.lang.Integer.MAX_VALUE, type));
          childrenList.add(new Property("state", "code", "Describes the state of the calibration.", 0, java.lang.Integer.MAX_VALUE, state));
          childrenList.add(new Property("time", "instant", "Describes the time last calibration has been performed.", 0, java.lang.Integer.MAX_VALUE, time));
        }

      public DeviceMetricCalibrationComponent copy() {
        DeviceMetricCalibrationComponent dst = new DeviceMetricCalibrationComponent();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.state = state == null ? null : state.copy();
        dst.time = time == null ? null : time.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof DeviceMetricCalibrationComponent))
          return false;
        DeviceMetricCalibrationComponent o = (DeviceMetricCalibrationComponent) other;
        return compareDeep(type, o.type, true) && compareDeep(state, o.state, true) && compareDeep(time, o.time, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof DeviceMetricCalibrationComponent))
          return false;
        DeviceMetricCalibrationComponent o = (DeviceMetricCalibrationComponent) other;
        return compareValues(type, o.type, true) && compareValues(state, o.state, true) && compareValues(time, o.time, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (state == null || state.isEmpty())
           && (time == null || time.isEmpty());
      }

  }

    /**
     * Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.
     */
    @Child(name="type", type={CodeableConcept.class}, order=0, min=1, max=1)
    @Description(shortDefinition="Type of metric", formalDefinition="Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc." )
    protected CodeableConcept type;

    /**
     * Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID. 
It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.
     */
    @Child(name="identifier", type={Identifier.class}, order=1, min=1, max=1)
    @Description(shortDefinition="Unique identifier of this DeviceMetric", formalDefinition="Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID. \nIt should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device." )
    protected Identifier identifier;

    /**
     * Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.
     */
    @Child(name="unit", type={CodeableConcept.class}, order=2, min=0, max=1)
    @Description(shortDefinition="Unit of metric", formalDefinition="Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc." )
    protected CodeableConcept unit;

    /**
     * Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.
     */
    @Child(name="source", type={Device.class}, order=3, min=0, max=1)
    @Description(shortDefinition="Describes the link to the source Device", formalDefinition="Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc." )
    protected Reference source;

    /**
     * The actual object that is the target of the reference (Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.)
     */
    protected Device sourceTarget;

    /**
     * Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device.
An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.
     */
    @Child(name="parent", type={DeviceComponent.class}, order=4, min=0, max=1)
    @Description(shortDefinition="Describes the link to the parent DeviceComponent", formalDefinition="Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device.\nAn example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location." )
    protected Reference parent;

    /**
     * The actual object that is the target of the reference (Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device.
An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.)
     */
    protected DeviceComponent parentTarget;

    /**
     * Indicates current operational state of the device. For example: On, Off, Standby, etc.
     */
    @Child(name="operationalStatus", type={CodeType.class}, order=5, min=0, max=1)
    @Description(shortDefinition="on | off | standby", formalDefinition="Indicates current operational state of the device. For example: On, Off, Standby, etc." )
    protected Enumeration<MetricOperationalStatus> operationalStatus;

    /**
     * Describes the typical color of the representation of observations that have been generated for this DeviceMetric.
     */
    @Child(name="color", type={CodeType.class}, order=6, min=0, max=1)
    @Description(shortDefinition="black | red | green | yellow | blue | magenta | cyan | white", formalDefinition="Describes the typical color of the representation of observations that have been generated for this DeviceMetric." )
    protected Enumeration<MetricColor> color;

    /**
     * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     */
    @Child(name="category", type={CodeType.class}, order=7, min=1, max=1)
    @Description(shortDefinition="measurement | setting | calculation | unspecified", formalDefinition="Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation." )
    protected Enumeration<MetricCategory> category;

    /**
     * Describes the measurement repetition time. This is not
necessarily the same as the update
period.
     */
    @Child(name="measurementPeriod", type={Timing.class}, order=8, min=0, max=1)
    @Description(shortDefinition="Describes the measurement repetition time", formalDefinition="Describes the measurement repetition time. This is not\nnecessarily the same as the update\nperiod." )
    protected Timing measurementPeriod;

    /**
     * Describes the calibrations that have been performed or that are required to be performed.
     */
    @Child(name="calibration", type={}, order=9, min=0, max=Child.MAX_UNLIMITED)
    @Description(shortDefinition="Describes the calibrations that have been performed or that are required to be performed", formalDefinition="Describes the calibrations that have been performed or that are required to be performed." )
    protected List<DeviceMetricCalibrationComponent> calibration;

    private static final long serialVersionUID = -480554704L;

    public DeviceMetric() {
      super();
    }

    public DeviceMetric(CodeableConcept type, Identifier identifier, Enumeration<MetricCategory> category) {
      super();
      this.type = type;
      this.identifier = identifier;
      this.category = category;
    }

    /**
     * @return {@link #type} (Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.)
     */
    public CodeableConcept getType() { 
      if (this.type == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetric.type");
        else if (Configuration.doAutoCreate())
          this.type = new CodeableConcept(); // cc
      return this.type;
    }

    public boolean hasType() { 
      return this.type != null && !this.type.isEmpty();
    }

    /**
     * @param value {@link #type} (Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.)
     */
    public DeviceMetric setType(CodeableConcept value) { 
      this.type = value;
      return this;
    }

    /**
     * @return {@link #identifier} (Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID. 
It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.)
     */
    public Identifier getIdentifier() { 
      if (this.identifier == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetric.identifier");
        else if (Configuration.doAutoCreate())
          this.identifier = new Identifier(); // cc
      return this.identifier;
    }

    public boolean hasIdentifier() { 
      return this.identifier != null && !this.identifier.isEmpty();
    }

    /**
     * @param value {@link #identifier} (Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID. 
It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.)
     */
    public DeviceMetric setIdentifier(Identifier value) { 
      this.identifier = value;
      return this;
    }

    /**
     * @return {@link #unit} (Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.)
     */
    public CodeableConcept getUnit() { 
      if (this.unit == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetric.unit");
        else if (Configuration.doAutoCreate())
          this.unit = new CodeableConcept(); // cc
      return this.unit;
    }

    public boolean hasUnit() { 
      return this.unit != null && !this.unit.isEmpty();
    }

    /**
     * @param value {@link #unit} (Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.)
     */
    public DeviceMetric setUnit(CodeableConcept value) { 
      this.unit = value;
      return this;
    }

    /**
     * @return {@link #source} (Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.)
     */
    public Reference getSource() { 
      if (this.source == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetric.source");
        else if (Configuration.doAutoCreate())
          this.source = new Reference(); // cc
      return this.source;
    }

    public boolean hasSource() { 
      return this.source != null && !this.source.isEmpty();
    }

    /**
     * @param value {@link #source} (Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.)
     */
    public DeviceMetric setSource(Reference value) { 
      this.source = value;
      return this;
    }

    /**
     * @return {@link #source} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.)
     */
    public Device getSourceTarget() { 
      if (this.sourceTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetric.source");
        else if (Configuration.doAutoCreate())
          this.sourceTarget = new Device(); // aa
      return this.sourceTarget;
    }

    /**
     * @param value {@link #source} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.)
     */
    public DeviceMetric setSourceTarget(Device value) { 
      this.sourceTarget = value;
      return this;
    }

    /**
     * @return {@link #parent} (Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device.
An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.)
     */
    public Reference getParent() { 
      if (this.parent == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetric.parent");
        else if (Configuration.doAutoCreate())
          this.parent = new Reference(); // cc
      return this.parent;
    }

    public boolean hasParent() { 
      return this.parent != null && !this.parent.isEmpty();
    }

    /**
     * @param value {@link #parent} (Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device.
An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.)
     */
    public DeviceMetric setParent(Reference value) { 
      this.parent = value;
      return this;
    }

    /**
     * @return {@link #parent} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device.
An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.)
     */
    public DeviceComponent getParentTarget() { 
      if (this.parentTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetric.parent");
        else if (Configuration.doAutoCreate())
          this.parentTarget = new DeviceComponent(); // aa
      return this.parentTarget;
    }

    /**
     * @param value {@link #parent} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device.
An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.)
     */
    public DeviceMetric setParentTarget(DeviceComponent value) { 
      this.parentTarget = value;
      return this;
    }

    /**
     * @return {@link #operationalStatus} (Indicates current operational state of the device. For example: On, Off, Standby, etc.). This is the underlying object with id, value and extensions. The accessor "getOperationalStatus" gives direct access to the value
     */
    public Enumeration<MetricOperationalStatus> getOperationalStatusElement() { 
      if (this.operationalStatus == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetric.operationalStatus");
        else if (Configuration.doAutoCreate())
          this.operationalStatus = new Enumeration<MetricOperationalStatus>(new MetricOperationalStatusEnumFactory()); // bb
      return this.operationalStatus;
    }

    public boolean hasOperationalStatusElement() { 
      return this.operationalStatus != null && !this.operationalStatus.isEmpty();
    }

    public boolean hasOperationalStatus() { 
      return this.operationalStatus != null && !this.operationalStatus.isEmpty();
    }

    /**
     * @param value {@link #operationalStatus} (Indicates current operational state of the device. For example: On, Off, Standby, etc.). This is the underlying object with id, value and extensions. The accessor "getOperationalStatus" gives direct access to the value
     */
    public DeviceMetric setOperationalStatusElement(Enumeration<MetricOperationalStatus> value) { 
      this.operationalStatus = value;
      return this;
    }

    /**
     * @return Indicates current operational state of the device. For example: On, Off, Standby, etc.
     */
    public MetricOperationalStatus getOperationalStatus() { 
      return this.operationalStatus == null ? null : this.operationalStatus.getValue();
    }

    /**
     * @param value Indicates current operational state of the device. For example: On, Off, Standby, etc.
     */
    public DeviceMetric setOperationalStatus(MetricOperationalStatus value) { 
      if (value == null)
        this.operationalStatus = null;
      else {
        if (this.operationalStatus == null)
          this.operationalStatus = new Enumeration<MetricOperationalStatus>(new MetricOperationalStatusEnumFactory());
        this.operationalStatus.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #color} (Describes the typical color of the representation of observations that have been generated for this DeviceMetric.). This is the underlying object with id, value and extensions. The accessor "getColor" gives direct access to the value
     */
    public Enumeration<MetricColor> getColorElement() { 
      if (this.color == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetric.color");
        else if (Configuration.doAutoCreate())
          this.color = new Enumeration<MetricColor>(new MetricColorEnumFactory()); // bb
      return this.color;
    }

    public boolean hasColorElement() { 
      return this.color != null && !this.color.isEmpty();
    }

    public boolean hasColor() { 
      return this.color != null && !this.color.isEmpty();
    }

    /**
     * @param value {@link #color} (Describes the typical color of the representation of observations that have been generated for this DeviceMetric.). This is the underlying object with id, value and extensions. The accessor "getColor" gives direct access to the value
     */
    public DeviceMetric setColorElement(Enumeration<MetricColor> value) { 
      this.color = value;
      return this;
    }

    /**
     * @return Describes the typical color of the representation of observations that have been generated for this DeviceMetric.
     */
    public MetricColor getColor() { 
      return this.color == null ? null : this.color.getValue();
    }

    /**
     * @param value Describes the typical color of the representation of observations that have been generated for this DeviceMetric.
     */
    public DeviceMetric setColor(MetricColor value) { 
      if (value == null)
        this.color = null;
      else {
        if (this.color == null)
          this.color = new Enumeration<MetricColor>(new MetricColorEnumFactory());
        this.color.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #category} (Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.). This is the underlying object with id, value and extensions. The accessor "getCategory" gives direct access to the value
     */
    public Enumeration<MetricCategory> getCategoryElement() { 
      if (this.category == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetric.category");
        else if (Configuration.doAutoCreate())
          this.category = new Enumeration<MetricCategory>(new MetricCategoryEnumFactory()); // bb
      return this.category;
    }

    public boolean hasCategoryElement() { 
      return this.category != null && !this.category.isEmpty();
    }

    public boolean hasCategory() { 
      return this.category != null && !this.category.isEmpty();
    }

    /**
     * @param value {@link #category} (Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.). This is the underlying object with id, value and extensions. The accessor "getCategory" gives direct access to the value
     */
    public DeviceMetric setCategoryElement(Enumeration<MetricCategory> value) { 
      this.category = value;
      return this;
    }

    /**
     * @return Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     */
    public MetricCategory getCategory() { 
      return this.category == null ? null : this.category.getValue();
    }

    /**
     * @param value Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     */
    public DeviceMetric setCategory(MetricCategory value) { 
        if (this.category == null)
          this.category = new Enumeration<MetricCategory>(new MetricCategoryEnumFactory());
        this.category.setValue(value);
      return this;
    }

    /**
     * @return {@link #measurementPeriod} (Describes the measurement repetition time. This is not
necessarily the same as the update
period.)
     */
    public Timing getMeasurementPeriod() { 
      if (this.measurementPeriod == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create DeviceMetric.measurementPeriod");
        else if (Configuration.doAutoCreate())
          this.measurementPeriod = new Timing(); // cc
      return this.measurementPeriod;
    }

    public boolean hasMeasurementPeriod() { 
      return this.measurementPeriod != null && !this.measurementPeriod.isEmpty();
    }

    /**
     * @param value {@link #measurementPeriod} (Describes the measurement repetition time. This is not
necessarily the same as the update
period.)
     */
    public DeviceMetric setMeasurementPeriod(Timing value) { 
      this.measurementPeriod = value;
      return this;
    }

    /**
     * @return {@link #calibration} (Describes the calibrations that have been performed or that are required to be performed.)
     */
    public List<DeviceMetricCalibrationComponent> getCalibration() { 
      if (this.calibration == null)
        this.calibration = new ArrayList<DeviceMetricCalibrationComponent>();
      return this.calibration;
    }

    public boolean hasCalibration() { 
      if (this.calibration == null)
        return false;
      for (DeviceMetricCalibrationComponent item : this.calibration)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #calibration} (Describes the calibrations that have been performed or that are required to be performed.)
     */
    // syntactic sugar
    public DeviceMetricCalibrationComponent addCalibration() { //3
      DeviceMetricCalibrationComponent t = new DeviceMetricCalibrationComponent();
      if (this.calibration == null)
        this.calibration = new ArrayList<DeviceMetricCalibrationComponent>();
      this.calibration.add(t);
      return t;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("type", "CodeableConcept", "Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.", 0, java.lang.Integer.MAX_VALUE, type));
        childrenList.add(new Property("identifier", "Identifier", "Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID. \nIt should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.", 0, java.lang.Integer.MAX_VALUE, identifier));
        childrenList.add(new Property("unit", "CodeableConcept", "Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.", 0, java.lang.Integer.MAX_VALUE, unit));
        childrenList.add(new Property("source", "Reference(Device)", "Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.", 0, java.lang.Integer.MAX_VALUE, source));
        childrenList.add(new Property("parent", "Reference(DeviceComponent)", "Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device.\nAn example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.", 0, java.lang.Integer.MAX_VALUE, parent));
        childrenList.add(new Property("operationalStatus", "code", "Indicates current operational state of the device. For example: On, Off, Standby, etc.", 0, java.lang.Integer.MAX_VALUE, operationalStatus));
        childrenList.add(new Property("color", "code", "Describes the typical color of the representation of observations that have been generated for this DeviceMetric.", 0, java.lang.Integer.MAX_VALUE, color));
        childrenList.add(new Property("category", "code", "Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.", 0, java.lang.Integer.MAX_VALUE, category));
        childrenList.add(new Property("measurementPeriod", "Timing", "Describes the measurement repetition time. This is not\nnecessarily the same as the update\nperiod.", 0, java.lang.Integer.MAX_VALUE, measurementPeriod));
        childrenList.add(new Property("calibration", "", "Describes the calibrations that have been performed or that are required to be performed.", 0, java.lang.Integer.MAX_VALUE, calibration));
      }

      public DeviceMetric copy() {
        DeviceMetric dst = new DeviceMetric();
        copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.unit = unit == null ? null : unit.copy();
        dst.source = source == null ? null : source.copy();
        dst.parent = parent == null ? null : parent.copy();
        dst.operationalStatus = operationalStatus == null ? null : operationalStatus.copy();
        dst.color = color == null ? null : color.copy();
        dst.category = category == null ? null : category.copy();
        dst.measurementPeriod = measurementPeriod == null ? null : measurementPeriod.copy();
        if (calibration != null) {
          dst.calibration = new ArrayList<DeviceMetricCalibrationComponent>();
          for (DeviceMetricCalibrationComponent i : calibration)
            dst.calibration.add(i.copy());
        };
        return dst;
      }

      protected DeviceMetric typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
          return false;
        if (!(other instanceof DeviceMetric))
          return false;
        DeviceMetric o = (DeviceMetric) other;
        return compareDeep(type, o.type, true) && compareDeep(identifier, o.identifier, true) && compareDeep(unit, o.unit, true)
           && compareDeep(source, o.source, true) && compareDeep(parent, o.parent, true) && compareDeep(operationalStatus, o.operationalStatus, true)
           && compareDeep(color, o.color, true) && compareDeep(category, o.category, true) && compareDeep(measurementPeriod, o.measurementPeriod, true)
           && compareDeep(calibration, o.calibration, true);
      }

      @Override
      public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
          return false;
        if (!(other instanceof DeviceMetric))
          return false;
        DeviceMetric o = (DeviceMetric) other;
        return compareValues(operationalStatus, o.operationalStatus, true) && compareValues(color, o.color, true)
           && compareValues(category, o.category, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && (type == null || type.isEmpty()) && (identifier == null || identifier.isEmpty())
           && (unit == null || unit.isEmpty()) && (source == null || source.isEmpty()) && (parent == null || parent.isEmpty())
           && (operationalStatus == null || operationalStatus.isEmpty()) && (color == null || color.isEmpty())
           && (category == null || category.isEmpty()) && (measurementPeriod == null || measurementPeriod.isEmpty())
           && (calibration == null || calibration.isEmpty());
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.DeviceMetric;
   }

  @SearchParamDefinition(name="category", path="DeviceMetric.category", description="The category of the metric", type="token" )
  public static final String SP_CATEGORY = "category";
  @SearchParamDefinition(name="source", path="DeviceMetric.source", description="The device resource", type="reference" )
  public static final String SP_SOURCE = "source";
  @SearchParamDefinition(name="parent", path="DeviceMetric.parent", description="The parent DeviceMetric resource", type="reference" )
  public static final String SP_PARENT = "parent";
  @SearchParamDefinition(name="type", path="DeviceMetric.type", description="The component type", type="token" )
  public static final String SP_TYPE = "type";
  @SearchParamDefinition(name="identifier", path="DeviceMetric.identifier", description="The identifier of the metric", type="token" )
  public static final String SP_IDENTIFIER = "identifier";

}


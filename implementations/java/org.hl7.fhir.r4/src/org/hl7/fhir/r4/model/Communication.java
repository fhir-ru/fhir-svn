package org.hl7.fhir.r4.model;

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

// Generated on Sun, Mar 18, 2018 07:33+1100 for FHIR v3.2.0

import java.util.*;

import org.hl7.fhir.utilities.Utilities;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;
import org.hl7.fhir.instance.model.api.*;
import org.hl7.fhir.exceptions.FHIRException;
/**
 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.
 */
@ResourceDef(name="Communication", profile="http://hl7.org/fhir/Profile/Communication")
public class Communication extends DomainResource {

    public enum CommunicationStatus {
        /**
         * The core event has not started yet, but some staging activities have begun (e.g. surgical suite preparation).  Preparation stages may be tracked for billing purposes.
         */
        PREPARATION, 
        /**
         * The event is currently occurring
         */
        INPROGRESS, 
        /**
         * The event was terminated prior to any impact on the subject (though preparatory actions may have been taken)
         */
        NOTDONE, 
        /**
         * The event has been temporarily stopped but is expected to resume in the future
         */
        SUSPENDED, 
        /**
         * The event was  terminated prior to the full completion of the intended actions but after having at least some impact on the subject.
         */
        ABORTED, 
        /**
         * The event has now concluded
         */
        COMPLETED, 
        /**
         * This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be "cancelled" rather than "entered-in-error".)
         */
        ENTEREDINERROR, 
        /**
         * The authoring system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for "other" - one of the listed statuses is presumed to apply, it's just not known which one.
         */
        UNKNOWN, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static CommunicationStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("preparation".equals(codeString))
          return PREPARATION;
        if ("in-progress".equals(codeString))
          return INPROGRESS;
        if ("not-done".equals(codeString))
          return NOTDONE;
        if ("suspended".equals(codeString))
          return SUSPENDED;
        if ("aborted".equals(codeString))
          return ABORTED;
        if ("completed".equals(codeString))
          return COMPLETED;
        if ("entered-in-error".equals(codeString))
          return ENTEREDINERROR;
        if ("unknown".equals(codeString))
          return UNKNOWN;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown CommunicationStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case PREPARATION: return "preparation";
            case INPROGRESS: return "in-progress";
            case NOTDONE: return "not-done";
            case SUSPENDED: return "suspended";
            case ABORTED: return "aborted";
            case COMPLETED: return "completed";
            case ENTEREDINERROR: return "entered-in-error";
            case UNKNOWN: return "unknown";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case PREPARATION: return "http://hl7.org/fhir/event-status";
            case INPROGRESS: return "http://hl7.org/fhir/event-status";
            case NOTDONE: return "http://hl7.org/fhir/event-status";
            case SUSPENDED: return "http://hl7.org/fhir/event-status";
            case ABORTED: return "http://hl7.org/fhir/event-status";
            case COMPLETED: return "http://hl7.org/fhir/event-status";
            case ENTEREDINERROR: return "http://hl7.org/fhir/event-status";
            case UNKNOWN: return "http://hl7.org/fhir/event-status";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case PREPARATION: return "The core event has not started yet, but some staging activities have begun (e.g. surgical suite preparation).  Preparation stages may be tracked for billing purposes.";
            case INPROGRESS: return "The event is currently occurring";
            case NOTDONE: return "The event was terminated prior to any impact on the subject (though preparatory actions may have been taken)";
            case SUSPENDED: return "The event has been temporarily stopped but is expected to resume in the future";
            case ABORTED: return "The event was  terminated prior to the full completion of the intended actions but after having at least some impact on the subject.";
            case COMPLETED: return "The event has now concluded";
            case ENTEREDINERROR: return "This electronic record should never have existed, though it is possible that real-world decisions were based on it.  (If real-world activity has occurred, the status should be \"cancelled\" rather than \"entered-in-error\".)";
            case UNKNOWN: return "The authoring system does not know which of the status values currently applies for this request.  Note: This concept is not to be used for \"other\" - one of the listed statuses is presumed to apply, it's just not known which one.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case PREPARATION: return "Preparation";
            case INPROGRESS: return "In Progress";
            case NOTDONE: return "Not Done";
            case SUSPENDED: return "Suspended";
            case ABORTED: return "Aborted";
            case COMPLETED: return "Completed";
            case ENTEREDINERROR: return "Entered in Error";
            case UNKNOWN: return "Unknown";
            default: return "?";
          }
        }
    }

  public static class CommunicationStatusEnumFactory implements EnumFactory<CommunicationStatus> {
    public CommunicationStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("preparation".equals(codeString))
          return CommunicationStatus.PREPARATION;
        if ("in-progress".equals(codeString))
          return CommunicationStatus.INPROGRESS;
        if ("not-done".equals(codeString))
          return CommunicationStatus.NOTDONE;
        if ("suspended".equals(codeString))
          return CommunicationStatus.SUSPENDED;
        if ("aborted".equals(codeString))
          return CommunicationStatus.ABORTED;
        if ("completed".equals(codeString))
          return CommunicationStatus.COMPLETED;
        if ("entered-in-error".equals(codeString))
          return CommunicationStatus.ENTEREDINERROR;
        if ("unknown".equals(codeString))
          return CommunicationStatus.UNKNOWN;
        throw new IllegalArgumentException("Unknown CommunicationStatus code '"+codeString+"'");
        }
        public Enumeration<CommunicationStatus> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<CommunicationStatus>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("preparation".equals(codeString))
          return new Enumeration<CommunicationStatus>(this, CommunicationStatus.PREPARATION);
        if ("in-progress".equals(codeString))
          return new Enumeration<CommunicationStatus>(this, CommunicationStatus.INPROGRESS);
        if ("not-done".equals(codeString))
          return new Enumeration<CommunicationStatus>(this, CommunicationStatus.NOTDONE);
        if ("suspended".equals(codeString))
          return new Enumeration<CommunicationStatus>(this, CommunicationStatus.SUSPENDED);
        if ("aborted".equals(codeString))
          return new Enumeration<CommunicationStatus>(this, CommunicationStatus.ABORTED);
        if ("completed".equals(codeString))
          return new Enumeration<CommunicationStatus>(this, CommunicationStatus.COMPLETED);
        if ("entered-in-error".equals(codeString))
          return new Enumeration<CommunicationStatus>(this, CommunicationStatus.ENTEREDINERROR);
        if ("unknown".equals(codeString))
          return new Enumeration<CommunicationStatus>(this, CommunicationStatus.UNKNOWN);
        throw new FHIRException("Unknown CommunicationStatus code '"+codeString+"'");
        }
    public String toCode(CommunicationStatus code) {
      if (code == CommunicationStatus.PREPARATION)
        return "preparation";
      if (code == CommunicationStatus.INPROGRESS)
        return "in-progress";
      if (code == CommunicationStatus.NOTDONE)
        return "not-done";
      if (code == CommunicationStatus.SUSPENDED)
        return "suspended";
      if (code == CommunicationStatus.ABORTED)
        return "aborted";
      if (code == CommunicationStatus.COMPLETED)
        return "completed";
      if (code == CommunicationStatus.ENTEREDINERROR)
        return "entered-in-error";
      if (code == CommunicationStatus.UNKNOWN)
        return "unknown";
      return "?";
      }
    public String toSystem(CommunicationStatus code) {
      return code.getSystem();
      }
    }

    public enum CommunicationPriority {
        /**
         * The request has normal priority
         */
        ROUTINE, 
        /**
         * The request should be actioned promptly - higher priority than routine
         */
        URGENT, 
        /**
         * The request should be actioned as soon as possible - higher priority than urgent
         */
        ASAP, 
        /**
         * The request should be actioned immediately - highest possible priority.  E.g. an emergency
         */
        STAT, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static CommunicationPriority fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("routine".equals(codeString))
          return ROUTINE;
        if ("urgent".equals(codeString))
          return URGENT;
        if ("asap".equals(codeString))
          return ASAP;
        if ("stat".equals(codeString))
          return STAT;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown CommunicationPriority code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case ROUTINE: return "routine";
            case URGENT: return "urgent";
            case ASAP: return "asap";
            case STAT: return "stat";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case ROUTINE: return "http://hl7.org/fhir/request-priority";
            case URGENT: return "http://hl7.org/fhir/request-priority";
            case ASAP: return "http://hl7.org/fhir/request-priority";
            case STAT: return "http://hl7.org/fhir/request-priority";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case ROUTINE: return "The request has normal priority";
            case URGENT: return "The request should be actioned promptly - higher priority than routine";
            case ASAP: return "The request should be actioned as soon as possible - higher priority than urgent";
            case STAT: return "The request should be actioned immediately - highest possible priority.  E.g. an emergency";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case ROUTINE: return "Routine";
            case URGENT: return "Urgent";
            case ASAP: return "ASAP";
            case STAT: return "STAT";
            default: return "?";
          }
        }
    }

  public static class CommunicationPriorityEnumFactory implements EnumFactory<CommunicationPriority> {
    public CommunicationPriority fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("routine".equals(codeString))
          return CommunicationPriority.ROUTINE;
        if ("urgent".equals(codeString))
          return CommunicationPriority.URGENT;
        if ("asap".equals(codeString))
          return CommunicationPriority.ASAP;
        if ("stat".equals(codeString))
          return CommunicationPriority.STAT;
        throw new IllegalArgumentException("Unknown CommunicationPriority code '"+codeString+"'");
        }
        public Enumeration<CommunicationPriority> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<CommunicationPriority>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("routine".equals(codeString))
          return new Enumeration<CommunicationPriority>(this, CommunicationPriority.ROUTINE);
        if ("urgent".equals(codeString))
          return new Enumeration<CommunicationPriority>(this, CommunicationPriority.URGENT);
        if ("asap".equals(codeString))
          return new Enumeration<CommunicationPriority>(this, CommunicationPriority.ASAP);
        if ("stat".equals(codeString))
          return new Enumeration<CommunicationPriority>(this, CommunicationPriority.STAT);
        throw new FHIRException("Unknown CommunicationPriority code '"+codeString+"'");
        }
    public String toCode(CommunicationPriority code) {
      if (code == CommunicationPriority.ROUTINE)
        return "routine";
      if (code == CommunicationPriority.URGENT)
        return "urgent";
      if (code == CommunicationPriority.ASAP)
        return "asap";
      if (code == CommunicationPriority.STAT)
        return "stat";
      return "?";
      }
    public String toSystem(CommunicationPriority code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class CommunicationPayloadComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A communicated content (or for multi-part communications, one portion of the communication).
         */
        @Child(name = "content", type = {StringType.class, Attachment.class, Reference.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Message part content", formalDefinition="A communicated content (or for multi-part communications, one portion of the communication)." )
        protected Type content;

        private static final long serialVersionUID = -1763459053L;

    /**
     * Constructor
     */
      public CommunicationPayloadComponent() {
        super();
      }

    /**
     * Constructor
     */
      public CommunicationPayloadComponent(Type content) {
        super();
        this.content = content;
      }

        /**
         * @return {@link #content} (A communicated content (or for multi-part communications, one portion of the communication).)
         */
        public Type getContent() { 
          return this.content;
        }

        /**
         * @return {@link #content} (A communicated content (or for multi-part communications, one portion of the communication).)
         */
        public StringType getContentStringType() throws FHIRException { 
          if (this.content == null)
            return null;
          if (!(this.content instanceof StringType))
            throw new FHIRException("Type mismatch: the type StringType was expected, but "+this.content.getClass().getName()+" was encountered");
          return (StringType) this.content;
        }

        public boolean hasContentStringType() { 
          return this != null && this.content instanceof StringType;
        }

        /**
         * @return {@link #content} (A communicated content (or for multi-part communications, one portion of the communication).)
         */
        public Attachment getContentAttachment() throws FHIRException { 
          if (this.content == null)
            return null;
          if (!(this.content instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but "+this.content.getClass().getName()+" was encountered");
          return (Attachment) this.content;
        }

        public boolean hasContentAttachment() { 
          return this != null && this.content instanceof Attachment;
        }

        /**
         * @return {@link #content} (A communicated content (or for multi-part communications, one portion of the communication).)
         */
        public Reference getContentReference() throws FHIRException { 
          if (this.content == null)
            return null;
          if (!(this.content instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.content.getClass().getName()+" was encountered");
          return (Reference) this.content;
        }

        public boolean hasContentReference() { 
          return this != null && this.content instanceof Reference;
        }

        public boolean hasContent() { 
          return this.content != null && !this.content.isEmpty();
        }

        /**
         * @param value {@link #content} (A communicated content (or for multi-part communications, one portion of the communication).)
         */
        public CommunicationPayloadComponent setContent(Type value) { 
          if (value != null && !(value instanceof StringType || value instanceof Attachment || value instanceof Reference))
            throw new Error("Not the right type for Communication.payload.content[x]: "+value.fhirType());
          this.content = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("content[x]", "string|Attachment|Reference(Any)", "A communicated content (or for multi-part communications, one portion of the communication).", 0, 1, content));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 264548711: /*content[x]*/  return new Property("content[x]", "string|Attachment|Reference(Any)", "A communicated content (or for multi-part communications, one portion of the communication).", 0, 1, content);
          case 951530617: /*content*/  return new Property("content[x]", "string|Attachment|Reference(Any)", "A communicated content (or for multi-part communications, one portion of the communication).", 0, 1, content);
          case -326336022: /*contentString*/  return new Property("content[x]", "string|Attachment|Reference(Any)", "A communicated content (or for multi-part communications, one portion of the communication).", 0, 1, content);
          case -702028164: /*contentAttachment*/  return new Property("content[x]", "string|Attachment|Reference(Any)", "A communicated content (or for multi-part communications, one portion of the communication).", 0, 1, content);
          case 1193747154: /*contentReference*/  return new Property("content[x]", "string|Attachment|Reference(Any)", "A communicated content (or for multi-part communications, one portion of the communication).", 0, 1, content);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 951530617: /*content*/ return this.content == null ? new Base[0] : new Base[] {this.content}; // Type
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 951530617: // content
          this.content = castToType(value); // Type
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("content[x]")) {
          this.content = castToType(value); // Type
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 264548711:  return getContent(); 
        case 951530617:  return getContent(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 951530617: /*content*/ return new String[] {"string", "Attachment", "Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("contentString")) {
          this.content = new StringType();
          return this.content;
        }
        else if (name.equals("contentAttachment")) {
          this.content = new Attachment();
          return this.content;
        }
        else if (name.equals("contentReference")) {
          this.content = new Reference();
          return this.content;
        }
        else
          return super.addChild(name);
      }

      public CommunicationPayloadComponent copy() {
        CommunicationPayloadComponent dst = new CommunicationPayloadComponent();
        copyValues(dst);
        dst.content = content == null ? null : content.copy();
        return dst;
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof CommunicationPayloadComponent))
          return false;
        CommunicationPayloadComponent o = (CommunicationPayloadComponent) other_;
        return compareDeep(content, o.content, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof CommunicationPayloadComponent))
          return false;
        CommunicationPayloadComponent o = (CommunicationPayloadComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(content);
      }

  public String fhirType() {
    return "Communication.payload";

  }

  }

    /**
     * Identifiers associated with this Communication that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Unique identifier", formalDefinition="Identifiers associated with this Communication that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)." )
    protected List<Identifier> identifier;

    /**
     * A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event.
     */
    @Child(name = "instantiates", type = {UriType.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Instantiates protocol or definition", formalDefinition="A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event." )
    protected List<UriType> instantiates;

    /**
     * An order, proposal or plan fulfilled in whole or in part by this Communication.
     */
    @Child(name = "basedOn", type = {Reference.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Request fulfilled by this communication", formalDefinition="An order, proposal or plan fulfilled in whole or in part by this Communication." )
    protected List<Reference> basedOn;
    /**
     * The actual objects that are the target of the reference (An order, proposal or plan fulfilled in whole or in part by this Communication.)
     */
    protected List<Resource> basedOnTarget;


    /**
     * Part of this action.
     */
    @Child(name = "partOf", type = {Reference.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Part of this action", formalDefinition="Part of this action." )
    protected List<Reference> partOf;
    /**
     * The actual objects that are the target of the reference (Part of this action.)
     */
    protected List<Resource> partOfTarget;


    /**
     * Prior communication that this communication is in response to.
     */
    @Child(name = "inResponseTo", type = {Communication.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Reply to", formalDefinition="Prior communication that this communication is in response to." )
    protected List<Reference> inResponseTo;
    /**
     * The actual objects that are the target of the reference (Prior communication that this communication is in response to.)
     */
    protected List<Communication> inResponseToTarget;


    /**
     * The status of the transmission.
     */
    @Child(name = "status", type = {CodeType.class}, order=5, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="preparation | in-progress | not-done | suspended | aborted | completed | entered-in-error", formalDefinition="The status of the transmission." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/event-status")
    protected Enumeration<CommunicationStatus> status;

    /**
     * Captures the reason for the current state of the Communication.
     */
    @Child(name = "statusReason", type = {CodeableConcept.class}, order=6, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Reason for current status", formalDefinition="Captures the reason for the current state of the Communication." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/communication-not-done-reason")
    protected CodeableConcept statusReason;

    /**
     * The type of message conveyed such as alert, notification, reminder, instruction, etc.
     */
    @Child(name = "category", type = {CodeableConcept.class}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Message category", formalDefinition="The type of message conveyed such as alert, notification, reminder, instruction, etc." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/communication-category")
    protected List<CodeableConcept> category;

    /**
     * Characterizes how quickly the planned or in progress communication must be addressed. Includes concepts such as stat, urgent, routine.
     */
    @Child(name = "priority", type = {CodeType.class}, order=8, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Message urgency", formalDefinition="Characterizes how quickly the planned or in progress communication must be addressed. Includes concepts such as stat, urgent, routine." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/request-priority")
    protected Enumeration<CommunicationPriority> priority;

    /**
     * A channel that was used for this communication (e.g. email, fax).
     */
    @Child(name = "medium", type = {CodeableConcept.class}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="A channel of communication", formalDefinition="A channel that was used for this communication (e.g. email, fax)." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/v3-ParticipationMode")
    protected List<CodeableConcept> medium;

    /**
     * The patient or group that was the focus of this communication.
     */
    @Child(name = "subject", type = {Patient.class, Group.class}, order=10, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Focus of message", formalDefinition="The patient or group that was the focus of this communication." )
    protected Reference subject;

    /**
     * The actual object that is the target of the reference (The patient or group that was the focus of this communication.)
     */
    protected Resource subjectTarget;

    /**
     * The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either a receipt(s) is not tracked (e.g. a mass mail-out) or is captured in aggregate (all emails confirmed received by a particular time).
     */
    @Child(name = "recipient", type = {Device.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class, Group.class, CareTeam.class}, order=11, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Message recipient", formalDefinition="The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either a receipt(s) is not tracked (e.g. a mass mail-out) or is captured in aggregate (all emails confirmed received by a particular time)." )
    protected List<Reference> recipient;
    /**
     * The actual objects that are the target of the reference (The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either a receipt(s) is not tracked (e.g. a mass mail-out) or is captured in aggregate (all emails confirmed received by a particular time).)
     */
    protected List<Resource> recipientTarget;


    /**
     * Description of the purpose/content, similar to a subject line in an email.
     */
    @Child(name = "topic", type = {CodeableConcept.class}, order=12, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Description of the purpose/content", formalDefinition="Description of the purpose/content, similar to a subject line in an email." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/communication-topic")
    protected CodeableConcept topic;

    /**
     * Other resources that pertain to this communication and to which this communication should be associated.
     */
    @Child(name = "about", type = {Reference.class}, order=13, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Resources that pertain to this communication", formalDefinition="Other resources that pertain to this communication and to which this communication should be associated." )
    protected List<Reference> about;
    /**
     * The actual objects that are the target of the reference (Other resources that pertain to this communication and to which this communication should be associated.)
     */
    protected List<Resource> aboutTarget;


    /**
     * The encounter within which the communication was sent.
     */
    @Child(name = "context", type = {Encounter.class, EpisodeOfCare.class}, order=14, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Encounter or episode leading to message", formalDefinition="The encounter within which the communication was sent." )
    protected Reference context;

    /**
     * The actual object that is the target of the reference (The encounter within which the communication was sent.)
     */
    protected Resource contextTarget;

    /**
     * The time when this communication was sent.
     */
    @Child(name = "sent", type = {DateTimeType.class}, order=15, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="When sent", formalDefinition="The time when this communication was sent." )
    protected DateTimeType sent;

    /**
     * The time when this communication arrived at the destination.
     */
    @Child(name = "received", type = {DateTimeType.class}, order=16, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="When received", formalDefinition="The time when this communication arrived at the destination." )
    protected DateTimeType received;

    /**
     * The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.
     */
    @Child(name = "sender", type = {Device.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class}, order=17, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Message sender", formalDefinition="The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication." )
    protected Reference sender;

    /**
     * The actual object that is the target of the reference (The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.)
     */
    protected Resource senderTarget;

    /**
     * The reason or justification for the communication.
     */
    @Child(name = "reasonCode", type = {CodeableConcept.class}, order=18, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Indication for message", formalDefinition="The reason or justification for the communication." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/clinical-findings")
    protected List<CodeableConcept> reasonCode;

    /**
     * Indicates another resource whose existence justifies this communication.
     */
    @Child(name = "reasonReference", type = {Condition.class, Observation.class, DiagnosticReport.class, DocumentReference.class}, order=19, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Why was communication done?", formalDefinition="Indicates another resource whose existence justifies this communication." )
    protected List<Reference> reasonReference;
    /**
     * The actual objects that are the target of the reference (Indicates another resource whose existence justifies this communication.)
     */
    protected List<Resource> reasonReferenceTarget;


    /**
     * Text, attachment(s), or resource(s) that was communicated to the recipient.
     */
    @Child(name = "payload", type = {}, order=20, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Message payload", formalDefinition="Text, attachment(s), or resource(s) that was communicated to the recipient." )
    protected List<CommunicationPayloadComponent> payload;

    /**
     * Additional notes or commentary about the communication by the sender, receiver or other interested parties.
     */
    @Child(name = "note", type = {Annotation.class}, order=21, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Comments made about the communication", formalDefinition="Additional notes or commentary about the communication by the sender, receiver or other interested parties." )
    protected List<Annotation> note;

    private static final long serialVersionUID = -251663710L;

  /**
   * Constructor
   */
    public Communication() {
      super();
    }

  /**
   * Constructor
   */
    public Communication(Enumeration<CommunicationStatus> status) {
      super();
      this.status = status;
    }

    /**
     * @return {@link #identifier} (Identifiers associated with this Communication that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public Communication addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #instantiates} (A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event.)
     */
    public List<UriType> getInstantiates() { 
      if (this.instantiates == null)
        this.instantiates = new ArrayList<UriType>();
      return this.instantiates;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setInstantiates(List<UriType> theInstantiates) { 
      this.instantiates = theInstantiates;
      return this;
    }

    public boolean hasInstantiates() { 
      if (this.instantiates == null)
        return false;
      for (UriType item : this.instantiates)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #instantiates} (A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event.)
     */
    public UriType addInstantiatesElement() {//2 
      UriType t = new UriType();
      if (this.instantiates == null)
        this.instantiates = new ArrayList<UriType>();
      this.instantiates.add(t);
      return t;
    }

    /**
     * @param value {@link #instantiates} (A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event.)
     */
    public Communication addInstantiates(String value) { //1
      UriType t = new UriType();
      t.setValue(value);
      if (this.instantiates == null)
        this.instantiates = new ArrayList<UriType>();
      this.instantiates.add(t);
      return this;
    }

    /**
     * @param value {@link #instantiates} (A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event.)
     */
    public boolean hasInstantiates(String value) { 
      if (this.instantiates == null)
        return false;
      for (UriType v : this.instantiates)
        if (v.getValue().equals(value)) // uri
          return true;
      return false;
    }

    /**
     * @return {@link #basedOn} (An order, proposal or plan fulfilled in whole or in part by this Communication.)
     */
    public List<Reference> getBasedOn() { 
      if (this.basedOn == null)
        this.basedOn = new ArrayList<Reference>();
      return this.basedOn;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setBasedOn(List<Reference> theBasedOn) { 
      this.basedOn = theBasedOn;
      return this;
    }

    public boolean hasBasedOn() { 
      if (this.basedOn == null)
        return false;
      for (Reference item : this.basedOn)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addBasedOn() { //3
      Reference t = new Reference();
      if (this.basedOn == null)
        this.basedOn = new ArrayList<Reference>();
      this.basedOn.add(t);
      return t;
    }

    public Communication addBasedOn(Reference t) { //3
      if (t == null)
        return this;
      if (this.basedOn == null)
        this.basedOn = new ArrayList<Reference>();
      this.basedOn.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #basedOn}, creating it if it does not already exist
     */
    public Reference getBasedOnFirstRep() { 
      if (getBasedOn().isEmpty()) {
        addBasedOn();
      }
      return getBasedOn().get(0);
    }

    /**
     * @deprecated Use Reference#setResource(IBaseResource) instead
     */
    @Deprecated
    public List<Resource> getBasedOnTarget() { 
      if (this.basedOnTarget == null)
        this.basedOnTarget = new ArrayList<Resource>();
      return this.basedOnTarget;
    }

    /**
     * @return {@link #partOf} (Part of this action.)
     */
    public List<Reference> getPartOf() { 
      if (this.partOf == null)
        this.partOf = new ArrayList<Reference>();
      return this.partOf;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setPartOf(List<Reference> thePartOf) { 
      this.partOf = thePartOf;
      return this;
    }

    public boolean hasPartOf() { 
      if (this.partOf == null)
        return false;
      for (Reference item : this.partOf)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addPartOf() { //3
      Reference t = new Reference();
      if (this.partOf == null)
        this.partOf = new ArrayList<Reference>();
      this.partOf.add(t);
      return t;
    }

    public Communication addPartOf(Reference t) { //3
      if (t == null)
        return this;
      if (this.partOf == null)
        this.partOf = new ArrayList<Reference>();
      this.partOf.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #partOf}, creating it if it does not already exist
     */
    public Reference getPartOfFirstRep() { 
      if (getPartOf().isEmpty()) {
        addPartOf();
      }
      return getPartOf().get(0);
    }

    /**
     * @deprecated Use Reference#setResource(IBaseResource) instead
     */
    @Deprecated
    public List<Resource> getPartOfTarget() { 
      if (this.partOfTarget == null)
        this.partOfTarget = new ArrayList<Resource>();
      return this.partOfTarget;
    }

    /**
     * @return {@link #inResponseTo} (Prior communication that this communication is in response to.)
     */
    public List<Reference> getInResponseTo() { 
      if (this.inResponseTo == null)
        this.inResponseTo = new ArrayList<Reference>();
      return this.inResponseTo;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setInResponseTo(List<Reference> theInResponseTo) { 
      this.inResponseTo = theInResponseTo;
      return this;
    }

    public boolean hasInResponseTo() { 
      if (this.inResponseTo == null)
        return false;
      for (Reference item : this.inResponseTo)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addInResponseTo() { //3
      Reference t = new Reference();
      if (this.inResponseTo == null)
        this.inResponseTo = new ArrayList<Reference>();
      this.inResponseTo.add(t);
      return t;
    }

    public Communication addInResponseTo(Reference t) { //3
      if (t == null)
        return this;
      if (this.inResponseTo == null)
        this.inResponseTo = new ArrayList<Reference>();
      this.inResponseTo.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #inResponseTo}, creating it if it does not already exist
     */
    public Reference getInResponseToFirstRep() { 
      if (getInResponseTo().isEmpty()) {
        addInResponseTo();
      }
      return getInResponseTo().get(0);
    }

    /**
     * @deprecated Use Reference#setResource(IBaseResource) instead
     */
    @Deprecated
    public List<Communication> getInResponseToTarget() { 
      if (this.inResponseToTarget == null)
        this.inResponseToTarget = new ArrayList<Communication>();
      return this.inResponseToTarget;
    }

    /**
     * @deprecated Use Reference#setResource(IBaseResource) instead
     */
    @Deprecated
    public Communication addInResponseToTarget() { 
      Communication r = new Communication();
      if (this.inResponseToTarget == null)
        this.inResponseToTarget = new ArrayList<Communication>();
      this.inResponseToTarget.add(r);
      return r;
    }

    /**
     * @return {@link #status} (The status of the transmission.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<CommunicationStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Communication.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<CommunicationStatus>(new CommunicationStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the transmission.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Communication setStatusElement(Enumeration<CommunicationStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of the transmission.
     */
    public CommunicationStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the transmission.
     */
    public Communication setStatus(CommunicationStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<CommunicationStatus>(new CommunicationStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #statusReason} (Captures the reason for the current state of the Communication.)
     */
    public CodeableConcept getStatusReason() { 
      if (this.statusReason == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Communication.statusReason");
        else if (Configuration.doAutoCreate())
          this.statusReason = new CodeableConcept(); // cc
      return this.statusReason;
    }

    public boolean hasStatusReason() { 
      return this.statusReason != null && !this.statusReason.isEmpty();
    }

    /**
     * @param value {@link #statusReason} (Captures the reason for the current state of the Communication.)
     */
    public Communication setStatusReason(CodeableConcept value) { 
      this.statusReason = value;
      return this;
    }

    /**
     * @return {@link #category} (The type of message conveyed such as alert, notification, reminder, instruction, etc.)
     */
    public List<CodeableConcept> getCategory() { 
      if (this.category == null)
        this.category = new ArrayList<CodeableConcept>();
      return this.category;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setCategory(List<CodeableConcept> theCategory) { 
      this.category = theCategory;
      return this;
    }

    public boolean hasCategory() { 
      if (this.category == null)
        return false;
      for (CodeableConcept item : this.category)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addCategory() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.category == null)
        this.category = new ArrayList<CodeableConcept>();
      this.category.add(t);
      return t;
    }

    public Communication addCategory(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.category == null)
        this.category = new ArrayList<CodeableConcept>();
      this.category.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #category}, creating it if it does not already exist
     */
    public CodeableConcept getCategoryFirstRep() { 
      if (getCategory().isEmpty()) {
        addCategory();
      }
      return getCategory().get(0);
    }

    /**
     * @return {@link #priority} (Characterizes how quickly the planned or in progress communication must be addressed. Includes concepts such as stat, urgent, routine.). This is the underlying object with id, value and extensions. The accessor "getPriority" gives direct access to the value
     */
    public Enumeration<CommunicationPriority> getPriorityElement() { 
      if (this.priority == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Communication.priority");
        else if (Configuration.doAutoCreate())
          this.priority = new Enumeration<CommunicationPriority>(new CommunicationPriorityEnumFactory()); // bb
      return this.priority;
    }

    public boolean hasPriorityElement() { 
      return this.priority != null && !this.priority.isEmpty();
    }

    public boolean hasPriority() { 
      return this.priority != null && !this.priority.isEmpty();
    }

    /**
     * @param value {@link #priority} (Characterizes how quickly the planned or in progress communication must be addressed. Includes concepts such as stat, urgent, routine.). This is the underlying object with id, value and extensions. The accessor "getPriority" gives direct access to the value
     */
    public Communication setPriorityElement(Enumeration<CommunicationPriority> value) { 
      this.priority = value;
      return this;
    }

    /**
     * @return Characterizes how quickly the planned or in progress communication must be addressed. Includes concepts such as stat, urgent, routine.
     */
    public CommunicationPriority getPriority() { 
      return this.priority == null ? null : this.priority.getValue();
    }

    /**
     * @param value Characterizes how quickly the planned or in progress communication must be addressed. Includes concepts such as stat, urgent, routine.
     */
    public Communication setPriority(CommunicationPriority value) { 
      if (value == null)
        this.priority = null;
      else {
        if (this.priority == null)
          this.priority = new Enumeration<CommunicationPriority>(new CommunicationPriorityEnumFactory());
        this.priority.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #medium} (A channel that was used for this communication (e.g. email, fax).)
     */
    public List<CodeableConcept> getMedium() { 
      if (this.medium == null)
        this.medium = new ArrayList<CodeableConcept>();
      return this.medium;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setMedium(List<CodeableConcept> theMedium) { 
      this.medium = theMedium;
      return this;
    }

    public boolean hasMedium() { 
      if (this.medium == null)
        return false;
      for (CodeableConcept item : this.medium)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addMedium() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.medium == null)
        this.medium = new ArrayList<CodeableConcept>();
      this.medium.add(t);
      return t;
    }

    public Communication addMedium(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.medium == null)
        this.medium = new ArrayList<CodeableConcept>();
      this.medium.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #medium}, creating it if it does not already exist
     */
    public CodeableConcept getMediumFirstRep() { 
      if (getMedium().isEmpty()) {
        addMedium();
      }
      return getMedium().get(0);
    }

    /**
     * @return {@link #subject} (The patient or group that was the focus of this communication.)
     */
    public Reference getSubject() { 
      if (this.subject == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Communication.subject");
        else if (Configuration.doAutoCreate())
          this.subject = new Reference(); // cc
      return this.subject;
    }

    public boolean hasSubject() { 
      return this.subject != null && !this.subject.isEmpty();
    }

    /**
     * @param value {@link #subject} (The patient or group that was the focus of this communication.)
     */
    public Communication setSubject(Reference value) { 
      this.subject = value;
      return this;
    }

    /**
     * @return {@link #subject} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The patient or group that was the focus of this communication.)
     */
    public Resource getSubjectTarget() { 
      return this.subjectTarget;
    }

    /**
     * @param value {@link #subject} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The patient or group that was the focus of this communication.)
     */
    public Communication setSubjectTarget(Resource value) { 
      this.subjectTarget = value;
      return this;
    }

    /**
     * @return {@link #recipient} (The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either a receipt(s) is not tracked (e.g. a mass mail-out) or is captured in aggregate (all emails confirmed received by a particular time).)
     */
    public List<Reference> getRecipient() { 
      if (this.recipient == null)
        this.recipient = new ArrayList<Reference>();
      return this.recipient;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setRecipient(List<Reference> theRecipient) { 
      this.recipient = theRecipient;
      return this;
    }

    public boolean hasRecipient() { 
      if (this.recipient == null)
        return false;
      for (Reference item : this.recipient)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addRecipient() { //3
      Reference t = new Reference();
      if (this.recipient == null)
        this.recipient = new ArrayList<Reference>();
      this.recipient.add(t);
      return t;
    }

    public Communication addRecipient(Reference t) { //3
      if (t == null)
        return this;
      if (this.recipient == null)
        this.recipient = new ArrayList<Reference>();
      this.recipient.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #recipient}, creating it if it does not already exist
     */
    public Reference getRecipientFirstRep() { 
      if (getRecipient().isEmpty()) {
        addRecipient();
      }
      return getRecipient().get(0);
    }

    /**
     * @deprecated Use Reference#setResource(IBaseResource) instead
     */
    @Deprecated
    public List<Resource> getRecipientTarget() { 
      if (this.recipientTarget == null)
        this.recipientTarget = new ArrayList<Resource>();
      return this.recipientTarget;
    }

    /**
     * @return {@link #topic} (Description of the purpose/content, similar to a subject line in an email.)
     */
    public CodeableConcept getTopic() { 
      if (this.topic == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Communication.topic");
        else if (Configuration.doAutoCreate())
          this.topic = new CodeableConcept(); // cc
      return this.topic;
    }

    public boolean hasTopic() { 
      return this.topic != null && !this.topic.isEmpty();
    }

    /**
     * @param value {@link #topic} (Description of the purpose/content, similar to a subject line in an email.)
     */
    public Communication setTopic(CodeableConcept value) { 
      this.topic = value;
      return this;
    }

    /**
     * @return {@link #about} (Other resources that pertain to this communication and to which this communication should be associated.)
     */
    public List<Reference> getAbout() { 
      if (this.about == null)
        this.about = new ArrayList<Reference>();
      return this.about;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setAbout(List<Reference> theAbout) { 
      this.about = theAbout;
      return this;
    }

    public boolean hasAbout() { 
      if (this.about == null)
        return false;
      for (Reference item : this.about)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addAbout() { //3
      Reference t = new Reference();
      if (this.about == null)
        this.about = new ArrayList<Reference>();
      this.about.add(t);
      return t;
    }

    public Communication addAbout(Reference t) { //3
      if (t == null)
        return this;
      if (this.about == null)
        this.about = new ArrayList<Reference>();
      this.about.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #about}, creating it if it does not already exist
     */
    public Reference getAboutFirstRep() { 
      if (getAbout().isEmpty()) {
        addAbout();
      }
      return getAbout().get(0);
    }

    /**
     * @deprecated Use Reference#setResource(IBaseResource) instead
     */
    @Deprecated
    public List<Resource> getAboutTarget() { 
      if (this.aboutTarget == null)
        this.aboutTarget = new ArrayList<Resource>();
      return this.aboutTarget;
    }

    /**
     * @return {@link #context} (The encounter within which the communication was sent.)
     */
    public Reference getContext() { 
      if (this.context == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Communication.context");
        else if (Configuration.doAutoCreate())
          this.context = new Reference(); // cc
      return this.context;
    }

    public boolean hasContext() { 
      return this.context != null && !this.context.isEmpty();
    }

    /**
     * @param value {@link #context} (The encounter within which the communication was sent.)
     */
    public Communication setContext(Reference value) { 
      this.context = value;
      return this;
    }

    /**
     * @return {@link #context} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The encounter within which the communication was sent.)
     */
    public Resource getContextTarget() { 
      return this.contextTarget;
    }

    /**
     * @param value {@link #context} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The encounter within which the communication was sent.)
     */
    public Communication setContextTarget(Resource value) { 
      this.contextTarget = value;
      return this;
    }

    /**
     * @return {@link #sent} (The time when this communication was sent.). This is the underlying object with id, value and extensions. The accessor "getSent" gives direct access to the value
     */
    public DateTimeType getSentElement() { 
      if (this.sent == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Communication.sent");
        else if (Configuration.doAutoCreate())
          this.sent = new DateTimeType(); // bb
      return this.sent;
    }

    public boolean hasSentElement() { 
      return this.sent != null && !this.sent.isEmpty();
    }

    public boolean hasSent() { 
      return this.sent != null && !this.sent.isEmpty();
    }

    /**
     * @param value {@link #sent} (The time when this communication was sent.). This is the underlying object with id, value and extensions. The accessor "getSent" gives direct access to the value
     */
    public Communication setSentElement(DateTimeType value) { 
      this.sent = value;
      return this;
    }

    /**
     * @return The time when this communication was sent.
     */
    public Date getSent() { 
      return this.sent == null ? null : this.sent.getValue();
    }

    /**
     * @param value The time when this communication was sent.
     */
    public Communication setSent(Date value) { 
      if (value == null)
        this.sent = null;
      else {
        if (this.sent == null)
          this.sent = new DateTimeType();
        this.sent.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #received} (The time when this communication arrived at the destination.). This is the underlying object with id, value and extensions. The accessor "getReceived" gives direct access to the value
     */
    public DateTimeType getReceivedElement() { 
      if (this.received == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Communication.received");
        else if (Configuration.doAutoCreate())
          this.received = new DateTimeType(); // bb
      return this.received;
    }

    public boolean hasReceivedElement() { 
      return this.received != null && !this.received.isEmpty();
    }

    public boolean hasReceived() { 
      return this.received != null && !this.received.isEmpty();
    }

    /**
     * @param value {@link #received} (The time when this communication arrived at the destination.). This is the underlying object with id, value and extensions. The accessor "getReceived" gives direct access to the value
     */
    public Communication setReceivedElement(DateTimeType value) { 
      this.received = value;
      return this;
    }

    /**
     * @return The time when this communication arrived at the destination.
     */
    public Date getReceived() { 
      return this.received == null ? null : this.received.getValue();
    }

    /**
     * @param value The time when this communication arrived at the destination.
     */
    public Communication setReceived(Date value) { 
      if (value == null)
        this.received = null;
      else {
        if (this.received == null)
          this.received = new DateTimeType();
        this.received.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #sender} (The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.)
     */
    public Reference getSender() { 
      if (this.sender == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Communication.sender");
        else if (Configuration.doAutoCreate())
          this.sender = new Reference(); // cc
      return this.sender;
    }

    public boolean hasSender() { 
      return this.sender != null && !this.sender.isEmpty();
    }

    /**
     * @param value {@link #sender} (The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.)
     */
    public Communication setSender(Reference value) { 
      this.sender = value;
      return this;
    }

    /**
     * @return {@link #sender} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.)
     */
    public Resource getSenderTarget() { 
      return this.senderTarget;
    }

    /**
     * @param value {@link #sender} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.)
     */
    public Communication setSenderTarget(Resource value) { 
      this.senderTarget = value;
      return this;
    }

    /**
     * @return {@link #reasonCode} (The reason or justification for the communication.)
     */
    public List<CodeableConcept> getReasonCode() { 
      if (this.reasonCode == null)
        this.reasonCode = new ArrayList<CodeableConcept>();
      return this.reasonCode;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setReasonCode(List<CodeableConcept> theReasonCode) { 
      this.reasonCode = theReasonCode;
      return this;
    }

    public boolean hasReasonCode() { 
      if (this.reasonCode == null)
        return false;
      for (CodeableConcept item : this.reasonCode)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CodeableConcept addReasonCode() { //3
      CodeableConcept t = new CodeableConcept();
      if (this.reasonCode == null)
        this.reasonCode = new ArrayList<CodeableConcept>();
      this.reasonCode.add(t);
      return t;
    }

    public Communication addReasonCode(CodeableConcept t) { //3
      if (t == null)
        return this;
      if (this.reasonCode == null)
        this.reasonCode = new ArrayList<CodeableConcept>();
      this.reasonCode.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #reasonCode}, creating it if it does not already exist
     */
    public CodeableConcept getReasonCodeFirstRep() { 
      if (getReasonCode().isEmpty()) {
        addReasonCode();
      }
      return getReasonCode().get(0);
    }

    /**
     * @return {@link #reasonReference} (Indicates another resource whose existence justifies this communication.)
     */
    public List<Reference> getReasonReference() { 
      if (this.reasonReference == null)
        this.reasonReference = new ArrayList<Reference>();
      return this.reasonReference;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setReasonReference(List<Reference> theReasonReference) { 
      this.reasonReference = theReasonReference;
      return this;
    }

    public boolean hasReasonReference() { 
      if (this.reasonReference == null)
        return false;
      for (Reference item : this.reasonReference)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addReasonReference() { //3
      Reference t = new Reference();
      if (this.reasonReference == null)
        this.reasonReference = new ArrayList<Reference>();
      this.reasonReference.add(t);
      return t;
    }

    public Communication addReasonReference(Reference t) { //3
      if (t == null)
        return this;
      if (this.reasonReference == null)
        this.reasonReference = new ArrayList<Reference>();
      this.reasonReference.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #reasonReference}, creating it if it does not already exist
     */
    public Reference getReasonReferenceFirstRep() { 
      if (getReasonReference().isEmpty()) {
        addReasonReference();
      }
      return getReasonReference().get(0);
    }

    /**
     * @deprecated Use Reference#setResource(IBaseResource) instead
     */
    @Deprecated
    public List<Resource> getReasonReferenceTarget() { 
      if (this.reasonReferenceTarget == null)
        this.reasonReferenceTarget = new ArrayList<Resource>();
      return this.reasonReferenceTarget;
    }

    /**
     * @return {@link #payload} (Text, attachment(s), or resource(s) that was communicated to the recipient.)
     */
    public List<CommunicationPayloadComponent> getPayload() { 
      if (this.payload == null)
        this.payload = new ArrayList<CommunicationPayloadComponent>();
      return this.payload;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setPayload(List<CommunicationPayloadComponent> thePayload) { 
      this.payload = thePayload;
      return this;
    }

    public boolean hasPayload() { 
      if (this.payload == null)
        return false;
      for (CommunicationPayloadComponent item : this.payload)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CommunicationPayloadComponent addPayload() { //3
      CommunicationPayloadComponent t = new CommunicationPayloadComponent();
      if (this.payload == null)
        this.payload = new ArrayList<CommunicationPayloadComponent>();
      this.payload.add(t);
      return t;
    }

    public Communication addPayload(CommunicationPayloadComponent t) { //3
      if (t == null)
        return this;
      if (this.payload == null)
        this.payload = new ArrayList<CommunicationPayloadComponent>();
      this.payload.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #payload}, creating it if it does not already exist
     */
    public CommunicationPayloadComponent getPayloadFirstRep() { 
      if (getPayload().isEmpty()) {
        addPayload();
      }
      return getPayload().get(0);
    }

    /**
     * @return {@link #note} (Additional notes or commentary about the communication by the sender, receiver or other interested parties.)
     */
    public List<Annotation> getNote() { 
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      return this.note;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Communication setNote(List<Annotation> theNote) { 
      this.note = theNote;
      return this;
    }

    public boolean hasNote() { 
      if (this.note == null)
        return false;
      for (Annotation item : this.note)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Annotation addNote() { //3
      Annotation t = new Annotation();
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return t;
    }

    public Communication addNote(Annotation t) { //3
      if (t == null)
        return this;
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
     */
    public Annotation getNoteFirstRep() { 
      if (getNote().isEmpty()) {
        addNote();
      }
      return getNote().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "Identifiers associated with this Communication that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("instantiates", "uri", "A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event.", 0, java.lang.Integer.MAX_VALUE, instantiates));
        children.add(new Property("basedOn", "Reference(Any)", "An order, proposal or plan fulfilled in whole or in part by this Communication.", 0, java.lang.Integer.MAX_VALUE, basedOn));
        children.add(new Property("partOf", "Reference(Any)", "Part of this action.", 0, java.lang.Integer.MAX_VALUE, partOf));
        children.add(new Property("inResponseTo", "Reference(Communication)", "Prior communication that this communication is in response to.", 0, java.lang.Integer.MAX_VALUE, inResponseTo));
        children.add(new Property("status", "code", "The status of the transmission.", 0, 1, status));
        children.add(new Property("statusReason", "CodeableConcept", "Captures the reason for the current state of the Communication.", 0, 1, statusReason));
        children.add(new Property("category", "CodeableConcept", "The type of message conveyed such as alert, notification, reminder, instruction, etc.", 0, java.lang.Integer.MAX_VALUE, category));
        children.add(new Property("priority", "code", "Characterizes how quickly the planned or in progress communication must be addressed. Includes concepts such as stat, urgent, routine.", 0, 1, priority));
        children.add(new Property("medium", "CodeableConcept", "A channel that was used for this communication (e.g. email, fax).", 0, java.lang.Integer.MAX_VALUE, medium));
        children.add(new Property("subject", "Reference(Patient|Group)", "The patient or group that was the focus of this communication.", 0, 1, subject));
        children.add(new Property("recipient", "Reference(Device|Organization|Patient|Practitioner|PractitionerRole|RelatedPerson|Group|CareTeam)", "The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either a receipt(s) is not tracked (e.g. a mass mail-out) or is captured in aggregate (all emails confirmed received by a particular time).", 0, java.lang.Integer.MAX_VALUE, recipient));
        children.add(new Property("topic", "CodeableConcept", "Description of the purpose/content, similar to a subject line in an email.", 0, 1, topic));
        children.add(new Property("about", "Reference(Any)", "Other resources that pertain to this communication and to which this communication should be associated.", 0, java.lang.Integer.MAX_VALUE, about));
        children.add(new Property("context", "Reference(Encounter|EpisodeOfCare)", "The encounter within which the communication was sent.", 0, 1, context));
        children.add(new Property("sent", "dateTime", "The time when this communication was sent.", 0, 1, sent));
        children.add(new Property("received", "dateTime", "The time when this communication arrived at the destination.", 0, 1, received));
        children.add(new Property("sender", "Reference(Device|Organization|Patient|Practitioner|PractitionerRole|RelatedPerson)", "The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.", 0, 1, sender));
        children.add(new Property("reasonCode", "CodeableConcept", "The reason or justification for the communication.", 0, java.lang.Integer.MAX_VALUE, reasonCode));
        children.add(new Property("reasonReference", "Reference(Condition|Observation|DiagnosticReport|DocumentReference)", "Indicates another resource whose existence justifies this communication.", 0, java.lang.Integer.MAX_VALUE, reasonReference));
        children.add(new Property("payload", "", "Text, attachment(s), or resource(s) that was communicated to the recipient.", 0, java.lang.Integer.MAX_VALUE, payload));
        children.add(new Property("note", "Annotation", "Additional notes or commentary about the communication by the sender, receiver or other interested parties.", 0, java.lang.Integer.MAX_VALUE, note));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "Identifiers associated with this Communication that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation).", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -246883639: /*instantiates*/  return new Property("instantiates", "uri", "A protocol, guideline, or other definition that was adhered to in whole or in part by this communication event.", 0, java.lang.Integer.MAX_VALUE, instantiates);
        case -332612366: /*basedOn*/  return new Property("basedOn", "Reference(Any)", "An order, proposal or plan fulfilled in whole or in part by this Communication.", 0, java.lang.Integer.MAX_VALUE, basedOn);
        case -995410646: /*partOf*/  return new Property("partOf", "Reference(Any)", "Part of this action.", 0, java.lang.Integer.MAX_VALUE, partOf);
        case 1932956065: /*inResponseTo*/  return new Property("inResponseTo", "Reference(Communication)", "Prior communication that this communication is in response to.", 0, java.lang.Integer.MAX_VALUE, inResponseTo);
        case -892481550: /*status*/  return new Property("status", "code", "The status of the transmission.", 0, 1, status);
        case 2051346646: /*statusReason*/  return new Property("statusReason", "CodeableConcept", "Captures the reason for the current state of the Communication.", 0, 1, statusReason);
        case 50511102: /*category*/  return new Property("category", "CodeableConcept", "The type of message conveyed such as alert, notification, reminder, instruction, etc.", 0, java.lang.Integer.MAX_VALUE, category);
        case -1165461084: /*priority*/  return new Property("priority", "code", "Characterizes how quickly the planned or in progress communication must be addressed. Includes concepts such as stat, urgent, routine.", 0, 1, priority);
        case -1078030475: /*medium*/  return new Property("medium", "CodeableConcept", "A channel that was used for this communication (e.g. email, fax).", 0, java.lang.Integer.MAX_VALUE, medium);
        case -1867885268: /*subject*/  return new Property("subject", "Reference(Patient|Group)", "The patient or group that was the focus of this communication.", 0, 1, subject);
        case 820081177: /*recipient*/  return new Property("recipient", "Reference(Device|Organization|Patient|Practitioner|PractitionerRole|RelatedPerson|Group|CareTeam)", "The entity (e.g. person, organization, clinical information system, care team or device) which was the target of the communication. If receipts need to be tracked by individual, a separate resource instance will need to be created for each recipient.  Multiple recipient communications are intended where either a receipt(s) is not tracked (e.g. a mass mail-out) or is captured in aggregate (all emails confirmed received by a particular time).", 0, java.lang.Integer.MAX_VALUE, recipient);
        case 110546223: /*topic*/  return new Property("topic", "CodeableConcept", "Description of the purpose/content, similar to a subject line in an email.", 0, 1, topic);
        case 92611469: /*about*/  return new Property("about", "Reference(Any)", "Other resources that pertain to this communication and to which this communication should be associated.", 0, java.lang.Integer.MAX_VALUE, about);
        case 951530927: /*context*/  return new Property("context", "Reference(Encounter|EpisodeOfCare)", "The encounter within which the communication was sent.", 0, 1, context);
        case 3526552: /*sent*/  return new Property("sent", "dateTime", "The time when this communication was sent.", 0, 1, sent);
        case -808719903: /*received*/  return new Property("received", "dateTime", "The time when this communication arrived at the destination.", 0, 1, received);
        case -905962955: /*sender*/  return new Property("sender", "Reference(Device|Organization|Patient|Practitioner|PractitionerRole|RelatedPerson)", "The entity (e.g. person, organization, clinical information system, or device) which was the source of the communication.", 0, 1, sender);
        case 722137681: /*reasonCode*/  return new Property("reasonCode", "CodeableConcept", "The reason or justification for the communication.", 0, java.lang.Integer.MAX_VALUE, reasonCode);
        case -1146218137: /*reasonReference*/  return new Property("reasonReference", "Reference(Condition|Observation|DiagnosticReport|DocumentReference)", "Indicates another resource whose existence justifies this communication.", 0, java.lang.Integer.MAX_VALUE, reasonReference);
        case -786701938: /*payload*/  return new Property("payload", "", "Text, attachment(s), or resource(s) that was communicated to the recipient.", 0, java.lang.Integer.MAX_VALUE, payload);
        case 3387378: /*note*/  return new Property("note", "Annotation", "Additional notes or commentary about the communication by the sender, receiver or other interested parties.", 0, java.lang.Integer.MAX_VALUE, note);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -246883639: /*instantiates*/ return this.instantiates == null ? new Base[0] : this.instantiates.toArray(new Base[this.instantiates.size()]); // UriType
        case -332612366: /*basedOn*/ return this.basedOn == null ? new Base[0] : this.basedOn.toArray(new Base[this.basedOn.size()]); // Reference
        case -995410646: /*partOf*/ return this.partOf == null ? new Base[0] : this.partOf.toArray(new Base[this.partOf.size()]); // Reference
        case 1932956065: /*inResponseTo*/ return this.inResponseTo == null ? new Base[0] : this.inResponseTo.toArray(new Base[this.inResponseTo.size()]); // Reference
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<CommunicationStatus>
        case 2051346646: /*statusReason*/ return this.statusReason == null ? new Base[0] : new Base[] {this.statusReason}; // CodeableConcept
        case 50511102: /*category*/ return this.category == null ? new Base[0] : this.category.toArray(new Base[this.category.size()]); // CodeableConcept
        case -1165461084: /*priority*/ return this.priority == null ? new Base[0] : new Base[] {this.priority}; // Enumeration<CommunicationPriority>
        case -1078030475: /*medium*/ return this.medium == null ? new Base[0] : this.medium.toArray(new Base[this.medium.size()]); // CodeableConcept
        case -1867885268: /*subject*/ return this.subject == null ? new Base[0] : new Base[] {this.subject}; // Reference
        case 820081177: /*recipient*/ return this.recipient == null ? new Base[0] : this.recipient.toArray(new Base[this.recipient.size()]); // Reference
        case 110546223: /*topic*/ return this.topic == null ? new Base[0] : new Base[] {this.topic}; // CodeableConcept
        case 92611469: /*about*/ return this.about == null ? new Base[0] : this.about.toArray(new Base[this.about.size()]); // Reference
        case 951530927: /*context*/ return this.context == null ? new Base[0] : new Base[] {this.context}; // Reference
        case 3526552: /*sent*/ return this.sent == null ? new Base[0] : new Base[] {this.sent}; // DateTimeType
        case -808719903: /*received*/ return this.received == null ? new Base[0] : new Base[] {this.received}; // DateTimeType
        case -905962955: /*sender*/ return this.sender == null ? new Base[0] : new Base[] {this.sender}; // Reference
        case 722137681: /*reasonCode*/ return this.reasonCode == null ? new Base[0] : this.reasonCode.toArray(new Base[this.reasonCode.size()]); // CodeableConcept
        case -1146218137: /*reasonReference*/ return this.reasonReference == null ? new Base[0] : this.reasonReference.toArray(new Base[this.reasonReference.size()]); // Reference
        case -786701938: /*payload*/ return this.payload == null ? new Base[0] : this.payload.toArray(new Base[this.payload.size()]); // CommunicationPayloadComponent
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(castToIdentifier(value)); // Identifier
          return value;
        case -246883639: // instantiates
          this.getInstantiates().add(castToUri(value)); // UriType
          return value;
        case -332612366: // basedOn
          this.getBasedOn().add(castToReference(value)); // Reference
          return value;
        case -995410646: // partOf
          this.getPartOf().add(castToReference(value)); // Reference
          return value;
        case 1932956065: // inResponseTo
          this.getInResponseTo().add(castToReference(value)); // Reference
          return value;
        case -892481550: // status
          value = new CommunicationStatusEnumFactory().fromType(castToCode(value));
          this.status = (Enumeration) value; // Enumeration<CommunicationStatus>
          return value;
        case 2051346646: // statusReason
          this.statusReason = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 50511102: // category
          this.getCategory().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -1165461084: // priority
          value = new CommunicationPriorityEnumFactory().fromType(castToCode(value));
          this.priority = (Enumeration) value; // Enumeration<CommunicationPriority>
          return value;
        case -1078030475: // medium
          this.getMedium().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -1867885268: // subject
          this.subject = castToReference(value); // Reference
          return value;
        case 820081177: // recipient
          this.getRecipient().add(castToReference(value)); // Reference
          return value;
        case 110546223: // topic
          this.topic = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 92611469: // about
          this.getAbout().add(castToReference(value)); // Reference
          return value;
        case 951530927: // context
          this.context = castToReference(value); // Reference
          return value;
        case 3526552: // sent
          this.sent = castToDateTime(value); // DateTimeType
          return value;
        case -808719903: // received
          this.received = castToDateTime(value); // DateTimeType
          return value;
        case -905962955: // sender
          this.sender = castToReference(value); // Reference
          return value;
        case 722137681: // reasonCode
          this.getReasonCode().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -1146218137: // reasonReference
          this.getReasonReference().add(castToReference(value)); // Reference
          return value;
        case -786701938: // payload
          this.getPayload().add((CommunicationPayloadComponent) value); // CommunicationPayloadComponent
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(castToIdentifier(value));
        } else if (name.equals("instantiates")) {
          this.getInstantiates().add(castToUri(value));
        } else if (name.equals("basedOn")) {
          this.getBasedOn().add(castToReference(value));
        } else if (name.equals("partOf")) {
          this.getPartOf().add(castToReference(value));
        } else if (name.equals("inResponseTo")) {
          this.getInResponseTo().add(castToReference(value));
        } else if (name.equals("status")) {
          value = new CommunicationStatusEnumFactory().fromType(castToCode(value));
          this.status = (Enumeration) value; // Enumeration<CommunicationStatus>
        } else if (name.equals("statusReason")) {
          this.statusReason = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("category")) {
          this.getCategory().add(castToCodeableConcept(value));
        } else if (name.equals("priority")) {
          value = new CommunicationPriorityEnumFactory().fromType(castToCode(value));
          this.priority = (Enumeration) value; // Enumeration<CommunicationPriority>
        } else if (name.equals("medium")) {
          this.getMedium().add(castToCodeableConcept(value));
        } else if (name.equals("subject")) {
          this.subject = castToReference(value); // Reference
        } else if (name.equals("recipient")) {
          this.getRecipient().add(castToReference(value));
        } else if (name.equals("topic")) {
          this.topic = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("about")) {
          this.getAbout().add(castToReference(value));
        } else if (name.equals("context")) {
          this.context = castToReference(value); // Reference
        } else if (name.equals("sent")) {
          this.sent = castToDateTime(value); // DateTimeType
        } else if (name.equals("received")) {
          this.received = castToDateTime(value); // DateTimeType
        } else if (name.equals("sender")) {
          this.sender = castToReference(value); // Reference
        } else if (name.equals("reasonCode")) {
          this.getReasonCode().add(castToCodeableConcept(value));
        } else if (name.equals("reasonReference")) {
          this.getReasonReference().add(castToReference(value));
        } else if (name.equals("payload")) {
          this.getPayload().add((CommunicationPayloadComponent) value);
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case -246883639:  return addInstantiatesElement();
        case -332612366:  return addBasedOn(); 
        case -995410646:  return addPartOf(); 
        case 1932956065:  return addInResponseTo(); 
        case -892481550:  return getStatusElement();
        case 2051346646:  return getStatusReason(); 
        case 50511102:  return addCategory(); 
        case -1165461084:  return getPriorityElement();
        case -1078030475:  return addMedium(); 
        case -1867885268:  return getSubject(); 
        case 820081177:  return addRecipient(); 
        case 110546223:  return getTopic(); 
        case 92611469:  return addAbout(); 
        case 951530927:  return getContext(); 
        case 3526552:  return getSentElement();
        case -808719903:  return getReceivedElement();
        case -905962955:  return getSender(); 
        case 722137681:  return addReasonCode(); 
        case -1146218137:  return addReasonReference(); 
        case -786701938:  return addPayload(); 
        case 3387378:  return addNote(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -246883639: /*instantiates*/ return new String[] {"uri"};
        case -332612366: /*basedOn*/ return new String[] {"Reference"};
        case -995410646: /*partOf*/ return new String[] {"Reference"};
        case 1932956065: /*inResponseTo*/ return new String[] {"Reference"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 2051346646: /*statusReason*/ return new String[] {"CodeableConcept"};
        case 50511102: /*category*/ return new String[] {"CodeableConcept"};
        case -1165461084: /*priority*/ return new String[] {"code"};
        case -1078030475: /*medium*/ return new String[] {"CodeableConcept"};
        case -1867885268: /*subject*/ return new String[] {"Reference"};
        case 820081177: /*recipient*/ return new String[] {"Reference"};
        case 110546223: /*topic*/ return new String[] {"CodeableConcept"};
        case 92611469: /*about*/ return new String[] {"Reference"};
        case 951530927: /*context*/ return new String[] {"Reference"};
        case 3526552: /*sent*/ return new String[] {"dateTime"};
        case -808719903: /*received*/ return new String[] {"dateTime"};
        case -905962955: /*sender*/ return new String[] {"Reference"};
        case 722137681: /*reasonCode*/ return new String[] {"CodeableConcept"};
        case -1146218137: /*reasonReference*/ return new String[] {"Reference"};
        case -786701938: /*payload*/ return new String[] {};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("instantiates")) {
          throw new FHIRException("Cannot call addChild on a primitive type Communication.instantiates");
        }
        else if (name.equals("basedOn")) {
          return addBasedOn();
        }
        else if (name.equals("partOf")) {
          return addPartOf();
        }
        else if (name.equals("inResponseTo")) {
          return addInResponseTo();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type Communication.status");
        }
        else if (name.equals("statusReason")) {
          this.statusReason = new CodeableConcept();
          return this.statusReason;
        }
        else if (name.equals("category")) {
          return addCategory();
        }
        else if (name.equals("priority")) {
          throw new FHIRException("Cannot call addChild on a primitive type Communication.priority");
        }
        else if (name.equals("medium")) {
          return addMedium();
        }
        else if (name.equals("subject")) {
          this.subject = new Reference();
          return this.subject;
        }
        else if (name.equals("recipient")) {
          return addRecipient();
        }
        else if (name.equals("topic")) {
          this.topic = new CodeableConcept();
          return this.topic;
        }
        else if (name.equals("about")) {
          return addAbout();
        }
        else if (name.equals("context")) {
          this.context = new Reference();
          return this.context;
        }
        else if (name.equals("sent")) {
          throw new FHIRException("Cannot call addChild on a primitive type Communication.sent");
        }
        else if (name.equals("received")) {
          throw new FHIRException("Cannot call addChild on a primitive type Communication.received");
        }
        else if (name.equals("sender")) {
          this.sender = new Reference();
          return this.sender;
        }
        else if (name.equals("reasonCode")) {
          return addReasonCode();
        }
        else if (name.equals("reasonReference")) {
          return addReasonReference();
        }
        else if (name.equals("payload")) {
          return addPayload();
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Communication";

  }

      public Communication copy() {
        Communication dst = new Communication();
        copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        if (instantiates != null) {
          dst.instantiates = new ArrayList<UriType>();
          for (UriType i : instantiates)
            dst.instantiates.add(i.copy());
        };
        if (basedOn != null) {
          dst.basedOn = new ArrayList<Reference>();
          for (Reference i : basedOn)
            dst.basedOn.add(i.copy());
        };
        if (partOf != null) {
          dst.partOf = new ArrayList<Reference>();
          for (Reference i : partOf)
            dst.partOf.add(i.copy());
        };
        if (inResponseTo != null) {
          dst.inResponseTo = new ArrayList<Reference>();
          for (Reference i : inResponseTo)
            dst.inResponseTo.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        dst.statusReason = statusReason == null ? null : statusReason.copy();
        if (category != null) {
          dst.category = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : category)
            dst.category.add(i.copy());
        };
        dst.priority = priority == null ? null : priority.copy();
        if (medium != null) {
          dst.medium = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : medium)
            dst.medium.add(i.copy());
        };
        dst.subject = subject == null ? null : subject.copy();
        if (recipient != null) {
          dst.recipient = new ArrayList<Reference>();
          for (Reference i : recipient)
            dst.recipient.add(i.copy());
        };
        dst.topic = topic == null ? null : topic.copy();
        if (about != null) {
          dst.about = new ArrayList<Reference>();
          for (Reference i : about)
            dst.about.add(i.copy());
        };
        dst.context = context == null ? null : context.copy();
        dst.sent = sent == null ? null : sent.copy();
        dst.received = received == null ? null : received.copy();
        dst.sender = sender == null ? null : sender.copy();
        if (reasonCode != null) {
          dst.reasonCode = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : reasonCode)
            dst.reasonCode.add(i.copy());
        };
        if (reasonReference != null) {
          dst.reasonReference = new ArrayList<Reference>();
          for (Reference i : reasonReference)
            dst.reasonReference.add(i.copy());
        };
        if (payload != null) {
          dst.payload = new ArrayList<CommunicationPayloadComponent>();
          for (CommunicationPayloadComponent i : payload)
            dst.payload.add(i.copy());
        };
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        return dst;
      }

      protected Communication typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof Communication))
          return false;
        Communication o = (Communication) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(instantiates, o.instantiates, true)
           && compareDeep(basedOn, o.basedOn, true) && compareDeep(partOf, o.partOf, true) && compareDeep(inResponseTo, o.inResponseTo, true)
           && compareDeep(status, o.status, true) && compareDeep(statusReason, o.statusReason, true) && compareDeep(category, o.category, true)
           && compareDeep(priority, o.priority, true) && compareDeep(medium, o.medium, true) && compareDeep(subject, o.subject, true)
           && compareDeep(recipient, o.recipient, true) && compareDeep(topic, o.topic, true) && compareDeep(about, o.about, true)
           && compareDeep(context, o.context, true) && compareDeep(sent, o.sent, true) && compareDeep(received, o.received, true)
           && compareDeep(sender, o.sender, true) && compareDeep(reasonCode, o.reasonCode, true) && compareDeep(reasonReference, o.reasonReference, true)
           && compareDeep(payload, o.payload, true) && compareDeep(note, o.note, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof Communication))
          return false;
        Communication o = (Communication) other_;
        return compareValues(instantiates, o.instantiates, true) && compareValues(status, o.status, true) && compareValues(priority, o.priority, true)
           && compareValues(sent, o.sent, true) && compareValues(received, o.received, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, instantiates, basedOn
          , partOf, inResponseTo, status, statusReason, category, priority, medium, subject
          , recipient, topic, about, context, sent, received, sender, reasonCode, reasonReference
          , payload, note);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Communication;
   }

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Unique identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Communication.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="Communication.identifier", description="Unique identifier", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Unique identifier</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Communication.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>instantiates</b>
   * <p>
   * Description: <b>Instantiates protocol or definition</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>Communication.instantiates</b><br>
   * </p>
   */
  @SearchParamDefinition(name="instantiates", path="Communication.instantiates", description="Instantiates protocol or definition", type="uri" )
  public static final String SP_INSTANTIATES = "instantiates";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>instantiates</b>
   * <p>
   * Description: <b>Instantiates protocol or definition</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>Communication.instantiates</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.UriClientParam INSTANTIATES = new ca.uhn.fhir.rest.gclient.UriClientParam(SP_INSTANTIATES);

 /**
   * Search parameter: <b>subject</b>
   * <p>
   * Description: <b>Focus of message</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.subject</b><br>
   * </p>
   */
  @SearchParamDefinition(name="subject", path="Communication.subject", description="Focus of message", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Patient") }, target={Group.class, Patient.class } )
  public static final String SP_SUBJECT = "subject";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>subject</b>
   * <p>
   * Description: <b>Focus of message</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.subject</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SUBJECT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_SUBJECT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Communication:subject</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SUBJECT = new ca.uhn.fhir.model.api.Include("Communication:subject").toLocked();

 /**
   * Search parameter: <b>received</b>
   * <p>
   * Description: <b>When received</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Communication.received</b><br>
   * </p>
   */
  @SearchParamDefinition(name="received", path="Communication.received", description="When received", type="date" )
  public static final String SP_RECEIVED = "received";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>received</b>
   * <p>
   * Description: <b>When received</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Communication.received</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam RECEIVED = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_RECEIVED);

 /**
   * Search parameter: <b>part-of</b>
   * <p>
   * Description: <b>Part of this action</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.partOf</b><br>
   * </p>
   */
  @SearchParamDefinition(name="part-of", path="Communication.partOf", description="Part of this action", type="reference" )
  public static final String SP_PART_OF = "part-of";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>part-of</b>
   * <p>
   * Description: <b>Part of this action</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.partOf</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PART_OF = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PART_OF);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Communication:part-of</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PART_OF = new ca.uhn.fhir.model.api.Include("Communication:part-of").toLocked();

 /**
   * Search parameter: <b>medium</b>
   * <p>
   * Description: <b>A channel of communication</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Communication.medium</b><br>
   * </p>
   */
  @SearchParamDefinition(name="medium", path="Communication.medium", description="A channel of communication", type="token" )
  public static final String SP_MEDIUM = "medium";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>medium</b>
   * <p>
   * Description: <b>A channel of communication</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Communication.medium</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam MEDIUM = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_MEDIUM);

 /**
   * Search parameter: <b>encounter</b>
   * <p>
   * Description: <b>Encounter leading to message</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.context</b><br>
   * </p>
   */
  @SearchParamDefinition(name="encounter", path="Communication.context", description="Encounter leading to message", type="reference", target={Encounter.class } )
  public static final String SP_ENCOUNTER = "encounter";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
   * <p>
   * Description: <b>Encounter leading to message</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.context</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENCOUNTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ENCOUNTER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Communication:encounter</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENCOUNTER = new ca.uhn.fhir.model.api.Include("Communication:encounter").toLocked();

 /**
   * Search parameter: <b>sent</b>
   * <p>
   * Description: <b>When sent</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Communication.sent</b><br>
   * </p>
   */
  @SearchParamDefinition(name="sent", path="Communication.sent", description="When sent", type="date" )
  public static final String SP_SENT = "sent";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>sent</b>
   * <p>
   * Description: <b>When sent</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Communication.sent</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam SENT = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_SENT);

 /**
   * Search parameter: <b>based-on</b>
   * <p>
   * Description: <b>Request fulfilled by this communication</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.basedOn</b><br>
   * </p>
   */
  @SearchParamDefinition(name="based-on", path="Communication.basedOn", description="Request fulfilled by this communication", type="reference" )
  public static final String SP_BASED_ON = "based-on";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>based-on</b>
   * <p>
   * Description: <b>Request fulfilled by this communication</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.basedOn</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam BASED_ON = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_BASED_ON);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Communication:based-on</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_BASED_ON = new ca.uhn.fhir.model.api.Include("Communication:based-on").toLocked();

 /**
   * Search parameter: <b>sender</b>
   * <p>
   * Description: <b>Message sender</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.sender</b><br>
   * </p>
   */
  @SearchParamDefinition(name="sender", path="Communication.sender", description="Message sender", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Device"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Practitioner"), @ca.uhn.fhir.model.api.annotation.Compartment(name="RelatedPerson") }, target={Device.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_SENDER = "sender";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>sender</b>
   * <p>
   * Description: <b>Message sender</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.sender</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam SENDER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_SENDER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Communication:sender</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_SENDER = new ca.uhn.fhir.model.api.Include("Communication:sender").toLocked();

 /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>Focus of message</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.subject</b><br>
   * </p>
   */
  @SearchParamDefinition(name="patient", path="Communication.subject", description="Focus of message", type="reference", target={Patient.class } )
  public static final String SP_PATIENT = "patient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>Focus of message</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.subject</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PATIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Communication:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include("Communication:patient").toLocked();

 /**
   * Search parameter: <b>recipient</b>
   * <p>
   * Description: <b>Message recipient</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.recipient</b><br>
   * </p>
   */
  @SearchParamDefinition(name="recipient", path="Communication.recipient", description="Message recipient", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Device"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Patient"), @ca.uhn.fhir.model.api.annotation.Compartment(name="Practitioner"), @ca.uhn.fhir.model.api.annotation.Compartment(name="RelatedPerson") }, target={CareTeam.class, Device.class, Group.class, Organization.class, Patient.class, Practitioner.class, PractitionerRole.class, RelatedPerson.class } )
  public static final String SP_RECIPIENT = "recipient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>recipient</b>
   * <p>
   * Description: <b>Message recipient</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.recipient</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam RECIPIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_RECIPIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Communication:recipient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_RECIPIENT = new ca.uhn.fhir.model.api.Include("Communication:recipient").toLocked();

 /**
   * Search parameter: <b>context</b>
   * <p>
   * Description: <b>Encounter or episode leading to message</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.context</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context", path="Communication.context", description="Encounter or episode leading to message", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Encounter") }, target={Encounter.class, EpisodeOfCare.class } )
  public static final String SP_CONTEXT = "context";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context</b>
   * <p>
   * Description: <b>Encounter or episode leading to message</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Communication.context</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam CONTEXT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_CONTEXT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>Communication:context</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_CONTEXT = new ca.uhn.fhir.model.api.Include("Communication:context").toLocked();

 /**
   * Search parameter: <b>category</b>
   * <p>
   * Description: <b>Message category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Communication.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name="category", path="Communication.category", description="Message category", type="token" )
  public static final String SP_CATEGORY = "category";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>category</b>
   * <p>
   * Description: <b>Message category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Communication.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CATEGORY);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>preparation | in-progress | not-done | suspended | aborted | completed | entered-in-error</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Communication.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="Communication.status", description="preparation | in-progress | not-done | suspended | aborted | completed | entered-in-error", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>preparation | in-progress | not-done | suspended | aborted | completed | entered-in-error</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Communication.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);


}


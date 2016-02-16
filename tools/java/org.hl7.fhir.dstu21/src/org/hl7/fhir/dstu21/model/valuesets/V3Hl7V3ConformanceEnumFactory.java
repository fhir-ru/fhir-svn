package org.hl7.fhir.dstu21.model.valuesets;

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

// Generated on Sun, Jan 31, 2016 18:56-0800 for FHIR v1.3.0


import org.hl7.fhir.dstu21.model.EnumFactory;

public class V3Hl7V3ConformanceEnumFactory implements EnumFactory<V3Hl7V3Conformance> {

  public V3Hl7V3Conformance fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("I".equals(codeString))
      return V3Hl7V3Conformance.I;
    if ("NP".equals(codeString))
      return V3Hl7V3Conformance.NP;
    if ("R".equals(codeString))
      return V3Hl7V3Conformance.R;
    if ("RC".equals(codeString))
      return V3Hl7V3Conformance.RC;
    if ("RI".equals(codeString))
      return V3Hl7V3Conformance.RI;
    if ("U".equals(codeString))
      return V3Hl7V3Conformance.U;
    throw new IllegalArgumentException("Unknown V3Hl7V3Conformance code '"+codeString+"'");
  }

  public String toCode(V3Hl7V3Conformance code) {
    if (code == V3Hl7V3Conformance.I)
      return "I";
    if (code == V3Hl7V3Conformance.NP)
      return "NP";
    if (code == V3Hl7V3Conformance.R)
      return "R";
    if (code == V3Hl7V3Conformance.RC)
      return "RC";
    if (code == V3Hl7V3Conformance.RI)
      return "RI";
    if (code == V3Hl7V3Conformance.U)
      return "U";
    return "?";
  }

    public String toSystem(V3Hl7V3Conformance code) {
      return code.getSystem();
      }

}

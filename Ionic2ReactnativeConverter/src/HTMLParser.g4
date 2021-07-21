/*
 [The "BSD licence"]
 Copyright (c) 2013 Tom Everett
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

parser grammar HTMLParser;

options { tokenVocab= HTMLLexer; }

htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs*
     (interpolation|htmlElements)*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement  htmlMisc*
    ;

htmlElement
    : TAG_OPEN TAG_NAME (binding|htmlAttribute)*
      (TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE)
    | SCRIPTLET
    | script
    | style
    ;

// grammer rule of event directive

binding
    :propertybinding // class or style or id ...etc
    |structural_binding //  builtin directives like ngFor*
    |twoWaybining // two way binding
    |eventbinding
    ;

structural_binding : Astrict TAG_NAME TAG_EQUALS ATTVALUE_VALUE;
eventbinding : OPEN_PAR Property  CLOSE_PAR TAG_EQUALS ATTVALUE_VALUE  ;
propertybinding:OPEN_SQUARE_PARKET   Property CLOSE_SQUARE_PARKET TAG_EQUALS ATTVALUE_VALUE;
<<<<<<< Updated upstream
twowaybining: Two_way_binding_open NGMODEL  Two_way_binding_close  TAG_EQUALS ATTVALUE_VALUE ;
=======
twoWaybining: Two_way_binding_open NGMODEL  Two_way_binding_close  TAG_EQUALS ATTVALUE_VALUE ;
>>>>>>> Stashed changes

htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment | interpolation) htmlChardata?)*
//    |interpolation*
    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?
    ;

htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;

interpolation
    : htmlMisc* OPEN_curly_brac   Interpolation_inside  CLOSE_curly_brac htmlMisc*
    ;



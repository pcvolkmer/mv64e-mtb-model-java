# MV §64e MTB Java datamodel for use with DNPM:DIP

Serialization and deserialization of DNPM:DIP MTB DTOs for the Java programming language.

This library contains auto-generated Java code for the DNPM:DIP MTB DTOs as used by the DNPM:DIP backends Scala code.
It is a replacement for mostly manual adapted code in https://github.com/dnpm-dip/mv64e-mtb-dto-java.

## Usage notices

Since this library is also intended to be used with Onkostar, the default Java version is limited to Java 11
and all date-time objects do not use JSR 310 types but `java.util.Date`.

JSON (de)serialization includes format conversion for patients birthdate and date of death as introduced in
https://github.com/dnpm-dip/backend-core/commit/97c44aa8bbd6ba4ac81824c5178db23fd08f9068


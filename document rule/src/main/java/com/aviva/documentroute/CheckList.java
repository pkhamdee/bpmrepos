package com.aviva.documentroute;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CheckList implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String name;
   private java.lang.String value;

   public CheckList()
   {
   }

   public java.lang.String getName()
   {
      return this.name;
   }

   public void setName(java.lang.String name)
   {
      this.name = name;
   }

   public java.lang.String getValue()
   {
      return this.value;
   }

   public void setValue(java.lang.String value)
   {
      this.value = value;
   }

   public CheckList(java.lang.String name, java.lang.String value)
   {
      this.name = name;
      this.value = value;
   }

}
package com.aviva.documentroute;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Action implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String actionType;

   private java.util.List<com.aviva.documentroute.Property> properties;

   public Action()
   {
   }

   public java.lang.String getActionType()
   {
      return this.actionType;
   }

   public void setActionType(java.lang.String actionType)
   {
      this.actionType = actionType;
   }

   public java.util.List<com.aviva.documentroute.Property> getProperties()
   {
      return this.properties;
   }

   public void setProperties(
         java.util.List<com.aviva.documentroute.Property> properties)
   {
      this.properties = properties;
   }

   public Action(java.lang.String actionType,
         java.util.List<com.aviva.documentroute.Property> properties)
   {
      this.actionType = actionType;
      this.properties = properties;
   }

}
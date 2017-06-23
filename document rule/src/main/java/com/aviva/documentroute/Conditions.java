package com.aviva.documentroute;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Conditions implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String policyStatus;
   private java.lang.Boolean isContractCreated;
   private java.lang.Integer dispatchDate;
   private java.lang.Boolean isPolicyAckReceived;
   private java.lang.Boolean isPolicyHolderReceived;
   private java.lang.Boolean isCompliantReceived;
   private java.lang.Boolean isIncidentReceived;
   private java.lang.Boolean isCCNeedSupport;
   private java.lang.Boolean isNBProcessExist;
   private java.lang.Boolean isPSProcessExist;
   private java.lang.Boolean isClaimProcessExist;

   private java.lang.Boolean isPolicyOnHold;

   public Conditions()
   {
   }

   public java.lang.String getPolicyStatus()
   {
      return this.policyStatus;
   }

   public void setPolicyStatus(java.lang.String policyStatus)
   {
      this.policyStatus = policyStatus;
   }

   public java.lang.Boolean getIsContractCreated()
   {
      return this.isContractCreated;
   }

   public void setIsContractCreated(java.lang.Boolean isContractCreated)
   {
      this.isContractCreated = isContractCreated;
   }

   public java.lang.Integer getDispatchDate()
   {
      return this.dispatchDate;
   }

   public void setDispatchDate(java.lang.Integer dispatchDate)
   {
      this.dispatchDate = dispatchDate;
   }

   public java.lang.Boolean getIsPolicyAckReceived()
   {
      return this.isPolicyAckReceived;
   }

   public void setIsPolicyAckReceived(java.lang.Boolean isPolicyAckReceived)
   {
      this.isPolicyAckReceived = isPolicyAckReceived;
   }

   public java.lang.Boolean getIsPolicyHolderReceived()
   {
      return this.isPolicyHolderReceived;
   }

   public void setIsPolicyHolderReceived(
         java.lang.Boolean isPolicyHolderReceived)
   {
      this.isPolicyHolderReceived = isPolicyHolderReceived;
   }

   public java.lang.Boolean getIsCompliantReceived()
   {
      return this.isCompliantReceived;
   }

   public void setIsCompliantReceived(java.lang.Boolean isCompliantReceived)
   {
      this.isCompliantReceived = isCompliantReceived;
   }

   public java.lang.Boolean getIsIncidentReceived()
   {
      return this.isIncidentReceived;
   }

   public void setIsIncidentReceived(java.lang.Boolean isIncidentReceived)
   {
      this.isIncidentReceived = isIncidentReceived;
   }

   public java.lang.Boolean getIsCCNeedSupport()
   {
      return this.isCCNeedSupport;
   }

   public void setIsCCNeedSupport(java.lang.Boolean isCCNeedSupport)
   {
      this.isCCNeedSupport = isCCNeedSupport;
   }

   public java.lang.Boolean getIsNBProcessExist()
   {
      return this.isNBProcessExist;
   }

   public void setIsNBProcessExist(java.lang.Boolean isNBProcessExist)
   {
      this.isNBProcessExist = isNBProcessExist;
   }

   public java.lang.Boolean getIsPSProcessExist()
   {
      return this.isPSProcessExist;
   }

   public void setIsPSProcessExist(java.lang.Boolean isPSProcessExist)
   {
      this.isPSProcessExist = isPSProcessExist;
   }

   public java.lang.Boolean getIsClaimProcessExist()
   {
      return this.isClaimProcessExist;
   }

   public void setIsClaimProcessExist(java.lang.Boolean isClaimProcessExist)
   {
      this.isClaimProcessExist = isClaimProcessExist;
   }

   public java.lang.Boolean getIsPolicyOnHold()
   {
      return this.isPolicyOnHold;
   }

   public void setIsPolicyOnHold(java.lang.Boolean isPolicyOnHold)
   {
      this.isPolicyOnHold = isPolicyOnHold;
   }

   public Conditions(java.lang.String policyStatus,
         java.lang.Boolean isContractCreated, java.lang.Integer dispatchDate,
         java.lang.Boolean isPolicyAckReceived,
         java.lang.Boolean isPolicyHolderReceived,
         java.lang.Boolean isCompliantReceived,
         java.lang.Boolean isIncidentReceived,
         java.lang.Boolean isCCNeedSupport, java.lang.Boolean isNBProcessExist,
         java.lang.Boolean isPSProcessExist,
         java.lang.Boolean isClaimProcessExist, java.lang.Boolean isPolicyOnHold)
   {
      this.policyStatus = policyStatus;
      this.isContractCreated = isContractCreated;
      this.dispatchDate = dispatchDate;
      this.isPolicyAckReceived = isPolicyAckReceived;
      this.isPolicyHolderReceived = isPolicyHolderReceived;
      this.isCompliantReceived = isCompliantReceived;
      this.isIncidentReceived = isIncidentReceived;
      this.isCCNeedSupport = isCCNeedSupport;
      this.isNBProcessExist = isNBProcessExist;
      this.isPSProcessExist = isPSProcessExist;
      this.isClaimProcessExist = isClaimProcessExist;
      this.isPolicyOnHold = isPolicyOnHold;
   }

}
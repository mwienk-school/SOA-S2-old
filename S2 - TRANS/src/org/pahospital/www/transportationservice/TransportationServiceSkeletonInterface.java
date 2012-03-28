
/**
 * TransportationServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
    package org.pahospital.www.transportationservice;
    /**
     *  TransportationServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface TransportationServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param patientOrder
         */

        
                public void orderPatientTransport
                (
                  org.pahospital.www.transportationservice.PatientOrder patientOrder
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param sampleOrder
         */

        
                public void orderSampleTransport
                (
                  org.pahospital.www.transportationservice.SampleOrder sampleOrder
                 )
            ;
        
         }
    
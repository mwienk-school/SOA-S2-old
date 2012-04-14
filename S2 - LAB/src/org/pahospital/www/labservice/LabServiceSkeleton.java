
/**
 * LabServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
    package org.pahospital.www.labservice;

import java.sql.SQLException;
import java.util.Random;

import org.pahospital.www.database.DB_Manager;
import org.pahospital.www.labcallbackservice.CallbackThread;
    /**
     *  LabServiceSkeleton java skeleton for the axisService
     */
    public class LabServiceSkeleton implements LabServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param labOrder0 
             * @return labOrderId1 
         * @throws SQLException 
         */
        
                 public org.pahospital.www.labservice.LabOrderId orderLabTest
                  (
                  org.pahospital.www.labservice.LabOrder labOrder0
                  ) throws SQLException
                  {
                	 System.out.println("in Labservice");
                	 DB_Manager db=new DB_Manager();
                	 String orderID=db.InsertlabOrder(labOrder0);
                	 LabOrderId temp= new LabOrderId();
                	 temp.setLabOrderId(orderID);
                	 Random rn = new Random();
                	 int n = 100000 + 1;
                	 int i = rn.nextInt() % n;
                	 if(i<0)
                	 i= -1*i;
                	 System.out.println("sleep time"+i);
                     CallbackThread t= new CallbackThread(orderID,i);
                	 t.start();
                	 return temp;
        }
     
    }
    
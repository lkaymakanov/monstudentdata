
/**
 * WsnacidCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package net.is_bg.mon.wsclient.stub;

    /**
     *  WsnacidCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WsnacidCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WsnacidCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WsnacidCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getStudentDataFromEGN_AdminRD method
            * override this method for handling normal response from getStudentDataFromEGN_AdminRD operation
            */
           public void receiveResultgetStudentDataFromEGN_AdminRD(
                    net.is_bg.mon.wsclient.stub.WsnacidStub.GetStudentDataFromEGN_AdminRDResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStudentDataFromEGN_AdminRD operation
           */
            public void receiveErrorgetStudentDataFromEGN_AdminRD(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStudentDataFromEGN_AdminRHE method
            * override this method for handling normal response from getStudentDataFromEGN_AdminRHE operation
            */
           public void receiveResultgetStudentDataFromEGN_AdminRHE(
                    net.is_bg.mon.wsclient.stub.WsnacidStub.GetStudentDataFromEGN_AdminRHEResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStudentDataFromEGN_AdminRHE operation
           */
            public void receiveErrorgetStudentDataFromEGN_AdminRHE(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStudentDataFromLIN_AdminRHE method
            * override this method for handling normal response from getStudentDataFromLIN_AdminRHE operation
            */
           public void receiveResultgetStudentDataFromLIN_AdminRHE(
                    net.is_bg.mon.wsclient.stub.WsnacidStub.GetStudentDataFromLIN_AdminRHEResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStudentDataFromLIN_AdminRHE operation
           */
            public void receiveErrorgetStudentDataFromLIN_AdminRHE(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStudentPEDataFromEGN_AdminRHE method
            * override this method for handling normal response from getStudentPEDataFromEGN_AdminRHE operation
            */
           public void receiveResultgetStudentPEDataFromEGN_AdminRHE(
                    net.is_bg.mon.wsclient.stub.WsnacidStub.GetStudentPEDataFromEGN_AdminRHEResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStudentPEDataFromEGN_AdminRHE operation
           */
            public void receiveErrorgetStudentPEDataFromEGN_AdminRHE(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStudentDataFromEGN_AdminRDC method
            * override this method for handling normal response from getStudentDataFromEGN_AdminRDC operation
            */
           public void receiveResultgetStudentDataFromEGN_AdminRDC(
                    net.is_bg.mon.wsclient.stub.WsnacidStub.GetStudentDataFromEGN_AdminRDCResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStudentDataFromEGN_AdminRDC operation
           */
            public void receiveErrorgetStudentDataFromEGN_AdminRDC(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStudentPEDataFromLIN_AdminRHE method
            * override this method for handling normal response from getStudentPEDataFromLIN_AdminRHE operation
            */
           public void receiveResultgetStudentPEDataFromLIN_AdminRHE(
                    net.is_bg.mon.wsclient.stub.WsnacidStub.GetStudentPEDataFromLIN_AdminRHEResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStudentPEDataFromLIN_AdminRHE operation
           */
            public void receiveErrorgetStudentPEDataFromLIN_AdminRHE(java.lang.Exception e) {
            }
                


    }
    
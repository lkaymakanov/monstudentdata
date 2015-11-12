
/**
 * WsCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package net.is_bg.mon.wsclient.stub;

    /**
     *  WsCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class WsCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public WsCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public WsCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getServer method
            * override this method for handling normal response from getServer operation
            */
           public void receiveResultgetServer(
                    net.is_bg.mon.wsclient.stub.WsStub.GetServerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServer operation
           */
            public void receiveErrorgetServer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServerRHE method
            * override this method for handling normal response from getServerRHE operation
            */
           public void receiveResultgetServerRHE(
                    net.is_bg.mon.wsclient.stub.WsStub.GetServerRHEResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerRHE operation
           */
            public void receiveErrorgetServerRHE(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServerRHEOuter method
            * override this method for handling normal response from getServerRHEOuter operation
            */
           public void receiveResultgetServerRHEOuter(
                    net.is_bg.mon.wsclient.stub.WsStub.GetServerRHEOuterResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServerRHEOuter operation
           */
            public void receiveErrorgetServerRHEOuter(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUniversitiesData method
            * override this method for handling normal response from getUniversitiesData operation
            */
           public void receiveResultgetUniversitiesData(
                    net.is_bg.mon.wsclient.stub.WsStub.GetUniversitiesDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUniversitiesData operation
           */
            public void receiveErrorgetUniversitiesData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStudentDataFromEGN method
            * override this method for handling normal response from getStudentDataFromEGN operation
            */
           public void receiveResultgetStudentDataFromEGN(
                    net.is_bg.mon.wsclient.stub.WsStub.GetStudentDataFromEGNResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStudentDataFromEGN operation
           */
            public void receiveErrorgetStudentDataFromEGN(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getValidDatesData method
            * override this method for handling normal response from getValidDatesData operation
            */
           public void receiveResultgetValidDatesData(
                    net.is_bg.mon.wsclient.stub.WsStub.GetValidDatesDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getValidDatesData operation
           */
            public void receiveErrorgetValidDatesData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSpecialitiesData method
            * override this method for handling normal response from getSpecialitiesData operation
            */
           public void receiveResultgetSpecialitiesData(
                    net.is_bg.mon.wsclient.stub.WsStub.GetSpecialitiesDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSpecialitiesData operation
           */
            public void receiveErrorgetSpecialitiesData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getStudentDataFromEGNExtended method
            * override this method for handling normal response from getStudentDataFromEGNExtended operation
            */
           public void receiveResultgetStudentDataFromEGNExtended(
                    net.is_bg.mon.wsclient.stub.WsStub.GetStudentDataFromEGNExtendedResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getStudentDataFromEGNExtended operation
           */
            public void receiveErrorgetStudentDataFromEGNExtended(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getVersion method
            * override this method for handling normal response from getVersion operation
            */
           public void receiveResultgetVersion(
                    net.is_bg.mon.wsclient.stub.WsStub.GetVersionResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getVersion operation
           */
            public void receiveErrorgetVersion(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getUniversityStudentDataFromEGN method
            * override this method for handling normal response from getUniversityStudentDataFromEGN operation
            */
           public void receiveResultgetUniversityStudentDataFromEGN(
                    net.is_bg.mon.wsclient.stub.WsStub.GetUniversityStudentDataFromEGNResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getUniversityStudentDataFromEGN operation
           */
            public void receiveErrorgetUniversityStudentDataFromEGN(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getIndicatorsData method
            * override this method for handling normal response from getIndicatorsData operation
            */
           public void receiveResultgetIndicatorsData(
                    net.is_bg.mon.wsclient.stub.WsStub.GetIndicatorsDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getIndicatorsData operation
           */
            public void receiveErrorgetIndicatorsData(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getProfNapravleniaData method
            * override this method for handling normal response from getProfNapravleniaData operation
            */
           public void receiveResultgetProfNapravleniaData(
                    net.is_bg.mon.wsclient.stub.WsStub.GetProfNapravleniaDataResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getProfNapravleniaData operation
           */
            public void receiveErrorgetProfNapravleniaData(java.lang.Exception e) {
            }
                


    }
    
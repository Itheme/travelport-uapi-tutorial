package com.travelport.service.hotel_v35_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-03-09T16:22:43.818-07:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://www.travelport.com/service/hotel_v35_0", name = "HotelSearchServicePortType")
@XmlSeeAlso({com.travelport.schema.hotel_v35_0.ObjectFactory.class, com.travelport.schema.common_v35_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HotelSearchServicePortType {

    @WebResult(name = "HotelSearchAvailabilityRsp", targetNamespace = "http://www.travelport.com/schema/hotel_v35_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/HotelService")
    public com.travelport.schema.hotel_v35_0.BaseHotelSearchRsp service(
        @WebParam(partName = "parameters", name = "HotelSearchAvailabilityReq", targetNamespace = "http://www.travelport.com/schema/hotel_v35_0")
        com.travelport.schema.hotel_v35_0.HotelSearchAvailabilityReq parameters
    ) throws HotelFaultMessage;
}
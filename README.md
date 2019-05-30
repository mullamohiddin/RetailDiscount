RUN
---------
TO RUN this Project -> 
1. mvn clean install
2. RUN DemoApplication.java file as a Java application

To Check the payable Amount and discount details access below url in postman/soapUI

http://localhost:8080/api/rest/retail/bill

body :
{
"userName": "GOUSE",
"userType": "Employee",
"billNo": "123",
"amount": 998
}

Expected Response:
{
    "billNo": "123",
    "discountPercent": 30,
    "discountAmount": 299.4,
    "billAmount": 998,
    "payableAmount": 698.6,
    "userId": null,
    "discount": 30
}

This Project All contains Junit test coverage with all the scenarios.
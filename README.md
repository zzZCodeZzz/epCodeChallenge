# epCodeChallenge
### Currently running on 
(first Request will take a few seconds longer cause the free tier heroku server will go to sleep after 30 minutes of idle)

https://ep-code-challenge.herokuapp.com 

#####Example Request: 

`curl -X POST "https://ep-code-challenge.herokuapp.com/offer/example" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"applicant\": { \"address\": { \"city\": \"Berlin\", \"number\": 28, \"street\": \"Nehringstraße\", \"zipCode\": 14059 }, \"birthPlace\": \"Berlin\", \"birthday\": \"28.06.1988\", \"contactInfo\": { \"additionalContactMethod\": \"#ManuOnTwitter\", \"emails\": [ \"mail@mail.de\" ], \"phones\": [ { \"dialingCode\": \"+49\", \"number\": 1778756390 } ] }, \"firstName\": \"Manuel\", \"lastName\": \"Zach\" }, \"financing\": { \"brokerageInPercent\": 7, \"furnishingsPrice\": 20000, \"landTransferTaxInPercent\": 3, \"modernizing\": false, \"notarialFeeInPercent\": 5, \"otherCosts\": 10000, \"purchasePrice\": 100000, \"purpose\": \"PURCHASE\" }, \"property\": { \"address\": { \"city\": \"Berlin\", \"number\": 28, \"street\": \"Nehringstraße\", \"zipCode\": 14059 }, \"sizeInSquareMeter\": 120, \"type\": \"FLAT\" }}"`
##

### Dokumentation

https://ep-code-challenge.herokuapp.com/swagger-ui.html#
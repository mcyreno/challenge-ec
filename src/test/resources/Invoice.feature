#language:en
Feature: Invoice

  Background: Access the main page
    Given I can access the login page directly
    And I will login with a default user "user@phptravels.com", "demouser"
    And Access My Account Page 

  #TC003
  Scenario Outline: Check invoice with success
    Given Click on Invoice button
    Then All data will appear <Email>, <Password>, <HotelName>, <InvoiceDate>, <DueDate>, <InvoiceNumber>, <BookingCode>, <CustomerDetails>, <Room>, <CheckIn>, <CheckOut>, <TotalStay>, <DepositNow>, <TaxVAT>, <TotalAmount>

    Examples: 
      | Email | Password | HotelName | InvoiceDate | DueDate | InvoiceNumber | BookingCode | CustomerDetails | Room | CheckIn | CheckOut | TotalStay | DepositNow | TaxVAT | TotalAmount |
      | user@phptravels.com | Demouser | Rendezvous Hotel | "10/09/2018" | "11/09/2018" | 114 | 4259 | JOHNY SMITH | Junior Suites | "10/09/2018" | "11/09/2018" | "1 $250" | "USD $27.50" | "USD $25" | "USD $275" |
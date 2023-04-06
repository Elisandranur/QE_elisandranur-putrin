Feature: User able to pay the product
  As a user after choose the product
  I have to choose payment methode
  So that I able to isi pulsa

  Scenario: Payment product
    Given User already in Isi Pulsa Page
    When I am fill the number
    And I choose nominal
    And I am on the Pembayaran Page
    And I choose payment methode Gopay
    And I click the Bayar Sekarang Button
    Then I am on the Payment Receipt page
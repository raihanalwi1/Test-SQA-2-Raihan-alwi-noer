Feature: Tiket Pesawat
  As a user
  I want to tiket pesawat page
  So I can buy tiket pesawat

  Scenario Outline: tiket pesawat with jumlah penumpang
    Given I am on the tiket pesawat
    When I click jumlah penumpang
    And I click penumpang dewasa until "<jumlah>"
    Then I will get message result "<result>"
    Examples:
    | jumlah | result |
    | 7      | failed |
    | 1      | success |

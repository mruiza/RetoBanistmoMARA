#author: Maria Alejandra Ruiz Amariles

  Feature: As a user to the Bancolombia´s Web
    I want to download the PDF prohibitions
    for verify this PDF

    @ScenarioExitoso
  Scenario: Verify the PDF of prohibitions
    Given that the user wants to use the Bancolombia Web
    When he download the PDF of prohitions
    Then verify that see the PDF
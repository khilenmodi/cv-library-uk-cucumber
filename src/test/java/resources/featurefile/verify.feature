Feature: verify the job search result

  Scenario Outline: verify job search result using different dataset
    Given I am on homepage
    When I accept the cookies
    And  I enter job title "<JobTitle>"
    And  I enter location "<Location>"
    And  I enter Distance "<Distance>"
    And I click on more search option
    And I enter minimum salary "<salaryMin>"
    And I enter maximum salary "<salaryMax>"
    And I select salary type "<salaryType>"
    And I select job type "<jobType>"
    And I click on find jobs button
    Then I should see the job search result "<result>"

    Examples:
      | JobTitle            | Location | Distance | salaryMin | salaryMax | salaryType | jobType        | result                                            |
      | Tester              | Harrow   | 5 miles  | 30000     | 50000     | Per annum  | Permanent      | Permanent Tester jobs in Harrow                   |
      | Engineer            | UK       | 5 miles  | 50000     | 75000     | Per month  | Contract       | Contract Engineer jobs in UK                      |
      | Design Manager      | London   | 10 miles | 50000     | 100000    | Per annum  | Temporary      | Temporary Design Manager jobs in London           |
      | Warehouse Operative | London   | 15 miles | 10000     | 20000     | Per day    | Apprenticeship | Apprenticeship Warehouse Operative jobs in London |
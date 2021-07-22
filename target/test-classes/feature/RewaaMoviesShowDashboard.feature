@TestRewaaMoviesShowDashboardFeature
Feature: Covering positive test cases
  In order to test dashboard

  Background: User navigates to gmail URL
    Given I am on the Login page URL "http://3.134.135.231:4000/"
    Then I should see "angular-starter" on Page

  @verifyItemLists
  Scenario: validate all dropdown options inside Items List
    When I click on items list inside feature
    Then I softly see "Continents" is displayed in dropdown under lists
    Then I softly see "Countries" is displayed in dropdown under lists
    Then I softly see "Cities" is displayed in dropdown under lists
    Then I softly see "Movies" is displayed in dropdown under lists

  @verifyMoviesList
  Scenario: Print movies names on console for first page
    Then I print all movie list on console

  @verifyCountries
  Scenario: validate all expected countries list should be displayed while clicking on countries option
    When I click on items list inside feature
    And I click on "Countries" inside item list feature
    And I see following countries :
      | Afghanistan         |
      | Åland Islands       |
      | Albania             |
      | Algeria             |
      | American Samoa      |
      | Andorra             |
      | Angola              |
      | Anguilla            |
      | Antarctica          |
      | Antigua and Barbuda |
      | Argentina           |
      | Armenia             |
      | Aruba               |
      | Australia           |
      | Austria             |
      | Azerbaijan          |
      | Bahamas             |
      | Bahrain             |
      | Bangladesh          |
      | Barbados            |
    #Then I see expected continents " Afghanistan : Åland Islands : Albania : Algeria : American Samoa : Andorra : Angola : Anguilla : Antarctica : Antigua and Barbuda : Argentina : Armenia : Aruba : Australia : Austria : Azerbaijan : Bahamas : Bahrain : Bangladesh : Barbados " inside table
    And I refresh the page

  @verifyContinent
  Scenario: validate all expected continents list should be displayed while clicking on continents option
    When I click on items list inside feature
    And I click on "Continents" inside item list feature
    #Then I see expected continents " Antarctica : Australia : North America : South America " inside table
    And I see following continents :
      | Antarctica    |
      | Australia     |
      | North America |
      | South America |
    And I refresh the page

  @verifySearchFunctionality
  Scenario: validate search functionality
    And I perform search for "Abraham Lincoln"
    Then I see expected movie "Abraham Lincoln"

  @verifyCreateOperation
  Scenario: validate user is able to add sub movie into list
    And I perform search for "Abraham Lincoln"
    And I click on movie name "Abraham Lincoln"
    And I click on crud option "fas fa-plus"
    And I enter "Forrest Gump" into Name field
    And I enter "Forrest Gump" into file name field
    And I enter "23/06/1994" into release date field
    And I enter "Forrest Gump" into wikipedia field
    And I click on crud option "fas fa-save"
    Then I see movie id get generated

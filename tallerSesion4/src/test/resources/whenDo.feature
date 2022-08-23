Feature: WhenDo
  @Group3
  Scenario Outline: create a task

    Given I have access to WhenDo1

    When I create a task with
    And I write the title:"<title>"
    And I write the detail:"<detail>"
    And I keep the task
    Then the task "<title>" should be displayed


    Examples:
      | title   | detail |
      | Group3  | Somos el grupo 3|
      | JBGroup | Curso Automatizacion Moviles  |
      | Denisse | Denisse Palomino   |
      | Anahi   | Anahi Velasquez   |

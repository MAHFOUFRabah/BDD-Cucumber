Feature: Super Soothie Loyalty Card Program
  The more you by, the more point you earn
  Background:
    Given  the the following drink category
      | Drink              | Category | Points |  |
      | Banana             | Regular  | 15     |  |
      | triple Berry Blend | Fancy    | 20     |  |
      | Early Grey         | Tea      | 30     |  |

  Scenario Outline: Earning point when purchaching smoothies
    Given Michael is a Morning Freshness Member
    When Michael purchase <Quantity> <Drink> drinks
    Then He should earn <Points> points
    Examples:
      | Drink              | Quantity | Points |  |
      | Banana             | 2        | 30      |  |
      | triple Berry Blend | 1        | 20     |  |
      | Early Grey         | 3        | 90     |  |

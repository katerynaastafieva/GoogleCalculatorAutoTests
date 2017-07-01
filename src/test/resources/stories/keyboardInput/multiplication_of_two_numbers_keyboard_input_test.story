Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: GCK-3 Multiplication of two numbers using keyboard positive scenario

Given open google page with calculator on it for keyboard test
When multiply <num1> and <num2> using keyboard
Then shown a valid <result> for keyboard test

Examples:
|num1|num2|result|
|11  |10  |110   |
|0   |10  |0     |
|-15 |23  |-345  |
|-16 |-24 |384   |
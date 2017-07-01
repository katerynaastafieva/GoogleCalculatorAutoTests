Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: GCK-1 Adding of two numbers using keyboard positive scenario

Given open google page with calculator on it for keyboard test
When add <num1> and <num2> using keyboard
Then shown a valid <result> for keyboard test

Examples:
|num1|num2|result|
|1   |10  |11    |
|-15 |23  |8     |
|-16 |-24 |-40   |
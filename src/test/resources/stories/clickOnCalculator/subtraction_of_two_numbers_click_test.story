Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: GCC-2 Substraction of two numbers using mouse positive scenario

Given open google page with calculator on it for click test
When subtract <num2> from <num1> using mouse
Then shown a valid <result> for click test

Examples:
|num1|num2|result|
|11  |10  |1     |
|1   |10  |-9    |
|-15 |23  |-38   |
|-16 |-24 |-40   |
Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: GCC-5 Division by zero using mouse scenario

Given open google page with calculator on it for click test
When divide <num> by <zero> using mouse
Then shown a valid <result> for click test

Examples:
|num |zero|result    |
|22  |0   |Infinity  |
|0   |0   |Error     |
|22  |-0  |Infinity  |
|-3  |-0  |-Infinity |

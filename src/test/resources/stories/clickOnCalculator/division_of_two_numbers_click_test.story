Meta:

@mouse

Scenario: GCC-4 Division of two numbers using mouse positive scenario

Given open google page with calculator on it
When divide <num1> by <num2> using mouse
Then shown a valid <result>

Examples:
|num1|num2|result|
|22  |11  |2     |
|1   |10  |0.1   |
|-69 |23  |-3    |
|-24 |-24 |1     |
|0   |-24 |0     |
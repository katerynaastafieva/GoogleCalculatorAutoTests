Meta:

@mouse

Scenario: GCC-3 Multiplication of two numbers using mouse positive scenario

Given open google page with calculator on it
When multiply <num1> and <num2> using mouse
Then shown a valid <result>

Examples:
|num1|num2|result|
|11  |10  |110   |
|0   |10  |0     |
|-15 |23  |-345  |
|-16 |-24 |384   |
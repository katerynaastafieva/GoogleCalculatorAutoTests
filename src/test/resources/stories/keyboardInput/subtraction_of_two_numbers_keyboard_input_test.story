Meta:

@keyboard

Scenario: GCK-2 Substraction of two numbers using keyboard positive scenario

Given open google page with calculator on it
When subtract <num2> from <num1> using keyboard
Then shown a valid <result>

Examples:
|num1|num2|result|
|11  |10  |1     |
|1   |10  |-9    |
|-15 |23  |-38   |

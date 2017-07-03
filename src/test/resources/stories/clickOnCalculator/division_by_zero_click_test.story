Meta:

@mouse

Scenario: GCC-5 Division by zero using mouse scenario

Given open google page with calculator on it
When divide <num> by <zero> using mouse
Then shown a valid <result>

Examples:
|num |zero|result    |
|22  |0   |Infinity  |
|-123|0   |-Infinity |
|0   |0   |Error     |
|22  |-0  |Infinity  |
|-3  |-0  |-Infinity |

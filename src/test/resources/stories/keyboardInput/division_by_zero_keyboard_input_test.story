Meta:

@keyboard

Scenario: GCK-5 Division by zero using keyboard scenario

Given open google page with calculator on it
When divide <num> by <zero> using keyboard
Then shown a valid <result>

Examples:
|num |zero|result    |
|22  |0   |Infinity  |
|0   |0   |Error     |
|22  |-0  |Infinity  |
|-3  |-0  |-Infinity |

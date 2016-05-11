Feature: Total Cost calculator

Scenario: Calculate cost of item list 1
	Given cost of items
      | item   	| price	|
      | Banana  | 2.50	|
      | Orange	| 1.75	|
      | Apple   | 1.00	|
      | Lemon   | 0.50	|
      | Peach   | 1.99	|
    And items in my shopping basket are
      | item   	| quantity	|
      | Banana  | 1   		|
      | Orange  | 3   		|
      | Apple   | 5   		|
      | Lemon   | 11   		|
      | Peach   | 8   		|
    Then it should cost me 34.17
    
    
Scenario: Calculate cost of item list 2
	Given cost of items
      | item   	| price	|
      | Banana  | 12.89	|
      | Orange	| 21.75	|
      | Apple   | 92.11	|
      | Lemon   | 66.44	|
      | Peach   | 29.19	|
    And items in my shopping basket are
      | item   	| quantity	|
      | Banana  | 28   		|
      | Orange  | 53   		|
      | Apple   | 43   		|
      | Lemon   | 99   		|
      | Peach   | 41   		|
    Then it should cost me 13248.75
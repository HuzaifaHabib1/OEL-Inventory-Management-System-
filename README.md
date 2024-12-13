# OEL-Inventory-Management-System-
Proposed Application: An inventory management system will be developed to support item lookup, sorting by priority (e.g., perishables), and efficient addition and removal of items. The application will ensure fast data retrieval and manipulation, thus enhancing operational efficiency.
Chosen Data Structure: The primary data structure for this application will be a Priority Queue implemented using a Heap. This choice is justified as follows:
•	Efficiency: A heap allows for O(log n) time complexity for insertion and deletion, which is optimal for managing a dynamic set of items where priority changes frequently.
•	Comparison with Other Data Structures:
o	Arrays: Insertion and deletion in unsorted arrays have O(n) complexity, making them less efficient.
o	Linked Lists: Searching for the highest-priority item in an unsorted linked list is O(n), and even in a sorted linked list, insertion takes O(n).
o	Doubly Linked Lists: Similar to linked lists, operations are less efficient compared to heaps.
o	Stacks and Queues: These structures do not support prioritization.
Algorithmic Challenges:
1.	Maintaining the heap property during insertions and deletions.
2.	Efficiently handling updates to item priorities.
Plan to Address Challenges:
•	Implement a min-heap to prioritize items with the smallest values (e.g., expiration dates).
•	Use heapify operations to maintain heap properties efficiently during updates.
Reflection Report:
1.	Challenges:
o	Implementing the heapify operation correctly.
o	Ensuring the priority queue could handle dynamic updates efficiently.
2.	Data Structure Choice:
o	The heap was chosen due to its optimal performance for insertions and deletions, which are frequent in inventory systems.
3.	Learnings:
o	Understanding the importance of maintaining heap properties for efficiency.
o	Balancing clarity and optimization in code.
By designing and implementing this inventory management system, we gained practical experience in leveraging data structures and algorithms to solve real-world problems effectively.

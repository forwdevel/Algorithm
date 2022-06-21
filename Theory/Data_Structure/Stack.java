// [ Java Stack Class ]
// >> The Java collections framework has a class named 'Stack' that provides
//          the functionality of the stack data structure.
// >> The 'Stack' class extends the 'Vector' class.

// [ Stack Implementation ]
// >> In stack. elements are stored and accessed in 'Last in First Out' manner.
// >> That is, element are added to the top of the stack and removed form the top of the stack.

// [ Creating a Stack ]
// >> In order to creat a stack, we must import the 'java.util.Stack' package first.

// [ Stack Methods ]
// push() >> Add an element to the top of the stack.
// pop() >> Remove an element from the top the stack.
// peek() >> Return an object from the top of the stack.
// search() >> Return the 'position(index)' of the element in the stack. It used to search an elemnt in the stack
// empty() >> Check whether a stack is empty or not.

// [ Use ArrayDeque Instead of Stack ]
// >> The 'Stack' class provides the direct implementation of the stack data structure.
// >> However, it is recommended not to use it.
// >> Instead, use the 'ArrayDeque' class (implements the 'Deque' interface) to implement the stack data structure in java.
// Reason:
//    >> Stack is a class, Deque is an interface.
//    >> Only one class can be extended, whereas any number of interfaces can be implemented by single class in Java (multiple inheritance of type).
//    >> Using the Deque interface removes the dependency on the concrete Stack class and its ancestors and gives you more flexibility.
// Inconsistency:
//    >> Stack extends the Vector class, which allows you to access element by index.
//    >> 

import java.util.Stack;

public class Stack {
      public static void main(String[] args) {

            Stack<Integer> temp = new Stack<>();

      }
}

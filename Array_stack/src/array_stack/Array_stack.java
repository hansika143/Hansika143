/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_stack;

public class Array_stack {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();
        stack.push(10);
        System.out.println("10 pushed");
        stack.push(20);
        System.out.println("20 pushed");
        stack.push(30);
        System.out.println("30 pushed");

        System.out.println("Top element: " + stack.peek());
        int removed = stack.pop();
        System.out.println("Removed: " + removed);
        System.out.println("Top element now: " + (stack.isEmpty() ? "empty" : stack.peek()));
        System.out.println("Size: " + stack.size());
    }

}

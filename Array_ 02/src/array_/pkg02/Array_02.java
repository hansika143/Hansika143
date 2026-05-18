/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_.pkg02;

public class Array_02 {

    static class Node {
        String cityName;
        Node next;

        Node(String cityName) {
            this.cityName = cityName;
            this.next = null;
        }
    }

    private Node head = null;

    public void append(String cityName) {
        Node newNode = new Node(cityName);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // 1. Display all city names
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.cityName + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    // 2. Display total count, first city, and last city
    public void displayStats() {
        int count = 0;
        Node temp = head;
        String first = (head != null) ? head.cityName : "None";
        String last = "None";

        while (temp != null) {
            count++;
            if (temp.next == null) {
                last = temp.cityName;
            }
            temp = temp.next;
        }

        System.out.println("• Total number of cities: " + count);
        System.out.println("• First city in the list: " + first);
        System.out.println("• Last city in the list:  " + last);
    }

    // 3. Insert city at specific index
    public void insertAtIndex(int index, String cityName) {
        Node newNode = new Node(cityName);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // 5. Search for a city and display its index
    public void searchCity(String cityName) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.cityName.equalsIgnoreCase(cityName)) {
                System.out.println("City \"" + cityName + "\" found at index position: " + index);
                return;
            }
            temp = temp.next;
            index++;
        }
        System.out.println("City \"" + cityName + "\" not found in the list.");
    }

    // 6. Delete element at index position
    public void deleteAtIndex(int index) {
        if (head == null)
            return;

        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Index out of bounds for deletion");
            return;
        }

        temp.next = temp.next.next;
    }

    // 8. Display the Linked List in reverse order (using recursion)
    public void displayReverse() {
        printReverseHelper(head);
        System.out.println();
    }

    private void printReverseHelper(Node node) {
        if (node == null)
            return;
        printReverseHelper(node.next);
        System.out.print(node.cityName + " ");
    }

    // 9. Check whether a city exists
    public void checkExists(String cityName) {
        Node temp = head;
        boolean exists = false;
        while (temp != null) {
            if (temp.cityName.equalsIgnoreCase(cityName)) {
                exists = true;
                break;
            }
            temp = temp.next;
        }
        System.out.println("Does \"" + cityName + "\" exist in the list? " + (exists ? "Yes" : "No"));
    }

    // 10. Simple ani method
    public void ani() {
        System.out.println("ani method called");
    }

    // 11. Simple ain method
    public void ain() {
        System.out.println("ain method called");
    }

    // Main Method to run all tasks
    public static void main(String[] args) {
        Array_02 list = new Array_02();

        // Initial setup: Insert given city names
        String[] cities = { "Colombo", "Kandy", "Galle", "Jaffna", "Matara", "Kurunegala", "Badulla" };
        for (String city : cities) {
            list.append(city);
        }

        System.out.println("1. Initial Linked List ");
        list.displayList();
        System.out.println();

        System.out.println(" 2. List Statistics ");
        list.displayStats();
        System.out.println();

        System.out.println("3 & 4. Inserting 'Anuradhapura' at Index 3 ");
        list.insertAtIndex(3, "Anuradhapura");
        list.displayList();
        System.out.println();

        System.out.println(" 5. Search for 'Matara' ");
        list.searchCity("Matara");
        System.out.println();

        System.out.println("6 & 7. Deleting element at Index 4 ");
        list.deleteAtIndex(4);
        list.displayList();
        System.out.println();

        System.out.println("8. Linked List in Reverse Order ");
        list.displayReverse();
        System.out.println();

        System.out.println("Checking if 'Kandy' exists ");
        list.checkExists("Kandy");
        System.out.println();
        
    }
}
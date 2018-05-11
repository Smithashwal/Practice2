package practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import practice.Node;

public class ToDoList {

	List<Node> list = new LinkedList<Node>();

	public void toDoList() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your TO-DOs: ");
		String input = scanner.nextLine();
		Node node = new Node();
		node.setData(input);
		list.add(node);
	}

	public void printNodes() {
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i).getData());
	}

	public int takeInput() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1. TO_DOs and 2 to exit and 3 to display ");
		int choice = scanner.nextInt();
		return choice;

	}

	public static void main(String[] args) {

		int choice = 0;
		ToDoList toDoList = new ToDoList();
		while (choice != 2) {
			choice = toDoList.takeInput();

			if (choice == 1) {
				toDoList.toDoList();
			}

			if (choice == 3) {
				System.out.println("YOUR TO_DO LIST IS :");
				toDoList.printNodes();
			}

		}
	}

}

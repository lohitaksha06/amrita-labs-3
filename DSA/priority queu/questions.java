import java.util.*;4 — Priority Queue using Min-Heap and Max-Heap

import java.util.*;

public class Questions {

    static void showMinAndMaxHeap() {public class Q4_PriorityQueue {

        int[] values = {5, 3, 8, 1, 9};    public static void main(String[] args) {

        import java.util.*;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());        public class Questions {

            static void showMinAndMaxHeap() {

        for (int value : values) {                int[] values = {5, 3, 8, 1, 9};

            minHeap.add(value);

            maxHeap.add(value);                PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        }                PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());



        System.out.print("Min heap: ");                for (int value : values) {

        while (!minHeap.isEmpty()) {                    minHeap.add(value);

            System.out.print(minHeap.poll() + " ");                    maxHeap.add(value);

        }                }

        System.out.println();

                System.out.print("Min heap: ");

        System.out.print("Max heap: ");                while (!minHeap.isEmpty()) {

        while (!maxHeap.isEmpty()) {                    System.out.print(minHeap.poll() + " ");

            System.out.print(maxHeap.poll() + " ");                }

        }                System.out.println();

        System.out.println();

    }                System.out.print("Max heap: ");

                while (!maxHeap.isEmpty()) {

    static class Job {                    System.out.print(maxHeap.poll() + " ");

        final String id;                }

        final int priority;                System.out.println();

            }

        Job(String id, int priority) {

            this.id = id;            static class Job {

            this.priority = priority;                final String id;

        }                final int priority;

    }

                Job(String id, int priority) {

    static void showJobScheduling() {                    this.id = id;

        PriorityQueue<Job> jobs = new PriorityQueue<>((a, b) -> b.priority - a.priority);                    this.priority = priority;

        jobs.add(new Job("Job1", 3));                }

        jobs.add(new Job("Job2", 5));            }

        jobs.add(new Job("Job3", 1));

        jobs.add(new Job("Job4", 4));            static void showJobScheduling() {

                PriorityQueue<Job> jobs = new PriorityQueue<>((a, b) -> b.priority - a.priority);

        System.out.println("Job order (highest priority first):");                jobs.add(new Job("Job1", 3));

        while (!jobs.isEmpty()) {                jobs.add(new Job("Job2", 5));

            Job job = jobs.poll();                jobs.add(new Job("Job3", 1));

            System.out.println(job.id + " priority " + job.priority);                jobs.add(new Job("Job4", 4));

        }

    }                System.out.println("Job order (highest priority first):");

                while (!jobs.isEmpty()) {

    static class Task {                    Job job = jobs.poll();

        final String name;                    System.out.println(job.id + " priority " + job.priority);

        int priority;                }

            }

        Task(String name, int priority) {

            this.name = name;            static class Task {

            this.priority = priority;                final String name;

        }                int priority;

    }

                Task(String name, int priority) {

    static PriorityQueue<Task> taskQueue = new PriorityQueue<>((a, b) -> b.priority - a.priority);                    this.name = name;

                    this.priority = priority;

    static void addTask(String name, int priority) {                }

        taskQueue.add(new Task(name, priority));            }

    }

            static PriorityQueue<Task> taskQueue = new PriorityQueue<>((a, b) -> b.priority - a.priority);

    static void updateTaskPriority(String name, int newPriority) {

        List<Task> buffer = new ArrayList<>();            static void addTask(String name, int priority) {

        while (!taskQueue.isEmpty()) {                taskQueue.add(new Task(name, priority));

            Task current = taskQueue.poll();            }

            if (current.name.equals(name)) {

                current.priority = newPriority;            static void updateTaskPriority(String name, int newPriority) {

            }                List<Task> buffer = new ArrayList<>();

            buffer.add(current);                while (!taskQueue.isEmpty()) {

        }                    Task current = taskQueue.poll();

        taskQueue.addAll(buffer);                    if (current.name.equals(name)) {

    }                        current.priority = newPriority;

                    }

    static void printTasks() {                    buffer.add(current);

        PriorityQueue<Task> copy = new PriorityQueue<>(taskQueue);                }

        while (!copy.isEmpty()) {                taskQueue.addAll(buffer);

            Task task = copy.poll();            }

            System.out.println(task.name + " priority " + task.priority);

        }            static void printTasks() {

    }                PriorityQueue<Task> copy = new PriorityQueue<>(taskQueue);

                while (!copy.isEmpty()) {

    static void showDynamicPriority() {                    Task task = copy.poll();

        taskQueue.clear();                    System.out.println(task.name + " priority " + task.priority);

        addTask("Task1", 2);                }

        addTask("Task2", 5);            }

        addTask("Task3", 3);

            static void showDynamicPriority() {

        System.out.println("Tasks before update:");                taskQueue.clear();

        printTasks();                addTask("Task1", 2);

                addTask("Task2", 5);

        updateTaskPriority("Task1", 6);                addTask("Task3", 3);



        System.out.println("Tasks after update:");                System.out.println("Tasks before update:");

        printTasks();                printTasks();

    }

                updateTaskPriority("Task1", 6);

    public static void main(String[] args) {

        showMinAndMaxHeap();                System.out.println("Tasks after update:");

        System.out.println();                printTasks();

        showJobScheduling();            }

        System.out.println();

        showDynamicPriority();            public static void main(String[] args) {

    }                showMinAndMaxHeap();

}                System.out.println();

                showJobScheduling();
                System.out.println();
                showDynamicPriority();
            }
        }
    // Display queue
    static void display() {
        PriorityQueue<Task> temp = new PriorityQueue<>(pq);
        while (!temp.isEmpty()) {
            Task t = temp.poll();
            System.out.println(t.name + " → " + t.priority);
        }
    }

    public static void main(String[] args) {
        addTask("Task1", 2);
        addTask("Task2", 5);
        addTask("Task3", 3);

        System.out.println("Initial Queue:");
        display();

        System.out.println("\nUpdating priority of Task1 to 6...");
        updatePriority("Task1", 6);

        System.out.println("\nAfter Update:");
        display();
    }
}
}
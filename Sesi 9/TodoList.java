import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Queue<String> todoQueue = new LinkedList<>();
        Deque<String> doneDeque = new LinkedList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Selamat datang di Todo List!");
            System.out.println("============================");
            System.out.println("Silahkan masukkan kegiatan Anda.(Ketik 'selesai' apabila todolist sudah cukup)");
            System.out.println("============================");
            while (true) {
                String todo = scanner.nextLine();
                if (todo.equals("selesai")) {
                    break;
                }
                todoQueue.add(todo);
            }
            System.out.println("Daftar kegiatan yang harus dikerjakan:");
            int i = 1;
            for (String todo : todoQueue) {
                System.out.println(i + ". " + todo);
                i++;
            }
            System.out.println("============================");
            while (!todoQueue.isEmpty()) {
                String todo = todoQueue.peek();
                System.out.println("- " + todo);
                System.out.print("Apakah kegiatan ini telah selesai? (y/n) ");
                String answer = scanner.nextLine();
                if (answer.equals("y")) {
                    todoQueue.remove();
                    doneDeque.addFirst(todo);
                } else {
                    System.out.println("Silahkan selesaikan kegiatan ini terlebih dahulu sebelum melanjutkan ke kegiatan berikutnya.");
                }
            }
        }
        System.out.println("Daftar kegiatan yang telah selesai:");
        for (String done : doneDeque) {
            System.out.println("- " + done);
        }
        System.out.println("Terima kasih telah menggunakan Todo List!");
    }
}

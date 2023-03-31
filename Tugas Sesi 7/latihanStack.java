import java.util.Stack;

public class latihanStack {
    public static void main(String[] args) {
        Stack<String> jurusan = new Stack<String>();
        jurusan.push("TI");
        jurusan.push("SI");
        jurusan.push("Teknik Mesin");
        jurusan.push("DKV");

        System.out.println("Stack items\t: " + jurusan);
        jurusan.pop();
        System.out.println("Stack after pop\t: " + jurusan);
        System.out.println("Pick\t : " + jurusan.peek());
        System.out.println("Apakah kosong?\t: " + jurusan.empty());
        System.out.println("Lihat indeks ke- 2\t: " + jurusan.get(2));
        System.out.println("Lihat indeks pertama\t: " + jurusan.firstElement());
        System.out.println("Lihat indeks terakhir\t: " + jurusan.lastElement());
        jurusan.remove(1);
        System.out.println("Stack items sebelum clear\t: " + jurusan);
        jurusan.clear();
        System.out.println("Stack items sesudah clear\t: " + jurusan);

        for (String j : jurusan) {
            System.out.println("Stack items\t :" + j);
        }

    }
}
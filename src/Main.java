import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void cr0(File file) {
        if (file.mkdir()) System.out.println("Деректория создана");
    }

    public static void cr1(File file) throws IOException {
        if (file.createNewFile()) System.out.println("Файл создан");
    }

    public static void cr2(StringBuilder sum) {
        try (FileWriter writer = new FileWriter("D:\\ Games\\temp\\ temp.txt", false)) {

            writer.write(sum.toString() + " Оно работает");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {


        File Games = new File("D:// Games");
        File scr = new File("D:// Games", "scr");
        File res = new File("D:// Games", "res");
        File savegames = new File("D:// Games", "savegames");
        File temp = new File("D:// Games", "temp");
        File main = new File("D:\\ Games\\scr", "main");
        File test = new File("D:\\ Games\\scr", "test");
        File drawables = new File("D:\\ Games\\res", "drawables");
        File vectors = new File("D:\\ Games\\res", "vectors");
        File icons = new File("D:\\ Games\\res", "icons");


        File Utils = new File("D:\\ Games\\scr\\main", "Utils.java");
        File Main = new File("D:\\ Games\\scr\\main", "Main.java");
        File txt = new File("D:\\ Games\\temp", "temp.txt");

        ArrayList<File> s = new ArrayList<>();
        s.add(Games);
        s.add(scr);
        s.add(res);
        s.add(savegames);
        s.add(temp);
        s.add(main);
        s.add(test);
        s.add(icons);
        s.add(drawables);
        s.add(vectors);

        s.add(Utils);
        s.add(Main);
        s.add(txt);

        for (int i = 0; i < s.size() - 3; i++) {
            cr0(s.get(i));
        }
        for (int i = s.size() - 3; i < s.size(); i++) {
            cr1(s.get(i));
        }

        StringBuilder sum = new StringBuilder();
        sum.append(Games);
        sum.append(scr);
        sum.append(res);
        sum.append(savegames);
        sum.append(temp);
        sum.append(main);
        sum.append(test);
        sum.append(Main);
        sum.append(Utils);
        sum.append(drawables);
        sum.append(vectors);
        sum.append(icons);

    cr2(sum);

    }
}











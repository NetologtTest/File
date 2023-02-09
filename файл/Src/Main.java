import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        File Games = new File("D:// Games");
        if (Games.mkdir()) System.out.println("Каталог создан");

        File scr = new File("D:// Games", "scr");
        if (scr.mkdir()) System.out.println("Деректория создана");

        File res = new File("D:// Games", "res");
        if (res.mkdir()) System.out.println("Деректория создана");

        File savegames = new File("D:// Games", "savegames");
        if (savegames.mkdir()) System.out.println("Деректория создана");

        File temp = new File("D:// Games", "temp");
        if (temp.mkdir()) System.out.println("Деректория создана");


        File main = new File("D:\\ Games\\scr", "main");
        if (main.mkdir()) System.out.println("Деректория создана");


        File test = new File("D:\\ Games\\scr", "test");
        if (test.mkdir()) System.out.println("Деректория создана");

        File Main = new File("D:\\ Games\\scr\\main", "Main.java");
        try {
            Main.createNewFile();
            System.out.println("Файл создан");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File Utils = new File("D:\\ Games\\scr\\main", "Utils.java");
        try {
            Utils.createNewFile();
            System.out.println("Файл создан");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        File drawables = new File("D:\\ Games\\res", "drawables");
        if (drawables.mkdir()) System.out.println("Деректория создана");

        File vectors = new File("D:\\ Games\\res", "vectors");
        if (vectors.mkdir()) System.out.println("Деректория создана");

        File icons = new File("D:\\ Games\\res", "icons");
        if (icons.mkdir()) System.out.println("Деректория создана");

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

        try (FileWriter writer = new FileWriter("D:\\ Games\\temp\\ temp.txt", false)) {
      
            writer.write(sum.toString() + " Оно работает");
            writer.flush();
     
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


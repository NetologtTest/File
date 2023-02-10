import java.io.File;

public class Main {

    public static void main(String[] args) {
        GameProgress gameProgress1 = new GameProgress(999, 999, 1, 999.9);
        GameProgress gameProgress2 = new GameProgress(1, 1, 999, 1.0);
        GameProgress gameProgress3 = new GameProgress(123, 123, 123, 123.0);

        gameProgress1.saveGame("D:\\ Games\\savegames\\  gameProgress1");
        gameProgress2.saveGame("D:\\ Games\\savegames\\  gameProgress2");
        gameProgress3.saveGame("D:\\ Games\\savegames\\  gameProgress3");

        gameProgress1.zipFiles("D:\\ Games\\savegames\\ zip.zip1", "D:\\ Games\\savegames\\  gameProgress1 ");
        gameProgress1.zipFiles("D:\\ Games\\savegames\\ zip.zip2", "D:\\ Games\\savegames\\  gameProgress2 ");
        gameProgress1.zipFiles("D:\\ Games\\savegames\\ zip.zip3", "D:\\ Games\\savegames\\  gameProgress3 ");
    }
}
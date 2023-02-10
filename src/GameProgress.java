import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GameProgress implements Serializable {
    private static final long serialVersionUID = 1L;

    private int health;
    private int weapons;
    private int lvl;
    private double distance;

    public GameProgress(int health, int weapons, int lvl, double distance) {
        this.health = health;
        this.weapons = weapons;
        this.lvl = lvl;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "GameProgress{" +
                "health=" + health +
                ", weapons=" + weapons +
                ", lvl=" + lvl +
                ", distance=" + distance +
                '}';
    }

    public void saveGame(String way) {
        try {
            FileOutputStream fos = new FileOutputStream(way);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(way);
        } catch (Exception e) {
            System.out.println("Did not work");
        }
    }

    public void zipFiles(String way, String waySave) {

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(way));
             FileInputStream fis = new FileInputStream("paced_"+waySave)) {
            ZipEntry entry = new ZipEntry(waySave);
            zout.putNextEntry(entry);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}




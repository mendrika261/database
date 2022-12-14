package file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {

    public static String FILEPATH = "datafile/";

    public static void save(String filename, Object object) throws Exception {
        createDirectory();
        FileOutputStream fileOutputStream = new FileOutputStream(FILEPATH+filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(fileOutputStream));
        objectOutputStream.writeObject(object);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static Object load(String filename) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(FILEPATH+filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(fileInputStream));
        Object result = objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return result;
    }

    public static void clear(String filename) {
        File file = new File(FILEPATH+filename);
        if(file.exists()) file.delete();
    }

    public static void writeLog(String row) throws IOException {
        createDirectory();
        File file = new File(FILEPATH+"database.log");
        FileWriter fr = new FileWriter(file, true);
        fr.write(row+"\n");
        fr.close();
    }

    public static void createDirectory() throws IOException {
        File dir = new File(FILEPATH);
        if(!dir.exists() && !dir.isDirectory())
            Files.createDirectory(Paths.get(FILEPATH));
    }
}

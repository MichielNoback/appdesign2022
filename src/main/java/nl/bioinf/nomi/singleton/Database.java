package nl.bioinf.nomi.singleton;

public class Database {
    private static Database instance = new Database();

    private Database() { }

    public static Database getInstance() {
/*        synchronized (Database.class) {
            if (instance == null) {
                //thread A
                instance = new Database();
            }
        }*/
        return instance;
    }

}

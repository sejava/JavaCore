package practic.dbconfig.interfaces;

import practic.dbconfig.interfaces.DBServise;
import practic.dbconfig.interfaces.DeveloperDBServise;

/**
 * Created by pan on 18.12.16.
 */
public class Main {
        /* Інтерфейси*/
        public static void main(String[] args) {
            DeveloperDBServise developerDbServise = new DeveloperDBServise();

            //declaration
            DBServise devDbservice;

            //initialization
            devDbservice = new DeveloperDBServise();
            devDbservice = new ManagerDBService();
        }
        /* Інтерфейси*/
}

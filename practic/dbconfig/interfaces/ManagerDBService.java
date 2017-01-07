package practic.dbconfig.interfaces;

import practic.dbconfig.abstarcMethods.DeveloperEmployee;

/**
 * Created by pan on 18.12.16.
 */
public class ManagerDBService implements DBServise {
    @Override
    public void save(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee get(long id) {
        return null;
    }

    @Override
    public void update(DeveloperEmployee employee) {

    }

    @Override
    public DeveloperEmployee[] getAllDevelopers() {
        return new DeveloperEmployee[0];
    }
}

package practic.dbconfig.interfaces;

import practic.dbconfig.abstarcMethods.DeveloperEmployee;

/**
 * методи з интерфейся переписані
 */
public class DeveloperDBServise implements DBServise, Test {
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

    @Override
    public void test() {

    }
}

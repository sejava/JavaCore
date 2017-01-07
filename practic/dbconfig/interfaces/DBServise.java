package practic.dbconfig.interfaces;

import practic.dbconfig.abstarcMethods.DeveloperEmployee;

/**
 * практіка інтерфейсів
 */
public interface DBServise {
    void save(DeveloperEmployee employee);
    DeveloperEmployee get(long id);
    void update(DeveloperEmployee employee);

    DeveloperEmployee[] getAllDevelopers();

}

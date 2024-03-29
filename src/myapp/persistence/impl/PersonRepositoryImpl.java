package myapp.persistence.impl;

import myapp.model.MargaritaPizza;
import myapp.persistence.JpaRepository;
import myapp.persistence.PersistenceSettings;
import myapp.persistence.PersonRepository;

/**
 * Created by bruno.devesa on 26-07-2015.
 */
public class PersonRepositoryImpl extends JpaRepository<MargaritaPizza, Integer> implements PersonRepository {

    @Override
    protected String persistenceUnitName() {
        return PersistenceSettings.PERSISTENCE_UNIT_NAME;
    }
}

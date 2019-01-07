package by.epam.training.dmitrylishko.task02.dao;

import by.epam.training.dmitrylishko.task02.entity.Appliance;
import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;

public interface ApplianceDAO {
    <E>Appliance find(Criteria<E> creteria);
}

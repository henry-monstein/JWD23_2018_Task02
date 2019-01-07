package by.epam.training.dmitrylishko.task02.service;

import by.epam.training.dmitrylishko.task02.entity.Appliance;
import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;

public interface ApplianceService {
    <E> Appliance find(Criteria<E> criteria);
}

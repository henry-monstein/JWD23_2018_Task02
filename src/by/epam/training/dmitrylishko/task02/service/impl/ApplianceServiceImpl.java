package by.epam.training.dmitrylishko.task02.service.impl;

import by.epam.training.dmitrylishko.task02.dao.ApplianceDAO;
import by.epam.training.dmitrylishko.task02.dao.DAOFactory;
import by.epam.training.dmitrylishko.task02.entity.Appliance;
import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;
import by.epam.training.dmitrylishko.task02.service.ApplianceService;
import by.epam.training.dmitrylishko.task02.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {
    @Override
    public <E>Appliance find(Criteria<E> criteria){
        if(!Validator.criteriaValidator(criteria)){
            return null;
        }
        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        Appliance appliance = applianceDAO.find(criteria);

        return appliance;
    }
}

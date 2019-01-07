package by.epam.training.dmitrylishko.task02.dao.impl;

import by.epam.training.dmitrylishko.task02.dao.ApplianceDAO;
import by.epam.training.dmitrylishko.task02.entity.Appliance;
import by.epam.training.dmitrylishko.task02.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ApplianceDAOImpl implements ApplianceDAO {
    private static final String FILE_NAME = "src\\main\\resources\\appliances_db.txt";

    @Override
    public <E> Appliance find(Criteria<E> criteria) {

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_NAME);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if(checkLine(line, criteria)) {
                    return ApplianceCreator.createAppliance(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR");
        } catch (IOException e) {
            System.err.println("ERROR");
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.err.println("ERROR");
                }
            }
        }
        return null;
    }

    private static <E> boolean checkLine(String line, Criteria<E> criteria) {
        String applianceType = criteria.getApplianceType();
        boolean createObject = false;
        if (line.matches("(" + applianceType + ").+")) {
            String criterias = criteria.getCriteria().toString();
            String[] arrayCriterias = criterias.split("[{},\\s]+");
            for (int i = 0; i < arrayCriterias.length; i++) {
                createObject = line.matches(".+(" + arrayCriterias[i] + ").+");
            }
        }
        return createObject;
    }

}

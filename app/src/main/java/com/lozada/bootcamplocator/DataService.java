package com.lozada.bootcamplocator;

import java.util.ArrayList;

public class DataService {
    private static DataService instance = new DataService();

    public static DataService getInstance() {
        return instance;
    }

    private DataService() {

    }

    public ArrayList<LocationModel> getBootcampLocationsWithin10MilesOfZip(int zipcode) {
        //pretending we are downloading data from the server

        ArrayList<LocationModel> bootCamps =new ArrayList<>();
        bootCamps.add(new LocationModel( 10.2818f, 123.8816f, "SM Seaside", "Cebu City, Central Visayas, Philippines", "img"));
        bootCamps.add(new LocationModel( 10.2900f, 123.8619f, "University of San Jose-Recoletos Basak Campus", "Cebu City, Central Visayas, Philippines", "img"));
        bootCamps.add(new LocationModel( 10.2891f,123.8710f, "Shopwise", "N. Bacalso Ave., Basak San Nicolas, Cebu City, 6000", "img"));
        return bootCamps;
    }
}

package com.lhotse.core.team.TestingPack2;

import com.lhotse.core.team.TestingPack1.Beverage;

// If we remove pulbic from Beverage class then error comes as now that becomes default so cannot be access in different package.
// Error:(3, 41) java: com.lhotse.core.team.TestingPack1.Beverage is not public in com.lhotse.core.team.TestingPack1; cannot be accessed from outside package

public class Tea extends Beverage {
    public static void main(String[] arg){

    }
}

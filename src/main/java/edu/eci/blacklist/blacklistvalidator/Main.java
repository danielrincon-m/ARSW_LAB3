/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.blacklist.blacklistvalidator;

import java.util.List;

/**
 * @author hcadavid
 */
public class Main {

    public static void main(String a[]) {
        long tinicial = System.currentTimeMillis();

        HostBlackListsValidator hblv = new HostBlackListsValidator();
        List<Integer> blackListOcurrences = hblv.checkHost("200.24.34.55", 10);
//        int processorNumber = Runtime.getRuntime().availableProcessors();
//        List<Integer> blackListOcurrences=hblv.checkHost("200.24.34.55", 2 * processorNumber);
        System.out.println("The host was found in the following blacklists:" + blackListOcurrences);

        System.out.println("Tiempo: " + String.valueOf((double) (System.currentTimeMillis() - tinicial) / 1000d));
    }

}

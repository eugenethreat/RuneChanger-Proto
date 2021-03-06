package org.example.runes;

import com.google.gson.Gson;
import generated.LolPerksPerkPageResource;

import java.util.HashMap;

public class RunepageStore {
    /*
    Class that holds all the rune pages for champs in a list
     */

    HashMap<String, LolPerksPerkPageResource> runepages = new HashMap();

    public RunepageStore() {
        loadRunes();
    }

    public void loadRunes() {
        /*
        //probably have runepages stored as a json?
            runepages need:
            runes
            quints
            rune family ids
            name

            precision: 8000
            domination: 8100
            sorcery: 8200
            inspiration: 8300
            resolve: 8400
         */

        Gson gson = new Gson();
        LolPerksPerkPageResource sample = new LolPerksPerkPageResource();
        //serialize runepages to json

    }

    //Methods: pass a champ, get runepage
    public LolPerksPerkPageResource getRunesForChamp(String champ) {
        LolPerksPerkPageResource page = new LolPerksPerkPageResource();

        return page;
    }

}

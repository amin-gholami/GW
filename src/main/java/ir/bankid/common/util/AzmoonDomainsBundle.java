package ir.bankid.common.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

public class AzmoonDomainsBundle {
    private static ResourceBundle AZMOON_DOMAIN_PAGE = ResourceBundle.getBundle("allowedHosts/isc-azmoon-domains");

    public static List<String> azmoonDomains(){

        List azmoonDomains = new ArrayList<String>();
        Collections.list(AZMOON_DOMAIN_PAGE.getKeys()).forEach(key->{
                    azmoonDomains.add(AZMOON_DOMAIN_PAGE.getString(key));
                }
        );
        return azmoonDomains;
    }

}

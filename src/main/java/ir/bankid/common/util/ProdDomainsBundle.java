package ir.bankid.common.util;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

public class ProdDomainsBundle {
    private static ResourceBundle PROD_DOMAIN_PAGE = ResourceBundle.getBundle("allowedHosts/isc-prod-domains");

    public static List<String> prodDomains(){

        List prodDomains = new ArrayList<String>();
        Collections.list(PROD_DOMAIN_PAGE.getKeys()).forEach(key->{
                    prodDomains.add(PROD_DOMAIN_PAGE.getString(key));
                }
        );
        return prodDomains;
    }

}

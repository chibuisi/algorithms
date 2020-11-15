package google;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Provider {
    String name;
    HashMap<String,Double> prefixesAndRates = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Double> getPrefixesAndRates() {
        return prefixesAndRates;
    }

    public void setPrefixesAndRates(HashMap<String, Double> prefixesAndRates) {
        this.prefixesAndRates = prefixesAndRates;
    }
}

class Solution{
    List<Provider> providers = new ArrayList<>();
    HashMap<String,Provider> p = new HashMap<>();
     Solution(){
         Provider provider1 = new Provider();
         provider1.name = "Provider1";
         provider1.prefixesAndRates.put("972",0.02);
         provider1.prefixesAndRates.put("97251",0.02);

         Provider provider2 = new Provider();
         provider2.name = "Provider2";
         provider2.prefixesAndRates.put("972", 0.01);
         provider2.prefixesAndRates.put("97250",0.03);

         providers.add(provider1);
         providers.add(provider2);

         p.put("Provider1",provider1);
         p.put("Provider2",provider2);
     }
     public List<String> findCheapProvider(String phoneNo){
         double rate = 0.0;
         StringBuilder prefix = new StringBuilder();
         for(int i = 0; i < phoneNo.length()-1; i++){
             prefix.append(phoneNo.substring(0,i));
             List<Provider> providerList = providers.stream()
                     .filter(provider -> provider.name.equals(prefix)).collect(Collectors.toList());
             for(Provider p : providerList){
                 rate = Math.min(rate, p.prefixesAndRates.get("prefix"));
             }
         }
         List<String> result = new ArrayList<>();
         result.add(rate+"");
         return result;
     }
}

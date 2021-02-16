package parsers;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JsonSimpleParser extends Downloader implements Variables, ParserStratedgy {

    @Override
    public Root parse(String stringToParse) {

        Root root = new Root();
        JSONParser parser = new JSONParser();
        try {
            JSONObject rootJsonObject = (JSONObject) parser.parse(stringToParse);
            String bankName = (String) rootJsonObject.get(TAG_BANK_NAME);
            String bankLocation = (String) rootJsonObject.get(TAG_BANK_LOCATION);
            long baseCurrencyId = (long) rootJsonObject.get(TAG_BASE_CURRENCY_ID);
            Date date = DateParse.strToDate((String) rootJsonObject.get(TAG_DATE));

            JSONArray currencyJsonArray = (JSONArray) rootJsonObject.get(TAG_CURRENCY);
            List<Currency> currencyList = new ArrayList<>();

            for (Object it : currencyJsonArray) {
                JSONObject currencyJsonObject = (JSONObject) it;

                long id = (long) currencyJsonObject.get(TAG_ID);
                String name = (String) currencyJsonObject.get(TAG_NAME);
                long code = (long) currencyJsonObject.get(TAG_CODE);
                double rate = ((Number) currencyJsonObject.get(TAG_RATE)).doubleValue();
                boolean visible = (boolean) currencyJsonObject.get(TAG_VISIBLE);

                Currency currency = new Currency((int) code, (int) id, name, rate, visible);
                currencyList.add(currency);
            }
            root.setBankName(bankName);
            root.setBankLocation(bankLocation);
            root.setDate(date);
            root.setBaseCurrencyId((int) baseCurrencyId);
            root.setCurrencies(currencyList);

            System.out.println("Вы выбрали JsonSimpleParser-парсер");
            return root;

        } catch (Exception e) {
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}
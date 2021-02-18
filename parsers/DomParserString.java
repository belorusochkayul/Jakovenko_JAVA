package parsers;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    public class DomParserString implements ParseStratedgyEmpty, Variables,UrlXmlUtils {
        @Override
        public Root parse() {
            Root root = new Root();
            Document doc;
            try {
                doc = buildDocument();
            } catch (Exception e) {
                System.out.println("Open parsing error" + e.toString());
                return null;
            }

            Node rootNode = doc.getFirstChild();
            NodeList rootChilds = rootNode.getChildNodes();

            String bankName = null;
            String bankLocation = null;
            String dateStr = null;
            Date date = null;
            int baseCurrencyId = 0;
            Node currencyNode = null;
            for (int i = 0; i < rootChilds.getLength(); i++) {
                if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }

                switch (rootChilds.item(i).getNodeName()) {
                    case TAG_BANK_NAME: {
                        bankName = rootChilds.item(i).getTextContent();
                        break;
                    }
                    case TAG_BANK_LOCATION: {
                        bankLocation = rootChilds.item(i).getTextContent();
                        break;
                    }
                    case TAG_DATE: {
                        dateStr = rootChilds.item(i).getTextContent();
                        date = DateParse.strToDate(dateStr);
                        System.out.println(date.toString());
                        break;
                    }
                    case TAG_BASE_CURRENCY_ID: {
                        try {
                            baseCurrencyId = Integer.valueOf(rootChilds.item(i).getTextContent());
                            break;
                        } catch (Exception e) {
                            System.out.println("Type not integer" + e.toString());
                        }
                    }
                    case TAG_CURRENCY: {
                        currencyNode = rootChilds.item(i);
                        break;
                    }
                }
            }
            if (currencyNode == null) {
                return null;
            }
            List<Currency> currencyList = parsCurrency(currencyNode);

            root.setBankName(bankName);
            root.setBankLocation(bankLocation);
            root.setDate(date);
            root.setBaseCurrencyId(baseCurrencyId);
            root.setCurrencies(currencyList);

            System.out.println("Вы выбрали DOM-парсер");
            return root;
        }

        private Document buildDocument() throws Exception {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            return dbf.newDocumentBuilder().parse(URL);
        }

        private List<Currency> parsCurrency(Node currencyNode) {
            List<Currency> currencyList = new ArrayList<>();
            NodeList currencyChilds = currencyNode.getChildNodes();

            for (int i = 0; i < currencyChilds.getLength(); i++) {
                if (currencyChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                if (!currencyChilds.item(i).getNodeName().equals(TAG_ELEMENT)) {
                    continue;
                }
                Currency currency = parsElement(currencyChilds.item(i));
                currencyList.add(currency);
            }
            return currencyList;
        }

        private Currency parsElement(Node elementNode) {
            int code = 0;
            int id = 0;
            String name = "";
            float rate = 0;
            boolean visible = false;

            NodeList elementChilds = elementNode.getChildNodes();
            for (int j = 0; j < elementChilds.getLength(); j++) {
                if (elementChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }

                switch (elementChilds.item(j).getNodeName()) {
                    case TAG_CODE: {
                        try {
                            code = Integer.valueOf(elementChilds.item(j).getTextContent());
                            break;
                        } catch (Exception e) {
                            System.out.println("Type not integer" + e.toString());
                        }
                    }
                    case TAG_ID: {
                        try {
                            id = Integer.valueOf(elementChilds.item(j).getTextContent());
                            break;
                        } catch (Exception e) {
                            System.out.println("Type not integer" + e.toString());
                        }
                    }
                    case TAG_NAME: {
                        name = elementChilds.item(j).getTextContent();
                        break;
                    }
                    case TAG_RATE: {
                        try {
                            rate = Float.valueOf(elementChilds.item(j).getTextContent());
                            break;
                        } catch (Exception e) {
                            System.out.println("Type not Float" + e.toString());
                        }
                    }
                    case TAG_VISIBLE: {
                        visible = Boolean.valueOf(elementChilds.item(j).getTextContent());
                        break;
                    }
                }
            }
            Currency currency = new Currency(code, id, name, rate, visible);
            return currency;
        }
    }
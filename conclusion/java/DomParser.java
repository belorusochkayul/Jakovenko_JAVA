import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DomParser implements ParseStratedgy, Variables {
    private String url;

    public DomParser(String url) {
        this.url = url;
    }

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

        String name = null;
        String location = null;
        Node newsNode = null;

        for (int i = 0; i < rootChilds.getLength(); i++) {
            if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (rootChilds.item(i).getNodeName()) {
                case TAG_NAME: {
                    name = rootChilds.item(i).getTextContent();
                    break;
                }
                case TAG_LOCATION: {
                    location = rootChilds.item(i).getTextContent();
                    break;
                }
                case TAG_NEWS: {
                    newsNode = rootChilds.item(i);
                    break;
                }
            }
        }
        if (newsNode == null) {
            return null;
        }

        List<News> newsList = parsNews(newsNode);
        root.setName(name);
        root.setLocation(location);
        root.setNews(newsList);

        System.out.println("Вы выбрали DOM-парсер");
        return root;
    }

    private Document buildDocument() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(url);
    }

    private List<News> parsNews(Node newsNode) {
        List<News> newsList = new ArrayList<>();
        NodeList newsChilds = newsNode.getChildNodes();

        for (int i = 0; i < newsChilds.getLength(); i++) {
            if (newsChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            if (!newsChilds.item(i).getNodeName().equals(TAG_ELEMENT)) {
                continue;
            }
            News news = parsElement(newsChilds.item(i));
            newsList.add(news);
        }
        return newsList;
    }

    private News parsElement(Node elementNode) {
        int id = 0;
        String title = "";
        String description = "";
        boolean visible = false;
        String dateStr = null;
        Date date = null;
        List<String> keywords = new ArrayList<>();
        String element = "";

        NodeList elementChilds = elementNode.getChildNodes();
        for (int j = 0; j < elementChilds.getLength(); j++) {
            if (elementChilds.item(j).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            switch (elementChilds.item(j).getNodeName()) {
                case TAG_ID: {
                    try {
                        id = Integer.valueOf(elementChilds.item(j).getTextContent());
                        break;
                    } catch (Exception e) {
                        System.out.println("Type not integer" + e.toString());
                    }
                }
                case TAG_TITLE: {
                    title = elementChilds.item(j).getTextContent();
                    break;
                }
                case TAG_DESCRIPTION: {
                    description = elementChilds.item(j).getTextContent();
                    break;
                }
                case TAG_DATE: {
                    dateStr = elementChilds.item(j).getTextContent();
                    date = DateParse.strToDate(dateStr);
                    break;
                }
                case TAG_VISIBLE: {
                    visible = Boolean.valueOf(elementChilds.item(j).getTextContent());
                    break;
                }
                case TAG_KEYWORDS: {
                    for (int k = 0; k < elementChilds.getLength(); k++) {
                        element = elementChilds.item(j).getTextContent();
                    }
                    keywords.add(element);
                    break;
                }
            }
        }
        News news = new News(date, description, id, keywords, title, visible);
        return news;
    }
}
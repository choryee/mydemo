package ex10_Refactorying_Java_2nd.chapter12.replaceSuperclassWithDelegate;

import java.util.HashMap;
import java.util.Map;

public class CatalogRepository {
    Map<Long, CatalogItem> map = new HashMap<>();

    public CatalogItem get(Long id) {
        return map.get(id);
    }
}

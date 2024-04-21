package ex10_Refactorying_Java_2nd.chapter06.introduceParameterObject;

import java.util.ArrayList;
import java.util.List;

public class Station {
    protected String name;
    protected List<Reading> readings = new ArrayList<>();
}

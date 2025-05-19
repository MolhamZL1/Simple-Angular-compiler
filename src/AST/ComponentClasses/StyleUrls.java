package AST.ComponentClasses;

import java.util.List;

public class StyleUrls implements StylesProperty{
    private List<String> urls;

    public StyleUrls(List<String> urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "StyleUrls{" +
                 urls +
                '}';
    }
}

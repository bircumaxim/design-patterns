package composite;

import java.util.ArrayList;

import static composite.Main.compositeBuilder;

class Directory implements Element {
    private String name;
    private ArrayList<Element> includedElements = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Element element) {
        includedElements.add(element);
    }

    public void ls() {
        System.out.println(compositeBuilder + name);
        compositeBuilder.append("   ");
        for (Object obj : includedElements) {
            // Recover the type of this object
            String name = obj.getClass().getSimpleName();
            if (name.equals("Directory")) {
                ((Directory) obj).ls();
            } else {
                ((File) obj).ls();
            }
        }
        compositeBuilder.setLength(compositeBuilder.length() - 3);
    }
}

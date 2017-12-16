package composite;

import java.util.ArrayList;

import static composite.Main.compositeBuilder;

class Directory {
    private String name;
    private ArrayList<Object> includedFiles = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        includedFiles.add(obj);
    }

    public void ls() {
        System.out.println(compositeBuilder + name);
        compositeBuilder.append("   ");
        for (Object obj : includedFiles) {
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

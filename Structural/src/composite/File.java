package composite;

import static composite.Main.compositeBuilder;

class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println(compositeBuilder + name);
    }
}


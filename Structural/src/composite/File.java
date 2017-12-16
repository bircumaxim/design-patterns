package composite;

import static composite.Main.compositeBuilder;

class File implements Element {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println(compositeBuilder + name);
    }
}


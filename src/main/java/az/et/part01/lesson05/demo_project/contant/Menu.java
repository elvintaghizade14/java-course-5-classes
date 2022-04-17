package az.et.part01.lesson05.demo_project.contant;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Menu {
    LOGIN(1, "Login"),
    REGISTER(2, "Register");

    private final int id;
    private final String title;

    Menu(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public static String getMenu() {
        return menuStream()
                .map(Menu::formatMenu)
                .collect(Collectors.joining("\n"));
    }

    private static String formatMenu(Menu menu) {
        return menu.id + ". " + menu.title;
    }

    public static Menu findMenuById(int id) {
        return menuStream()
                .filter(menu -> menu.id == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid menu id: " + id));
    }

    private static Stream<Menu> menuStream() {
        return Arrays.stream(Menu.values());
    }
}

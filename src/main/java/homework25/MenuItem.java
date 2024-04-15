package homework25;
//Добавьте поле name типа String для названия элемента.
//Добавьте поле type типа MenuItemType для указания типа элемента.
//Создайте конструктор, принимающий оба значения.
//Реализуйте методы getName() и getType() для доступа к полям.
//Переопределите метод toString() для вывода информации об элементе.

public class MenuItem {
    private String dashname;
    private MenuItemType menuItemType;

    public MenuItem(String dashname, MenuItemType menuItemType) {
        this.dashname = dashname;
        this.menuItemType = menuItemType;
    }

    public String getDashname() {
        return dashname;
    }

    public MenuItemType getMenuItemType() {
        return menuItemType;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "dashname='" + dashname + '\'' +
                ", menuItemType=" + menuItemType +
                '}';
    }

    }


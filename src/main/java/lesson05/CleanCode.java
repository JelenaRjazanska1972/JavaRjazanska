package lesson05;

public class CleanCode {
    //правила наименования переменных
    //всегда с мал буквы --->
    //lowerCamelCase
    //должна указывать на то что она обознает какие задачи
    //если нужна цифра то в середине или в конце
    int currentPage = 10;
    String userName = "max";

    //is, can, hat, isAvailable, canExecute
    boolean hasChildren = true;

    boolean sendMessage = true;

    // Правила наименование методов
    //lowerCamelCase
    // в названии стоит описание метода что он делает
    public int calculateTax() {
        return 0;
    }

}

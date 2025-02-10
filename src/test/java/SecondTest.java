import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SecondTest {
    @Test
    void SecondTest() {
        Configuration.holdBrowserOpen = true; // Оставляем браузер открытым после теста
        open("https://admin-stand-2.merch-agg-new.ru/login");

        // Проверяем, что элемент видим, и вводим значение
        $("[name='login']").shouldBe(visible).setValue("HelloWorld");

        // Логируем результат
        System.out.println("Элемент найден: " + $("[name='login']").exists());

    }
}

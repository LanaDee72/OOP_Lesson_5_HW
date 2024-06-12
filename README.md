## Lesson 5. HW
### Антонова С.Е. Номер группы: 6380

Добрый день!

Попыталась написать реальзацию `Service`, `Controller` и `View` через интерфейсы. Надеюсь не перемудрила и все сделала правильно

У меня только есть вопрос. Изначально в интерфейсе `UserService` я хотела прописать следующий код:

```
public interface UserService {
    User create(String name, String lastName);
    User getById(int id) throws Exception;
    List<User> getAll();
}
```

Но, когда я стала переопределять методы интерфеса в `StudentService`, VScode не дал мне прописать переопределение `List<User> getAll()` как `List<Student> getAll()`. Если я правильно поняла, была ошибка типов.

Скажите пожалуйста где я допустила ошибку? И как в таком случае следовало написать код?

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AnnotationProcessor {

    public void process(Object object) {

        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Run.class)) {
                Run annotation = method.getAnnotation(Run.class);

                System.out.println("Запущен метод: " + annotation.description());

                if (!Modifier.isPublic((method.getModifiers()))) {
                    method.setAccessible(true);
                }

                try {
                    method.invoke(object);
                } catch (Exception e) {
                    System.out.println("Произошла ошибка при запуске метода процессором аннотации" + e.getMessage());
                }
            }
        }
    }
}

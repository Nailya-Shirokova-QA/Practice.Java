import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ObjectNullifier {

    public static void nullifyObject(Object obj) {
        if (obj == null) {
            return;
        }

        Class<?> clazz = obj.getClass();

        while (clazz != null && clazz != Object.class) {
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                try {
                    field.setAccessible(true);

                    int modifiers = field.getModifiers();

                    if (Modifier.isFinal(modifiers)) {
                        continue;
                    }

                    Class<?> fieldType = field.getType();

                    if (!fieldType.isPrimitive()) {
                        if (Modifier.isStatic(modifiers)) {
                            field.set(null, null);
                        } else {
                            field.set(obj, null);
                        }
                    }

                } catch (IllegalAccessException e) {
                    System.err.println("Error accessing field: " + field.getName());
                } catch (Exception e) {
                    System.err.println("Error processing field: " + field.getName());
                }
            }

            clazz = clazz.getSuperclass();
        }
    }

    public static void nullifyObjectWithSetters(Object obj) {
        if (obj == null) {
            return;
        }

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            try {
                int modifiers = field.getModifiers();

                if (Modifier.isFinal(modifiers)) {
                    continue;
                }

                String fieldName = field.getName();
                String setterName = "set" +
                        fieldName.substring(0, 1).toUpperCase() +
                        fieldName.substring(1);

                try {
                    Class<?> fieldType = field.getType();

                    if (!fieldType.isPrimitive()) {
                        if (Modifier.isStatic(modifiers)) {
                            clazz.getMethod(setterName, fieldType).invoke(null, (Object) null);
                        } else {
                            clazz.getMethod(setterName, fieldType).invoke(obj, (Object) null);
                        }
                    }
                } catch (NoSuchMethodException e) {
                    System.err.println("No setter for field: " + fieldName);
                }

            } catch (Exception e) {
                System.err.println("Error processing field: " + field.getName());
            }
        }
    }
}

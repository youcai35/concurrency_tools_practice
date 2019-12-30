package annotation;

public @interface SafeOrUnsafe {
    boolean isSafe() default true;
    String description() default "";
}
